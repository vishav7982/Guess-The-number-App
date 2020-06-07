package com.example.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int rand_int1 = rand.nextInt(20)+1;
    public void guessNumber(View view)
    {

        EditText editText = (EditText) findViewById(R.id.editTextNumber2);
        Log.i("Entered Value",editText.getText().toString());
        Log.i(" info ",Integer.toString(rand_int1));
        int guessValue = Integer.parseInt(editText.getText().toString());
        String message;
        if(guessValue > rand_int1)
        {
            message = "Try Lower !";
        }
        else if(guessValue < rand_int1)
        {
            message = "Try Higher!";
        }
        else
        {
            message = "You Got it !" ;
            rand_int1=rand.nextInt(20)+1;
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        Log.i("Entered Value",editText.getText().toString());
        Log.i("Our Number", Integer.toString(rand_int1));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}