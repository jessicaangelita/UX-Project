package com.edu.projectux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.ByteArrayOutputStream;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Bundle extra = getIntent().getExtras();
        String username = extra.getString("username");
        ImageButton backBtn = (ImageButton) findViewById(R.id.backBtnss);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductActivity.this, HomeActivity.class);
                String intentKey = "username";
                intent.putExtra(intentKey, username);
                startActivity(intent);
            }
        });
        CardView forestcard = (CardView) findViewById(R.id.forest_card);
        forestcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image_view = findViewById(R.id.forest_image);
                TextView title_text = findViewById(R.id.forest_title);
                TextView price_text = findViewById(R.id.forest_price);
                TextView date_text = findViewById(R.id.forest_date);

                Intent intent = new Intent(ProductActivity.this, ProductDetail.class);
                intent.putExtra("picture", R.drawable.product_image1);
                intent.putExtra("title_text",title_text.getText().toString());
                intent.putExtra("price_text",price_text.getText().toString());
                intent.putExtra("date_text",date_text.getText().toString());
                intent.putExtra("detail_text","As the lone survivor of a passenger jet crash, you find yourself in a mysterious forest battling to stay alive against a society of cannibalistic mutants. Build, explore, survive in this terrifying first person survival horror simulator.");
                startActivity(intent);
            }
        });
        CardView picocard = (CardView) findViewById(R.id.pico_card);
        picocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image_view = findViewById(R.id.pico_image);
                TextView title_text = findViewById(R.id.pico_title);
                TextView price_text = findViewById(R.id.pico_price);
                TextView date_text = findViewById(R.id.pico_date);

                Intent intent = new Intent(ProductActivity.this, ProductDetail.class);
                intent.putExtra("picture", R.drawable.product_image2);
                intent.putExtra("title_text",title_text.getText().toString());
                intent.putExtra("price_text",price_text.getText().toString());
                intent.putExtra("date_text",date_text.getText().toString());
                intent.putExtra("detail_text","PICO PARK is a cooperative local/online multiplay action puzzle game for 2-8 players.");
                startActivity(intent);
            }
        });
        CardView forcecard = (CardView) findViewById(R.id.force_card);
        forcecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image_view = findViewById(R.id.force_image);
                TextView title_text = findViewById(R.id.force_title);
                TextView price_text = findViewById(R.id.force_price);
                TextView date_text = findViewById(R.id.force_date);

                Intent intent = new Intent(ProductActivity.this, ProductDetail.class);
                intent.putExtra("picture", R.drawable.product_image3);
                intent.putExtra("title_text",title_text.getText().toString());
                intent.putExtra("price_text",price_text.getText().toString());
                intent.putExtra("date_text",date_text.getText().toString());
                intent.putExtra("detail_text","An anime crossover between Jump-related manga franchises, such as Dragon Ball, One Piece, Naruto, and Bleach. The features a large roster of characters from both new and old manga series.");
                startActivity(intent);
            }
        });
        CardView sotcard = (CardView) findViewById(R.id.sot_card);
        sotcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image_view = findViewById(R.id.sot_image);
                TextView title_text = findViewById(R.id.sot_title);
                TextView price_text = findViewById(R.id.sot_price);
                TextView date_text = findViewById(R.id.sot_date);

                Intent intent = new Intent(ProductActivity.this, ProductDetail.class);
                intent.putExtra("picture", R.drawable.product_image4);
                intent.putExtra("title_text",title_text.getText().toString());
                intent.putExtra("price_text",price_text.getText().toString());
                intent.putExtra("date_text",date_text.getText().toString());
                intent.putExtra("detail_text","Sea of Thieves offers the essential pirate experience, from sailing and fighting to exploring and looting – everything you need to live the pirate life and become a legend in your own right. With no set roles, you have complete freedom to approach the world, and other players, however you choose.");
                startActivity(intent);
            }
        });
        CardView simscard = (CardView) findViewById(R.id.sims_card);
        simscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image_view = findViewById(R.id.sims_image);
                TextView title_text = findViewById(R.id.sims_title);
                TextView price_text = findViewById(R.id.sims_price);
                TextView date_text = findViewById(R.id.sims_date);

                Intent intent = new Intent(ProductActivity.this, ProductDetail.class);
                intent.putExtra("picture", R.drawable.product_image5);
                intent.putExtra("title_text",title_text.getText().toString());
                intent.putExtra("price_text",price_text.getText().toString());
                intent.putExtra("date_text",date_text.getText().toString());
                intent.putExtra("detail_text","Play with life and discover the possibilities. Unleash your imagination and create a world of Sims that’s wholly unique. Explore and customize every detail from Sims to homes–and much more.");
                startActivity(intent);
            }
        });
        CardView journeycard = (CardView) findViewById(R.id.journey_card);
        journeycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image_view = findViewById(R.id.journey_image);
                TextView title_text = findViewById(R.id.journey_title);
                TextView price_text = findViewById(R.id.journey_price);
                TextView date_text = findViewById(R.id.journey_date);

                Intent intent = new Intent(ProductActivity.this, ProductDetail.class);
                intent.putExtra("picture", R.drawable.product_image6);
                intent.putExtra("title_text",title_text.getText().toString());
                intent.putExtra("price_text",price_text.getText().toString());
                intent.putExtra("date_text",date_text.getText().toString());
                intent.putExtra("detail_text","Explore the ancient, mysterious world of Journey as you soar above ruins and glide across sands to discover its secrets.");
                startActivity(intent);
            }
        });

        Spinner menuSpinner = (Spinner) findViewById(R.id.menuSpinners);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(ProductActivity.this, R.array.product_array, R.layout.support_simple_spinner_dropdown_item);
        spinnerAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        menuSpinner.setAdapter(spinnerAdapter);
        menuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String menu = adapterView.getItemAtPosition(i).toString();
                if (menu.equals("Home")){
                    Intent intent = new Intent(ProductActivity.this, HomeActivity.class);
                    String intentKey = "username";
                    intent.putExtra(intentKey, username);;
                    startActivity(intent);
                }else if (menu.equals("About Us")){
                    Intent intent = new Intent(ProductActivity.this, AboutUsActivity.class);
                    String intentKey = "username";
                    intent.putExtra(intentKey, username);
                    startActivity(intent);
                }else if (menu.equals("Log Out")){
                    Intent intent = new Intent(ProductActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }



        });
    }
}