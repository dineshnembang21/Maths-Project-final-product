package com.codewithdinesh.final_try;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN=5000;
    //variables
    Animation topAnim,bottomAnim;
    ImageView image;
    TextView logo,slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



        new Handler().postDelayed (new Runnable () {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Nex.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_SCREEN);


        //animation
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        topAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

    //hooke
        image=findViewById(R.id.imageview);
        logo=findViewById(R.id.activity1);
        slogan=findViewById(R.id.activ1);

        image.setAnimation(topAnim);
        logo.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);
    }

}
