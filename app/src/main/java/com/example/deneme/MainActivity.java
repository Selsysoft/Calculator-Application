package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button topla,cikar,carp,bol;
    EditText sayi1,sayi2;
    TextView sonuc;

    Double birinci,ikinci,sonuuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topla=findViewById(R.id.topla);
        cikar=findViewById(R.id.cikar);
        carp=findViewById(R.id.carp);
        bol=findViewById(R.id.bol);
        sayi1=findViewById(R.id.sayi1);
        sayi2=findViewById(R.id.sayi2);
        sonuc=findViewById(R.id.sonuc);

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                birinci=Double.parseDouble(sayi1.getText().toString());
                ikinci=Double.parseDouble(sayi2.getText().toString());

                sonuuc=birinci+ikinci;
                sonuc.setText(sonuuc.toString());
            }
        });
        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                birinci=Double.parseDouble(sayi1.getText().toString());
                ikinci=Double.parseDouble(sayi2.getText().toString());

                sonuuc=birinci-ikinci;
                sonuc.setText(sonuuc.toString());
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                birinci=Double.parseDouble(sayi1.getText().toString());
                ikinci=Double.parseDouble(sayi2.getText().toString());

                sonuuc=birinci*ikinci;
                sonuc.setText(sonuuc.toString());
            }
        });
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                birinci=Double.parseDouble(sayi1.getText().toString());
                ikinci=Double.parseDouble(sayi2.getText().toString());

                sonuuc=birinci/ikinci;
                sonuc.setText(sonuuc.toString());
            }
        });
    }
}
