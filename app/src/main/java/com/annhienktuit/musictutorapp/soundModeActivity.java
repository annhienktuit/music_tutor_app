package com.annhienktuit.musictutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class soundModeActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ArrayList<Integer> arrayimage;
    ArrayList<Button> arraybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_mode);
        /*ImageView imageview=(ImageView) findViewById(R.id.imageView1);
        int[] notes={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g};
        Random r=new Random();
        int n=(r.nextInt(6));
        imageview.setImageResource(notes[n]);*/

        linearLayout=(LinearLayout) findViewById(R.id.linearlayout_image);

        arrayimage=new ArrayList<>();
        arrayimage.add(R.drawable.a);
        arrayimage.add(R.drawable.b);
        arrayimage.add(R.drawable.c);
        arrayimage.add(R.drawable.d);
        arrayimage.add(R.drawable.e);
        arrayimage.add(R.drawable.f);
        arrayimage.add(R.drawable.g);

        Random random=new Random();
        int vitri=random.nextInt(arrayimage.size());
        linearLayout.setBackgroundResource(arrayimage.get(vitri));


    }
    public void Clickbutton(View w)
    {

    }

}
