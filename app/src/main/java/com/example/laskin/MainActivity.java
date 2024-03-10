package com.example.laskin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput1;
    private EditText numberInput2;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        numberInput1 = findViewById(R.id.editFirstNumber);
        numberInput2 = findViewById(R.id.editSecondNumber);
        add = findViewById(R.id.plusButton);
        subtract = findViewById(R.id.minusButton);
        multiply = findViewById(R.id.multiplyButton);
        divide = findViewById(R.id.divideButton);
        result = findViewById(R.id.textSeeResult);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void addNumbers(View view){
        int num1 = Integer.parseInt(String.valueOf(numberInput1.getText()));
        int num2 = Integer.parseInt(String.valueOf(numberInput2.getText()));
        int calculation = num1+num2;
        result.setText(Integer.toString(calculation));
    }

    public void subtractNumbers(View view){
        int num1 = Integer.parseInt(String.valueOf(numberInput1.getText()));
        int num2 = Integer.parseInt(String.valueOf(numberInput2.getText()));
        int calculation = num1-num2;
        result.setText(Integer.toString(calculation));
    }

    public void multiplyNumbers(View view){
        int num1 = Integer.parseInt(String.valueOf(numberInput1.getText()));
        int num2 = Integer.parseInt(String.valueOf(numberInput2.getText()));
        int calculation = num1*num2;
        result.setText(Integer.toString(calculation));
    }

    public void divideNumbers(View view){
        int num1 = Integer.parseInt(String.valueOf(numberInput1.getText()));
        int num2 = Integer.parseInt(String.valueOf(numberInput2.getText()));
        int calculation = num1/num2;
        result.setText(Integer.toString(calculation));
    }
}