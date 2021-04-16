package com.example.playcards;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reply extends AppCompatActivity {

    private EditText edtxt1,edtxt2,edtxt3,edtxt4,edtxt5;

    private Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);

        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Reply");
        //text= findViewById(R.id.textView3);

        edtxt1 = findViewById(R.id.editText1);
        edtxt2 =findViewById(R.id.editText2);
        edtxt3 =findViewById(R.id.editText3);
        edtxt4 =findViewById(R.id.editText4);
        edtxt5 = findViewById(R.id.editText5);

        but1 = findViewById(R.id.but1);


        
       int a =getIntent().getIntExtra("name1",0);
        int b =getIntent().getIntExtra("name2",0);
        int c =getIntent().getIntExtra("name3",0);
        int d =getIntent().getIntExtra("name4",0);
        int e =getIntent().getIntExtra("name5",0);

        edtxt1.setText(a+" ");
        edtxt2.setText(b+" ");
        edtxt3.setText(c+" ");
        edtxt4.setText(d+" ");
        edtxt5.setText(e+" ");

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = a+b+c+d+e;

                getSharedPreferences("srujan",MODE_PRIVATE).edit().putInt("sum1",sum).commit();
                startActivity(new Intent(Reply.this,MainActivity.class));
            }
        });






    }
}