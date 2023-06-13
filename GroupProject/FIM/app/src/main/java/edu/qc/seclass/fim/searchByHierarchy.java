package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class searchByHierarchy extends AppCompatActivity {

    DatabaseHelper dbHelper = new DatabaseHelper(searchByHierarchy.this);


    String table;
    Button searchButton;
    TextView category;
    TextView type;
    String searchQuery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_hiearchy);

        category = findViewById(R.id.productCategorySBH);
        type = findViewById(R.id.productTypeSBH);

        searchButton = findViewById(R.id.searchButtonSBH);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(category.getText().toString()) || TextUtils.isEmpty(type.getText().toString()) ) {

                    Toast.makeText(searchByHierarchy.this, "Please enter data in all fields.", Toast.LENGTH_LONG).show();
                    return;
                }//if any field is empty


                if (category.getText().toString().equalsIgnoreCase("Wood")) {
                    table = "WOODS";
                    DatabaseHelper db = new DatabaseHelper(searchByHierarchy.this);
                    List<Wood> list = db.getWoodsWithType(type.getText().toString());
                    ArrayAdapter results = new ArrayAdapter<Wood>(searchByHierarchy.this,android.R.layout.simple_list_item_1, list) ;


                }

                if (category.getText().toString().equalsIgnoreCase("Tile")) {
                    table = "TILES";
                }

                if (category.getText().toString().equalsIgnoreCase("Stone")) {
                    table = "STONES";
                }

                if (category.getText().toString().equalsIgnoreCase("Vinyl")) {
                    table = "VINYLS";
                }

                if (category.getText().toString().equalsIgnoreCase("Laminate")) {
                    table = "LAMINATES";
                }

                searchQuery = "SELECT * FROM " + table + "WHERE Type = '"+ type.getText().toString()+"'";





            }
        });//search OnClickListener






    }//onCreate
}//class