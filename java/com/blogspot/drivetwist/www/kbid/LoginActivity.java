package com.blogspot.drivetwist.www.kbid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText memail;
    private EditText mpass;
    private Button mregister;
    int counter=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        memail=(EditText)findViewById(R.id.username);
        mpass=(EditText)findViewById(R.id.password);
        mregister=(Button)findViewById(R.id.Submit);

    }
    public void submit(View view){
        String e;
        String p;
        e=memail.getText().toString();
        p=mpass.getText().toString();
        if(memail.getText().toString().equals("admin") &&
                mpass.getText().toString().equals("123")) {
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
            Intent login=new Intent(this,MainActivity.class);
            startActivity(login);
        }else{
            Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
        }
    }
}
