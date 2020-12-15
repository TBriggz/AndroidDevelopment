package com.tristen.tristenbriggs_comp304lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //attractions activity btn
        findViewById(R.id.attractions_imageBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Selected Attractions.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), AttractionsActivity.class));
            }
        });

        //landmarks activity btn
        findViewById(R.id.landmarks_imageBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Selected Landmarks.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), LandmarksActivity.class));

            }
        });
    }
}