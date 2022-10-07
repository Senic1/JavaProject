package com.example.final_projectars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Five extends AppCompatActivity {
    ImageView _imgZam2;
    ImageView _imgKl2;
    float dx2, dy2;
    boolean KlX2, KlY2;
    Intent _intent;
    Timer _timer2;
    TimerTask _task2;
    Random myrnd3 = new Random();
    ConstraintLayout _Const2;
    int c = 15;
    TextView _lbl5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        _imgKl2 = (ImageView) findViewById(R.id.imgKl2);
        _imgZam2 = (ImageView) findViewById(R.id.imgZam2);
        _Const2 = (ConstraintLayout) findViewById(R.id.Const2);
        _lbl5 = (TextView) findViewById(R.id.lbl5);
        image_move(_imgKl2);
        getSupportActionBar().hide();
        _timer2 = new Timer();
        _task2 = new Task2();
        _timer2.schedule(_task2,0,1000);
    }

    @SuppressLint("ClickableViewAccessibility")
    public void image_move(ImageView img) {
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dx2 = v.getX() - event.getRawX();
                        dy2 = v.getY() - event.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        v.animate()
                                .x(event.getRawX() + dx2)
                                .y(event.getRawY() + dy2)
                                .setDuration(0)
                                .start();
                        break;
                    case MotionEvent.ACTION_UP:
                        KlX2 = _imgZam2.getX() + 150 < v.getX() && v.getX() < _imgZam2.getX() + _imgZam2.getWidth() / 2 + 20;
                        KlY2 = _imgZam2.getY() + 150 < v.getY() && v.getY() < _imgZam2.getY() + _imgZam2.getHeight() / 2 + 20;


                        if (KlX2 && KlY2) {
                            _timer2.cancel();
                            _intent = new Intent();
                            _intent.putExtra("back51", 200 + "");
                            setResult(RESULT_OK, _intent);
                            finish();
                            Toast.makeText(getApplication(), "Ты прошел 2 уровень", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }
    class Task2 extends TimerTask {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    c--;
                    if(c == 0){
                        _intent = new Intent();
                        _intent.putExtra("back51", 0+"");
                        setResult(RESULT_CANCELED, _intent);
                        finish();
                        Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        int x = Integer.valueOf(_Const2.getWidth() - 500);
                        int y = Integer.valueOf(_Const2.getHeight() - 500);
                        int a = myrnd3.nextInt(x);
                        int b = myrnd3.nextInt(y);
                        _imgZam2.setX(a);
                        _imgZam2.setY(b);
                        _lbl5.setText("Время: " + c + " сек.");
                    }
                }
            });
        }
    }
}