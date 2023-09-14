package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText passEdit;
    private CheckBox mCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        passEdit = findViewById(R.id.editTextNumberPassword);
        mCheckBox = findViewById((R.id.checkBox2));

        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked){
                if(isChecked){
                    passEdit.setTransformationMethod(null);
                }else{
                    passEdit.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
    }
}