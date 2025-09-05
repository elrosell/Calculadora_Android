package com.example.calculadora;

import static android.app.ProgressDialog.show;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText textito1,textito2;
    Button botoncitos, botoncitor, botoncitom, botoncitod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textito1 = findViewById(R.id.textito1);
        textito2 = findViewById(R.id.textito2);

        botoncitos = findViewById(R.id.bots);
        botoncitos.setOnClickListener(this);

        botoncitod = findViewById(R.id.botd);
        botoncitod.setOnClickListener(this);

        botoncitom = findViewById(R.id.botm);
        botoncitom.setOnClickListener(this);

        botoncitor = findViewById(R.id.botr);
        botoncitor.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String cadenita =((Button)v).getText().toString();
        Clasecita objetito = new Clasecita();
        objetito.setDatito1(Integer.parseInt(textito1.getText().toString()));
        objetito.setDatito2(Integer.parseInt(textito2.getText().toString()));
        if(cadenita.equals("+"))
        {Toast.makeText(this,"La Suma es ",
                Toast.LENGTH_SHORT).show();}
        else if(cadenita.equals("-"))
        {Toast.makeText(this, "La Resta es" + objetito.restita(),
                    Toast.LENGTH_SHORT).show();}
        else if(cadenita.equals("*"))
        {Toast.makeText(this, "La Multiplicación es " + objetito.multiplicacioncita(),
                    Toast.LENGTH_SHORT).show();}
        else
        {Toast.makeText(this, "La División es " + objetito.divisioncita(),
                    Toast.LENGTH_SHORT).show();}
    }
}
