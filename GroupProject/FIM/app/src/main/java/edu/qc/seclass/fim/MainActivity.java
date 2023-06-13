package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Initiate the buttons/textInputs that link buttons to variables
    Button regularRegisterButton;
    Button employeeRegisterButton;
    Button loginButton;
    EditText usernameInput;
    EditText passwordInput;
    User currentUser;


    //DELETE IN FINAL BUILD
    Button skipLoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       regularRegisterButton = findViewById(R.id.registerButton);
       employeeRegisterButton = findViewById(R.id.registerAsEmployeeButton);
       usernameInput = findViewById(R.id.username);
       passwordInput = findViewById(R.id.password);
       loginButton = findViewById(R.id.loginButton);

        //skipLoginButton=findViewById(R.id.skipLoginButton);

        DatabaseHelper dbHelper = new DatabaseHelper(MainActivity.this);


               regularRegisterButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {

                       if (TextUtils.isEmpty(usernameInput.getText().toString() ) || TextUtils.isEmpty(passwordInput.getText().toString()) ) {




                           Toast.makeText(getApplicationContext(), "Please enter data in all fields. Try again.",
                                   Toast.LENGTH_LONG).show();

                           return;



                       }//if either field is empty or null







                       User newUserCreated = new User(usernameInput.getText().toString(), passwordInput.getText().toString(), false);
                       //Toast.makeText(MainActivity.this, newUser.toString(), Toast.LENGTH_LONG).show();
                    boolean success = dbHelper.addUser(newUserCreated);


                       if (success==false) {

                           Toast.makeText(MainActivity.this, "Failed to register account. Maybe the username is already in the database?" , Toast.LENGTH_LONG).show();
                       }

                       else {
                           Toast.makeText(MainActivity.this, "Account registered to database! ", Toast.LENGTH_LONG).show();
                       }

                   }//onClick
               });//regular button listener


employeeRegisterButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if (TextUtils.isEmpty(usernameInput.getText().toString() ) || TextUtils.isEmpty(passwordInput.getText().toString()) ) {


            Toast.makeText(getApplicationContext(), "Please enter data in all fields. Try again.",
                    Toast.LENGTH_LONG).show();

            return;


        }//if either field is empty or null

        User newUserCreated = new User(usernameInput.getText().toString(), passwordInput.getText().toString(), true);
        //Toast.makeText(MainActivity.this, newUser.toString(), Toast.LENGTH_LONG).show();
        boolean success = dbHelper.addUser(newUserCreated);

        if (success==false) {

            Toast.makeText(MainActivity.this, "Failed to register account. Maybe the username is already in the database?", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(MainActivity.this, "Account registered to database! Account has employee privileges.", Toast.LENGTH_LONG).show();
        }



    }//onClick
});//employee register setOnClickListener



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeLoginPageIntent = new Intent(MainActivity.this, HomeScreenActivity.class);
                startActivity(homeLoginPageIntent);


            }//onClick
        });//setOnClick

/*
//DELETE IN FINAL BUILD
//////////////////////////////
        skipLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, EmployeeModifyInventory.class);
                startActivity(intent);

            }//onClick
        });//setOnClick

////////////////////
*/

    }//onCreate


}//class