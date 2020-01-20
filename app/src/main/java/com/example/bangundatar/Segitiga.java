package com.example.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Segitiga extends AppCompatActivity {

    Button submitButton;
    EditText widthInput, heightInput;
    TextView resultLabel;

    double width, height, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        widthInput = findViewById(R.id.widthInput);
        heightInput = findViewById(R.id.heightInput);
        resultLabel = findViewById(R.id.resultLabel);

        submitButton = findViewById(R.id.submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = Double.parseDouble(widthInput.getText().toString().trim());
                height= Double.parseDouble(heightInput.getText().toString().trim());

                result = width * height / 2;

                resultLabel.append(String.valueOf(result));
            }
        });

    }
}
