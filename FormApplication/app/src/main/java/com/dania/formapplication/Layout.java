package com.dania.formapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Layout extends AppCompatActivity {

    TextView nama, golongan, nim, agama, jk;
    String getnama, getgolongan, getnim, getagama, getjk;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        nim = (TextView) findViewById(R.id.nim);
        nama = (TextView) findViewById(R.id.nama);
        golongan = (TextView) findViewById(R.id.golongan);
        agama = (TextView) findViewById(R.id.agama);
        jk = (TextView) findViewById(R.id.jk);

Bundle b = getIntent().getExtras();
        getnim = b.getString("parse_nim");
        getnama = b.getString("parse_nama");
        getgolongan = b.getString("parse_golongan");
        getjk = b.getString("parse_jk");
        getagama = b.getString("parse_agama");

        nim.setText("NIM                :"+getnim);
        nim.setText("NAMA               :"+getnama);
        nim.setText("GOLONGAN           :"+getgolongan);
        nim.setText("JENIS KELAMIN      :"+getjk);
        nim.setText("AGAMA              :"+getagama);
    }
}
