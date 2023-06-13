package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddLaminateDetails extends AppCompatActivity {

    String category;
    TextView waterResistance;
    TextView whichCategory;


    TextView laminateColor;
    TextView laminateSize;
    TextView laminateBrand;
    TextView laminateType;
    TextView laminatePrice;
    TextView laminateMaterial;
    TextView laminateName;
    TextView laminateStock;

    String waterResistanceString;

    Button addToDatabaseButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_laminate_details);

        DatabaseHelper dbHelper = new DatabaseHelper(AddLaminateDetails.this);


        laminateColor = findViewById(R.id.laminateColor);
        laminateSize = findViewById(R.id.laminateSize);
        laminateBrand = findViewById(R.id.laminateBrand);
        laminateType = findViewById(R.id.laminateType);
        laminatePrice = findViewById(R.id.laminatePrice);
        waterResistance = findViewById(R.id.waterResistancelaminate);
        laminateName = findViewById(R.id.laminateproductName);
        addToDatabaseButton = findViewById(R.id.addlaminateButton);
        laminateStock = findViewById(R.id.laminateStock);


        addToDatabaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(laminateColor.getText().toString()) || (TextUtils.isEmpty(laminateSize.getText().toString()) )   || (TextUtils.isEmpty(laminateBrand.getText().toString()) ) || (TextUtils.isEmpty(laminateType.getText().toString()) )  || (TextUtils.isEmpty(laminatePrice.getText().toString()) ) || (TextUtils.isEmpty(waterResistance.getText().toString()) )  || (TextUtils.isEmpty(laminateName.getText().toString()) ) ||  (TextUtils.isEmpty(laminateStock.getText().toString()) )      ) {

                    Toast.makeText(AddLaminateDetails.this, "Please enter data in all fields.", Toast.LENGTH_LONG).show();
                    return;
                }//if any field is empty

                if (waterResistance.getText().toString().equalsIgnoreCase("Water Resistant") == false && waterResistance.getText().toString().equalsIgnoreCase("Regular")==false  ) {

                    Toast.makeText(AddLaminateDetails.this, "Laminate is either Water Resistant or Regular ", Toast.LENGTH_LONG).show();
                    return;
                }

                if (waterResistance.getText().toString().equalsIgnoreCase("Water Resistant")) {

                    waterResistanceString = "Water Resistant";

                }

                if (waterResistance.getText().toString().equalsIgnoreCase("Regular")) {

                    waterResistanceString = "Regular";

                }


                Laminate theLaminateProduct = new Laminate (laminateColor.getText().toString(), Integer.parseInt(laminateSize.getText().toString()), laminateBrand.getText().toString(), laminateType.getText().toString(), Float.parseFloat(laminatePrice.getText().toString()), waterResistanceString );
                theLaminateProduct.setName(laminateName.getText().toString());
                theLaminateProduct.setStock(Integer.parseInt(laminateStock.getText().toString()));

                boolean success = dbHelper.addLaminate(theLaminateProduct);
                // boolean success = dbHelper.addProductJustName(stoneName.getText().toString());

                if (success==false) {

                    Toast.makeText(AddLaminateDetails.this, "Failed to add Laminate product" , Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(AddLaminateDetails.this, "Successfully added Laminate product! ", Toast.LENGTH_LONG).show();
                }




            }
        });//setOnClick



    }//onCreate
}//class