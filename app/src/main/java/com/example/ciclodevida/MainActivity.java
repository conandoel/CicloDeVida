package com.example.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botonSaludar, botonReset;
    private EditText editNombre;
    private TextView textSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSaludar = findViewById(R.id.botonSaludar);
        botonReset = findViewById(R.id.botonReset);
        editNombre = findViewById(R.id.editNombre);
        textSaludo = findViewById(R.id.textSaludo);
    }

    public void saludar(View v){
        if(editNombre.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar un Nombre", Toast.LENGTH_SHORT).show();
            //Log.i("saludo", "saludar: ");
        }
        else {
            //el usuario ingresa su nombre
            textSaludo.setText("Bienvenido " + editNombre.getText().toString());
            botonReset.setEnabled(true);
        }

    }

    public void reset(View v){
        textSaludo.setText("");
        editNombre.setText("");
        botonReset.setEnabled(false);

    }
}
