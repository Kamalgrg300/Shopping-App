package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AddRestOfTileDetailsActivity extends AppCompatActivity {

   // Bundle extras = getIntent().getExtras();
    String category;
    String material;
    TextView whichCategory;

    TextView tileColor;
    TextView tileSize;
    TextView tileBrand;
    TextView tileType;
    TextView tilePrice;
    TextView tileMaterial;
    TextView tileName;
TextView tileStock;
    Button addToDatabaseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_rest_of_tile_details);

        DatabaseHelper dbHelper = new DatabaseHelper(AddRestOfTileDetailsActivity.this);


        tileColor = findViewById(R.id.tileColor);
        tileSize = findViewById(R.id.tileSize);
        tileBrand = findViewById(R.id.tileBrand);
        tileType = findViewById(R.id.tileType);
        tilePrice = findViewById(R.id.tilePrice);
        tileMaterial = findViewById(R.id.tileMaterial);
        tileName = findViewById(R.id.tileproductName);
        tileStock = findViewById(R.id.tileStock);
        addToDatabaseButton = findViewById(R.id.addTileButton);


        //These 3 lines of code are mostly just testing passing data between activities
        category = getIntent().getStringExtra("category");
        whichCategory = findViewById(R.id.getWhichCategory);
        whichCategory.setText(category);


        addToDatabaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if (TextUtils.isEmpty(tileColor.getText().toString()) || (TextUtils.isEmpty(tileSize.getText().toString()) )   || (TextUtils.isEmpty(tileBrand.getText().toString()) ) || (TextUtils.isEmpty(tileType.getText().toString()) )  || (TextUtils.isEmpty(tilePrice.getText().toString()) ) || (TextUtils.isEmpty(tileMaterial.getText().toString()) )  || (TextUtils.isEmpty(tileName.getText().toString()) ) ||(TextUtils.isEmpty(tileStock.getText().toString()) )     ) {

                   Toast.makeText(AddRestOfTileDetailsActivity.this, "Please enter data in all fields.", Toast.LENGTH_LONG).show();
                    return;
               }//if any field is empty


                if (tileMaterial.getText().toString().equalsIgnoreCase("Porcelain") == false && tileMaterial.getText().toString().equalsIgnoreCase("Ceramic")==false && tileMaterial.getText().toString().equalsIgnoreCase ("Resin" ) ==false ) {

                    Toast.makeText(AddRestOfTileDetailsActivity.this, "Tile materials can be Porcelain, Ceramic, or Resin ", Toast.LENGTH_LONG).show();
                    return;
                }

                if (tileMaterial.getText().toString().equalsIgnoreCase("Porecelain") ) {
                    material = "Porcelain";
                }

                if (tileMaterial.getText().toString().equalsIgnoreCase("Ceramic") ) {
                    material = "Ceramic";
                }

                if (tileMaterial.getText().toString().equalsIgnoreCase("Resin") ) {
                    material = "Resin";
                }



               boolean success = dbHelper.addTile(tileName.getText().toString(), "Tile", tileColor.getText().toString(), Integer.parseInt(tileSize.getText().toString()), tileBrand.getText().toString(), tileType.getText().toString(), Float.parseFloat(tilePrice.getText().toString()), Integer.parseInt(tileStock.getText().toString()), material );
               // boolean success = dbHelper.addProductJustName(tileName.getText().toString());

                if (success==false) {

                    Toast.makeText(AddRestOfTileDetailsActivity.this, "Failed to add Tile product" , Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(AddRestOfTileDetailsActivity.this, "Successfully added Tile product! ", Toast.LENGTH_LONG).show();
                }



            }//onClick
        });//setOnClick addToDatabase





    }//onCreate
}//class