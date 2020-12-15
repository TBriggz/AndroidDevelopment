package com.tristen.tristenbriggs_comp304lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        //CN tower btn
        findViewById(R.id.attractions_imageBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Selected CN Tower.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), MapsActivity.class));
            }
        });

        //Niagara Falls btn
        findViewById(R.id.attractions_imageBtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Selected Niagara falls.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), MapsActivity3.class));

            }
        });

        //Canada's wonderland
        findViewById(R.id.attractions_imageBtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Selected Canada's wonderland.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), MapsActivity6.class));
            }
        });

    }
}