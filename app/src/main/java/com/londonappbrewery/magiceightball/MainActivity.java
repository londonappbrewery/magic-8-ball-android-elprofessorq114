package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askBut = findViewById(R.id.askButton);
        final ImageView ballImage = findViewById(R.id.ball_Image);
        final int[] ballArray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};
        askBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Magic-8-Ball", "Button Pressed!!!");
                Random rn = new Random();
                int n = rn.nextInt(5);
                ballImage.setImageResource(ballArray[n]);
            }
        });
    }
}
