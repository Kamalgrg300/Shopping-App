package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TileActivity extends AppCompatActivity {

    String tile ="";

    Button porcelainButton;


    public void selectNextAttribute() {

        //MainActivity is a PLACEHOLDER activity to direct to.
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("tile", tile);
        startActivity(intent);

    }//startSelectTypeActivity



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tile);

        porcelainButton = findViewById(R.id.porcelainButton);

        porcelainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }//onClick
        });//setOnClickListener





    }//OnCreate
}//Class