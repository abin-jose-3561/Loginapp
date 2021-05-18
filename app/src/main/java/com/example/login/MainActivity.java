package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText email, pass, uname;
    String e,p,u;
    //correct Email =abc@gmail.com
    //correct password - abin123

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       b = findViewById(R.id.button);
       pass = findViewById(R.id.password);
       email = findViewById(R.id.email);
        uname = findViewById(R.id.uname);

       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                    e = email.getText().toString();
                    p = pass.getText().toString();
                    u = uname.getText().toString();
              if(e.equals("a") || p.equals("abin"))
              {
                  Toast.makeText(MainActivity.this,"LoGin Successful",Toast.LENGTH_SHORT).show();


                  Intent mymovingintent = new Intent(MainActivity.this, home.class);
                  mymovingintent.putExtra("mykey", e);
                  mymovingintent.putExtra("mykeyuser", u);
                  startActivity(mymovingintent);
              }
              else
              {
                  Toast.makeText(MainActivity.this,"LoGin Failed",Toast.LENGTH_LONG).show();
              }
           }
       });

    }
}