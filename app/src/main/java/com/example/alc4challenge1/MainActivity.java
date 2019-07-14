package com.example.alc4challenge1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutAlc();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyProfile();
            }
        });
    }

    private void openMyProfile() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }

    private void openAboutAlc() {
        Intent intent = new Intent(this, AboutAlc.class);
        startActivity(intent);
    }
}
