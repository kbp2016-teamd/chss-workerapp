package com.chss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class QuestionaireActivity extends AppCompatActivity implements View.OnClickListener
{
    public View weightView, temperatureView, systBPView, diaBPView,
            coughView, coughWithBloodView, sweatsView, fatigueView,
            weaknessView, weightLossView, chestPainView, shortnessOfBreathView,
            skinRashView, muscleAcheView, jointPainView, diarrheaView,
            swollenLymphView, palpitationsView, heartBurnView,
            weightGainView, nauseaView, paralysisView, numbnessView,
            blurredVisionView, dizzinessView, lossOfBalanceView,
            vomittingView, chillsView, soreThroastView,
            sneezingView, headacheView, congestionView, dryCoughView;

    public EditText weightEditText, temperatureRadioGroup, systBPRadioGroup, diaBPRadioGroup,
            coughRadioGroup, coughWithBloodRadioGroup, sweatsRadioGroup, fatigueRadioGroup,
            weaknessRadioGroup, weightLossRadioGroup, chestPainRadioGroup, shortnessOfBreathRadioGroup,
            skinRashRadioGroup, muscleAcheRadioGroup, jointPainRadioGroup, diarrheaRadioGroup,
            swollenLymphRadioGroup, palpitationsRadioGroup, heartBurnRadioGroup,
            weightGainRadioGroup, nauseaRadioGroup, paralysisRadioGroup, numbnessRadioGroup,
            blurredVisionRadioGroup, dizzinessRadioGroup, lossOfBalanceRadioGroup,
            vomittingRadioGroup, chillsRadioGroup, soreThroastRadioGroup,
            sneezingRadioGroup, headacheRadioGroup, congestionRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionaire);

        weightView = findViewById(R.id.layoutWeight);
        coughWithBloodView = findViewById(R.id.layoutBloodCough);
        blurredVisionView = findViewById(R.id.layoutBlurredVision);
        chestPainView = findViewById(R.id.layoutChestPain);
        chillsView = findViewById(R.id.layoutChills);
        congestionView = findViewById(R.id.layoutCongestion);
        coughView = findViewById(R.id.layoutCough);
        diaBPView = findViewById(R.id.layoutDiaBP);
        diarrheaView = findViewById(R.id.layoutDiarrhea);
        dizzinessView = findViewById(R.id.layoutDizziness);
        dryCoughView = findViewById(R.id.layoutDryCough);
        headacheView = findViewById(R.id.layoutHeadache);
        fatigueView = findViewById(R.id.layoutFatigue);
        heartBurnView = findViewById(R.id.layoutHeartburn);
        weightLossView = findViewById(R.id.layoutWeightLoss);
        weaknessView = findViewById(R.id.layoutWeakness);
        vomittingView = findViewById(R.id.layoutVomiting);
        temperatureView = findViewById(R.id.layoutTemperature);
        systBPView = findViewById(R.id.layoutSystBP);
        swollenLymphView = findViewById(R.id.layoutSwollenLymth);
        soreThroastView = findViewById(R.id.layoutSoreThroat);
        sneezingView = findViewById(R.id.layoutSneezing);
        skinRashView = findViewById(R.id.layoutSkinRash);
        shortnessOfBreathView = findViewById(R.id.layoutShortnessofBreath);
        numbnessView = findViewById(R.id.layoutNumbness);
        nauseaView = findViewById(R.id.layoutNausea);
        lossOfBalanceView = findViewById(R.id.layoutLossofBalance);
        jointPainView = findViewById(R.id.layoutJointPain);
        muscleAcheView = findViewById(R.id.layoutMuscleAche);

        weightView = findViewById(R.id.layoutWeight);
        coughWithBloodView = findViewById(R.id.layoutBloodCough);
        blurredVisionView = findViewById(R.id.layoutBlurredVision);
        chestPainView = findViewById(R.id.layoutChestPain);
        chillsView = findViewById(R.id.layoutChills);
        congestionView = findViewById(R.id.layoutCongestion);
        coughView = findViewById(R.id.layoutCough);
        diaBPView = findViewById(R.id.layoutDiaBP);
        diarrheaView = findViewById(R.id.layoutDiarrhea);
        dizzinessView = findViewById(R.id.layoutDizziness);
        dryCoughView = findViewById(R.id.layoutDryCough);
        headacheView = findViewById(R.id.layoutHeadache);
        fatigueView = findViewById(R.id.layoutFatigue);
        heartBurnView = findViewById(R.id.layoutHeartburn);
        weightLossView = findViewById(R.id.layoutWeightLoss);
        weaknessView = findViewById(R.id.layoutWeakness);
        vomittingView = findViewById(R.id.layoutVomiting);
        temperatureView = findViewById(R.id.layoutTemperature);
        systBPView = findViewById(R.id.layoutSystBP);
        swollenLymphView = findViewById(R.id.layoutSwollenLymth);
        soreThroastView = findViewById(R.id.layoutSoreThroat);
        sneezingView = findViewById(R.id.layoutSneezing);
        skinRashView = findViewById(R.id.layoutSkinRash);
        shortnessOfBreathView = findViewById(R.id.layoutShortnessofBreath);
        numbnessView = findViewById(R.id.layoutNumbness);
        nauseaView = findViewById(R.id.layoutNausea);
        lossOfBalanceView = findViewById(R.id.layoutLossofBalance);
        jointPainView = findViewById(R.id.layoutJointPain);
        muscleAcheView = findViewById(R.id.layoutMuscleAche);

        Button addEvaluationBtn = (Button) findViewById(R.id.createEvaluation);
        addEvaluationBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        HashMap<String, String> evaulation = new HashMap<>();
        DataClass.addEvaluation(evaulation);
    }
}