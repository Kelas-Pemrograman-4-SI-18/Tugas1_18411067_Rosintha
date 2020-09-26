package com.e.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtInput ;
EditText edtNama, edtAlamat, edtProdi, edtNPM ;
Button btnInput ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = (TextView) findViewById(R.id.txtBiodata);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtNPM = (EditText) findViewById(R.id.edtNpm);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        btnInput = (Button) findViewById(R.id.btnInput);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nama = edtNama.getText().toString();
                String Alamat = edtAlamat.getText().toString();
                String Prodi = edtProdi.getText().toString();
                String Npm = edtNPM.getText().toString();

                txtInput.setText(Nama + "\n" + Alamat + "\n" + Prodi + "\n" + Npm);
            }
            });

    }
}
