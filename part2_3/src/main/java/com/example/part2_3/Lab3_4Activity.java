package com.example.part2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Lab3_4Activity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_4);

        TextView textView=findViewById(R.id.fontView);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "joker.png");
        textView.setTypeface(typeface); // fontView 라는 텍스트뷰의 폰트를 typeface로 바꿔라

        checkBox=findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox.setText("is Checked");
                }else {
                    checkBox.setText("is unChecked");
                }
            }
        });


    }
}
