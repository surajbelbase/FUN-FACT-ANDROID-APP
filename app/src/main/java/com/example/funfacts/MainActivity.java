package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        public static final String TAG = "MainActivity";
    //Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;
    private FactBook fb = new FactBook();
    private ColorWheel color = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign views from the layout file to the corresponding variables

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = fb.getFact();
                //update the screen with new fact
                factTextView.setText(fact);
                int colour = color.getColor();
                relativeLayout.setBackgroundColor(colour);
                showFactButton.setTextColor(colour);
            }
        };
        showFactButton.setOnClickListener(listener);
        Log.d(TAG,"let's dddddddddddddddddddddeeeeeeeeeebbbbbbbbbbbbbbugggg");
    }
}