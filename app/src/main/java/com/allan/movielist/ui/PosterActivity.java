package com.allan.movielist.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.allan.movielist.R;

import java.net.URL;

public class PosterActivity extends AppCompatActivity {

    private ImageView poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poster);
        poster = findViewById(R.id.poster_img);
        String url = getIntent().getStringExtra("url");
        try {
        URL URL = new URL(url);
        Bitmap bitmap = BitmapFactory.decodeStream(URL.openConnection().getInputStream());
        poster.setImageBitmap(bitmap);
        } catch (Exception e) {
            Log.e("URL error", e.getMessage());
            Toast.makeText(PosterActivity.this, "Image url is bad", Toast.LENGTH_SHORT).show();
        }
    }
}
