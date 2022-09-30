package com.edu.projectux;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extra = getIntent().getExtras();
        String username = extra.getString("username");
        TextView welcomeLbl = (TextView)findViewById(R.id.welcomeUser);
        welcomeLbl.setText("Welcome, " + username);

        Button productBtn = (Button)findViewById(R.id.productBtn);
        productBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ProductActivity.class);
                String intentKey = "username";
                intent.putExtra(intentKey, username);
                startActivity(intent);
            }
        });
        Button aboutusBtn = (Button)findViewById(R.id.aboutusBtn);
        aboutusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AboutUsActivity.class);
                String intentKey = "username";
                intent.putExtra(intentKey, username);
                startActivity(intent);
            }
        });
        Button logoutBtn = (Button)findViewById(R.id.logoutBtn);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    //link sama menu dalam option_menu
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.option_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId()==R.id.logout){
//            startActivity(new Intent(this, com.edu.ux3.MainActivity.class));
//        }else if(item.getItemId()==R.id.setting){
//
//        }
//
//        return true;
//    }
}