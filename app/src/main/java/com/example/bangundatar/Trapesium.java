package com.example.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Trapesium extends AppCompatActivity {
    EditText sisi1Input, sisi2Input, heightInput;
    TextView resultLabel;
    Button submitButton;

    double sisi1, sisi2, height, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        sisi1Input = findViewById(R.id.sisi1Input);
        sisi2Input = findViewById(R.id.sisi2Input);
        heightInput = findViewById(R.id.heightInput);

        submitButton = findViewById(R.id.submit);
        resultLabel = findViewById(R.id.resultLabel);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi1 = Double.parseDouble(sisi1Input.getText().toString().trim());
                sisi2 = Double.parseDouble(sisi2Input.getText().toString().trim());
                height = Double.parseDouble(heightInput.getText().toString().trim());

                result = (sisi1 + sisi2) * height / 2;
                resultLabel.append(String.valueOf(result));
            }
        });

    }
}
