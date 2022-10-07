package com.example.final_projectars;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button _btn1, _btn1dop, _btn2, _btn2dop, _btnSbros;
    Intent _intent;
    static private int code = 0;
    String s1;
    TextView _lbl2;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btn1 = (Button) findViewById(R.id.btn1);
        _btn1dop = (Button)findViewById(R.id.btn1dop);
        _lbl2 = (TextView) findViewById(R.id.lbl2);
        _btn2 = (Button) findViewById(R.id.btn2);
        _btn2dop = (Button)findViewById(R.id.btn2dop);
        _btnSbros = (Button)findViewById(R.id.btnSbros);
        getSupportActionBar().hide();
        _lbl2.setText("Ваши очки: 0");


        _btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _btn1.setEnabled(false);
                _intent = new Intent(getApplication(), Two.class);
                startActivityForResult(_intent, code);

            }
        });
        _btn1dop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = 1;
                _btn1dop.setEnabled(false);
                _intent = new Intent(getApplication(), Three.class);
                startActivityForResult(_intent, code);
                Toast.makeText(getApplication(), "Передвинь ключ к замку", Toast.LENGTH_SHORT).show();
            }
        });
        _btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = 2;
                _btn2.setEnabled(false);
                _intent = new Intent(getApplication(), Four.class);
                startActivityForResult(_intent, code);
            }
        });
        _btn2dop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = 3;
                _btn2dop.setEnabled(false);
                _intent = new Intent(getApplication(), Five.class);
                startActivityForResult(_intent, code);
                Toast.makeText(getApplication(), "Передвинь ключ к замку", Toast.LENGTH_SHORT).show();
            }
        });
        _btnSbros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             _btn1.setEnabled(true);
             _btnSbros.setEnabled(false);
        //     _lbl2.setText("Ваши очки: 0");
             code = 0;
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                _btn1dop.setEnabled(true);
        }
            else{
                _btn1.setEnabled(true);
                _lbl2.setText("Ваши очки: 0");
            }
        }

        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                s1 = data.getStringExtra("back31");
                a += Integer.valueOf(s1);
                _lbl2.setText(String.valueOf("Ваши очки: "+a));
                _btn2.setEnabled(true);
            }
            else{
                _btn1dop.setEnabled(true);
                _lbl2.setText("Ваши очки: 0");
            }
        }

        if(requestCode == 2) {
            if (resultCode == RESULT_OK) {
                _btn2dop.setEnabled(true);
            }
            else {
                _btn2.setEnabled(true);
            }
        }

            if(requestCode == 3){
                if(resultCode == RESULT_OK){
                    s1 = data.getStringExtra("back51");
                    a += Integer.valueOf(s1);
                    _lbl2.setText(String.valueOf("Ваши очки: "+a));
                    _btnSbros.setEnabled(true);

                }
                else{
                    _btn2dop.setEnabled(true);
                    _lbl2.setText("Ваши очки: 0");
                }
            }
        }
    }
