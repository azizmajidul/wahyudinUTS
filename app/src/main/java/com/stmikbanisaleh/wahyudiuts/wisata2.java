package com.stmikbanisaleh.wahyudiuts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class wisata2 extends AppCompatActivity {
    TextView pw1;
    String getpw1;
    Button btndes, btnmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getpw1 =getIntent().getStringExtra("kebunraya");
        pw1 = (TextView) findViewById(R.id.pariwaisata1);
        pw1.setText("Galery " +getpw1);

        btndes = findViewById(R.id.deskripsi);
        btnmap = findViewById(R.id.peta);
        btndes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), deskripsi2.class);
                startActivity(intent); finish();
            }
        });
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "-6.597618237444277, 106.79952688104076";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=("+url+")"));
                startActivity(intent);
            }
        });
    }
}