package com.annhienktuit.musictutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class soundModeActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ArrayList<Integer> arrayimage;
    ArrayList<Button> arraybutton;
    int position;



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
        position=vitri;
        linearLayout.setBackgroundResource(arrayimage.get(vitri));

        int[] button={R.id.button_A,R.id.button_B,R.id.button_C,R.id.button_D,R.id.button_E,R.id.button_F,R.id.button_G};
        //A
        Button button_a=(Button) findViewById(R.id.button_A);
        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                    Toast.makeText(soundModeActivity.this,"Correct !!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(soundModeActivity.this,"WRONG !!!",Toast.LENGTH_LONG).show();
            }
        });
        //B
        Button button_b=(Button) findViewById(R.id.button_B);
        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==1)
                    Toast.makeText(soundModeActivity.this,"Correct !!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(soundModeActivity.this,"WRONG !!!",Toast.LENGTH_LONG).show();
            }
        });
        //C
        Button button_c=(Button) findViewById(R.id.button_C);
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==2)
                    Toast.makeText(soundModeActivity.this,"Correct !!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(soundModeActivity.this,"WRONG !!!",Toast.LENGTH_LONG).show();
            }
        });
        //D
        Button button_d=(Button) findViewById(R.id.button_D);
        button_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==3)
                    Toast.makeText(soundModeActivity.this,"Correct !!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(soundModeActivity.this,"WRONG !!!",Toast.LENGTH_LONG).show();
            }
        });
        //E
        Button button_e=(Button) findViewById(R.id.button_E);
        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==4)
                    Toast.makeText(soundModeActivity.this,"Correct !!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(soundModeActivity.this,"WRONG !!!",Toast.LENGTH_LONG).show();
            }
        });
        //F
        Button button_f=(Button) findViewById(R.id.button_F);
        button_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==5)
                    Toast.makeText(soundModeActivity.this,"Correct !!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(soundModeActivity.this,"WRONG !!!",Toast.LENGTH_LONG).show();
            }
        });
        Button button_g=(Button) findViewById(R.id.button_G);
        button_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==6)
                    Toast.makeText(soundModeActivity.this,"Correct !!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(soundModeActivity.this,"WRONG !!!",Toast.LENGTH_LONG).show();
            }
        });
    }


}
