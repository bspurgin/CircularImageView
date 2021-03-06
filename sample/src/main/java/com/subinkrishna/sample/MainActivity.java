package com.subinkrishna.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;
import com.subinkrishna.widget.CircularImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Picasso
        ImageView i1 = (ImageView) findViewById(R.id.image1);
        Picasso.with(this)
                .load("https://raw.githubusercontent.com/subinkrishna/CircularImageView/master/art/cat_original.jpg")
                .placeholder(R.drawable.placeholder)
                .centerCrop()
                .resize(200, 200)
                .into(i1);

        // Glide
        ImageView i2 = (ImageView) findViewById(R.id.image2);
        Glide.with(this)
                .load("http://invalid.url")
                .asBitmap()
                .error(R.drawable.placeholder)
                .into(i2);

        final CircularImageView i4 = (CircularImageView) findViewById(R.id.image5);
        i4.setCheckedStateBackgroundColor(Color.GRAY);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i4.toggle();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
