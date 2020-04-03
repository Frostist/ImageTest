package com.example.imagetest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
String TAG = "Project";
ImageView imageView;
ImageView homerImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG, "Starting...");

        imageView = findViewById(R.id.imageView);
        homerImageView = findViewById(R.id.homerImageView);
    }

       boolean BartIsShowing = true;

            public void fade(View view) {
                Log.w(TAG, "View tapped");

                if (BartIsShowing) {

                    BartIsShowing = false;
                    Log.w(TAG, "No Bart");
                    imageView.animate().alpha(0).setDuration(2000);
                    homerImageView.animate().alpha(1).setDuration(2000);

                } else {

                    BartIsShowing = true;
                    Log.w(TAG, "No Homer");
                    imageView.animate().alpha(1).setDuration(2000);
                    homerImageView.animate().alpha(0).setDuration(2000);

                }
            }
}
