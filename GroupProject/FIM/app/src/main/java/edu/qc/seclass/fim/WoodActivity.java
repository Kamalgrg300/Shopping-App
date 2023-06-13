package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wood);
        Button typeBtn = findViewById(R.id.typeBtn);
        Button speciesBtn = findViewById(R.id.speciesBtn);
        // When type is clicked should open Wood type activity
        typeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WoodActivity.this, WoodTypeActivity.class);
                startActivity(intent);
            }
        });
        // When species is clicked should open Wood species activity
        speciesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WoodActivity.this, WoodSpeciesActivity.class);
                startActivity(intent);
            }
        });

    }
}