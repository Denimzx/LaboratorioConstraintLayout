package com.example.laboratorioconstraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextWeight, editTextPrice, editTextLocation, editTextDestination;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextPrice = findViewById(R.id.editTextPrice);
        editTextLocation = findViewById(R.id.editTextLocation);
        editTextDestination = findViewById(R.id.editTextDestination);
        buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendRequest();
            }
        });
    }

    private void sendRequest() {
        // Obtener los valores de los campos
        String name = editTextName.getText().toString();
        String weight = editTextWeight.getText().toString();
        String price = editTextPrice.getText().toString();
        String location = editTextLocation.getText().toString();
        String destination = editTextDestination.getText().toString();

        // Crear intent para abrir ConfirmationActivity
        Intent intent = new Intent(MainActivity.this, ConfirmationActivity.class);
        // Pasar datos a la nueva actividad
        intent.putExtra("NAME", name);
        intent.putExtra("WEIGHT", weight);
        intent.putExtra("PRICE", price);
        intent.putExtra("LOCATION", location);
        intent.putExtra("DESTINATION", destination);
        // Iniciar la nueva actividad
        startActivity(intent);
    }
}
