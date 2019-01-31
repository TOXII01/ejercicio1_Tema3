package com.hu.yunyang.ejercicio1_tema3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bsaluda;
    private EditText etnombre;
    private EditText etapellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsaluda = findViewById(R.id.bsaluda);
        etnombre = findViewById(R.id.etnombre);
        etapellidos = findViewById(R.id.etapellido);

        bsaluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hola " + etnombre.getText() + " " + etapellidos.getText(), Toast.LENGTH_LONG).show();

            }
        });

        }

    }


