package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategorySelection2 extends AppCompatActivity {

    String category;
    Button tileButton;
Button woodButton;
Button stoneButton;
Button vinylButton;
Button laminateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection2);

        tileButton = findViewById(R.id.tileButton);
        woodButton = findViewById(R.id.tileWood2);
        stoneButton = findViewById(R.id.tileStone2);
        vinylButton = findViewById(R.id.tileVinyl2);
        laminateButton = findViewById(R.id.tileLaminate2);


        tileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                category = "Tile";
                Intent intent = new Intent(CategorySelection2.this, AddRestOfTileDetailsActivity.class);
                intent.putExtra("category", category);
                startActivity(intent);


            }//onClick
        });//tile onSetClickListener


        woodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                category = "Wood";
                Intent intent = new Intent(CategorySelection2.this, AddWoodDetails.class);
                intent.putExtra("category", category);
                startActivity(intent);

            }
        }); //woodOnSetClickListener




        stoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                category = "Stone";
                Intent intent = new Intent(CategorySelection2.this, AddStoneDetails.class);
                intent.putExtra("category", category);
                startActivity(intent);

            }
        });//StoneOnSetClickListener



        vinylButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                category = "Vinyl";
                Intent intent = new Intent(CategorySelection2.this, AddVinylDetails.class);
                intent.putExtra("category", category);
                startActivity(intent);

            }
        });//vinyl SetOnCLickListener

        laminateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                category = "Laminate";
                Intent intent = new Intent(CategorySelection2.this, AddLaminateDetails.class);
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });//lam onsetclicker




    }//onCreate
}//Class