package com.m00061016.tarealabo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Scorep2(View v){
        String p,aux;
        TextView scrp,scrp1;
        aux ="";
        scrp = (TextView)this.findViewById(R.id.screp2);

        p = scrp.getText().toString();

        switch(p){
            case "0":
                scrp.setText("15");
                break;
            case "15":
                scrp.setText("30");
                break;
            case "30":
                scrp.setText("40");
                break;
            case "40":
                scrp1 = findViewById(R.id.screp1);
                aux=scrp1.getText().toString();

                if(aux == "40") {
                    scrp.setText("advantage");
                } else if(aux == "advantage"){
                    scrp1.setText("40");

                } else if(aux != "40"){
                    scrp1.setText("0");
                    scrp.setText("0");
                }
            break;
            case "advantage":
                scrp1 = findViewById(R.id.screp1);

                scrp1.setText("0");
                scrp.setText("0");
                break;
        }
    }
    public void Scorep1(View v){
        String p,aux;
        TextView scrp,scrp2;
        aux= "";
        scrp = (TextView)this.findViewById(R.id.screp1);

        p = scrp.getText().toString();

        switch(p){
            case "0":
                scrp.setText("15");
                break;
            case "15":
                scrp.setText("30");
                break;
            case "30":
                scrp.setText("40");
                break;
            case "40":
                scrp2 = findViewById(R.id.screp2);
                aux=scrp2.getText().toString();

                if(aux == "40") {
                    scrp.setText("advantage");
                } else if(aux == "advantage"){
                    scrp2.setText("40");

                } else if(aux != "40"){
                    scrp2.setText("0");
                    scrp.setText("0");
                }
                break;
            case "advantage":
                scrp2 = findViewById(R.id.screp2);

                scrp2.setText("0");
                scrp.setText("0");
                break;
        }
    }
}
