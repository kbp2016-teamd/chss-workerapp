package com.chss;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import za.co.chss.client.entities.Patient;

public class PatientSearchActivity extends AppCompatActivity
        implements TextWatcher, View.OnClickListener
{

    private View rootView;
    private ArrayList<Patient> patientList;
    private EditText patientSearchET;
    private PatientAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_search);

        rootView = findViewById(android.R.id.content);

        RecyclerView patientListRV = (RecyclerView) findViewById(R.id.recyclerViewPatientList);
        patientListRV.setLayoutManager(new LinearLayoutManager((this)));
        patientList = DataClass.getPatientList();
        adapter = new PatientAdapter(patientList, this);
        patientListRV.setAdapter(adapter);

        patientSearchET = (EditText) findViewById(R.id.editTextPatientSearch);
        patientSearchET.addTextChangedListener(this);

        Button patientBtn = (Button) findViewById(R.id.buttonAddPatient);
        patientBtn.setOnClickListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        adapter.getFilter().filter(editable.toString());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.buttonAddPatient:
                startActivityForResult(new Intent(this, NewPatientActivity.class), DataClass.PATIENT_CREATION);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == DataClass.PATIENT_CREATION) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                Snackbar snackbar = Snackbar.make(rootView, "Patient successfully created", Snackbar.LENGTH_LONG);
                snackbar.show();
                snackbar.setAction("View", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(PatientSearchActivity.this, QuestionaireActivity.class));
                    }
                });
            }
            else
            {
                Snackbar snackbar = Snackbar.make(rootView, "Sorry couldn't create patient", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        }
    }
}