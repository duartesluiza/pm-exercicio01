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

        EditText e1 = (EditText) findViewById(R.id.nome);
        EditText e2 = (EditText) findViewById(R.id.telefone);
        EditText e3 = (EditText) findViewById(R.id.senha);

        TextView t1 = (TextView)  findViewById(R.id.titulo);

        Button b1 = (Button) findViewById(R.id.bt1);
        //escutar quando tiver um clique no botao
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(e1.getText()+"-"+e2.getText()+"-"+e3.getText());
            }
        });
    }

}