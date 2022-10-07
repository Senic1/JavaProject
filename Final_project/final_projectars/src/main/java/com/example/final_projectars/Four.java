package com.example.final_projectars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Four extends AppCompatActivity {
    ImageView _imgGl2;
    Button _btnExit2, _btnUp2, _btnLeft2, _btnDown2, _btnRight2;
    Intent _intent;
    boolean chelx, chely, chelx2, chely2, chelx3, chely3, chelx4, chely4, chelx5, chely5, chelx6, chely6, chelx7, chely7, chelx8, chely8, chelx9, chely9, chelx10, chely10, chelx11, chely11, chelx12, chely12, chelx13, chely13, chelx14, chely14, chelx15, chely15, chelx16, chely16, chelx17, chely17, chelx18, chely18, chelx19, chely19, chelx20, chely20, chelx21, chely21, chelx22, chely22, chelx23, chely23, chelx24, chely24, chelx25, chely25, chelx26, chely26, chelx27, chely27, chelx28, chely28, chelx29, chely29, chelx30, chely30, chelx31, chely31, chelx32, chely32, chelx33, chely33, chelx34, chely34, chelx35, chely35, chelx36, chely36, chelx37, chely37, chelx38, chely38, chelx39, chely39, chelx40, chely40, chelx41, chely41, chelx42, chely42, chelx43, chely43, chelx44, chely44, chelx45, chely45, chelx46, chely46, chelx47, chely47, chelx48, chely48, chelx49, chely49, chelx98, chely98,chelx106,chely106;
    boolean _finishx, _finishy;

    ImageView _img51, _img52, _img53, _img54, _img55, _img56, _img57, _img58, _img59, _img60, _img61, _img62, _img63, _img64, _img65, _img66, _img67, _img68, _img69,
            _img70, _img71, _img72, _img73, _img74, _img75, _img76, _img77, _img78, _img79, _img80, _img81, _img82, _img83, _img84, _img85, _img86, _img87, _img88,
            _img89, _img90, _img91, _img92, _img93, _img94, _img95, _img96, _img97, _img50,_img98,_img106, _imgFin2;
    TextView _lbl22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        _btnExit2 = (Button) findViewById(R.id.btnExit2);
        _imgGl2 = (ImageView) findViewById(R.id.imageGl2);
        _btnUp2 = (Button) findViewById(R.id.btnUp2);
        _btnDown2 = (Button) findViewById(R.id.btnDown2);
        _btnLeft2 = (Button) findViewById(R.id.btnLeft2);
        _btnRight2 = (Button) findViewById(R.id.btnRight2);
        _img50 = (ImageView) findViewById(R.id.imageView50);
        _img51 = (ImageView) findViewById(R.id.imageView51);
        _img52 = (ImageView) findViewById(R.id.imageView52);
        _img53 = (ImageView) findViewById(R.id.imageView53);
        _img54 = (ImageView) findViewById(R.id.imageView54);
        _img55 = (ImageView) findViewById(R.id.imageView55);
        _img56 = (ImageView) findViewById(R.id.imageView56);
        _img57 = (ImageView) findViewById(R.id.imageView57);
        _img58 = (ImageView) findViewById(R.id.imageView58);
        _img59 = (ImageView) findViewById(R.id.imageView59);
        _img60 = (ImageView) findViewById(R.id.imageView60);
        _img61 = (ImageView) findViewById(R.id.imageView61);
        _img62 = (ImageView) findViewById(R.id.imageView62);
        _img63 = (ImageView) findViewById(R.id.imageView63);
        _img64 = (ImageView) findViewById(R.id.imageView64);
        _img65 = (ImageView) findViewById(R.id.imageView65);
        _img66 = (ImageView) findViewById(R.id.imageView66);
        _img67 = (ImageView) findViewById(R.id.imageView67);
        _img68 = (ImageView) findViewById(R.id.imageView68);
        _img69 = (ImageView) findViewById(R.id.imageView69);
        _img70 = (ImageView) findViewById(R.id.imageView70);
        _img71 = (ImageView) findViewById(R.id.imageView71);
        _img72 = (ImageView) findViewById(R.id.imageView72);
        _img73 = (ImageView) findViewById(R.id.imageView73);
        _img74 = (ImageView) findViewById(R.id.imageView74);
        _img75 = (ImageView) findViewById(R.id.imageView75);
        _img76 = (ImageView) findViewById(R.id.imageView76);
        _img77 = (ImageView) findViewById(R.id.imageView77);
        _img78 = (ImageView) findViewById(R.id.imageView78);
        _img79 = (ImageView) findViewById(R.id.imageView79);
        _img80 = (ImageView) findViewById(R.id.imageView80);
        _img81 = (ImageView) findViewById(R.id.imageView81);
        _img82 = (ImageView) findViewById(R.id.imageView82);
        _img83 = (ImageView) findViewById(R.id.imageView83);
        _img84 = (ImageView) findViewById(R.id.imageView84);
        _img85 = (ImageView) findViewById(R.id.imageView85);
        _img86 = (ImageView) findViewById(R.id.imageView86);
        _img87 = (ImageView) findViewById(R.id.imageView87);
        _img88 = (ImageView) findViewById(R.id.imageView88);
        _img89 = (ImageView) findViewById(R.id.imageView89);
        _img90 = (ImageView) findViewById(R.id.imageView90);
        _img91 = (ImageView) findViewById(R.id.imageView91);
        _img92 = (ImageView) findViewById(R.id.imageView92);
        _img93 = (ImageView) findViewById(R.id.imageView93);
        _img94 = (ImageView) findViewById(R.id.imageView94);
        _img95 = (ImageView) findViewById(R.id.imageView95);
        _img96 = (ImageView) findViewById(R.id.imageView96);
        _img97 = (ImageView) findViewById(R.id.imageView97);
        _img98 = (ImageView) findViewById(R.id.imageView98);
        _img106 = (ImageView) findViewById(R.id.imageView106);
        _imgFin2 = (ImageView) findViewById(R.id.imageFin2);
        _lbl22 = (TextView) findViewById(R.id.lbl22);
        getSupportActionBar().hide();



        _btnExit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back41", 0+"");
                setResult(RESULT_CANCELED, _intent);
                finish();
            }
        });
        _btnUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl2.setY(_imgGl2.getY() - 30);

                chelx = _imgGl2.getX() < _img50.getX() + 80 && _img50.getX() - 80 < _imgGl2.getX();
                chely = _imgGl2.getY() < _img50.getY() + 80 && _img50.getY() - 80 < _imgGl2.getY();

                chelx2 = _imgGl2.getX() < _img51.getX() + 80 && _img51.getX() - 80 < _imgGl2.getX();
                chely2 = _imgGl2.getY() < _img51.getY() + 80 && _img51.getY() - 80 < _imgGl2.getY();

                chelx3 = _imgGl2.getX() < _img52.getX() + 80 && _img52.getX() - 80 < _imgGl2.getX();
                chely3 = _imgGl2.getY() < _img52.getY() + 80 && _img52.getY() - 80 < _imgGl2.getY();

                chelx4 = _imgGl2.getX() < _img53.getX() + 80 && _img53.getX() - 80 < _imgGl2.getX();
                chely4 = _imgGl2.getY() < _img53.getY() + 80 && _img53.getY() - 80 < _imgGl2.getY();

                chelx28 = _imgGl2.getX() < _img54.getX() + 80 && _img54.getX() - 80 < _imgGl2.getX();
                chely28 = _imgGl2.getY() < _img54.getY() + 80 && _img54.getY() - 80 < _imgGl2.getY();

                chelx5 = _imgGl2.getX() < _img55.getX() + 80 && _img55.getX() - 80 < _imgGl2.getX();
                chely5 = _imgGl2.getY() < _img55.getY() + 80 && _img55.getY() - 80 < _imgGl2.getY();

                chelx6 = _imgGl2.getX() < _img56.getX() + 80 && _img56.getX() - 80 < _imgGl2.getX();
                chely6 = _imgGl2.getY() < _img56.getY() + 80 && _img56.getY() - 80 < _imgGl2.getY();

                chelx7 = _imgGl2.getX() < _img57.getX() + 80 && _img57.getX() - 80 < _imgGl2.getX();
                chely7 = _imgGl2.getY() < _img57.getY() + 80 && _img57.getY() - 80 < _imgGl2.getY();

                chelx8 = _imgGl2.getX() < _img58.getX() + 80 && _img58.getX() - 80 < _imgGl2.getX();
                chely8 = _imgGl2.getY() < _img58.getY() + 80 && _img58.getY() - 80 < _imgGl2.getY();

                chelx9 = _imgGl2.getX() < _img59.getX() + 80 && _img59.getX() - 80 < _imgGl2.getX();
                chely9 = _imgGl2.getY() < _img59.getY() + 80 && _img59.getY() - 80 < _imgGl2.getY();

                chelx10 = _imgGl2.getX() < _img60.getX() + 80 && _img60.getX() - 80 < _imgGl2.getX();
                chely10 = _imgGl2.getY() < _img60.getY() + 80 && _img60.getY() - 80 < _imgGl2.getY();

                chelx11 = _imgGl2.getX() < _img61.getX() + 80 && _img61.getX() - 80 < _imgGl2.getX();
                chely11 = _imgGl2.getY() < _img61.getY() + 80 && _img61.getY() - 80 < _imgGl2.getY();

                chelx12 = _imgGl2.getX() < _img62.getX() + 80 && _img62.getX() - 80 < _imgGl2.getX();
                chely12 = _imgGl2.getY() < _img62.getY() + 80 && _img62.getY() - 80 < _imgGl2.getY();

                chelx13 = _imgGl2.getX() < _img63.getX() + 80 && _img63.getX() - 80 < _imgGl2.getX();
                chely13 = _imgGl2.getY() < _img63.getY() + 80 && _img63.getY() - 80 < _imgGl2.getY();

                chelx14 = _imgGl2.getX() < _img64.getX() + 80 && _img64.getX() - 80 < _imgGl2.getX();
                chely14 = _imgGl2.getY() < _img64.getY() + 80 && _img64.getY() - 80 < _imgGl2.getY();

                chelx15 = _imgGl2.getX() < _img65.getX() + 80 && _img65.getX() - 80 < _imgGl2.getX();
                chely15 = _imgGl2.getY() < _img65.getY() + 80 && _img65.getY() - 80 < _imgGl2.getY();

                chelx16 = _imgGl2.getX() < _img66.getX() + 80 && _img66.getX() - 80 < _imgGl2.getX();
                chely16 = _imgGl2.getY() < _img66.getY() + 80 && _img66.getY() - 80 < _imgGl2.getY();

                chelx17 = _imgGl2.getX() < _img67.getX() + 80 && _img67.getX() - 80 < _imgGl2.getX();
                chely17 = _imgGl2.getY() < _img67.getY() + 80 && _img67.getY() - 80 < _imgGl2.getY();

                chelx18 = _imgGl2.getX() < _img68.getX() + 80 && _img68.getX() - 80 < _imgGl2.getX();
                chely18 = _imgGl2.getY() < _img68.getY() + 80 && _img68.getY() - 80 < _imgGl2.getY();

                chelx19 = _imgGl2.getX() < _img69.getX() + 80 && _img69.getX() - 80 < _imgGl2.getX();
                chely19 = _imgGl2.getY() < _img69.getY() + 80 && _img69.getY() - 80 < _imgGl2.getY();

                chelx20 = _imgGl2.getX() < _img70.getX() + 80 && _img70.getX() - 80 < _imgGl2.getX();
                chely20 = _imgGl2.getY() < _img70.getY() + 80 && _img70.getY() - 80 < _imgGl2.getY();

                chelx21 = _imgGl2.getX() < _img71.getX() + 80 && _img71.getX() - 80 < _imgGl2.getX();
                chely21 = _imgGl2.getY() < _img71.getY() + 80 && _img71.getY() - 80 < _imgGl2.getY();

                chelx22 = _imgGl2.getX() < _img72.getX() + 80 && _img72.getX() - 80 < _imgGl2.getX();
                chely22 = _imgGl2.getY() < _img72.getY() + 80 && _img72.getY() - 80 < _imgGl2.getY();

                chelx23 = _imgGl2.getX() < _img73.getX() + 80 && _img73.getX() - 80 < _imgGl2.getX();
                chely23 = _imgGl2.getY() < _img73.getY() + 80 && _img73.getY() - 80 < _imgGl2.getY();

                chelx24 = _imgGl2.getX() < _img74.getX() + 80 && _img74.getX() - 80 < _imgGl2.getX();
                chely24 = _imgGl2.getY() < _img74.getY() + 80 && _img74.getY() - 80 < _imgGl2.getY();

                chelx25 = _imgGl2.getX() < _img75.getX() + 80 && _img75.getX() - 80 < _imgGl2.getX();
                chely25 = _imgGl2.getY() < _img75.getY() + 80 && _img75.getY() - 80 < _imgGl2.getY();

                chelx26 = _imgGl2.getX() < _img76.getX() + 80 && _img76.getX() - 80 < _imgGl2.getX();
                chely26 = _imgGl2.getY() < _img76.getY() + 80 && _img76.getY() - 80 < _imgGl2.getY();

                chelx27 = _imgGl2.getX() < _img77.getX() + 80 && _img77.getX() - 80 < _imgGl2.getX();
                chely27 = _imgGl2.getY() < _img77.getY() + 80 && _img77.getY() - 80 < _imgGl2.getY();

                chelx28 = _imgGl2.getX() < _img78.getX() + 80 && _img78.getX() - 80 < _imgGl2.getX();
                chely28 = _imgGl2.getY() < _img78.getY() + 80 && _img78.getY() - 80 < _imgGl2.getY();

                chelx29 = _imgGl2.getX() < _img79.getX() + 80 && _img79.getX() - 80 < _imgGl2.getX();
                chely29 = _imgGl2.getY() < _img79.getY() + 80 && _img79.getY() - 80 < _imgGl2.getY();

                chelx30 = _imgGl2.getX() < _img80.getX() + 80 && _img80.getX() - 80 < _imgGl2.getX();
                chely30 = _imgGl2.getY() < _img80.getY() + 80 && _img80.getY() - 80 < _imgGl2.getY();

                chelx31 = _imgGl2.getX() < _img81.getX() + 80 && _img81.getX() - 80 < _imgGl2.getX();
                chely31 = _imgGl2.getY() < _img81.getY() + 80 && _img81.getY() - 80 < _imgGl2.getY();

                chelx32 = _imgGl2.getX() < _img82.getX() + 80 && _img82.getX() - 80 < _imgGl2.getX();
                chely32 = _imgGl2.getY() < _img82.getY() + 80 && _img82.getY() - 80 < _imgGl2.getY();

                chelx33 = _imgGl2.getX() < _img83.getX() + 80 && _img83.getX() - 80 < _imgGl2.getX();
                chely33 = _imgGl2.getY() < _img83.getY() + 80 && _img83.getY() - 80 < _imgGl2.getY();

                chelx34 = _imgGl2.getX() < _img84.getX() + 80 && _img84.getX() - 80 < _imgGl2.getX();
                chely34 = _imgGl2.getY() < _img84.getY() + 80 && _img84.getY() - 80 < _imgGl2.getY();

                chelx35 = _imgGl2.getX() < _img85.getX() + 80 && _img85.getX() - 80 < _imgGl2.getX();
                chely35 = _imgGl2.getY() < _img85.getY() + 80 && _img85.getY() - 80 < _imgGl2.getY();

                chelx36 = _imgGl2.getX() < _img86.getX() + 80 && _img86.getX() - 80 < _imgGl2.getX();
                chely36 = _imgGl2.getY() < _img86.getY() + 80 && _img86.getY() - 80 < _imgGl2.getY();

                chelx37 = _imgGl2.getX() < _img87.getX() + 80 && _img87.getX() - 80 < _imgGl2.getX();
                chely37 = _imgGl2.getY() < _img87.getY() + 80 && _img87.getY() - 80 < _imgGl2.getY();

                chelx38 = _imgGl2.getX() < _img88.getX() + 80 && _img88.getX() - 80 < _imgGl2.getX();
                chely38 = _imgGl2.getY() < _img88.getY() + 80 && _img88.getY() - 80 < _imgGl2.getY();

                chelx39 = _imgGl2.getX() < _img89.getX() + 80 && _img89.getX() - 80 < _imgGl2.getX();
                chely39 = _imgGl2.getY() < _img89.getY() + 80 && _img89.getY() - 80 < _imgGl2.getY();

                chelx40 = _imgGl2.getX() < _img90.getX() + 80 && _img90.getX() - 80 < _imgGl2.getX();
                chely40 = _imgGl2.getY() < _img90.getY() + 80 && _img90.getY() - 80 < _imgGl2.getY();

                chelx41 = _imgGl2.getX() < _img91.getX() + 80 && _img91.getX() - 80 < _imgGl2.getX();
                chely41 = _imgGl2.getY() < _img91.getY() + 80 && _img91.getY() - 80 < _imgGl2.getY();

                chelx42 = _imgGl2.getX() < _img92.getX() + 80 && _img92.getX() - 80 < _imgGl2.getX();
                chely42 = _imgGl2.getY() < _img92.getY() + 80 && _img92.getY() - 80 < _imgGl2.getY();

                chelx43 = _imgGl2.getX() < _img93.getX() + 80 && _img93.getX() - 80 < _imgGl2.getX();
                chely43 = _imgGl2.getY() < _img93.getY() + 80 && _img93.getY() - 80 < _imgGl2.getY();

                chelx44 = _imgGl2.getX() < _img94.getX() + 80 && _img94.getX() - 80 < _imgGl2.getX();
                chely44 = _imgGl2.getY() < _img94.getY() + 80 && _img94.getY() - 80 < _imgGl2.getY();

                chelx45 = _imgGl2.getX() < _img95.getX() + 80 && _img95.getX() - 80 < _imgGl2.getX();
                chely45 = _imgGl2.getY() < _img95.getY() + 80 && _img95.getY() - 80 < _imgGl2.getY();

                chelx46 = _imgGl2.getX() < _img96.getX() + 80 && _img96.getX() - 80 < _imgGl2.getX();
                chely46 = _imgGl2.getY() < _img96.getY() + 80 && _img96.getY() - 80 < _imgGl2.getY();

                chelx47 = _imgGl2.getX() < _img97.getX() + 80 && _img97.getX() - 80 < _imgGl2.getX();
                chely47 = _imgGl2.getY() < _img97.getY() + 80 && _img97.getY() - 80 < _imgGl2.getY();

                _finishx = _imgGl2.getX() < _imgFin2.getX() + 80 && _imgFin2.getX() - 80 < _imgGl2.getX();
                _finishy = _imgGl2.getY() < _imgFin2.getY() + 80 && _imgFin2.getY() - 80 < _imgGl2.getY();

                if (_finishx && _finishy) {
                    _btnDown2.setClickable(false);
                    _btnUp2.setClickable(false);
                    _btnRight2.setClickable(false);
                    _btnLeft2.setClickable(false);
                    _intent = new Intent();
                    _intent.putExtra("back41", 0+"");
                    setResult(RESULT_OK, _intent);
                    finish();
                    Toast.makeText(getApplication(), "Открой замок", Toast.LENGTH_SHORT).show();
                } else {
                    if ((chelx && chely) || (chelx2 && chely2) || (chelx3 && chely3) || (chelx4 && chely4) || (chelx5 && chely5) || (chelx6 && chely6) || (chelx7 && chely7)
                            || (chelx8 && chely8) || (chelx9 && chely9) || (chelx10 && chely10) || (chelx11 && chely11) || (chelx12 && chely12) || (chelx13 && chely13)
                            || (chelx14 && chely14) || (chelx15 && chely15) || (chelx16 && chely16) || (chelx17 && chely17) || (chelx18 && chely18) || (chelx19 && chely19)
                            || (chelx20 && chely20) || (chelx21 && chely21) || (chelx22 && chely22) || (chelx23 && chely23) || (chelx24 && chely24) || (chelx25 && chely25)
                            || (chelx26 && chely26) || (chelx27 && chely27) || (chelx28 && chely28) || (chelx29 && chely29) || (chelx30 && chely30) || (chelx31 && chely31)
                            || (chelx32 && chely32) || (chelx33 && chely33) || (chelx34 && chely34) || (chelx35 && chely35) || (chelx36 && chely36) || (chelx37 && chely37)
                            || (chelx38 && chely38) || (chelx39 && chely39) || (chelx40 && chely40) || (chelx41 && chely41) || (chelx42 && chely42) || (chelx43 && chely43)
                            || (chelx44 && chely44) || (chelx45 && chely45) || (chelx46 && chely46) || (chelx47 && chely47) || (chelx48 && chely48) || (chelx49 && chely49)) {
                        Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                        _imgGl2.setY(1200);
                        _imgGl2.setX(480);
                    }
                }
            }
        });
        _btnDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl2.setY(_imgGl2.getY() + 30);

                chelx = _imgGl2.getX() < _img50.getX() + 80 && _img50.getX() - 80 < _imgGl2.getX();
                chely = _imgGl2.getY() < _img50.getY() + 80 && _img50.getY() - 80 < _imgGl2.getY();

                chelx2 = _imgGl2.getX() < _img51.getX() + 80 && _img51.getX() - 80 < _imgGl2.getX();
                chely2 = _imgGl2.getY() < _img51.getY() + 80 && _img51.getY() - 80 < _imgGl2.getY();

                chelx3 = _imgGl2.getX() < _img52.getX() + 80 && _img52.getX() - 80 < _imgGl2.getX();
                chely3 = _imgGl2.getY() < _img52.getY() + 80 && _img52.getY() - 80 < _imgGl2.getY();

                chelx4 = _imgGl2.getX() < _img53.getX() + 80 && _img53.getX() - 80 < _imgGl2.getX();
                chely4 = _imgGl2.getY() < _img53.getY() + 80 && _img53.getY() - 80 < _imgGl2.getY();

                chelx28 = _imgGl2.getX() < _img54.getX() + 80 && _img54.getX() - 80 < _imgGl2.getX();
                chely28 = _imgGl2.getY() < _img54.getY() + 80 && _img54.getY() - 80 < _imgGl2.getY();

                chelx5 = _imgGl2.getX() < _img55.getX() + 80 && _img55.getX() - 80 < _imgGl2.getX();
                chely5 = _imgGl2.getY() < _img55.getY() + 80 && _img55.getY() - 80 < _imgGl2.getY();

                chelx6 = _imgGl2.getX() < _img56.getX() + 80 && _img56.getX() - 80 < _imgGl2.getX();
                chely6 = _imgGl2.getY() < _img56.getY() + 80 && _img56.getY() - 80 < _imgGl2.getY();

                chelx7 = _imgGl2.getX() < _img57.getX() + 80 && _img57.getX() - 80 < _imgGl2.getX();
                chely7 = _imgGl2.getY() < _img57.getY() + 80 && _img57.getY() - 80 < _imgGl2.getY();

                chelx8 = _imgGl2.getX() < _img58.getX() + 80 && _img58.getX() - 80 < _imgGl2.getX();
                chely8 = _imgGl2.getY() < _img58.getY() + 80 && _img58.getY() - 80 < _imgGl2.getY();

                chelx9 = _imgGl2.getX() < _img59.getX() + 80 && _img59.getX() - 80 < _imgGl2.getX();
                chely9 = _imgGl2.getY() < _img59.getY() + 80 && _img59.getY() - 80 < _imgGl2.getY();

                chelx10 = _imgGl2.getX() < _img60.getX() + 80 && _img60.getX() - 80 < _imgGl2.getX();
                chely10 = _imgGl2.getY() < _img60.getY() + 80 && _img60.getY() - 80 < _imgGl2.getY();

                chelx11 = _imgGl2.getX() < _img61.getX() + 80 && _img61.getX() - 80 < _imgGl2.getX();
                chely11 = _imgGl2.getY() < _img61.getY() + 80 && _img61.getY() - 80 < _imgGl2.getY();

                chelx12 = _imgGl2.getX() < _img62.getX() + 80 && _img62.getX() - 80 < _imgGl2.getX();
                chely12 = _imgGl2.getY() < _img62.getY() + 80 && _img62.getY() - 80 < _imgGl2.getY();

                chelx13 = _imgGl2.getX() < _img63.getX() + 80 && _img63.getX() - 80 < _imgGl2.getX();
                chely13 = _imgGl2.getY() < _img63.getY() + 80 && _img63.getY() - 80 < _imgGl2.getY();

                chelx14 = _imgGl2.getX() < _img64.getX() + 80 && _img64.getX() - 80 < _imgGl2.getX();
                chely14 = _imgGl2.getY() < _img64.getY() + 80 && _img64.getY() - 80 < _imgGl2.getY();

                chelx15 = _imgGl2.getX() < _img65.getX() + 80 && _img65.getX() - 80 < _imgGl2.getX();
                chely15 = _imgGl2.getY() < _img65.getY() + 80 && _img65.getY() - 80 < _imgGl2.getY();

                chelx16 = _imgGl2.getX() < _img66.getX() + 80 && _img66.getX() - 80 < _imgGl2.getX();
                chely16 = _imgGl2.getY() < _img66.getY() + 80 && _img66.getY() - 80 < _imgGl2.getY();

                chelx17 = _imgGl2.getX() < _img67.getX() + 80 && _img67.getX() - 80 < _imgGl2.getX();
                chely17 = _imgGl2.getY() < _img67.getY() + 80 && _img67.getY() - 80 < _imgGl2.getY();

                chelx18 = _imgGl2.getX() < _img68.getX() + 80 && _img68.getX() - 80 < _imgGl2.getX();
                chely18 = _imgGl2.getY() < _img68.getY() + 80 && _img68.getY() - 80 < _imgGl2.getY();

                chelx19 = _imgGl2.getX() < _img69.getX() + 80 && _img69.getX() - 80 < _imgGl2.getX();
                chely19 = _imgGl2.getY() < _img69.getY() + 80 && _img69.getY() - 80 < _imgGl2.getY();

                chelx20 = _imgGl2.getX() < _img70.getX() + 80 && _img70.getX() - 80 < _imgGl2.getX();
                chely20 = _imgGl2.getY() < _img70.getY() + 80 && _img70.getY() - 80 < _imgGl2.getY();

                chelx21 = _imgGl2.getX() < _img71.getX() + 80 && _img71.getX() - 80 < _imgGl2.getX();
                chely21 = _imgGl2.getY() < _img71.getY() + 80 && _img71.getY() - 80 < _imgGl2.getY();

                chelx22 = _imgGl2.getX() < _img72.getX() + 80 && _img72.getX() - 80 < _imgGl2.getX();
                chely22 = _imgGl2.getY() < _img72.getY() + 80 && _img72.getY() - 80 < _imgGl2.getY();

                chelx23 = _imgGl2.getX() < _img73.getX() + 80 && _img73.getX() - 80 < _imgGl2.getX();
                chely23 = _imgGl2.getY() < _img73.getY() + 80 && _img73.getY() - 80 < _imgGl2.getY();

                chelx24 = _imgGl2.getX() < _img74.getX() + 80 && _img74.getX() - 80 < _imgGl2.getX();
                chely24 = _imgGl2.getY() < _img74.getY() + 80 && _img74.getY() - 80 < _imgGl2.getY();

                chelx25 = _imgGl2.getX() < _img75.getX() + 80 && _img75.getX() - 80 < _imgGl2.getX();
                chely25 = _imgGl2.getY() < _img75.getY() + 80 && _img75.getY() - 80 < _imgGl2.getY();

                chelx26 = _imgGl2.getX() < _img76.getX() + 80 && _img76.getX() - 80 < _imgGl2.getX();
                chely26 = _imgGl2.getY() < _img76.getY() + 80 && _img76.getY() - 80 < _imgGl2.getY();

                chelx27 = _imgGl2.getX() < _img77.getX() + 80 && _img77.getX() - 80 < _imgGl2.getX();
                chely27 = _imgGl2.getY() < _img77.getY() + 80 && _img77.getY() - 80 < _imgGl2.getY();

                chelx28 = _imgGl2.getX() < _img78.getX() + 80 && _img78.getX() - 80 < _imgGl2.getX();
                chely28 = _imgGl2.getY() < _img78.getY() + 80 && _img78.getY() - 80 < _imgGl2.getY();

                chelx29 = _imgGl2.getX() < _img79.getX() + 80 && _img79.getX() - 80 < _imgGl2.getX();
                chely29 = _imgGl2.getY() < _img79.getY() + 80 && _img79.getY() - 80 < _imgGl2.getY();

                chelx30 = _imgGl2.getX() < _img80.getX() + 80 && _img80.getX() - 80 < _imgGl2.getX();
                chely30 = _imgGl2.getY() < _img80.getY() + 80 && _img80.getY() - 80 < _imgGl2.getY();

                chelx31 = _imgGl2.getX() < _img81.getX() + 80 && _img81.getX() - 80 < _imgGl2.getX();
                chely31 = _imgGl2.getY() < _img81.getY() + 80 && _img81.getY() - 80 < _imgGl2.getY();

                chelx32 = _imgGl2.getX() < _img82.getX() + 80 && _img82.getX() - 80 < _imgGl2.getX();
                chely32 = _imgGl2.getY() < _img82.getY() + 80 && _img82.getY() - 80 < _imgGl2.getY();

                chelx33 = _imgGl2.getX() < _img83.getX() + 80 && _img83.getX() - 80 < _imgGl2.getX();
                chely33 = _imgGl2.getY() < _img83.getY() + 80 && _img83.getY() - 80 < _imgGl2.getY();

                chelx34 = _imgGl2.getX() < _img84.getX() + 80 && _img84.getX() - 80 < _imgGl2.getX();
                chely34 = _imgGl2.getY() < _img84.getY() + 80 && _img84.getY() - 80 < _imgGl2.getY();

                chelx35 = _imgGl2.getX() < _img85.getX() + 80 && _img85.getX() - 80 < _imgGl2.getX();
                chely35 = _imgGl2.getY() < _img85.getY() + 80 && _img85.getY() - 80 < _imgGl2.getY();

                chelx36 = _imgGl2.getX() < _img86.getX() + 80 && _img86.getX() - 80 < _imgGl2.getX();
                chely36 = _imgGl2.getY() < _img86.getY() + 80 && _img86.getY() - 80 < _imgGl2.getY();

                chelx37 = _imgGl2.getX() < _img87.getX() + 80 && _img87.getX() - 80 < _imgGl2.getX();
                chely37 = _imgGl2.getY() < _img87.getY() + 80 && _img87.getY() - 80 < _imgGl2.getY();

                chelx38 = _imgGl2.getX() < _img88.getX() + 80 && _img88.getX() - 80 < _imgGl2.getX();
                chely38 = _imgGl2.getY() < _img88.getY() + 80 && _img88.getY() - 80 < _imgGl2.getY();

                chelx39 = _imgGl2.getX() < _img89.getX() + 80 && _img89.getX() - 80 < _imgGl2.getX();
                chely39 = _imgGl2.getY() < _img89.getY() + 80 && _img89.getY() - 80 < _imgGl2.getY();

                chelx40 = _imgGl2.getX() < _img90.getX() + 80 && _img90.getX() - 80 < _imgGl2.getX();
                chely40 = _imgGl2.getY() < _img90.getY() + 80 && _img90.getY() - 80 < _imgGl2.getY();

                chelx41 = _imgGl2.getX() < _img91.getX() + 80 && _img91.getX() - 80 < _imgGl2.getX();
                chely41 = _imgGl2.getY() < _img91.getY() + 80 && _img91.getY() - 80 < _imgGl2.getY();

                chelx42 = _imgGl2.getX() < _img92.getX() + 80 && _img92.getX() - 80 < _imgGl2.getX();
                chely42 = _imgGl2.getY() < _img92.getY() + 80 && _img92.getY() - 80 < _imgGl2.getY();

                chelx43 = _imgGl2.getX() < _img93.getX() + 80 && _img93.getX() - 80 < _imgGl2.getX();
                chely43 = _imgGl2.getY() < _img93.getY() + 80 && _img93.getY() - 80 < _imgGl2.getY();

                chelx44 = _imgGl2.getX() < _img94.getX() + 80 && _img94.getX() - 80 < _imgGl2.getX();
                chely44 = _imgGl2.getY() < _img94.getY() + 80 && _img94.getY() - 80 < _imgGl2.getY();

                chelx45 = _imgGl2.getX() < _img95.getX() + 80 && _img95.getX() - 80 < _imgGl2.getX();
                chely45 = _imgGl2.getY() < _img95.getY() + 80 && _img95.getY() - 80 < _imgGl2.getY();

                chelx46 = _imgGl2.getX() < _img96.getX() + 80 && _img96.getX() - 80 < _imgGl2.getX();
                chely46 = _imgGl2.getY() < _img96.getY() + 80 && _img96.getY() - 80 < _imgGl2.getY();

                chelx47 = _imgGl2.getX() < _img97.getX() + 80 && _img97.getX() - 80 < _imgGl2.getX();
                chely47 = _imgGl2.getY() < _img97.getY() + 80 && _img97.getY() - 80 < _imgGl2.getY();

                chelx98 = _imgGl2.getX() < _img98.getX() + 80 && _img98.getX() - 80 < _imgGl2.getX();
                chely98 = _imgGl2.getY() < _img98.getY() + 80 && _img98.getY() - 80 < _imgGl2.getY();

                _finishx = _imgGl2.getX() < _imgFin2.getX() + 80 && _imgFin2.getX() - 80 < _imgGl2.getX();
                _finishy = _imgGl2.getY() < _imgFin2.getY() + 80 && _imgFin2.getY() - 80 < _imgGl2.getY();

                if (_finishx && _finishy) {
                    _btnDown2.setClickable(false);
                    _btnUp2.setClickable(false);
                    _btnRight2.setClickable(false);
                    _btnLeft2.setClickable(false);
                    _intent = new Intent();
                    _intent.putExtra("back41", 0+"");
                    setResult(RESULT_OK, _intent);
                    finish();
                    Toast.makeText(getApplication(), "Открой замок", Toast.LENGTH_SHORT).show();
                } else {
                    if ((chelx && chely) || (chelx2 && chely2) || (chelx3 && chely3) || (chelx4 && chely4) || (chelx5 && chely5) || (chelx6 && chely6) || (chelx7 && chely7)
                            || (chelx8 && chely8) || (chelx9 && chely9) || (chelx10 && chely10) || (chelx11 && chely11) || (chelx12 && chely12) || (chelx13 && chely13)
                            || (chelx14 && chely14) || (chelx15 && chely15) || (chelx16 && chely16) || (chelx17 && chely17) || (chelx18 && chely18) || (chelx19 && chely19)
                            || (chelx20 && chely20) || (chelx21 && chely21) || (chelx22 && chely22) || (chelx23 && chely23) || (chelx24 && chely24) || (chelx25 && chely25)
                            || (chelx26 && chely26) || (chelx27 && chely27) || (chelx28 && chely28) || (chelx29 && chely29) || (chelx30 && chely30) || (chelx31 && chely31)
                            || (chelx32 && chely32) || (chelx33 && chely33) || (chelx34 && chely34) || (chelx35 && chely35) || (chelx36 && chely36) || (chelx37 && chely37)
                            || (chelx38 && chely38) || (chelx39 && chely39) || (chelx40 && chely40) || (chelx41 && chely41) || (chelx42 && chely42) || (chelx43 && chely43)
                            || (chelx44 && chely44) || (chelx45 && chely45) || (chelx46 && chely46) || (chelx47 && chely47) || (chelx48 && chely48) || (chelx49 && chely49)
                            || (chelx98 && chely98))
                    {
                        Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                        _imgGl2.setY(1200);
                        _imgGl2.setX(480);
                    }
                }
            }
        });
        _btnLeft2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl2.setX(_imgGl2.getX() - 30);

                if (_imgGl2.getX() < -20) {
                    Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                    _imgGl2.setY(1200);
                    _imgGl2.setX(480);
                } else {


                    chelx = _imgGl2.getX() < _img50.getX() + 80 && _img50.getX() - 80 < _imgGl2.getX();
                    chely = _imgGl2.getY() < _img50.getY() + 80 && _img50.getY() - 80 < _imgGl2.getY();

                    chelx2 = _imgGl2.getX() < _img51.getX() + 80 && _img51.getX() - 80 < _imgGl2.getX();
                    chely2 = _imgGl2.getY() < _img51.getY() + 80 && _img51.getY() - 80 < _imgGl2.getY();

                    chelx3 = _imgGl2.getX() < _img52.getX() + 80 && _img52.getX() - 80 < _imgGl2.getX();
                    chely3 = _imgGl2.getY() < _img52.getY() + 80 && _img52.getY() - 80 < _imgGl2.getY();

                    chelx4 = _imgGl2.getX() < _img53.getX() + 80 && _img53.getX() - 80 < _imgGl2.getX();
                    chely4 = _imgGl2.getY() < _img53.getY() + 80 && _img53.getY() - 80 < _imgGl2.getY();

                    chelx28 = _imgGl2.getX() < _img54.getX() + 80 && _img54.getX() - 80 < _imgGl2.getX();
                    chely28 = _imgGl2.getY() < _img54.getY() + 80 && _img54.getY() - 80 < _imgGl2.getY();

                    chelx5 = _imgGl2.getX() < _img55.getX() + 80 && _img55.getX() - 80 < _imgGl2.getX();
                    chely5 = _imgGl2.getY() < _img55.getY() + 80 && _img55.getY() - 80 < _imgGl2.getY();

                    chelx6 = _imgGl2.getX() < _img56.getX() + 80 && _img56.getX() - 80 < _imgGl2.getX();
                    chely6 = _imgGl2.getY() < _img56.getY() + 80 && _img56.getY() - 80 < _imgGl2.getY();

                    chelx7 = _imgGl2.getX() < _img57.getX() + 80 && _img57.getX() - 80 < _imgGl2.getX();
                    chely7 = _imgGl2.getY() < _img57.getY() + 80 && _img57.getY() - 80 < _imgGl2.getY();

                    chelx8 = _imgGl2.getX() < _img58.getX() + 80 && _img58.getX() - 80 < _imgGl2.getX();
                    chely8 = _imgGl2.getY() < _img58.getY() + 80 && _img58.getY() - 80 < _imgGl2.getY();

                    chelx9 = _imgGl2.getX() < _img59.getX() + 80 && _img59.getX() - 80 < _imgGl2.getX();
                    chely9 = _imgGl2.getY() < _img59.getY() + 80 && _img59.getY() - 80 < _imgGl2.getY();

                    chelx10 = _imgGl2.getX() < _img60.getX() + 80 && _img60.getX() - 80 < _imgGl2.getX();
                    chely10 = _imgGl2.getY() < _img60.getY() + 80 && _img60.getY() - 80 < _imgGl2.getY();

                    chelx11 = _imgGl2.getX() < _img61.getX() + 80 && _img61.getX() - 80 < _imgGl2.getX();
                    chely11 = _imgGl2.getY() < _img61.getY() + 80 && _img61.getY() - 80 < _imgGl2.getY();

                    chelx12 = _imgGl2.getX() < _img62.getX() + 80 && _img62.getX() - 80 < _imgGl2.getX();
                    chely12 = _imgGl2.getY() < _img62.getY() + 80 && _img62.getY() - 80 < _imgGl2.getY();

                    chelx13 = _imgGl2.getX() < _img63.getX() + 80 && _img63.getX() - 80 < _imgGl2.getX();
                    chely13 = _imgGl2.getY() < _img63.getY() + 80 && _img63.getY() - 80 < _imgGl2.getY();

                    chelx14 = _imgGl2.getX() < _img64.getX() + 80 && _img64.getX() - 80 < _imgGl2.getX();
                    chely14 = _imgGl2.getY() < _img64.getY() + 80 && _img64.getY() - 80 < _imgGl2.getY();

                    chelx15 = _imgGl2.getX() < _img65.getX() + 80 && _img65.getX() - 80 < _imgGl2.getX();
                    chely15 = _imgGl2.getY() < _img65.getY() + 80 && _img65.getY() - 80 < _imgGl2.getY();

                    chelx16 = _imgGl2.getX() < _img66.getX() + 80 && _img66.getX() - 80 < _imgGl2.getX();
                    chely16 = _imgGl2.getY() < _img66.getY() + 80 && _img66.getY() - 80 < _imgGl2.getY();

                    chelx17 = _imgGl2.getX() < _img67.getX() + 80 && _img67.getX() - 80 < _imgGl2.getX();
                    chely17 = _imgGl2.getY() < _img67.getY() + 80 && _img67.getY() - 80 < _imgGl2.getY();

                    chelx18 = _imgGl2.getX() < _img68.getX() + 80 && _img68.getX() - 80 < _imgGl2.getX();
                    chely18 = _imgGl2.getY() < _img68.getY() + 80 && _img68.getY() - 80 < _imgGl2.getY();

                    chelx19 = _imgGl2.getX() < _img69.getX() + 80 && _img69.getX() - 80 < _imgGl2.getX();
                    chely19 = _imgGl2.getY() < _img69.getY() + 80 && _img69.getY() - 80 < _imgGl2.getY();

                    chelx20 = _imgGl2.getX() < _img70.getX() + 80 && _img70.getX() - 80 < _imgGl2.getX();
                    chely20 = _imgGl2.getY() < _img70.getY() + 80 && _img70.getY() - 80 < _imgGl2.getY();

                    chelx21 = _imgGl2.getX() < _img71.getX() + 80 && _img71.getX() - 80 < _imgGl2.getX();
                    chely21 = _imgGl2.getY() < _img71.getY() + 80 && _img71.getY() - 80 < _imgGl2.getY();

                    chelx22 = _imgGl2.getX() < _img72.getX() + 80 && _img72.getX() - 80 < _imgGl2.getX();
                    chely22 = _imgGl2.getY() < _img72.getY() + 80 && _img72.getY() - 80 < _imgGl2.getY();

                    chelx23 = _imgGl2.getX() < _img73.getX() + 80 && _img73.getX() - 80 < _imgGl2.getX();
                    chely23 = _imgGl2.getY() < _img73.getY() + 80 && _img73.getY() - 80 < _imgGl2.getY();

                    chelx24 = _imgGl2.getX() < _img74.getX() + 80 && _img74.getX() - 80 < _imgGl2.getX();
                    chely24 = _imgGl2.getY() < _img74.getY() + 80 && _img74.getY() - 80 < _imgGl2.getY();

                    chelx25 = _imgGl2.getX() < _img75.getX() + 80 && _img75.getX() - 80 < _imgGl2.getX();
                    chely25 = _imgGl2.getY() < _img75.getY() + 80 && _img75.getY() - 80 < _imgGl2.getY();

                    chelx26 = _imgGl2.getX() < _img76.getX() + 80 && _img76.getX() - 80 < _imgGl2.getX();
                    chely26 = _imgGl2.getY() < _img76.getY() + 80 && _img76.getY() - 80 < _imgGl2.getY();

                    chelx27 = _imgGl2.getX() < _img77.getX() + 80 && _img77.getX() - 80 < _imgGl2.getX();
                    chely27 = _imgGl2.getY() < _img77.getY() + 80 && _img77.getY() - 80 < _imgGl2.getY();

                    chelx28 = _imgGl2.getX() < _img78.getX() + 80 && _img78.getX() - 80 < _imgGl2.getX();
                    chely28 = _imgGl2.getY() < _img78.getY() + 80 && _img78.getY() - 80 < _imgGl2.getY();

                    chelx29 = _imgGl2.getX() < _img79.getX() + 80 && _img79.getX() - 80 < _imgGl2.getX();
                    chely29 = _imgGl2.getY() < _img79.getY() + 80 && _img79.getY() - 80 < _imgGl2.getY();

                    chelx30 = _imgGl2.getX() < _img80.getX() + 80 && _img80.getX() - 80 < _imgGl2.getX();
                    chely30 = _imgGl2.getY() < _img80.getY() + 80 && _img80.getY() - 80 < _imgGl2.getY();

                    chelx31 = _imgGl2.getX() < _img81.getX() + 80 && _img81.getX() - 80 < _imgGl2.getX();
                    chely31 = _imgGl2.getY() < _img81.getY() + 80 && _img81.getY() - 80 < _imgGl2.getY();

                    chelx32 = _imgGl2.getX() < _img82.getX() + 80 && _img82.getX() - 80 < _imgGl2.getX();
                    chely32 = _imgGl2.getY() < _img82.getY() + 80 && _img82.getY() - 80 < _imgGl2.getY();

                    chelx33 = _imgGl2.getX() < _img83.getX() + 80 && _img83.getX() - 80 < _imgGl2.getX();
                    chely33 = _imgGl2.getY() < _img83.getY() + 80 && _img83.getY() - 80 < _imgGl2.getY();

                    chelx34 = _imgGl2.getX() < _img84.getX() + 80 && _img84.getX() - 80 < _imgGl2.getX();
                    chely34 = _imgGl2.getY() < _img84.getY() + 80 && _img84.getY() - 80 < _imgGl2.getY();

                    chelx35 = _imgGl2.getX() < _img85.getX() + 80 && _img85.getX() - 80 < _imgGl2.getX();
                    chely35 = _imgGl2.getY() < _img85.getY() + 80 && _img85.getY() - 80 < _imgGl2.getY();

                    chelx36 = _imgGl2.getX() < _img86.getX() + 80 && _img86.getX() - 80 < _imgGl2.getX();
                    chely36 = _imgGl2.getY() < _img86.getY() + 80 && _img86.getY() - 80 < _imgGl2.getY();

                    chelx37 = _imgGl2.getX() < _img87.getX() + 80 && _img87.getX() - 80 < _imgGl2.getX();
                    chely37 = _imgGl2.getY() < _img87.getY() + 80 && _img87.getY() - 80 < _imgGl2.getY();

                    chelx38 = _imgGl2.getX() < _img88.getX() + 80 && _img88.getX() - 80 < _imgGl2.getX();
                    chely38 = _imgGl2.getY() < _img88.getY() + 80 && _img88.getY() - 80 < _imgGl2.getY();

                    chelx39 = _imgGl2.getX() < _img89.getX() + 80 && _img89.getX() - 80 < _imgGl2.getX();
                    chely39 = _imgGl2.getY() < _img89.getY() + 80 && _img89.getY() - 80 < _imgGl2.getY();

                    chelx40 = _imgGl2.getX() < _img90.getX() + 80 && _img90.getX() - 80 < _imgGl2.getX();
                    chely40 = _imgGl2.getY() < _img90.getY() + 80 && _img90.getY() - 80 < _imgGl2.getY();

                    chelx41 = _imgGl2.getX() < _img91.getX() + 80 && _img91.getX() - 80 < _imgGl2.getX();
                    chely41 = _imgGl2.getY() < _img91.getY() + 80 && _img91.getY() - 80 < _imgGl2.getY();

                    chelx42 = _imgGl2.getX() < _img92.getX() + 80 && _img92.getX() - 80 < _imgGl2.getX();
                    chely42 = _imgGl2.getY() < _img92.getY() + 80 && _img92.getY() - 80 < _imgGl2.getY();

                    chelx43 = _imgGl2.getX() < _img93.getX() + 80 && _img93.getX() - 80 < _imgGl2.getX();
                    chely43 = _imgGl2.getY() < _img93.getY() + 80 && _img93.getY() - 80 < _imgGl2.getY();

                    chelx44 = _imgGl2.getX() < _img94.getX() + 80 && _img94.getX() - 80 < _imgGl2.getX();
                    chely44 = _imgGl2.getY() < _img94.getY() + 80 && _img94.getY() - 80 < _imgGl2.getY();

                    chelx45 = _imgGl2.getX() < _img95.getX() + 80 && _img95.getX() - 80 < _imgGl2.getX();
                    chely45 = _imgGl2.getY() < _img95.getY() + 80 && _img95.getY() - 80 < _imgGl2.getY();

                    chelx46 = _imgGl2.getX() < _img96.getX() + 80 && _img96.getX() - 80 < _imgGl2.getX();
                    chely46 = _imgGl2.getY() < _img96.getY() + 80 && _img96.getY() - 80 < _imgGl2.getY();

                    chelx47 = _imgGl2.getX() < _img97.getX() + 80 && _img97.getX() - 80 < _imgGl2.getX();
                    chely47 = _imgGl2.getY() < _img97.getY() + 80 && _img97.getY() - 80 < _imgGl2.getY();

                    _finishx = _imgGl2.getX() < _imgFin2.getX() + 80 && _imgFin2.getX() - 80 < _imgGl2.getX();
                    _finishy = _imgGl2.getY() < _imgFin2.getY() + 80 && _imgFin2.getY() - 80 < _imgGl2.getY();

                    if (_finishx && _finishy) {
                        _btnDown2.setClickable(false);
                        _btnUp2.setClickable(false);
                        _btnRight2.setClickable(false);
                        _btnLeft2.setClickable(false);
                        _intent = new Intent();
                        _intent.putExtra("back41", 0 + "");
                        setResult(RESULT_OK, _intent);
                        finish();
                        Toast.makeText(getApplication(), "Открой замок", Toast.LENGTH_SHORT).show();
                    } else {
                        if ((chelx && chely) || (chelx2 && chely2) || (chelx3 && chely3) || (chelx4 && chely4) || (chelx5 && chely5) || (chelx6 && chely6) || (chelx7 && chely7)
                                || (chelx8 && chely8) || (chelx9 && chely9) || (chelx10 && chely10) || (chelx11 && chely11) || (chelx12 && chely12) || (chelx13 && chely13)
                                || (chelx14 && chely14) || (chelx15 && chely15) || (chelx16 && chely16) || (chelx17 && chely17) || (chelx18 && chely18) || (chelx19 && chely19)
                                || (chelx20 && chely20) || (chelx21 && chely21) || (chelx22 && chely22) || (chelx23 && chely23) || (chelx24 && chely24) || (chelx25 && chely25)
                                || (chelx26 && chely26) || (chelx27 && chely27) || (chelx28 && chely28) || (chelx29 && chely29) || (chelx30 && chely30) || (chelx31 && chely31)
                                || (chelx32 && chely32) || (chelx33 && chely33) || (chelx34 && chely34) || (chelx35 && chely35) || (chelx36 && chely36) || (chelx37 && chely37)
                                || (chelx38 && chely38) || (chelx39 && chely39) || (chelx40 && chely40) || (chelx41 && chely41) || (chelx42 && chely42) || (chelx43 && chely43)
                                || (chelx44 && chely44) || (chelx45 && chely45) || (chelx46 && chely46) || (chelx47 && chely47) || (chelx48 && chely48) || (chelx49 && chely49)) {
                            Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                            _imgGl2.setY(1200);
                            _imgGl2.setX(480);
                        }
                    }
                }
            }
        });
        _btnRight2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl2.setX(_imgGl2.getX() + 30);

                chelx = _imgGl2.getX() < _img50.getX() + 80 && _img50.getX() - 80 < _imgGl2.getX();
                chely = _imgGl2.getY() < _img50.getY() + 80 && _img50.getY() - 80 < _imgGl2.getY();

                chelx2 = _imgGl2.getX() < _img51.getX() + 80 && _img51.getX() - 80 < _imgGl2.getX();
                chely2 = _imgGl2.getY() < _img51.getY() + 80 && _img51.getY() - 80 < _imgGl2.getY();

                chelx3 = _imgGl2.getX() < _img52.getX() + 80 && _img52.getX() - 80 < _imgGl2.getX();
                chely3 = _imgGl2.getY() < _img52.getY() + 80 && _img52.getY() - 80 < _imgGl2.getY();

                chelx4 = _imgGl2.getX() < _img53.getX() + 80 && _img53.getX() - 80 < _imgGl2.getX();
                chely4 = _imgGl2.getY() < _img53.getY() + 80 && _img53.getY() - 80 < _imgGl2.getY();

                chelx28 = _imgGl2.getX() < _img54.getX() + 80 && _img54.getX() - 80 < _imgGl2.getX();
                chely28 = _imgGl2.getY() < _img54.getY() + 80 && _img54.getY() - 80 < _imgGl2.getY();

                chelx5 = _imgGl2.getX() < _img55.getX() + 80 && _img55.getX() - 80 < _imgGl2.getX();
                chely5 = _imgGl2.getY() < _img55.getY() + 80 && _img55.getY() - 80 < _imgGl2.getY();

                chelx6 = _imgGl2.getX() < _img56.getX() + 80 && _img56.getX() - 80 < _imgGl2.getX();
                chely6 = _imgGl2.getY() < _img56.getY() + 80 && _img56.getY() - 80 < _imgGl2.getY();

                chelx7 = _imgGl2.getX() < _img57.getX() + 80 && _img57.getX() - 80 < _imgGl2.getX();
                chely7 = _imgGl2.getY() < _img57.getY() + 80 && _img57.getY() - 80 < _imgGl2.getY();

                chelx8 = _imgGl2.getX() < _img58.getX() + 80 && _img58.getX() - 80 < _imgGl2.getX();
                chely8 = _imgGl2.getY() < _img58.getY() + 80 && _img58.getY() - 80 < _imgGl2.getY();

                chelx9 = _imgGl2.getX() < _img59.getX() + 80 && _img59.getX() - 80 < _imgGl2.getX();
                chely9 = _imgGl2.getY() < _img59.getY() + 80 && _img59.getY() - 80 < _imgGl2.getY();

                chelx10 = _imgGl2.getX() < _img60.getX() + 80 && _img60.getX() - 80 < _imgGl2.getX();
                chely10 = _imgGl2.getY() < _img60.getY() + 80 && _img60.getY() - 80 < _imgGl2.getY();

                chelx11 = _imgGl2.getX() < _img61.getX() + 80 && _img61.getX() - 80 < _imgGl2.getX();
                chely11 = _imgGl2.getY() < _img61.getY() + 80 && _img61.getY() - 80 < _imgGl2.getY();

                chelx12 = _imgGl2.getX() < _img62.getX() + 80 && _img62.getX() - 80 < _imgGl2.getX();
                chely12 = _imgGl2.getY() < _img62.getY() + 80 && _img62.getY() - 80 < _imgGl2.getY();

                chelx13 = _imgGl2.getX() < _img63.getX() + 80 && _img63.getX() - 80 < _imgGl2.getX();
                chely13 = _imgGl2.getY() < _img63.getY() + 80 && _img63.getY() - 80 < _imgGl2.getY();

                chelx14 = _imgGl2.getX() < _img64.getX() + 80 && _img64.getX() - 80 < _imgGl2.getX();
                chely14 = _imgGl2.getY() < _img64.getY() + 80 && _img64.getY() - 80 < _imgGl2.getY();

                chelx15 = _imgGl2.getX() < _img65.getX() + 80 && _img65.getX() - 80 < _imgGl2.getX();
                chely15 = _imgGl2.getY() < _img65.getY() + 80 && _img65.getY() - 80 < _imgGl2.getY();

                chelx16 = _imgGl2.getX() < _img66.getX() + 80 && _img66.getX() - 80 < _imgGl2.getX();
                chely16 = _imgGl2.getY() < _img66.getY() + 80 && _img66.getY() - 80 < _imgGl2.getY();

                chelx17 = _imgGl2.getX() < _img67.getX() + 80 && _img67.getX() - 80 < _imgGl2.getX();
                chely17 = _imgGl2.getY() < _img67.getY() + 80 && _img67.getY() - 80 < _imgGl2.getY();

                chelx18 = _imgGl2.getX() < _img68.getX() + 80 && _img68.getX() - 80 < _imgGl2.getX();
                chely18 = _imgGl2.getY() < _img68.getY() + 80 && _img68.getY() - 80 < _imgGl2.getY();

                chelx19 = _imgGl2.getX() < _img69.getX() + 80 && _img69.getX() - 80 < _imgGl2.getX();
                chely19 = _imgGl2.getY() < _img69.getY() + 80 && _img69.getY() - 80 < _imgGl2.getY();

                chelx20 = _imgGl2.getX() < _img70.getX() + 80 && _img70.getX() - 80 < _imgGl2.getX();
                chely20 = _imgGl2.getY() < _img70.getY() + 80 && _img70.getY() - 80 < _imgGl2.getY();

                chelx21 = _imgGl2.getX() < _img71.getX() + 80 && _img71.getX() - 80 < _imgGl2.getX();
                chely21 = _imgGl2.getY() < _img71.getY() + 80 && _img71.getY() - 80 < _imgGl2.getY();

                chelx22 = _imgGl2.getX() < _img72.getX() + 80 && _img72.getX() - 80 < _imgGl2.getX();
                chely22 = _imgGl2.getY() < _img72.getY() + 80 && _img72.getY() - 80 < _imgGl2.getY();

                chelx23 = _imgGl2.getX() < _img73.getX() + 80 && _img73.getX() - 80 < _imgGl2.getX();
                chely23 = _imgGl2.getY() < _img73.getY() + 80 && _img73.getY() - 80 < _imgGl2.getY();

                chelx24 = _imgGl2.getX() < _img74.getX() + 80 && _img74.getX() - 80 < _imgGl2.getX();
                chely24 = _imgGl2.getY() < _img74.getY() + 80 && _img74.getY() - 80 < _imgGl2.getY();

                chelx25 = _imgGl2.getX() < _img75.getX() + 80 && _img75.getX() - 80 < _imgGl2.getX();
                chely25 = _imgGl2.getY() < _img75.getY() + 80 && _img75.getY() - 80 < _imgGl2.getY();

                chelx26 = _imgGl2.getX() < _img76.getX() + 80 && _img76.getX() - 80 < _imgGl2.getX();
                chely26 = _imgGl2.getY() < _img76.getY() + 80 && _img76.getY() - 80 < _imgGl2.getY();

                chelx27 = _imgGl2.getX() < _img77.getX() + 80 && _img77.getX() - 80 < _imgGl2.getX();
                chely27 = _imgGl2.getY() < _img77.getY() + 80 && _img77.getY() - 80 < _imgGl2.getY();

                chelx28 = _imgGl2.getX() < _img78.getX() + 80 && _img78.getX() - 80 < _imgGl2.getX();
                chely28 = _imgGl2.getY() < _img78.getY() + 80 && _img78.getY() - 80 < _imgGl2.getY();

                chelx29 = _imgGl2.getX() < _img79.getX() + 80 && _img79.getX() - 80 < _imgGl2.getX();
                chely29 = _imgGl2.getY() < _img79.getY() + 80 && _img79.getY() - 80 < _imgGl2.getY();

                chelx30 = _imgGl2.getX() < _img80.getX() + 80 && _img80.getX() - 80 < _imgGl2.getX();
                chely30 = _imgGl2.getY() < _img80.getY() + 80 && _img80.getY() - 80 < _imgGl2.getY();

                chelx31 = _imgGl2.getX() < _img81.getX() + 80 && _img81.getX() - 80 < _imgGl2.getX();
                chely31 = _imgGl2.getY() < _img81.getY() + 80 && _img81.getY() - 80 < _imgGl2.getY();

                chelx32 = _imgGl2.getX() < _img82.getX() + 80 && _img82.getX() - 80 < _imgGl2.getX();
                chely32 = _imgGl2.getY() < _img82.getY() + 80 && _img82.getY() - 80 < _imgGl2.getY();

                chelx33 = _imgGl2.getX() < _img83.getX() + 80 && _img83.getX() - 80 < _imgGl2.getX();
                chely33 = _imgGl2.getY() < _img83.getY() + 80 && _img83.getY() - 80 < _imgGl2.getY();

                chelx34 = _imgGl2.getX() < _img84.getX() + 80 && _img84.getX() - 80 < _imgGl2.getX();
                chely34 = _imgGl2.getY() < _img84.getY() + 80 && _img84.getY() - 80 < _imgGl2.getY();

                chelx35 = _imgGl2.getX() < _img85.getX() + 80 && _img85.getX() - 80 < _imgGl2.getX();
                chely35 = _imgGl2.getY() < _img85.getY() + 80 && _img85.getY() - 80 < _imgGl2.getY();

                chelx36 = _imgGl2.getX() < _img86.getX() + 80 && _img86.getX() - 80 < _imgGl2.getX();
                chely36 = _imgGl2.getY() < _img86.getY() + 80 && _img86.getY() - 80 < _imgGl2.getY();

                chelx37 = _imgGl2.getX() < _img87.getX() + 80 && _img87.getX() - 80 < _imgGl2.getX();
                chely37 = _imgGl2.getY() < _img87.getY() + 80 && _img87.getY() - 80 < _imgGl2.getY();

                chelx38 = _imgGl2.getX() < _img88.getX() + 80 && _img88.getX() - 80 < _imgGl2.getX();
                chely38 = _imgGl2.getY() < _img88.getY() + 80 && _img88.getY() - 80 < _imgGl2.getY();

                chelx39 = _imgGl2.getX() < _img89.getX() + 80 && _img89.getX() - 80 < _imgGl2.getX();
                chely39 = _imgGl2.getY() < _img89.getY() + 80 && _img89.getY() - 80 < _imgGl2.getY();

                chelx40 = _imgGl2.getX() < _img90.getX() + 80 && _img90.getX() - 80 < _imgGl2.getX();
                chely40 = _imgGl2.getY() < _img90.getY() + 80 && _img90.getY() - 80 < _imgGl2.getY();

                chelx41 = _imgGl2.getX() < _img91.getX() + 80 && _img91.getX() - 80 < _imgGl2.getX();
                chely41 = _imgGl2.getY() < _img91.getY() + 80 && _img91.getY() - 80 < _imgGl2.getY();

                chelx42 = _imgGl2.getX() < _img92.getX() + 80 && _img92.getX() - 80 < _imgGl2.getX();
                chely42 = _imgGl2.getY() < _img92.getY() + 80 && _img92.getY() - 80 < _imgGl2.getY();

                chelx43 = _imgGl2.getX() < _img93.getX() + 80 && _img93.getX() - 80 < _imgGl2.getX();
                chely43 = _imgGl2.getY() < _img93.getY() + 80 && _img93.getY() - 80 < _imgGl2.getY();

                chelx44 = _imgGl2.getX() < _img94.getX() + 80 && _img94.getX() - 80 < _imgGl2.getX();
                chely44 = _imgGl2.getY() < _img94.getY() + 80 && _img94.getY() - 80 < _imgGl2.getY();

                chelx45 = _imgGl2.getX() < _img95.getX() + 80 && _img95.getX() - 80 < _imgGl2.getX();
                chely45 = _imgGl2.getY() < _img95.getY() + 80 && _img95.getY() - 80 < _imgGl2.getY();

                chelx46 = _imgGl2.getX() < _img96.getX() + 80 && _img96.getX() - 80 < _imgGl2.getX();
                chely46 = _imgGl2.getY() < _img96.getY() + 80 && _img96.getY() - 80 < _imgGl2.getY();

                chelx47 = _imgGl2.getX() < _img97.getX() + 80 && _img97.getX() - 80 < _imgGl2.getX();
                chely47 = _imgGl2.getY() < _img97.getY() + 80 && _img97.getY() - 80 < _imgGl2.getY();

                chelx106 = _imgGl2.getX() < _img97.getX() + 80 && _img106.getX() - 80 < _imgGl2.getX();
                chely47 = _imgGl2.getY() < _img106.getY() + 80 && _img106.getY() - 80 < _imgGl2.getY();

                _finishx = _imgGl2.getX() < _imgFin2.getX() + 80 && _imgFin2.getX() - 80 < _imgGl2.getX();
                _finishy = _imgGl2.getY() < _imgFin2.getY() + 80 && _imgFin2.getY() - 80 < _imgGl2.getY();

                if (_finishx && _finishy) {
                    _btnDown2.setClickable(false);
                    _btnUp2.setClickable(false);
                    _btnRight2.setClickable(false);
                    _btnLeft2.setClickable(false);
                    _intent = new Intent();
                    _intent.putExtra("back41", 0+"");
                    setResult(RESULT_OK, _intent);
                    finish();
                    Toast.makeText(getApplication(), "Открой замок", Toast.LENGTH_SHORT).show();
                } else {
                    if ((chelx && chely) || (chelx2 && chely2) || (chelx3 && chely3) || (chelx4 && chely4) || (chelx5 && chely5) || (chelx6 && chely6) || (chelx7 && chely7)
                            || (chelx8 && chely8) || (chelx9 && chely9) || (chelx10 && chely10) || (chelx11 && chely11) || (chelx12 && chely12) || (chelx13 && chely13)
                            || (chelx14 && chely14) || (chelx15 && chely15) || (chelx16 && chely16) || (chelx17 && chely17) || (chelx18 && chely18) || (chelx19 && chely19)
                            || (chelx20 && chely20) || (chelx21 && chely21) || (chelx22 && chely22) || (chelx23 && chely23) || (chelx24 && chely24) || (chelx25 && chely25)
                            || (chelx26 && chely26) || (chelx27 && chely27) || (chelx28 && chely28) || (chelx29 && chely29) || (chelx30 && chely30) || (chelx31 && chely31)
                            || (chelx32 && chely32) || (chelx33 && chely33) || (chelx34 && chely34) || (chelx35 && chely35) || (chelx36 && chely36) || (chelx37 && chely37)
                            || (chelx38 && chely38) || (chelx39 && chely39) || (chelx40 && chely40) || (chelx41 && chely41) || (chelx42 && chely42) || (chelx43 && chely43)
                            || (chelx44 && chely44) || (chelx45 && chely45) || (chelx46 && chely46) || (chelx47 && chely47) || (chelx48 && chely48) || (chelx49 && chely49)
                            || (chelx106 && chely106)) {
                        Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                        _imgGl2.setY(1200);
                        _imgGl2.setX(480);
                    }
                }
            }
        });

    }

}
