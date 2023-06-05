package com.example.damsem10_toastsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //SE CREAN LOS DOS BOTONES
    Button btnToast, btnSnackBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se vincula los botones con variables creadas
        btnToast = findViewById(R.id.buttonToast);
        btnSnackBar = findViewById(R.id.buttonSnackBar);

        //evento click
        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
    }

    //SE PONEN LOS BOTONES
    public void onClick(View v){
        if(v.getId() == R.id.buttonToast){
            Toast.makeText(this, "Mostrando Toast", Toast.LENGTH_SHORT).show();
        }
        else{
            Snackbar.make(v, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_SHORT).show();
        }
    }
}