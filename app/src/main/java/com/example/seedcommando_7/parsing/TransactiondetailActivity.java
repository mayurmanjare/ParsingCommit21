package com.example.seedcommando_7.parsing;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Objects;

public class TransactiondetailActivity extends AppCompatActivity {
TextView m1,m2,m3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.transactiondetail);
        m1=(TextView) findViewById(R.id.details);
        m2=(TextView) findViewById(R.id.textView);
        m3=(TextView) findViewById(R.id.textView2);
        m1.setTextColor(Color.GREEN);
        m1.setTextSize(20);

        m2.setTextColor(Color.BLACK);
        m2.setTextSize(20);

        m3.setTextColor(Color.BLACK);
        m3.setTextSize(20);

        Intent intent1= getIntent();
        Bundle b=intent1.getExtras();
        Object o=  b.get("details");
        HashMap<String,String> a=(HashMap<String, String>)o;
        m1.setText("EmailId:"+a.get("email")+"\n");
        m2.setText("MobileNo:"+a.get("mobile")+"\n");
        m3.setText("Name:"+a.get("name"));


    }
}
