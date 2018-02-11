package com.example.supremegoldieking.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String emptyString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view) {
                        EditText inputFirstNum = findViewById(R.id.inputFirstNum);
                        EditText inputSecondNum = findViewById(R.id.inputSecondNum);
                        TextView resultTextView = findViewById(R.id.resultTextView);

                        int num1 = Integer.parseInt(inputFirstNum.getText().toString());
                        int num2 = Integer.parseInt(inputSecondNum.getText().toString());
                        int result = num1 + num2;
                        String resultString = result + emptyString;
                        resultTextView.setText(resultString);
            }

        });
    }
}
