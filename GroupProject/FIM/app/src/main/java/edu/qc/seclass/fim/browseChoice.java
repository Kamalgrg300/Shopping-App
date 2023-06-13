package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class browseChoice extends AppCompatActivity {


    Button gotoProducts;
    Button gotoSBH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_choice);

        gotoProducts = findViewById(R.id.gotoProducts);
        gotoSBH = findViewById(R.id.gotoSBH);


        gotoProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeLoginPageIntent = new Intent(browseChoice.this, ProductsActivity.class);
                startActivity(homeLoginPageIntent);

            }
        });


        gotoSBH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeLoginPageIntent = new Intent(browseChoice.this, searchByHierarchy.class);
                startActivity(homeLoginPageIntent);

            }
        });



    }//onCreate
}//class