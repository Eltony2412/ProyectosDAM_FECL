package com.example.dam_sem11_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    //usuario establecido:
    String usuario = "1913110155";
    String password = "1913110155";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view) {

                //vinculamo datos:
                EditText usuarioI = findViewById(R.id.editTextEmail);
                EditText passwordI = findViewById(R.id.editTextPassword);

                //obtengo datos:
                String usu = String.valueOf(usuarioI.getText());
                String contra = String.valueOf(passwordI.getText());

                if (usu.equals(usuario)){
                    if(contra.equals(password)){
                        Intent i = new Intent(MainActivity.this, NotasActivity.class);
                        startActivity(i);
                    }
                    else{
                        Snackbar.make(view, "Usuario/Contraseña incorrectos", Snackbar.LENGTH_LONG).show();                    }
                }
                else{
                    Snackbar.make(view, "Usuario/Contraseña incorrectos", Snackbar.LENGTH_LONG).show();
                }


            }
        });

    }
}