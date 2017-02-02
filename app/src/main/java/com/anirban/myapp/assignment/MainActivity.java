package com.anirban.myapp.assignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button2);

    }

    public void callBlink(final View v){
        // to blinking...

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);

        //blinking effect on TextView
        TextView textview = (TextView) findViewById(R.id.text1);
        textview.startAnimation(animation);


    }


}
