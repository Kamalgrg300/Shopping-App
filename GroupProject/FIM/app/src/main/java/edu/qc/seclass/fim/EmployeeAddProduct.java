package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EmployeeAddProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_add_product);

        DatabaseHelper dbHelper = new DatabaseHelper(EmployeeAddProduct.this);


    }//onCreate
}//class