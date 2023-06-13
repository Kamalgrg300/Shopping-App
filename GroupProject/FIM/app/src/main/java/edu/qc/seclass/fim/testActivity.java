package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testActivity extends AppCompatActivity {

    Button theButton = findViewById(R.id.testActivityButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent homeLoginPageIntent = new Intent(testActivity.this, HomeScreenActivity.class);
                startActivity(homeLoginPageIntent);



            }
        });


    }
}