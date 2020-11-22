package com.example.asutest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asutest.one.Oct;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView oriList;
    Button search;
    TextView result;
    EditText input;
    TextView time;

    int[] list = new int[]{-10, 100, 23, 6, 52, 10000};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        oriList = findViewById(R.id.ori_list);
        search = findViewById(R.id.search);
        result = findViewById(R.id.result);
        input = findViewById(R.id.input);
        time = findViewById(R.id.time);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time.setText(df.format(System.currentTimeMillis()));

        oriList.setText(Arrays.toString(list));

        search.setOnClickListener(v -> {
            if (input.getText() == null) {
                return;
            }

            int s = Integer.parseInt(input.getText().toString());
            boolean b = Oct.binarySearch(list, s);
            if (b) {
                result.setText("Result: Found");
            } else {
                result.setText("Result: Not found");
            }
        });

    }

}