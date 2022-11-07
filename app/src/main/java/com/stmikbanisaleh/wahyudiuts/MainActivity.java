package com.stmikbanisaleh.wahyudiuts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pw1, pw2, pw3;

    String menu[] = {
            "Puncak",
            "Kebun Raya Bogor",
            "Taman Safari"
    };
    ListView listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pw1 = (TextView) findViewById(R.id.pw1);
        pw2 = (TextView) findViewById(R.id.pw2);
        pw3 = (TextView) findViewById(R.id.pw3);

        pw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String puncak =pw1.getText().toString();
                Intent intent = new Intent(MainActivity.this, wisata1.class);
                intent.putExtra("puncak", puncak);
                startActivity(intent); finish();
            }
        });

        pw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String kebunraya =pw2.getText().toString();
                Intent intent = new Intent(MainActivity.this, wisata2.class);
                intent.putExtra("kebunraya", kebunraya);
                startActivity(intent); finish();
            }
        });
        pw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String tamansafari =pw3.getText().toString();
                Intent intent = new Intent(MainActivity.this, wisata3.class);
                intent.putExtra("tamansafari", tamansafari);
                startActivity(intent); finish();
            }
        });

//        listMenu = (ListView) findViewById(R.id.menu);
//        Adaptermenu adaptermenu = new Adaptermenu(this, menu);
//        listMenu.setAdapter(adaptermenu);
//        listMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(getApplicationContext(), wisata1.class);
//            }
//        });

    }
//    private class Adaptermenu extends ArrayAdapter {
//        String list_menu[];
//
//        Activity activity;
//
//        //konstruktor
//        public Adaptermenu(MainActivity mainActivity, String[] list_menu) {
//            super(mainActivity, R.layout.list_menu, list_menu);
//            this.list_menu = list_menu;
//            activity = mainActivity;
//        }
//
//
//        //menthode yang digunakan untuk memanggil layout list_buah dan mengenalkan widgetnya
//        @NonNull
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            // panggil layout list_buah
//            LayoutInflater inflater = (LayoutInflater) activity.getLayoutInflater();
//            View view = inflater.inflate(R.layout.list_menu, null);
//
//
//            TextView menu;
//
//
//
//            menu = (TextView) view.findViewById(R.id.menuId);
//
//            // set data kedalam image
//
//            menu.setText(list_menu[position]);
//
//            return view;
//        }
//    }
}