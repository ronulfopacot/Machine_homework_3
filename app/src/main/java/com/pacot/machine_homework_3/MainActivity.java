package com.pacot.machine_homework_3;

import android.content.Intent;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(MainActivity.this,order_activity.class);
        RadioGroup rg = findViewById(R.id.type_burger);
        final RadioButton chicken = (RadioButton)findViewById(R.id.radio3);
        final RadioButton beef = (RadioButton)findViewById(R.id.radio4);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio3){
                    intent.putExtra("burger","Chicken");
                }
                else if (i == R.id.radio4){
                    intent.putExtra("burger","Beef");
                }
            }
        });

    }
}
