package com.tristen.tristenbriggs_comp304lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Launch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            //button to open application menus
            case R.id.labEx1btn:

                //setContentView(R.layout.activity_exercise1);
                Toast.makeText(this, "You have chosen activity 1", Toast.LENGTH_LONG).show();
                startActivity(new Intent(view.getContext(), MainActivity.class));
                break;

            default: setContentView(R.layout.activity_main);
        }

    }
}