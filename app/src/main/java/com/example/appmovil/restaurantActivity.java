package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class restaurantActivity extends AppCompatActivity {

    private ImageButton btnVege,btnCor,btnEjec,btnComi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        configureButton();
    }

    @SuppressLint("WrongViewCast")
    private void configureButton(){
        btnVege = findViewById(R.id.btnVeget);
        btnCor = findViewById(R.id.btnCorri);
        btnEjec = findViewById(R.id.btnEje);
        btnComi = findViewById(R.id.btnCom);

        btnVege.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(restaurantActivity.this, MapsActivity.class));
            }
        });
        btnCor.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(restaurantActivity.this, MapsActivity.class));
            }
        });
        btnEjec.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(restaurantActivity.this, MapsActivity.class));
            }
        });
        btnComi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(restaurantActivity.this, MapsActivity.class));
            }
        });


    }
}
