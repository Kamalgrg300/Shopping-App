package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddWoodDetails extends AppCompatActivity {


    String category;
    //String duplicate variables are made to pass in correct captialization to SQL query
    TextView woodType;
    String woodTypeString;
    TextView woodSpecies;
    String woodSpeciesString;
    TextView whichCategory;

    TextView Color;
    TextView Size;
    TextView Brand;
    TextView Type;
    TextView Price;

    TextView Name;
    TextView woodStock;

    Button addToDatabaseButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_wood_details);



        DatabaseHelper dbHelper = new DatabaseHelper(AddWoodDetails.this);


        Color = findViewById(R.id.Color);
        Size = findViewById(R.id.Size);
        Brand = findViewById(R.id.Brand);
        Type = findViewById(R.id.Type);
        Price = findViewById(R.id.Price);
        Name = findViewById(R.id.productName);
        woodStock = findViewById(R.id.woodStock);

        woodType = findViewById(R.id.woodType);
        woodSpecies = findViewById(R.id.woodSpecies);


        addToDatabaseButton = findViewById(R.id.addWoodButton);


        //These 3 lines of code are mostly just testing passing data between activities
        category = getIntent().getStringExtra("category");
        whichCategory = findViewById(R.id.getWhichCategory);
        whichCategory.setText(category);


        addToDatabaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(Color.getText().toString()) || (TextUtils.isEmpty(Size.getText().toString())) || (TextUtils.isEmpty(Brand.getText().toString())) || (TextUtils.isEmpty(Type.getText().toString())) || (TextUtils.isEmpty(Price.getText().toString())) || (TextUtils.isEmpty(woodType.getText().toString())) || (TextUtils.isEmpty(Name.getText().toString())) || TextUtils.isEmpty(woodSpecies.getText().toString())  || TextUtils.isEmpty(woodStock.getText().toString())  ) {

                    Toast.makeText(AddWoodDetails.this, "Please enter data in all fields.", Toast.LENGTH_LONG).show();
                    return;
                }//if any field is empty


                if (woodType.getText().toString().equalsIgnoreCase("Solid") == false && woodType.getText().toString().equalsIgnoreCase("Engineered") == false && woodType.getText().toString().equalsIgnoreCase("Bamboo") == false) {

                    Toast.makeText(AddWoodDetails.this, "Wood Type can be Solid, Engineered, or Bamboo ", Toast.LENGTH_LONG).show();
                    return;
                }


                if (woodSpecies.getText().toString().equalsIgnoreCase("Oak") == false && woodSpecies.getText().toString().equalsIgnoreCase("Hickory") == false && woodSpecies.getText().toString().equalsIgnoreCase("Maple") == false) {

                    Toast.makeText(AddWoodDetails.this, "Wood Species can be Oak, Hickory, or Maple ", Toast.LENGTH_LONG).show();
                    return;
                }

                if (woodType.getText().toString().equalsIgnoreCase("Solid")) {
                    woodTypeString = "Solid";
                }

                if (woodType.getText().toString().equalsIgnoreCase("Engineered")) {
                    woodTypeString = "Engineered";
                }

                if (woodType.getText().toString().equalsIgnoreCase("Bamboo")) {
                    woodTypeString = "Bamboo";
                }

                if (woodSpecies.getText().toString().equalsIgnoreCase("Oak")) {
                    woodSpeciesString = "Oak";
                }

                if (woodSpecies.getText().toString().equalsIgnoreCase("Hickory")) {
                    woodSpeciesString = "Hickory";
                }

                if (woodSpecies.getText().toString().equalsIgnoreCase("Maple")) {
                    woodSpeciesString = "Maple";
                }

Wood theWoodProduct = new Wood (Color.getText().toString(), Integer.parseInt(Size.getText().toString()), Brand.getText().toString(), Type.getText().toString(), Float.parseFloat(Price.getText().toString()), woodTypeString, woodSpeciesString );
                theWoodProduct.setName(Name.getText().toString());
                theWoodProduct.setStock(Integer.parseInt(woodStock.getText().toString()));
                boolean success = dbHelper.addWood(theWoodProduct);
                // boolean success = dbHelper.addProductJustName(tileName.getText().toString());

                if (success == false) {

                    Toast.makeText(AddWoodDetails.this, "Failed to add Wood product", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(AddWoodDetails.this, "Successfully added Wood product! ", Toast.LENGTH_LONG).show();
                }

            }//onClick

        });//setOnClick
            }//onCreate
                 }//class