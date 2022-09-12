package com.missouristate.arnold.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {

        ImageView helloImage = findViewById(R.id.helloImage);
        TextView hello_goodbye = findViewById(R.id.textView);

        String Text = hello_goodbye.getText().toString();

        if(Text.equals("Hello!")){

            hello_goodbye.setText("Goodbye!");
            helloImage.setVisibility(View.INVISIBLE);


        }else{

            hello_goodbye.setText("Hello!");
            helloImage.setVisibility(View.VISIBLE);


        }







    }

}