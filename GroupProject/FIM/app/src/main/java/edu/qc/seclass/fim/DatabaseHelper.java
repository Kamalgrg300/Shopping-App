package edu.qc.seclass.fim;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String USERS = "USERS";
    public static final String PASSWORD = "password";
    public static final String IS_EMPLOYEE = "isEmployee";
    public static final String USERNAME = "username";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "users.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

String createTableStatement = "CREATE TABLE " + USERS + " (" + USERNAME + " TEXT PRIMARY KEY," + PASSWORD + " TEXT, " + IS_EMPLOYEE + " BOOL )";
String addProductTable = "CREATE TABLE Products (Name TEXT PRIMARY KEY, Category TEXT, Color TEXT, Size INT, Brand TEXT, Type TEXT, Price INT,tileOrStoneMaterial TEXT, woodType TEXT, woodSpecies TEXT, laminateWaterResistance TEXT, vinylWaterResistance TEXT, Stock INT)";
String addTileTable = "CREATE TABLE TILES (Name PRIMARY KEY, Category TEXT, Color TEXT, Size INT, Brand TEXT, Type TEXT, Price NUM, Material TEXT, Stock INT)";
String addWoodTable = "CREATE TABLE WOODS (Name Primary Key, Category TEXT, Color TEXT, Size INT, Brand TEXT, Type TEXT, Price NUM, WoodType TEXT, Species TEXT, Stock INT)";
String addStoneTable = "CREATE TABLE STONES (Name PRIMARY KEY, Category TEXT, Color TEXT, Size INT, Brand TEXT, Type TEXT, Price NUM, Material TEXT, Stock INT)";
String addVinylTable = "CREATE TABLE VINYLS (Name PRIMARY KEY, Category TEXT, Color TEXT, Size INT, Brand TEXT, Type TEXT, Price NUM, WaterResistance TEXT, Stock INT)";
String addLaminateTable = "CREATE TABLE LAMINATES (Name PRIMARY KEY, Category TEXT, Color TEXT, Size INT, Brand TEXT, Type TEXT, Price NUM, WaterResistance TEXT, Stock INT)";

sqLiteDatabase.execSQL(createTableStatement);
sqLiteDatabase.execSQL(addProductTable);

sqLiteDatabase.execSQL(addTileTable);
sqLiteDatabase.execSQL(addWoodTable);
sqLiteDatabase.execSQL(addStoneTable);
sqLiteDatabase.execSQL(addVinylTable);
sqLiteDatabase.execSQL(addLaminateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

public boolean addUser(User newUser) {

SQLiteDatabase userDB = this.getWritableDatabase();
ContentValues cv = new ContentValues();

cv.put(USERNAME, newUser.getUsername());
cv.put(PASSWORD, newUser.getPassword());
cv.put(IS_EMPLOYEE, newUser.isEmployee());
long insert = userDB.insert(USERS, null, cv);

if (insert==-1) {
return false;
}
else {
return true;
}


}//addUser


    public boolean addTile(String name, String category, String color,int size, String brand, String type, float price, int stock,String material ) {

        SQLiteDatabase userDB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name", name);
        cv.put("Category", category);
        cv.put("Color", color);
        cv.put("Size", size);
        cv.put("Brand", brand);
        cv.put("Type", type);
        cv.put("Price", price);
        cv.put("Material", material);
        cv.put("Stock", stock);
        long insert = userDB.insert("TILES", null, cv);

        if (insert==-1) {
            return false;
        }
        else {
            return true;
        }

    }//addTile


    /*
//addProductJustName mostly just for testing
    boolean addProductJustName(String name){
        SQLiteDatabase userDB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name", name);

        long insert = userDB.insert("TILES", null, cv);

        if (insert==-1) {
            return false;
        }
        else {
            return true;
        }


    }
*/
    boolean addWood(Wood theWoodProduct) {

        SQLiteDatabase userDB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name", theWoodProduct.getName());
        cv.put("Category", "Wood");
        cv.put("Color", theWoodProduct.getColor());
        cv.put("Size", theWoodProduct.getSize());
        cv.put("Brand", theWoodProduct.getBrand());
        cv.put("Type", theWoodProduct.getType());
        cv.put("Price", theWoodProduct.getPrice());
        cv.put("WoodType", theWoodProduct.getWoodType());
        cv.put("Species", theWoodProduct.getWoodSpecies());

        long insert = userDB.insert("WOODS", null, cv);

        if (insert==-1) {
            return false;
        }
        else {
            return true;
        }



    }//addWood


    public boolean addStone (Stone theStoneProduct) {

        SQLiteDatabase userDB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name", theStoneProduct.getName());
        cv.put("Category", "Stone");
        cv.put("Color", theStoneProduct.getColor());
        cv.put("Size", theStoneProduct.getSize());
        cv.put("Brand", theStoneProduct.getBrand());
        cv.put("Type", theStoneProduct.getType());
        cv.put("Price", theStoneProduct.getPrice());
        cv.put("Material", theStoneProduct.getMaterial());
        long insert = userDB.insert("STONES", null, cv);

        if (insert==-1) {
            return false;
        }
        else {
            return true;
        }


    }//addStone


    public boolean addVinyl (Vinyl theVinylProduct) {

        SQLiteDatabase userDB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name", theVinylProduct.getName());
        cv.put("Category", "Vinyl");
        cv.put("Color", theVinylProduct.getColor());
        cv.put("Size", theVinylProduct.getSize());
        cv.put("Brand", theVinylProduct.getBrand());
        cv.put("Type", theVinylProduct.getType());
        cv.put("Price", theVinylProduct.getPrice());
        cv.put("WaterResistance", theVinylProduct.getWaterResistance());
        long insert = userDB.insert("VINYLS", null, cv);

        if (insert==-1) {
            return false;
        }
        else {
            return true;
        }




    }//addVinyl




    public boolean addLaminate(Laminate theLaminateProduct) {

        SQLiteDatabase userDB = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name", theLaminateProduct.getName());
        cv.put("Category", "Laminate");
        cv.put("Color", theLaminateProduct.getColor());
        cv.put("Size", theLaminateProduct.getSize());
        cv.put("Brand", theLaminateProduct.getBrand());
        cv.put("Type", theLaminateProduct.getType());
        cv.put("Price", theLaminateProduct.getPrice());
        cv.put("WaterResistance", theLaminateProduct.getWaterResistance());
        long insert = userDB.insert("LAMINATES", null, cv);

        if (insert==-1) {
            return false;
        }
        else {
            return true;
        }



    }//addLamiante


    public boolean checkProductExistence (String category, String nameToDelete) {

        SQLiteDatabase userDB = this.getReadableDatabase();
        Cursor theCursor = userDB.rawQuery("SELECT Name FROM " +category+" WHERE Name = '"+nameToDelete +"'", null);

        //if the username exists in one of the columns, return true.
        //note that a username can ONLY exist in one column since it's a PK.



        if (theCursor.moveToFirst()) {

            //  userDB.close()
            return true;



        }//if



        return false;
        
        
        
    }//checkProductExistence

    
    public boolean removeProduct (String category, String nameToDelete) {


        SQLiteDatabase userDB = this.getWritableDatabase();
String deleteQuery = "DELETE FROM " +category+ " WHERE Name = '" + nameToDelete+"'";
Cursor theCursor = userDB.rawQuery(deleteQuery, null);

        if (theCursor.moveToFirst()) {

            return true;

        }//if

        else {
              return false;
        }


    }//removeProduct


    public List<Wood> getWoodsWithType(String type) {

        String theQuery = "SELECT * FROM WOODS WHERE Type = '"+type+"'";

        List<Wood> theList = new ArrayList<Wood>();
        SQLiteDatabase userDB = this.getReadableDatabase();
        Cursor theCursor = userDB.rawQuery(theQuery, null);

        if (theCursor.moveToFirst()) {


            do {
                String name = theCursor.getString(0);
                String color = theCursor.getString(1);
                int size = theCursor.getInt(2);
                String brand = theCursor.getString(3);
                String producttype = theCursor.getString(4);
                float price = theCursor.getFloat(5);
                String woodType = theCursor.getString(6);
                String woodSpecies = theCursor.getString(7);
                int stock = theCursor.getInt(8);

                Wood x = new Wood(color, size, brand,producttype, price, woodType, woodSpecies);
                x.setName(name);
                x.setStock(stock);

                theList.add(x);

            }while (theCursor.moveToNext());




        }
        else {

        }//else
return theList;

    }//getQueryData


    public boolean removeProduct2(String category, String nameToDelete) {

        SQLiteDatabase userDB = this.getReadableDatabase();
       return userDB.delete(category, "Name = '" + nameToDelete + "'", null) >0;

}
    
    



    //verify that the username used to login is actually in the database
    public boolean checkUsername(String usernameToTest) {
        SQLiteDatabase userDB = this.getReadableDatabase();
        Cursor theCursor = userDB.rawQuery("SELECT username FROM USERS WHERE username = '"+usernameToTest +"'", null);

        //if the username exists in one of the columns, return true.
        //note that a username can ONLY exist in one column since it's a PK.



        if (theCursor.moveToFirst()) {

          //  userDB.close()
            return true;



        }//if



return false;
    }//checkUsername




    //parameters are a username and password. if the user enters the correct password, return true (Green light to log the user in).
    public boolean verifyUser(String usernameToTest, String passwordToTest) {

        SQLiteDatabase userDB = this.getReadableDatabase();

        if (checkUsername(usernameToTest)==true) {

            String comparePasswordQuery = "SELECT * FROM USERS WHERE USERNAME = '" + usernameToTest + "'" +" AND PASSWORD = '"+passwordToTest+"'";
            Cursor theCursor = userDB.rawQuery(comparePasswordQuery, null);

            if (theCursor.moveToFirst()) {

                //  userDB.close()
                return true;

            }//if
            else {
                return false;
            }


        }//if it's a valid username
return false;
    }//verifyUser


    //checks if a valid user is an employee
    public boolean verifyEmployee(String usernameToCheck, String passwordToCheck) {

        SQLiteDatabase userDB = this.getReadableDatabase();

        if (checkUsername(usernameToCheck)==false) {
            return false;
        }
        if (verifyUser(usernameToCheck,passwordToCheck)==false) {
            return false;
        }

        //if the user is confirmed to exist, check if they're an employee
        if (verifyUser(usernameToCheck, passwordToCheck)==true) {

            String query = "SELECT * FROM USERS WHERE USERNAME = '" + usernameToCheck + "'" +" AND PASSWORD = '"+passwordToCheck+"'"+ " AND isEmployee = 1";
            Cursor theCursor = userDB.rawQuery(query, null);

            if (theCursor.moveToFirst()) {

                //  userDB.close()
                return true;

            }//if
            else {
                return false;
            }

        }//if verifyUser


return false;


    }//verifyEmployee




}//class