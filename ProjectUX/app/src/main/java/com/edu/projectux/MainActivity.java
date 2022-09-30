package com.edu.projectux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginBtn = (Button)findViewById(R.id.loginTxt);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText usernameTxt = findViewById(R.id.usernameTxt);
                String username = usernameTxt.getText().toString();

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                String intentKey = "username";
                intent.putExtra(intentKey, username);

                TextView loginerror = (TextView)findViewById(R.id.loginerror);
                TextView passwordTxt = (TextView)findViewById(R.id.passwordTxt);

                if (usernameTxt.getText().toString().length()==0){
                    loginerror.setText("Username cannot be empty");
                }else if(usernameTxt.getText().toString().length()<3){
                    loginerror.setText("Username must be greater than 3");
                }else if(passwordTxt.getText().toString().length()==0){
                    loginerror.setText("Password cannot be empty");
                }else {
                    startActivity(intent);
                }

            }
        });

    }
}