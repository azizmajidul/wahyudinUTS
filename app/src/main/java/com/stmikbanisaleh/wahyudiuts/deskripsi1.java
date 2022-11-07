package com.stmikbanisaleh.wahyudiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class deskripsi1 extends AppCompatActivity {
    TextView textView2, textView3;
    String Text;
    String getintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi1);
        getintent = getIntent().getStringExtra("puncak");
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView3.setText("Deskripsi Puncak Bogor");
        Text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages," +
                " and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
        textView2.setText(Text);
    }
}