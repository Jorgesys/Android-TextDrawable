package com.jorgesys.textdrawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextDrawable textDrawable = new TextDrawable(getApplicationContext(), "Elenasys was here!", 200, 200);
        ((ImageView)findViewById(R.id.imageView)).setImageDrawable(textDrawable);

    }
}
