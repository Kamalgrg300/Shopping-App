package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class DeleteProductActivity extends AppCompatActivity {


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
        setContentView(R.layout.activity_delete_product);


        DatabaseHelper dbHelper = new DatabaseHelper(DeleteProductActivity.this);

        woodSelect = findViewById(R.id.selectWoodForDeletion);
        tileSelect = findViewById(R.id.selectTileForDeletion);
        stoneSelect = findViewById(R.id.selectStoneForDeletion);
        vinylSelect = findViewById(R.id.selectVinylForDeletion);
        laminateSelect = findViewById(R.id.selectLaminateForDeletion);
        nameToDelete = findViewById(R.id.nameToDelete);
        deleteButton = findViewById(R.id.deleteButtonDeletionPage);


        woodSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "WOODS";
                Toast.makeText(DeleteProductActivity.this, "Wood product selected for Deletion. Enter Wood product Name", Toast.LENGTH_LONG).show();




            }
        });//Onsetlistener



        tileSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "TILES";
                Toast.makeText(DeleteProductActivity.this, "Tile product selected for Deletion. Enter Tile product Name", Toast.LENGTH_LONG).show();

            }
        });//tiles Onsetlistener


        stoneSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "STONES";
                Toast.makeText(DeleteProductActivity.this, "Stone product selected for Deletion. Enter Stone product Name", Toast.LENGTH_LONG).show();

            }
        });//stone Onsetlistener

        vinylSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "VINYLS";
                Toast.makeText(DeleteProductActivity.this, "Wood product selected for Deletion. Enter Wood product Name", Toast.LENGTH_LONG).show();

            }
        });//vinyl Onsetlistener


        laminateSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                category = "LAMINATES";
                Toast.makeText(DeleteProductActivity.this, "Laminate product selected for Deletion. Enter Laminate product Name", Toast.LENGTH_LONG).show();



            }
        });//laminate onset


deleteButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

       boolean success = dbHelper.removeProduct2(category, nameToDelete.getText().toString());

        if (success==false) {

            Toast.makeText(DeleteProductActivity.this, "Failed to delete. Maybe "+nameToDelete.getText().toString()+" is not in the "+category+" table.", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(DeleteProductActivity.this, "Successfully deleted " + nameToDelete.getText().toString()+ " from " + category+ "!", Toast.LENGTH_LONG).show();
        }


    }
});







    }//onCreate
}//class