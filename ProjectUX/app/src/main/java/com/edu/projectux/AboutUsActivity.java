package com.edu.projectux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ViewFlipper;

public class AboutUsActivity extends AppCompatActivity {

    int[] images = {
            R.drawable.carousel_picture1,
            R.drawable.carousel_picture2,
            R.drawable.carousel_picture3
    };

    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Bundle extra = getIntent().getExtras();
        String username = extra.getString("username");

        ImageButton backBtn = (ImageButton) findViewById(R.id.backBtnss);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUsActivity.this, HomeActivity.class);
                String intentKey = "username";
                intent.putExtra(intentKey, username);
                startActivity(intent);
            }
        });

        Spinner menuSpinner = (Spinner) findViewById(R.id.menuSpinner);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(AboutUsActivity.this, R.array.aboutus_array, R.layout.support_simple_spinner_dropdown_item);
        spinnerAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        menuSpinner.setAdapter(spinnerAdapter);
        menuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String menu = adapterView.getItemAtPosition(i).toString();
                if (menu.equals("Home")){
                    Intent intent = new Intent(AboutUsActivity.this, HomeActivity.class);
                    String intentKey = "username";
                    intent.putExtra(intentKey, username);
                    startActivity(intent);
                }else if (menu.equals("Product")){
                    Intent intent = new Intent(AboutUsActivity.this, ProductActivity.class);
                    String intentKey = "username";
                    intent.putExtra(intentKey, username);
                    startActivity(intent);
                }else if (menu.equals("Log Out")){
                    Intent intent = new Intent(AboutUsActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }



        });

        viewFlipper = findViewById(R.id.carousel);
        for (int image : images){
            addImageToFlipper(image);
        }
    }


    private void addImageToFlipper(int image){
        ImageView imageView = new ImageView(AboutUsActivity.this);
        imageView.setBackgroundResource(image);

        //tambahin ke dalam carousel
        viewFlipper.addView(imageView);
        //set interval between images
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        //set animation
        viewFlipper.setInAnimation(AboutUsActivity.this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(AboutUsActivity.this, android.R.anim.slide_out_right);
    }

}