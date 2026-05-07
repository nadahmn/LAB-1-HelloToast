package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupère les éléments de l'écran
        textCount = findViewById(R.id.text_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Bouton 1 : Afficher le Toast
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bonjour !", Toast.LENGTH_SHORT).show();
            }
        });

        // Bouton 2 : Incrémenter le compteur
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textCount.setText(String.valueOf(count));
            }
        });
    }
}