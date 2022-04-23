package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        EditText username=(EditText) findViewById(R.id.username);
        EditText password=(EditText) findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Admin") && password.getText().toString().equals("pass"))
                {
                    Intent i=new Intent(MainActivity.this, MainActivity2.class);
                    Toast.makeText(MainActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
