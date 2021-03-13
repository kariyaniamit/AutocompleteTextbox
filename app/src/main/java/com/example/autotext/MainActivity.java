package com.example.autotext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView at;
    String[] countries={"argentina","aus","bangladesh","bhutan","england","india","pakistan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adp=new ArrayAdapter<>(this,android.R.layout.select_dialog_item,countries);
        at=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        at.setThreshold(1);
        at.setAdapter(adp);
        at.setTextColor(Color.RED);

    }
}