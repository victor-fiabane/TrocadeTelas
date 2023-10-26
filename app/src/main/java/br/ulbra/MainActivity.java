package br.ulbra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {

    Button btnTela1, btnTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarregarTelaPrincipal();
    }

    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        btnTela1 = (Button) findViewById(R.id.btnTela1);
        btnTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2();
            }
        });
    }
        public void CarregarTela2() {
            setContentView(R.layout.activity_main2);
            btnTela2 = (Button) findViewById (R.id.btnTela2);
            btnTela2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CarregarTelaPrincipal();
                }
            });
        } }
