package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class home extends AppCompatActivity {
    String myrecieivedemail , myrecieiveduser;
   EditText welcome;
    TextView uemail,uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myrecieivedemail = getIntent().getStringExtra("mykey");
        myrecieiveduser = getIntent().getStringExtra("mykeyuser");

        uemail = findViewById(R.id.useremail);
        uname = findViewById(R.id.username);
       welcome = findViewById(R.id.welcome);


        uname.setText("User Name : "+myrecieiveduser);
        uemail.setText("Email : "+myrecieivedemail);
       welcome.setText("Welcome  "+myrecieiveduser);


    }
}