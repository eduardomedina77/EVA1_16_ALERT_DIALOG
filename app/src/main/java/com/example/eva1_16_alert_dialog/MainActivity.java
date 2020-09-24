package com.example.eva1_16_alert_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onShowAletrDialog(View v){
        new AlertDialog.Builder(this)
                //AlertDialog miCuadroDialogo = new ....
                //miCuadroDialogo.setTitle...
                .setTitle("CUADRO DE DIALOGO DE ANDROID")
                .setMessage("Cuadro de dialogo")
                //.setIcon(R.drawable.ic_launcher_foreground)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                        Log.wtf("ALERT DIALOG","YES");
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                        Log.wtf("ALERT DIALOG","NO");
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                        Log.wtf("ALERT DIALOG","CANCEL");
                    }
                })
                .create()
                .show();
    }

    public void  onShowMyAlertDialog(View v){
        final Dialog miCuadroDialogo = new Dialog(this);
        miCuadroDialogo.setContentView(R.layout.mi_dialogo);
        TextView txtVwTitu;
        txtVwTitu = miCuadroDialogo.findViewById(R.id.txtVwTitulo);
        txtVwTitu.setText("ESTE ES MI CUADRO DE DIALOGO!!!");
        final EditText edtTxtDatos;
        edtTxtDatos = miCuadroDialogo.findViewById(R.id.edtTxtDatos);
        Button btnOK;
        btnOK = miCuadroDialogo.findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sCade;
                sCade = edtTxtDatos.getText().toString();
                Log.wtf("CUADRO PERSONAL",sCade);
                miCuadroDialogo.dismiss();
            }
        });
        miCuadroDialogo.show();
    }
}