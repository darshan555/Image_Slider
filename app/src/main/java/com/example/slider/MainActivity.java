package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper myFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFlipper = findViewById(R.id.flipper);

        int allImg[] = {R.drawable.img_a,R.drawable.img_b,R.drawable.img_c};

        for (int i = 0;i < allImg.length;i++) {
            showImg(allImg[i]);
        }
    }

    public void showImg(int img){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        myFlipper.addView(imageView);
        myFlipper.setFlipInterval(3000);
        myFlipper.setAutoStart(true);

        myFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        myFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}