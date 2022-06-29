package com.example.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.txtNome);
        EditText e2 = (EditText) findViewById(R.id.txtEmail);
        EditText e3 = (EditText) findViewById(R.id.txtsenha);

        TextView t1 = (TextView)  findViewById(R.id.titulo);

        Button b1 = (Button) findViewById(R.id.btnOK);
        //escutar quando tiver um clique no botao
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView lbl = (TextView) findViewById(R.id.lblResultado);
                final EditText txtNome = (EditText) findViewById(R.id.txtNome);
                String nome = txtNome.getText().toString();
                lbl.setText("oi mundo." + nome +" tudo bem?");
            }
        });


    }
}