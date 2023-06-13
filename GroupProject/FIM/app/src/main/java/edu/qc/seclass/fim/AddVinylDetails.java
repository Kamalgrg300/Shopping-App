package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class AddVinylDetails extends AppCompatActivity {

    String category;
    TextView waterResistance;
    TextView whichCategory;


    TextView vinylColor;
    TextView vinylSize;
    TextView vinylBrand;
    TextView vinylType;
    TextView vinylPrice;
    TextView vinylMaterial;
    TextView vinylName;
    TextView vinylStock;

    String waterResistanceString;

    Button addToDatabaseButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vinyl_details);

        DatabaseHelper dbHelper = new DatabaseHelper(AddVinylDetails.this);


        vinylColor = findViewById(R.id.vinylColor);
        vinylSize = findViewById(R.id.vinylSize);
        vinylBrand = findViewById(R.id.vinylBrand);
        vinylType = findViewById(R.id.vinylType);
        vinylPrice = findViewById(R.id.vinylPrice);
        waterResistance = findViewById(R.id.waterResistanceVinyl);
        vinylName = findViewById(R.id.vinylproductName);
        addToDatabaseButton = findViewById(R.id.addvinylButton);
        vinylStock = findViewById(R.id.vinylStock);


        addToDatabaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(vinylColor.getText().toString()) || (TextUtils.isEmpty(vinylSize.getText().toString()) )   || (TextUtils.isEmpty(vinylBrand.getText().toString()) ) || (TextUtils.isEmpty(vinylType.getText().toString()) )  || (TextUtils.isEmpty(vinylPrice.getText().toString()) ) || (TextUtils.isEmpty(waterResistance.getText().toString()) )  || (TextUtils.isEmpty(vinylName.getText().toString()) ) ||  (TextUtils.isEmpty(vinylStock.getText().toString()) )      ) {

                    Toast.makeText(AddVinylDetails.this, "Please enter data in all fields.", Toast.LENGTH_LONG).show();
                    return;
                }//if any field is empty

                if (waterResistance.getText().toString().equalsIgnoreCase("Water Resistant") == false && waterResistance.getText().toString().equalsIgnoreCase("Waterproof")==false  ) {

                    Toast.makeText(AddVinylDetails.this, "Vinyl is either Water Resistant or Waterproof ", Toast.LENGTH_LONG).show();
                    return;
                }

                if (waterResistance.getText().toString().equalsIgnoreCase("Water Resistant")) {

                    waterResistanceString = "Water Resistant";

                }

                if (waterResistance.getText().toString().equalsIgnoreCase("Waterproof")) {

                    waterResistanceString= "Waterproof";
                }



                Vinyl theVinylProduct = new Vinyl (vinylColor.getText().toString(), Integer.parseInt(vinylSize.getText().toString()), vinylBrand.getText().toString(), vinylType.getText().toString(), Float.parseFloat(vinylPrice.getText().toString()), waterResistanceString );
                theVinylProduct.setName(vinylName.getText().toString());
                theVinylProduct.setStock(Integer.parseInt(vinylStock.getText().toString()));

                boolean success = dbHelper.addVinyl(theVinylProduct);
                // boolean success = dbHelper.addProductJustName(stoneName.getText().toString());

                if (success==false) {

                    Toast.makeText(AddVinylDetails.this, "Failed to add Vinyl product" , Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(AddVinylDetails.this, "Successfully added Vinyl product! ", Toast.LENGTH_LONG).show();
                }



            }
        });//VinylSetOnClick



    }//onCreate
}//class