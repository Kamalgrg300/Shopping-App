package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EmployeeModifyInventory extends AppCompatActivity {

    Button addProductButton;
    Button deleteProductButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_modify_inventory);


        addProductButton = findViewById(R.id.addProductButton);
        deleteProductButton = findViewById(R.id.deleteProductButton2);
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(EmployeeModifyInventory.this, CategorySelection2.class);
                startActivity(intent);
                //Toast.makeText(EmployeeModifyInventory.this, "HEY", Toast.LENGTH_SHORT).show();



            }//onClick
        });//setOnClickListener


        deleteProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(EmployeeModifyInventory.this, DeleteProductActivity.class);
                startActivity(intent);



            }//onClick
        });//setOnClick del


    }//onCreate
}//class