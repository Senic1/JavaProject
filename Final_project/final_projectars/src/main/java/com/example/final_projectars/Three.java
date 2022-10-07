package com.example.final_projectars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Three extends AppCompatActivity {
    ImageView _imgZam;
    ImageView _imgKl;
    float dx, dy;
    boolean KlX, KlY;
    Intent _intent;
    TextView _lbl111;
    Timer _timer1;
    TimerTask _task1;
    Random myrnd1 = new Random();
    ConstraintLayout _Const1;
    int c = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        _imgKl = (ImageView)findViewById(R.id.imgKl);
        _imgZam = (ImageView) findViewById(R.id.imgZam);
        _lbl111 = (TextView) findViewById(R.id.lbl111);
        _Const1 = (ConstraintLayout)findViewById(R.id.Const1);
        getSupportActionBar().hide();
        image_move(_imgKl);
        _timer1 = new Timer();
        _task1 = new Task1();
        _timer1.schedule(_task1,0,1000);
    }
    @SuppressLint("ClickableViewAccessibility")
    public void image_move(ImageView img){
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        dx = v.getX()-event.getRawX();
                        dy = v.getY()-event.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        v.animate()
                                .x(event.getRawX()+dx)
                                .y(event.getRawY()+dy)
                                .setDuration(0)
                                .start();
                        break;
                    case MotionEvent.ACTION_UP:
                        KlX=_imgZam.getX()+150<v.getX()&& v.getX()<_imgZam.getX()+_imgZam.getWidth()/2+20;
                        KlY=_imgZam.getY()+150<v.getY()&& v.getY()<_imgZam.getY()+_imgZam.getHeight()/2+20;
                        if(KlX && KlY)
                        {
                            _timer1.cancel();
                            _intent = new Intent();
                            _intent.putExtra("back31", 100+"");
                            setResult(RESULT_OK, _intent);
                            finish();
                            Toast.makeText(getApplication(),"Ты прошел 1 уровень",Toast.LENGTH_SHORT).show();
                        }
                        break;
                    default:return false;
                }
                return true;
            }
        });
    }
    class Task1 extends TimerTask{
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    c--;
                    if(c == 0){
                        _intent = new Intent();
                        _intent.putExtra("back31", 0+"");
                        setResult(RESULT_CANCELED, _intent);
                        finish();
                        Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        int x = Integer.valueOf(_Const1.getWidth() - 500);
                        int y = Integer.valueOf(_Const1.getHeight() - 500);
                        int a = myrnd1.nextInt(x);
                        int b = myrnd1.nextInt(y);
                        _imgZam.setX(a);
                        _imgZam.setY(b);
                        _lbl111.setText("Время: " + c + " сек.");
                    }
                }
            });
        }
    }
}