package com.example.contactstest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Set;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";

    private ImageView imageView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Uri image = getIntent().getExtras().getParcelable(Intent.EXTRA_STREAM);
        imageView = (ImageView) findViewById(R.id.image_view);

        grantUriPermission("com.example.contacttest", image, Intent.FLAG_GRANT_READ_URI_PERMISSION);
        try {
            InputStream is = getContentResolver().openInputStream(image);
            imageView.setImageBitmap(BitmapFactory.decodeStream(is));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Set<String> s = getIntent().getExtras().keySet();
        for (String i : s) {
            Log.d(TAG, i + "\n");
        }

    }
}
