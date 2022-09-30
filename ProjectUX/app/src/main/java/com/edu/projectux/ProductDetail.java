package com.edu.projectux;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ProductDetail extends AppCompatActivity {

    ConstraintLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        ImageButton backBtn = (ImageButton) findViewById(R.id.backBtnss);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDetail.this, ProductActivity.class);
                startActivity(intent);
            }
        });
        Button order_button = (Button)findViewById(R.id.order_button);
        order_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText quantity = (EditText)findViewById(R.id.quantity);
                String check = quantity.getText().toString();
                if(check.isEmpty()){
                    Snackbar snackbar = Snackbar.make(view, "Quantity cannot be empty", Snackbar.LENGTH_LONG);
                    snackbar.show();
                }else if (Integer.valueOf(quantity.getText().toString())<1){
                    alert("Quantity must be greater than 0", "Error Input");
//                    Snackbar snackbar = Snackbar.make(view, "Quantity must be greater than 0", Snackbar.LENGTH_LONG);
//                    snackbar.show();
                }else{
                    alert("Successfully bought the game", "Success");
//                    Snackbar snackbar = Snackbar.make(view, "Successfully bought the game", Snackbar.LENGTH_LONG);
//                    snackbar.show();
                }
            }
        });

        String title_text = getIntent().getExtras().getString("title_text");
        String price_text = getIntent().getExtras().getString("price_text");
        String date_text = getIntent().getExtras().getString("date_text");
        String detail_text = getIntent().getExtras().getString("detail_text");
        int picture = getIntent().getExtras().getInt("picture");

        TextView product_title = (TextView)findViewById(R.id.product_title);
        product_title.setText(title_text);
        TextView product_price = (TextView)findViewById(R.id.product_price);
        product_price.setText(price_text);
        TextView product_date = (TextView)findViewById(R.id.product_date);
        product_date.setText(date_text);
        TextView product_detail = (TextView)findViewById(R.id.product_detail);
        product_detail.setText(detail_text);
        ImageView product_image = (ImageView)findViewById(R.id.product_image);
        product_image.setImageResource(picture);

    }

    public void alert(String message, String title){
        AlertDialog dlg = new AlertDialog.Builder(ProductDetail.this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        dlg.show();
    }
}