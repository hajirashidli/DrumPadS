package com.hajirashidli.drumpads;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;


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
    }

    public void playSound1(View view)
    {
        sp.play(sound1, 1, 1f, 0,0,1);

    }

    public void playSound2(View view)
    {
        sp.play(sound2, 1, 1, 0,0,1);

    }

    public void playSound3(View view)
    {
        sp.play(sound3, 1, 1, 0,0,1);

    }

    public void playSound4(View view)
    {
        sp.play(sound4, 1, 1, 0,0,1);

    }

    public void playSound5(View view)
    {
        sp.play(sound5, 1, 1, 0,0,1);

    }

    public void playSound6(View view)
    {
        sp.play(sound6, 1, 1, 0,0,1);

    }
}
