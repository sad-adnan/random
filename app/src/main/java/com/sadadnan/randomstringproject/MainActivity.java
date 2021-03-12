package com.sadadnan.randomstringproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sadadnan.randomstringlib.RandomNum;
import com.sadadnan.randomstringlib.RandomString;

public class MainActivity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4;
    private Button generateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        initializeIds();

        generate();

        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generate();
            }
        });

    }

    private void generate() {
        String ranString = RandomString.getRandomString(16);
        int ranInt = RandomNum.getRandomInt(1,100);
        float ranFloat = RandomNum.getRandomFloat(1.0F,100.0F);
        double ranDouble = RandomNum.getRandomDouble(1,100);

        tv1.setText("Random String : "+ranString);
        tv2.setText("Random Int : "+ranInt);
        tv3.setText("Random Float : "+ranFloat);
        tv4.setText("Random Double : "+ranDouble);
    }

    private void initializeIds() {
        tv1 = findViewById(R.id.randomStringTV);
        tv2 = findViewById(R.id.randomIntTV);
        tv3 = findViewById(R.id.randomFloatTV);
        tv4 = findViewById(R.id.randomDoubleTV);
        generateBtn = findViewById(R.id.generateBtn);
    }
}