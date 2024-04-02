package com.esaip.transfert_patient;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;


public class listechambre extends Activity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listechambre);

        Button UN ;
        Button DEUX ;

        UN = (Button)findViewById(R.id.UN);
        DEUX  = (Button)findViewById(R.id.DEUX);

        UN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent i = new Intent(listechambre.this, chambre.class);
                i.putExtra("Pat", "AT");

                startActivity(i);
            }
        });


        DEUX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(listechambre.this, chambre.class);
                i.putExtra("Pat", "MD");
                startActivity(i);
            }
        });

    }
}
