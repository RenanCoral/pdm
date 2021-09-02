package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editNomeUsuario, editSenhaUsuario;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);

        editNomeUsuario = findViewById(R.id.editNomeUsuario);
        editSenhaUsuario = findViewById(R.id.editSenhaUsuario);
        btnSalvar = findViewById(R.id.btnSalvar);
    }
}
