package com.tristen.tristenbriggs_comp304lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LandmarksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            //button to open application menus
            case R.id.landmark_imageBtn:

                //setContentView(R.layout.activity_maps2);
                Toast.makeText(getApplicationContext(),"Selected Centennial College.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), MapsActivity2.class));
                break;
            case R.id.attractions_imageBtn2:

                //setContentView(R.layout.activity_maps2);
                Toast.makeText(getApplicationContext(),"Selected Parliament Hill btn.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), MapsActivity4.class));
                break;

            case R.id.attractions_imageBtn3:

                //setContentView(R.layout.activity_maps2);
                Toast.makeText(getApplicationContext(),"Selected Royal Ontario Museum.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), MapsActivity5.class));
                break;

            default: setContentView(R.layout.activity_main);
        }

    }
    //EXTRA
    //National Gallery of Canada btn
//        findViewById(R.id.attraction4_imageBtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Selected National Gallery of Canada.",Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(view.getContext(), AttractionsActivity.class));
//            }
//        });

}