package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubcategorySelectionActivity extends AppCompatActivity {

    String category;

    Button tileButton;

    //if user selects Tile as category






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategory_selection);

        tileButton = findViewById(R.id.tileButton);

        tileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            category = "Tile";

           // selectTileActivity();


            }//onClick
        });//setOnClickListener



    }//OnCreate



    public void selectTileActivity() {

        Intent intent = new Intent(this, TileActivity.class);
        //intent.putExtra("category", category);
        startActivity(intent);

    }//startSelectTypeActivity

}//class