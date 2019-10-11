package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnEntrar;
    private Button btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureBoton();
    }
    private void configureBoton(){

        btnEntrar = findViewById(R.id.entrar);
        btnRegis = findViewById((R.id.regis));

        btnEntrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, restaurantActivity.class));
            }
        });

        btnRegis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, RegistrarActivity.class));
            }
        });
    }
}
