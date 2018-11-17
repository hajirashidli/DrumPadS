package com.hajirashidli.drumpads;

import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    public ImageView kitButton1;
    public ImageView kitButton2;
    public ImageView kitButton3;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound11;
    private int sound22;
    private int sound33;
    private int sound44;
    private int sound55;
    private int sound66;
    private int sound111;
    private int sound222;
    private int sound333;
    private int sound444;
    private int sound555;
    private int sound666;

    private int soundKit = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      since srcQuality isn't implemented,  I will leave it as 0.
        sp = new SoundPool(6, AudioManager.STREAM_MUSIC, 0);

//      priority not implemented either, will leave it at 1.
//      Changed context section from "getApplicationContext()" to "this".
        sound1 = sp.load(this, R.raw.sound1, 1);
        sound2 = sp.load(this, R.raw.sound2, 1);
        sound3 = sp.load(this, R.raw.sound3, 1);
        sound4 = sp.load(this, R.raw.sound4, 1);
        sound5 = sp.load(this, R.raw.sound5, 1);
        sound6 = sp.load(this, R.raw.sound6, 1);

        sound11 = sp.load(this, R.raw.sound11,1);
        sound22 = sp.load(this, R.raw.sound22,1);
        sound33 = sp.load(this, R.raw.sound33,1);
        sound44 = sp.load(this, R.raw.sound44,1);
        sound55 = sp.load(this, R.raw.sound55,1);
        sound66 = sp.load(this, R.raw.sound66,1);

        sound111 = sp.load(this, R.raw.sound111,1);
        sound222 = sp.load(this, R.raw.sound222,1);
        sound333 = sp.load(this, R.raw.sound333,1);
        sound444 = sp.load(this, R.raw.sound444,1);
        sound555 = sp.load(this, R.raw.sound555,1);
        sound666 = sp.load(this, R.raw.sound666,1);
    }

    public void changeSoundKit1(View view)
    {
        ImageView kitButton1 = findViewById(R.id.kitButtonId1);
        ImageView kitButton2 = findViewById(R.id.kitButtonId2);
        ImageView kitButton3 = findViewById(R.id.kitButtonId3);

        soundKit = 1;
        Toast.makeText(this, "Sound Kit 1 Activated", Toast.LENGTH_SHORT).show();

        kitButton1.setImageResource(R.drawable.button1disabled);
        kitButton2.setImageResource(R.drawable.button2);
        kitButton3.setImageResource(R.drawable.button3);
    }
    public void changeSoundKit2(View view)
    {
        ImageView kitButton1 = findViewById(R.id.kitButtonId1);
        ImageView kitButton2 = findViewById(R.id.kitButtonId2);
        ImageView kitButton3 = findViewById(R.id.kitButtonId3);

        soundKit = 2;
        Toast.makeText(this, "Sound Kit 2 Activated", Toast.LENGTH_SHORT).show();

        kitButton1.setImageResource(R.drawable.button1);
        kitButton2.setImageResource(R.drawable.button2disabled);
        kitButton3.setImageResource(R.drawable.button3);
    }
    public void changeSoundKit3(View view)
    {
        ImageView kitButton1 = findViewById(R.id.kitButtonId1);
        ImageView kitButton2 = findViewById(R.id.kitButtonId2);
        ImageView kitButton3 = findViewById(R.id.kitButtonId3);

        soundKit = 3;
        Toast.makeText(this, "Sound Kit 3 Activated", Toast.LENGTH_SHORT).show();

        kitButton1.setImageResource(R.drawable.button1);
        kitButton2.setImageResource(R.drawable.button2);
        kitButton3.setImageResource(R.drawable.button3disabled);
    }


    public void playSound1(View view)
    {
        if(soundKit == 1)
        {
            sp.play(sound1, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 2)
        {
            sp.play(sound11, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 3)
        {
            sp.play(sound111, 1, 1, 0, 0, 1);
        }

    }

    public void playSound2(View view)
    {
        if(soundKit == 1)
        {
            sp.play(sound2, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 2)
        {
            sp.play(sound22, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 3)
        {
            sp.play(sound222, 1, 1, 0, 0, 1);
        }
    }

    public void playSound3(View view)
    {
        if(soundKit == 1)
        {
            sp.play(sound3, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 2)
        {
            sp.play(sound33, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 3)
        {
            sp.play(sound333, 1, 1, 0, 0, 1);
        }
    }

    public void playSound4(View view)
    {
        if(soundKit == 1)
        {
            sp.play(sound4, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 2)
        {
            sp.play(sound44, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 3)
        {
            sp.play(sound444, 1, 1, 0, 0, 1);
        }
    }

    public void playSound5(View view)
    {
        if(soundKit == 1)
        {
            sp.play(sound5, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 2)
        {
            sp.play(sound55, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 3)
        {
            sp.play(sound555, 1, 1, 0, 0, 1);
        }
    }

    public void playSound6(View view)
    {
        if(soundKit == 1)
        {
            sp.play(sound6, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 2)
        {
            sp.play(sound66, 1, 1, 0, 0, 1);
        }
        else if(soundKit == 3)
        {
            sp.play(sound666, 1, 1, 0, 0, 1);
        }
    }
}
