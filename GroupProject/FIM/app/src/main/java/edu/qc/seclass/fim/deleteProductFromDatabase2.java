package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class deleteProductFromDatabase2 extends AppCompatActivity {


    Button woodSelect;
    Button tileSelect;
    Button stoneSelect;
    Button vinylSelect;
    Button laminateSelect;
    TextView nameToDelete;

    Button deleteButton;
    String category;
    
    
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_product_from_database2);

        DatabaseHelper dbHelper = new DatabaseHelper(deleteProductFromDatabase2.this);

        woodSelect = findViewById(R.id.selectWoodForDeletion2);
        tileSelect = findViewById(R.id.selectTileForDeletion2);
        stoneSelect = findViewById(R.id.selectStoneForDeletion2);
        vinylSelect = findViewById(R.id.selectVinylForDeletion2);
        laminateSelect = findViewById(R.id.selectLaminateForDeletion2);
        nameToDelete = findViewById(R.id.nameToDelete2);


        woodSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "WOODS";
                Toast.makeText(deleteProductFromDatabase2.this, "Wood product selected for Deletion. Enter Wood product Name", Toast.LENGTH_LONG).show();




            }
        });//Onsetlistener



        tileSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "TILES";
                Toast.makeText(deleteProductFromDatabase2.this, "Tile product selected for Deletion. Enter Tile product Name", Toast.LENGTH_LONG).show();

            }
        });//tiles Onsetlistener


        stoneSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "STONES";
                Toast.makeText(deleteProductFromDatabase2.this, "Stone product selected for Deletion. Enter Stone product Name", Toast.LENGTH_LONG).show();

            }
        });//stone Onsetlistener

        vinylSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "VINYLS";
                Toast.makeText(deleteProductFromDatabase2.this, "Wood product selected for Deletion. Enter Wood product Name", Toast.LENGTH_LONG).show();

            }
        });//vinyl Onsetlistener


        laminateSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                category = "LAMINATES";
                Toast.makeText(deleteProductFromDatabase2.this, "Laminate product selected for Deletion. Enter Laminate product Name", Toast.LENGTH_LONG).show();



            }
        });//laminate onset

/*
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean success = dbHelper.removeProduct(category, nameToDelete.getText().toString());

                if (success==false) {

                    Toast.makeText(deleteProductFromDatabase2.this, "Failed to delete. Maybe "+nameToDelete.getText().toString()+" is not in the "+category+"table.", Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(deleteProductFromDatabase2.this, "Successfully deleted " + nameToDelete.getText().toString()+ " from " + category+ "!", Toast.LENGTH_LONG).show();
                }


            }
        });

*/




    }//onCreate
}//class