package com.example.bangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajaranGenjangActivity extends AppCompatActivity {

    private EditText etSisiAlas, etSisiMiring, etTinggi;
    private Button btnHitung, btnReset;
    private TextView tvHasilLuas, tvHasilKeliling;
    private Double inputSisiAlas, inputSisiMiring, inputTinggi, hasilLuas, hasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajaran_genjang);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Jajaran Genjang");
        }

        // input
        etSisiAlas = findViewById(R.id.etSisiAlas);
        etSisiMiring = findViewById(R.id.etSisiMiring);
        etTinggi = findViewById(R.id.etTinggi);

        // button
        btnHitung = findViewById(R.id.btnHitung);
        btnReset = findViewById(R.id.btnReset);

        // hasil
        tvHasilLuas = findViewById(R.id.tvHasilLuas);
        tvHasilKeliling = findViewById(R.id.tvHasilKeliling);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvHasilLuas.setText("");
                tvHasilKeliling.setText("");

                inputSisiAlas = toDouble(etSisiAlas.getText().toString().trim());
                inputSisiMiring = toDouble(etSisiMiring.getText().toString().trim());
                inputTinggi = toDouble(etTinggi.getText().toString().trim());

                if(inputSisiAlas != null && inputTinggi != null) {
                    hasilLuas = inputSisiAlas * inputTinggi;
                    tvHasilLuas.setText("Luas : "+hasilLuas);
                } else {
                    tvHasilLuas.setText("Luas : 0");
                }

                if(inputSisiAlas != null && inputSisiMiring != null) {
                    hasilKeliling = 2 * (inputSisiAlas + inputSisiMiring);
                    tvHasilKeliling.setText("Keliling : "+hasilKeliling);
                } else {
                    tvHasilKeliling.setText("Keliling : 0");
                }

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSisiAlas.setText("");
                etSisiMiring.setText("");
                etTinggi.setText("");
                tvHasilLuas.setText("");
                tvHasilKeliling.setText("");
                etSisiAlas.clearFocus();
                etSisiMiring.clearFocus();
                etTinggi.clearFocus();
            }
        });
    }

    public Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
