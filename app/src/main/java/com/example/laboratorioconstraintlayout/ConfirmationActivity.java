package com.example.laboratorioconstraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        // Obtener los datos de la intención
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String weight = intent.getStringExtra("WEIGHT");
        String price = intent.getStringExtra("PRICE");
        String location = intent.getStringExtra("LOCATION");
        String destination = intent.getStringExtra("DESTINATION");

        // Mostrar los datos en los TextViews
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewWeight = findViewById(R.id.textViewWeight);
        TextView textViewPrice = findViewById(R.id.textViewPrice);
        TextView textViewLocation = findViewById(R.id.textViewLocation);
        TextView textViewDestination = findViewById(R.id.textViewDestination);

        textViewName.setText("Nombre de carga: " + name);
        textViewWeight.setText("Peso: " + weight);
        textViewPrice.setText("Precio: " + price);
        textViewLocation.setText("Ubicación: " + location);
        textViewDestination.setText("Destino: " + destination);
    }
}
