package com.esaip.transfert_patient;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.widget.Toast;

public class chambre extends Activity {

    Button On;
    EditText ValeurPoids;
    int Seconde;
    TextView Energie;
    TextView Brancard;

    TextView VerinHaut;
    TextView VerinBas;
    TextView FermetureGauche;
    TextView FermetureDroite;
    TextView LitBouge;

    TextView Nom;
    TextView Prenom;

    Button Retour;

    public void displayMsg(String str){
        Toast.makeText(this, On.getText() + str, Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chambre);

        On = (Button) findViewById(R.id.On);
        Nom = (TextView)findViewById(R.id.Nom);
        Prenom = (TextView)findViewById(R.id.Prenom);
        Retour = (Button) findViewById(R.id.Retour);
        ValeurPoids = (EditText)findViewById(R.id.ValeurPoids);
        Energie = (TextView)findViewById(R.id.Energie);
        Brancard = (TextView)findViewById(R.id.Brancard);
        VerinHaut = (TextView)findViewById(R.id.VerinHaut);
        VerinBas = (TextView)findViewById(R.id.VerinBas);
        FermetureGauche = (TextView)findViewById(R.id.FermetureGauche);
        FermetureDroite = (TextView)findViewById(R.id.FermetureDroite);
        LitBouge = (TextView)findViewById(R.id.LitBouge);
        Seconde = 33;

        Bundle extras = getIntent().getExtras();
        String C = extras.getString("Pat");

        switch (C){

            case "MD" : {
                Prenom.setText("Marion");
                Nom.setText("DUPOND");
             }break;

            case "AT" : {
                Prenom.setText("Arthur");
                Nom.setText("TAURAN");
            }break;
        }


        On.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(On.getText() == "Mettre le matelas sur le brancard")
                {
                    FermetureDroite.setVisibility(View.INVISIBLE);
                    VerinHaut.setTranslationX(380);
                    VerinBas.setTranslationX(380);
                    FermetureGauche.setVisibility(View.INVISIBLE);
                    LitBouge.setTranslationX(380);
                    /*Energie.setText(ValeurPoids.getText());*/
                    On.setText("Mettre le matelas sur le lit");
                }
                else {
                    VerinHaut.setTranslationX(0);
                    VerinBas.setTranslationX(0);
                    LitBouge.setTranslationX(0);
                    FermetureDroite.setVisibility(View.VISIBLE);
                    FermetureGauche.setVisibility(View.VISIBLE);
                    On.setText("Mettre le matelas sur le brancard");
                }

            }
        });


        Retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(chambre.this, listechambre.class);
                startActivity(i);

            }
        });

    }
}