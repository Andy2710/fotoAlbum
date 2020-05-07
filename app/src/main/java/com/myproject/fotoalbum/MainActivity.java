package com.myproject.fotoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
        int rdm = (int) (Math.random()*100);
        TextView txt = findViewById(R. id. text_num);
        txt.setText("http://myfile.org/"+String.valueOf(rdm) );

    }
    public void click(View v){

        Intent intent = new Intent(MainActivity. this, MainActivity.class);
        startActivity(intent);
    }


    public void Init(){
        Button prev = findViewById(R.id.button_pr);
       // Button next = findViewById(R.id.button_n);

       // Button prev = findViewById(R.id.button_pr);
        prev. setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                finish();
            }
//                Intent intent = new Intent(MainActivity. this, MainActivity.class);
//                startActivity(intent);
//
//            }
        });

        //Button next = findViewById(R.id.button_n);
//        next. setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity. this, MainActivity.class);
//                startActivity(intent);
//
//
//            }
//        });

    }
//    }
//    public void Init(){
//            Button prev = findViewById(R.id.button_n);
//            Button next = findViewById(R.id.button_n);
//
//        }
}


