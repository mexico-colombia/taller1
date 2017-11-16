package com.example.cristian.mytoolbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Traductor extends AppCompatActivity implements View.OnClickListener {

    Button EtoI, ItoE;
    int Cont = 0, cont2 = 0;
    String SaveWord;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traductor);

        EtoI = (Button) findViewById(R.id.btn_EtoI);
        EtoI.setOnClickListener(this);
        ItoE = (Button) findViewById(R.id.btn_ItoE);
        ItoE.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        EditText etpalabra = (EditText) findViewById(R.id.ETpalabra);
        SaveWord = etpalabra.getText().toString();
        etpalabra.setText("");
        TextView txtpalabra = (TextView) findViewById(R.id.txtresult);
        String x = "hola";
        int select = view.getId();

        try {
            switch (select) {

                case R.id.btn_EtoI:


                     if (x.toString() != SaveWord.toString())
                     {
                         txtpalabra.setText("Funciona");
                     }


                    break;

                case R.id.btn_ItoE:

                    if (SaveWord == "hello"){ txtpalabra.setText("Hola");}

                    break;

            }
        } catch (Exception e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}

