package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void employeeClick(View view){
        Intent intent = new Intent(HomeScreenActivity.this, EmployeeLoginActivity.class);
        startActivity(intent);
    }

    public void customerClick(View view){
        Intent intent = new Intent(HomeScreenActivity.this, browseChoice.class);
        startActivity(intent);
    }
}