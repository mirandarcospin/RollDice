package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    /*Private variables, one for the dice image and the other
        one for the random variable (gives the random number) */
    private ImageView imageViewDice;
    private TextView textViewDice;
    private Random rng = new Random();
    /*Sounds*/
    private MediaPlayer rolling;
    private MediaPlayer diceMiss;
    private MediaPlayer diceHit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDice = findViewById(R.id.textView); /* For text. Starts with "Roll!!!" */
        textViewDice.setText(R.string.start_text);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(); /*Function to what happens when we click the dice*/
            }
        });
    }

    private void rollDice()
    { /*Made the random function working. Difference cases to show
        the different dice images */
        textViewDice.setText(""); /*So there is no text during the rolls just the
                                    critical texts when dice is 1 or 20*/
        /*Setting the sounds*/
        rolling = MediaPlayer.create(MainActivity.this, R.raw.rolldice);
        diceMiss = MediaPlayer.create(MainActivity.this, R.raw.miss);
        diceHit = MediaPlayer.create(MainActivity.this, R.raw.hit);

        rolling.start();/*When rolling any dice*/

        int randomNumber = rng.nextInt(20) + 1;
        switch(randomNumber)
        {
            case 1: /*Text and Sound*/
                imageViewDice.setImageResource(R.drawable.dice1);
                textViewDice.setText(R.string.cm_d1);
                diceMiss.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                break;
            case 20:/*Text and sound*/
                imageViewDice.setImageResource(R.drawable.dice20);
                textViewDice.setText(R.string.ch_d20);
                diceHit.start();
                break;
        }

    }

}