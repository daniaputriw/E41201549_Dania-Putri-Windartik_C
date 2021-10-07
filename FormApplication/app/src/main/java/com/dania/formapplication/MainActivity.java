package com.dania.formapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView foto;
    TextView tnim, tnama, ttl, ttgl, tjk, tgolongan, tagama, thasil, kt;
    EditText enim, enama, etempat, etgl;
    RadioGroup rgl;
    RadioButton jk;
    Button tmbl;
    Spinner s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foto = (ImageView) findViewById(R.id.image1);
        tnim = (TextView) findViewById(R.id.nim);
        tnama = (TextView) findViewById(R.id.nama);
        tjk = (TextView) findViewById(R.id.jk);
        tgolongan = (TextView) findViewById(R.id.golongan);
        tagama = (TextView) findViewById(R.id.agama);
        ttl = (TextView) findViewById(R.id.tempat);
        ttgl = (TextView) findViewById(R.id.tgl);
        thasil = (TextView) findViewById(R.id.hasil);
        enim = (EditText) findViewById(R.id.innim);
        enama = (EditText) findViewById(R.id.innama);
        etempat = (EditText) findViewById(R.id.intempat);
        etgl = (EditText) findViewById(R.id.intgl);
        rgl = (RadioGroup) findViewById(R.id.rg);
        tmbl = (Button) findViewById(R.id.tombol);
        s1 = (Spinner) findViewById(R.id.sgolongan);
        s2 = (Spinner) findViewById(R.id.sagama);

        tmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //TODO Auto_generated method stub
                String inputnim =
                        String.valueOf(enim.getText().toString());
                String inputnama =
                        String.valueOf(enama.getText().toString());
                String inputtempat =
                        String.valueOf(etempat.getText().toString());
                String inputtanggal =
                        String.valueOf(etgl.getText().toString());
                String inputgolongan =
                        String.valueOf(s1.getSelectedItem().toString());
                String inputagama =
                        String.valueOf(s2.getSelectedItem().toString());

                int pilihidjk = rgl.getCheckedRadioButtonId();
                jk = (RadioButton) findViewById(pilihidjk);

                Intent intent = new Intent(MainActivity.this, Layout.class);

                Bundle b = new Bundle();
                b.putString("parse_nim", inputnim);
                b.putString("parse_nama", inputnama);
                b.putString("parse_golongan", inputgolongan);
                b.putString("parse_agama", inputagama);
                b.putString("parse_jk", jk.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}