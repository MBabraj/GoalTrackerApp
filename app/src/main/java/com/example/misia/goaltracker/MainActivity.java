package com.example.misia.goaltracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.id_przycisk);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("wprowadz","test");

            }

        });
    }
}
