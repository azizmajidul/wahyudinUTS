package com.stmikbanisaleh.wahyudiuts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class wisata1 extends AppCompatActivity {

    TextView pw1;
    String getpw1;
    Button btndes, btnmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        getpw1 =getIntent().getStringExtra("puncak");
        pw1 = (TextView) findViewById(R.id.pariwaisata1);
        pw1.setText("Galery " +getpw1);

        btndes = findViewById(R.id.deskripsi);
        btnmap = findViewById(R.id.peta);
        btndes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), deskripsi1.class);
                intent.putExtra("puncak", getpw1);
                startActivity(intent); finish();
            }
        });
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/Puncak,+Bogor/@-6.7028184,106.9815119,14z/data=!4m13!1m7!3m6!1s0x2e69b41da3000801:0xf076753f09646828!2sPuncak,+Bogor!3b1!8m2!3d-6.7028188!4d106.9990215!3m4!1s0x2e69b41da3000801:0xf076753f09646828!8m2!3d-6.7028188!4d106.9990215?hl=id";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=("+url+")"));
                startActivity(intent);
            }
        });

    }
}