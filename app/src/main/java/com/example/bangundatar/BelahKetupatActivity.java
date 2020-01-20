package com.example.bangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BelahKetupatActivity extends AppCompatActivity {

    private EditText etSisi, etDiagonal1, etDiagonal2;
    private Button btnHitung, btnReset;
    private TextView tvHasilLuas, tvHasilKeliling;
    private Double inputSisi, inputDiagonal1, inputDiagonal2, hasilLuas, hasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Belah Ketupat");
        }

        // input
        etSisi = findViewById(R.id.etSisi);
        etDiagonal1 = findViewById(R.id.etDiagonal1);
        etDiagonal2 = findViewById(R.id.etDiagonal2);

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

                inputSisi = toDouble(etSisi.getText().toString().trim());
                inputDiagonal1 = toDouble(etDiagonal1.getText().toString().trim());
                inputDiagonal2 = toDouble(etDiagonal1.getText().toString().trim());

                if(inputDiagonal1 != null && inputDiagonal2 != null) {
                    hasilLuas = inputDiagonal1 * inputDiagonal2 / 2;
                    tvHasilLuas.setText("Luas : "+hasilLuas);
                } else {
                    tvHasilLuas.setText("Luas : 0");
                }

                if(inputSisi != null) {
                    hasilKeliling = inputSisi * 4;
                    tvHasilKeliling.setText("Keliling : "+hasilKeliling);
                } else {
                    tvHasilKeliling.setText("Keliling : 0");
                }

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSisi.setText("");
                etDiagonal1.setText("");
                etDiagonal1.setText("");
                tvHasilLuas.setText("");
                tvHasilKeliling.setText("");
                etSisi.clearFocus();
                etDiagonal1.clearFocus();
                etDiagonal2.clearFocus();
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
