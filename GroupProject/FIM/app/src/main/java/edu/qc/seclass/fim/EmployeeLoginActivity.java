package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmployeeLoginActivity extends AppCompatActivity {

    User loggedInAs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login);


        EditText usernameEMPInput = (EditText) findViewById(R.id.usernameEMP_xml);
        EditText passwordEMPInput = (EditText) findViewById(R.id.passwordEMP_xml);
        Button signInButton = findViewById(R.id.empSignInButton);

        DatabaseHelper dbHelper = new DatabaseHelper(EmployeeLoginActivity.this);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(usernameEMPInput.getText().toString() ) || TextUtils.isEmpty(passwordEMPInput.getText().toString()) ) {


                    Toast.makeText(getApplicationContext(), "Please enter data in all fields. Try again.",
                            Toast.LENGTH_LONG).show();

                    return;

                }//if either field is empty or null


                String theInputtedUsername = usernameEMPInput.getText().toString();

                boolean doesUserExist = dbHelper.checkUsername(theInputtedUsername);


                //if the username doesn't exist in the database
                if (doesUserExist==false) {
                    Toast.makeText(getApplicationContext(), "Username is not in the database.", Toast.LENGTH_LONG).show();
                    return;
                }

                //if the username exists in the database but the password is wrong
                if ((doesUserExist==true) && dbHelper.verifyUser(usernameEMPInput.getText().toString(), passwordEMPInput.getText().toString()) == false) {

                    Toast.makeText(getApplicationContext(), "Incorrect password.", Toast.LENGTH_LONG).show();
                    return;
                }//if user entered correct username and password


                //if the user is verified but is not an employee
                if (dbHelper.verifyUser(usernameEMPInput.getText().toString(), passwordEMPInput.getText().toString())==true && dbHelper.verifyEmployee(usernameEMPInput.getText().toString(), passwordEMPInput.getText().toString())==false) {
                    Toast.makeText(getApplicationContext(), "This user isn't an employee.", Toast.LENGTH_LONG).show();
                    return;
                }


                if (dbHelper.verifyUser(usernameEMPInput.getText().toString(), passwordEMPInput.getText().toString())==true && dbHelper.verifyEmployee(usernameEMPInput.getText().toString(), passwordEMPInput.getText().toString())==true) {
                    Toast.makeText(getApplicationContext(), "Welcome " + usernameEMPInput.getText().toString() + "!", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(EmployeeLoginActivity.this, EmployeeModifyInventory.class);
                    startActivity(intent);

                }




            }//onClick
        });//setOnClickListener








    }//OnCreate
}