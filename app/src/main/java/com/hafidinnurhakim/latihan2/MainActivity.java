package com.hafidinnurhakim.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button
btPesanDua,btTampilkanNama,btTambah,btKurang,btKali,btBagi,btWhile,btDoWhile,btFor;
    EditText etNama,etBil1,etBil2,etHasil;
    TextView tvBilangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPesanDua=(Button)findViewById(R.id.btPesanDua);
        btPesanDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini Dari Tombol Dua",
                        Toast.LENGTH_SHORT).show();
            }
        });

        etNama=(EditText)findViewById(R.id.etNama);
        btTampilkanNama=(Button)findViewById(R.id.btTampilkanNama);
        btTampilkanNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, etNama.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        etBil1=(EditText)findViewById(R.id.etBil1);
        etBil2=(EditText)findViewById(R.id.etBil2);
        etHasil=(EditText)findViewById(R.id.etHasil);

        btTambah=(Button)findViewById(R.id.btTambah);
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Tambah");
            }
        });

        btKurang=(Button)findViewById(R.id.btKurang);
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kurang");
            }
        });

        btKali=(Button)findViewById(R.id.btKali);
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kali");
            }
        });

        btBagi=(Button)findViewById(R.id.btBagi);
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Bagi");
            }
        });

        tvBilangan=(TextView)findViewById(R.id.tvBilangan);
        btWhile=(Button)findViewById(R.id.btWhile);
        btWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil=2;
                tvBilangan.setText("");
                while (bil<=20){

tvBilangan.setText(tvBilangan.getText().toString()+String.valueOf(bil)+",");
                    bil+=2;
                }
            }
        });

        btDoWhile=(Button)findViewById(R.id.btDoWhile);
        btDoWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil=1;
                tvBilangan.setText("");
                do {

tvBilangan.setText(tvBilangan.getText().toString()+String.valueOf(bil)+",");
                    bil+=2;
                } while (bil<=20);

            }
        });

        btFor=(Button)findViewById(R.id.btFor);
        btFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBilangan.setText("");
                for(int bil=1;bil<=10;bil++){

tvBilangan.setText(tvBilangan.getText().toString()+String.valueOf(bil)+",");
                }
            }
        });

    }

    public void TampilkanPesan(View view) {
        Toast.makeText(this, "Selamat Belajar Android", Toast.LENGTH_SHORT).show();
    }

    void prosesMatematika(String Jenisproses){
        if (statusIsian()==true){
            ProsesHitung2 prosesHitung2=new ProsesHitung2(Double.valueOf(etBil1.getText().toString()),Double.valueOf(etBil2.getText().toString()));
            if(Jenisproses.equalsIgnoreCase("Tambah")) {
                etHasil.setText(String.valueOf(prosesHitung2.getTambah()));
            } else if(Jenisproses.equalsIgnoreCase("Kurang")) {
                etHasil.setText(String.valueOf(prosesHitung2.getKurang()));
            } else if(Jenisproses.equalsIgnoreCase("Kali")) {
                etHasil.setText(String.valueOf(prosesHitung2.getKali()));
            } else if(Jenisproses.equalsIgnoreCase("Bagi")) {
                etHasil.setText(String.valueOf(prosesHitung2.getBagi()));
            }
        }
    }

        boolean statusIsian(){
            boolean vstatus=true;
            if(etBil1.getText().toString().isEmpty()) {
                Toast.makeText(this, "Bilangan satu harap diisi", Toast.LENGTH_SHORT).show();
                etBil1.requestFocus();
                vstatus=false;
            } else if(etBil2.getText().toString().isEmpty()) {
                Toast.makeText(this, "Bilangan dua harap diisi", Toast.LENGTH_SHORT).show();
                etBil1.requestFocus();
                vstatus=false;
            }
            return vstatus;
        }
    }