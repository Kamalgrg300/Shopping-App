package edu.qc.seclass.fim;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddStoneDetails extends AppCompatActivity {

    String category;
    String material;
    TextView whichCategory;


    TextView stoneColor;
    TextView stoneSize;
    TextView stoneBrand;
    TextView stoneType;
    TextView stonePrice;
    TextView stoneMaterial;
    TextView stoneName;
    TextView stoneStock;

    Button addToDatabaseButton;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stone_details);

        DatabaseHelper dbHelper = new DatabaseHelper(AddStoneDetails.this);


        stoneColor = findViewById(R.id.stoneColor);
        stoneSize = findViewById(R.id.stoneSize);
        stoneBrand = findViewById(R.id.stoneBrand);
        stoneType = findViewById(R.id.stoneType);
        stonePrice = findViewById(R.id.stonePrice);
        stoneMaterial = findViewById(R.id.stoneMaterial);
        stoneName = findViewById(R.id.stoneproductName);
        addToDatabaseButton = findViewById(R.id.addStoneButton);
        stoneStock = findViewById(R.id.stoneStock);



        addToDatabaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(stoneColor.getText().toString()) || (TextUtils.isEmpty(stoneSize.getText().toString()) )   || (TextUtils.isEmpty(stoneBrand.getText().toString()) ) || (TextUtils.isEmpty(stoneType.getText().toString()) )  || (TextUtils.isEmpty(stonePrice.getText().toString()) ) || (TextUtils.isEmpty(stoneMaterial.getText().toString()) )  || (TextUtils.isEmpty(stoneName.getText().toString()) ) ||  (TextUtils.isEmpty(stoneStock.getText().toString()) )      ) {

                    Toast.makeText(AddStoneDetails.this, "Please enter data in all fields.", Toast.LENGTH_LONG).show();
                    return;
                }//if any field is empty






                if (stoneMaterial.getText().toString().equalsIgnoreCase("Marble") == false && stoneMaterial.getText().toString().equalsIgnoreCase("Pebble")==false && stoneMaterial.getText().toString().equalsIgnoreCase ("Slate" ) ==false ) {

                    Toast.makeText(AddStoneDetails.this, "Stone materials can be Marble, Ceramic, or Slate ", Toast.LENGTH_LONG).show();
                    return;
                }

                if (stoneMaterial.getText().toString().equalsIgnoreCase("Marble") ) {
                    material = "Marble";
                }

                if (stoneMaterial.getText().toString().equalsIgnoreCase("Pebble") ) {
                    material = "Pebble";
                }

                if (stoneMaterial.getText().toString().equalsIgnoreCase("Slate") ) {
                    material = "Slate";
                }

                Stone theStoneProduct = new Stone (stoneColor.getText().toString(), Integer.parseInt(stoneSize.getText().toString()), stoneBrand.getText().toString(), stoneType.getText().toString(), Float.parseFloat(stonePrice.getText().toString()), material );
                theStoneProduct.setName(stoneName.getText().toString());
                theStoneProduct.setStock(Integer.parseInt(stoneStock.getText().toString()));
                boolean success = dbHelper.addStone(theStoneProduct);
                // boolean success = dbHelper.addProductJustName(stoneName.getText().toString());

                if (success==false) {

                    Toast.makeText(AddStoneDetails.this, "Failed to add Stone product" , Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(AddStoneDetails.this, "Successfully added Stone product! ", Toast.LENGTH_LONG).show();
                }



            }//onClick
        });//setOnClick addToDatabase
        
        
        
        
        
        
    }//onCreate
}//class