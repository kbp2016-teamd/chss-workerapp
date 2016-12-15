package com.chss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import za.co.chss.client.entities.Patient;

public class NewPatientActivity extends AppCompatActivity implements View.OnClickListener
{
    private Patient patient;
    private EditText firstNameET, lastNameET, idNumberET,
            addressET, genderET, dateOfBirthET, heightET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_patient);

        firstNameET = (EditText) findViewById(R.id.editTextFirstName);
        lastNameET = (EditText) findViewById(R.id.editTextFirstName);
        idNumberET = (EditText) findViewById(R.id.editTextFirstName);
        addressET = (EditText) findViewById(R.id.editTextFirstName);
        genderET = (EditText) findViewById(R.id.editTextFirstName);
        dateOfBirthET  = (EditText) findViewById(R.id.editTextFirstName);
        heightET = (EditText) findViewById(R.id.editTextFirstName);

        Button createPatientBtn = (Button) findViewById(R.id.buttonCreate);
        createPatientBtn.setOnClickListener(this);
    }

    public void createPatient(Patient aPatient) {
        boolean success = DataClass.createPatient(patient);

        if(success) {
            Intent intent = getIntent();
            setResult(RESULT_OK, intent);
        }
        else
        {
            Intent intent = getIntent();
            setResult(RESULT_CANCELED, intent);
        }
        finish();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.buttonCreate:
                String firstName = firstNameET.getText().toString();
                String lastName = firstNameET.getText().toString();
                String idNumber = firstNameET.getText().toString();
                String address = firstNameET.getText().toString();
                String gender = firstNameET.getText().toString();
                String dateOfBirth = firstNameET.getText().toString();
                String height = firstNameET.getText().toString();
                Patient patient = new Patient(firstName, lastName, idNumber, gender, 0, dateOfBirth, null, null, null, null);

                createPatient(patient);
                break;
        }
    }
}