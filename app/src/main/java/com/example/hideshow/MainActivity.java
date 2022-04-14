package com.example.hideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ufo;
    boolean b = true;
    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ufo = findViewById(R.id.ufo);
        buton = findViewById(R.id.button);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (b)
               {

                   ufo.setVisibility(v.INVISIBLE);
                   buton.setText("Unhide");
               } else {

                   ufo.setVisibility(v.VISIBLE);
                   buton.setText("Hide");

               }

               b = !b;
            }
        });

    }
}