package com.example.final_projectars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Two extends AppCompatActivity {
    ImageView _imgGl;
    Button _btn21, _btnUp, _btnLeft, _btnDown, _btnRight;
    Intent _intent;
    boolean chelx, chely, chelx2, chely2, chelx3, chely3, chelx4, chely4, chelx5, chely5, chelx6, chely6, chelx7, chely7, chelx8, chely8, chelx9, chely9, chelx10, chely10, chelx11, chely11, chelx12, chely12, chelx13, chely13, chelx14, chely14, chelx15, chely15, chelx16, chely16, chelx17, chely17, chelx18, chely18, chelx19, chely19, chelx20, chely20, chelx21, chely21, chelx22, chely22, chelx23, chely23, chelx24, chely24, chelx25, chely25, chelx26, chely26, chelx27, chely27, chelx28, chely28, chelx29, chely29, chelx30, chely30, chelx31, chely31, chelx32, chely32, chelx33, chely33, chelx34, chely34, chelx35, chely35, chelx36, chely36, chelx37, chely37, chelx38, chely38, chelx39, chely39, chelx40, chely40, chelx41, chely41, chelx42, chely42, chelx43, chely43, chelx44, chely44, chelx45, chely45, chelx46, chely46, chelx47, chely47, chelx48, chely48, chelx49, chely49, chelx99, chely99;
    boolean _finishx, _finishy;

    ImageView _img1, _img2, _img3, _img4, _img5, _img6, _img7, _img8, _img9, _img10, _img11, _img12, _img13, _img14, _img15, _img16, _img17, _img18, _img19,
            _img20, _img21, _img22, _img23, _img24, _img25, _img26, _img27, _img28, _img29, _img30, _img31, _img32, _img33, _img34, _img35, _img36, _img37, _img38,
            _img39, _img40, _img41, _img42, _img43, _img44, _img45, _img46, _img47, _img48, _img49, _img99, _img100, _img101, _img102,_img103,_img104,_img105 ,_imgFin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        _btn21 = (Button) findViewById(R.id.btn21);
        _imgGl = (ImageView) findViewById(R.id.imgGl);
        _btnUp = (Button) findViewById(R.id.btnUp);
        _btnDown = (Button) findViewById(R.id.btnDown);
        _btnLeft = (Button) findViewById(R.id.btnLeft);
        _btnRight = (Button) findViewById(R.id.btnRight);
        _img1 = (ImageView) findViewById(R.id.imageView);
        _img2 = (ImageView) findViewById(R.id.imageView2);
        _img3 = (ImageView) findViewById(R.id.imageView3);
        _img4 = (ImageView) findViewById(R.id.imageView4);
        _img5 = (ImageView) findViewById(R.id.imageView5);
        _img6 = (ImageView) findViewById(R.id.imageView6);
        _img7 = (ImageView) findViewById(R.id.imageView7);
        _img8 = (ImageView) findViewById(R.id.imageView8);
        _img9 = (ImageView) findViewById(R.id.imageView9);
        _img10 = (ImageView) findViewById(R.id.imageView10);
        _img11 = (ImageView) findViewById(R.id.imageView11);
        _img12 = (ImageView) findViewById(R.id.imageView12);
        _img13 = (ImageView) findViewById(R.id.imageView13);
        _img14 = (ImageView) findViewById(R.id.imageView14);
        _img15 = (ImageView) findViewById(R.id.imageView15);
        _img16 = (ImageView) findViewById(R.id.imageView16);
        _img17 = (ImageView) findViewById(R.id.imageView17);
        _img18 = (ImageView) findViewById(R.id.imageView18);
        _img19 = (ImageView) findViewById(R.id.imageView19);
        _img20 = (ImageView) findViewById(R.id.imageView20);
        _img21 = (ImageView) findViewById(R.id.imageView21);
        _img22 = (ImageView) findViewById(R.id.imageView22);
        _img23 = (ImageView) findViewById(R.id.imageView23);
        _img24 = (ImageView) findViewById(R.id.imageView24);
        _img25 = (ImageView) findViewById(R.id.imageView25);
        _img26 = (ImageView) findViewById(R.id.imageView26);
        _img27 = (ImageView) findViewById(R.id.imageView27);
        _img28 = (ImageView) findViewById(R.id.imageView28);
        _img29 = (ImageView) findViewById(R.id.imageView29);
        _img30 = (ImageView) findViewById(R.id.imageView30);
        _img31 = (ImageView) findViewById(R.id.imageView31);
        _img32 = (ImageView) findViewById(R.id.imageView32);
        _img33 = (ImageView) findViewById(R.id.imageView33);
        _img34 = (ImageView) findViewById(R.id.imageView34);
        _img35 = (ImageView) findViewById(R.id.imageView35);
        _img36 = (ImageView) findViewById(R.id.imageView36);
        _img37 = (ImageView) findViewById(R.id.imageView37);
        _img38 = (ImageView) findViewById(R.id.imageView38);
        _img39 = (ImageView) findViewById(R.id.imageView39);
        _img40 = (ImageView) findViewById(R.id.imageView40);
        _img41 = (ImageView) findViewById(R.id.imageView41);
        _img42 = (ImageView) findViewById(R.id.imageView42);
        _img43 = (ImageView) findViewById(R.id.imageView43);
        _img44 = (ImageView) findViewById(R.id.imageView44);
        _img45 = (ImageView) findViewById(R.id.imageView45);
        _img46 = (ImageView) findViewById(R.id.imageView46);
        _img47 = (ImageView) findViewById(R.id.imageView47);
        _img48 = (ImageView) findViewById(R.id.imageView48);
        _img49 = (ImageView) findViewById(R.id.imageView49);
        _img99 = (ImageView) findViewById(R.id.imageView99);
        _img100 = (ImageView) findViewById(R.id.imageView100);
        _img101 = (ImageView) findViewById(R.id.imageView101);
        _img102 = (ImageView) findViewById(R.id.imageView102);
        _img103 = (ImageView) findViewById(R.id.imageView103);
        _img104 = (ImageView) findViewById(R.id.imageView104);
        _img105 = (ImageView) findViewById(R.id.imageView105);
        _imgFin = (ImageView) findViewById(R.id.imgFin);
        getSupportActionBar().hide();


        _btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back21", 0+"");
                setResult(RESULT_CANCELED, _intent);
                finish();
            }
        });
        _btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl.setY(_imgGl.getY() - 40);
                chelx = _imgGl.getX() < _img28.getX() + 80 && _img28.getX() - 80 < _imgGl.getX();
                chely = _imgGl.getY() < _img28.getY() + 80 && _img28.getY() - 80 < _imgGl.getY();

                chelx2 = _imgGl.getX() < _img1.getX() + 80 && _img1.getX() - 80 < _imgGl.getX();
                chely2 = _imgGl.getY() < _img1.getY() + 80 && _img1.getY() - 80 < _imgGl.getY();

                chelx3 = _imgGl.getX() < _img2.getX() + 80 && _img2.getX() - 80 < _imgGl.getX();
                chely3 = _imgGl.getY() < _img2.getY() + 80 && _img2.getY() - 80 < _imgGl.getY();

                chelx4 = _imgGl.getX() < _img3.getX() + 80 && _img3.getX() - 80 < _imgGl.getX();
                chely4 = _imgGl.getY() < _img3.getY() + 80 && _img3.getY() - 80 < _imgGl.getY();

                chelx28 = _imgGl.getX() < _img4.getX() + 80 && _img4.getX() - 80 < _imgGl.getX();
                chely28 = _imgGl.getY() < _img4.getY() + 80 && _img4.getY() - 80 < _imgGl.getY();

                chelx5 = _imgGl.getX() < _img5.getX() + 80 && _img5.getX() - 80 < _imgGl.getX();
                chely5 = _imgGl.getY() < _img5.getY() + 80 && _img5.getY() - 80 < _imgGl.getY();

                chelx6 = _imgGl.getX() < _img6.getX() + 80 && _img6.getX() - 80 < _imgGl.getX();
                chely6 = _imgGl.getY() < _img6.getY() + 80 && _img6.getY() - 80 < _imgGl.getY();

                chelx7 = _imgGl.getX() < _img7.getX() + 80 && _img7.getX() - 80 < _imgGl.getX();
                chely7 = _imgGl.getY() < _img7.getY() + 80 && _img7.getY() - 80 < _imgGl.getY();

                chelx8 = _imgGl.getX() < _img8.getX() + 80 && _img8.getX() - 80 < _imgGl.getX();
                chely8 = _imgGl.getY() < _img8.getY() + 80 && _img8.getY() - 80 < _imgGl.getY();

                chelx9 = _imgGl.getX() < _img9.getX() + 80 && _img9.getX() - 80 < _imgGl.getX();
                chely9 = _imgGl.getY() < _img9.getY() + 80 && _img9.getY() - 80 < _imgGl.getY();

                chelx10 = _imgGl.getX() < _img10.getX() + 80 && _img10.getX() - 80 < _imgGl.getX();
                chely10 = _imgGl.getY() < _img10.getY() + 80 && _img10.getY() - 80 < _imgGl.getY();

                chelx11 = _imgGl.getX() < _img11.getX() + 80 && _img11.getX() - 80 < _imgGl.getX();
                chely11 = _imgGl.getY() < _img11.getY() + 80 && _img11.getY() - 80 < _imgGl.getY();

                chelx12 = _imgGl.getX() < _img12.getX() + 80 && _img12.getX() - 80 < _imgGl.getX();
                chely12 = _imgGl.getY() < _img12.getY() + 80 && _img12.getY() - 80 < _imgGl.getY();

                chelx13 = _imgGl.getX() < _img13.getX() + 80 && _img13.getX() - 80 < _imgGl.getX();
                chely13 = _imgGl.getY() < _img13.getY() + 80 && _img13.getY() - 80 < _imgGl.getY();

                chelx14 = _imgGl.getX() < _img14.getX() + 80 && _img14.getX() - 80 < _imgGl.getX();
                chely14 = _imgGl.getY() < _img14.getY() + 80 && _img14.getY() - 80 < _imgGl.getY();

                chelx15 = _imgGl.getX() < _img15.getX() + 80 && _img15.getX() - 80 < _imgGl.getX();
                chely15 = _imgGl.getY() < _img15.getY() + 80 && _img15.getY() - 80 < _imgGl.getY();

                chelx16 = _imgGl.getX() < _img16.getX() + 80 && _img16.getX() - 80 < _imgGl.getX();
                chely16 = _imgGl.getY() < _img16.getY() + 80 && _img16.getY() - 80 < _imgGl.getY();

                chelx17 = _imgGl.getX() < _img17.getX() + 80 && _img17.getX() - 80 < _imgGl.getX();
                chely17 = _imgGl.getY() < _img17.getY() + 80 && _img17.getY() - 80 < _imgGl.getY();

                chelx18 = _imgGl.getX() < _img18.getX() + 80 && _img18.getX() - 80 < _imgGl.getX();
                chely18 = _imgGl.getY() < _img18.getY() + 80 && _img18.getY() - 80 < _imgGl.getY();

                chelx19 = _imgGl.getX() < _img19.getX() + 80 && _img19.getX() - 80 < _imgGl.getX();
                chely19 = _imgGl.getY() < _img19.getY() + 80 && _img19.getY() - 80 < _imgGl.getY();

                chelx20 = _imgGl.getX() < _img20.getX() + 80 && _img20.getX() - 80 < _imgGl.getX();
                chely20 = _imgGl.getY() < _img20.getY() + 80 && _img20.getY() - 80 < _imgGl.getY();

                chelx21 = _imgGl.getX() < _img21.getX() + 80 && _img21.getX() - 80 < _imgGl.getX();
                chely21 = _imgGl.getY() < _img21.getY() + 80 && _img21.getY() - 80 < _imgGl.getY();

                chelx22 = _imgGl.getX() < _img22.getX() + 80 && _img22.getX() - 80 < _imgGl.getX();
                chely22 = _imgGl.getY() < _img22.getY() + 80 && _img22.getY() - 80 < _imgGl.getY();

                chelx23 = _imgGl.getX() < _img23.getX() + 80 && _img23.getX() - 80 < _imgGl.getX();
                chely23 = _imgGl.getY() < _img23.getY() + 80 && _img23.getY() - 80 < _imgGl.getY();

                chelx24 = _imgGl.getX() < _img24.getX() + 80 && _img24.getX() - 80 < _imgGl.getX();
                chely24 = _imgGl.getY() < _img24.getY() + 80 && _img24.getY() - 80 < _imgGl.getY();

                chelx25 = _imgGl.getX() < _img25.getX() + 80 && _img25.getX() - 80 < _imgGl.getX();
                chely25 = _imgGl.getY() < _img25.getY() + 80 && _img25.getY() - 80 < _imgGl.getY();

                chelx26 = _imgGl.getX() < _img26.getX() + 80 && _img26.getX() - 80 < _imgGl.getX();
                chely26 = _imgGl.getY() < _img26.getY() + 80 && _img26.getY() - 80 < _imgGl.getY();

                chelx27 = _imgGl.getX() < _img27.getX() + 80 && _img27.getX() - 80 < _imgGl.getX();
                chely27 = _imgGl.getY() < _img27.getY() + 80 && _img27.getY() - 80 < _imgGl.getY();

                chelx29 = _imgGl.getX() < _img29.getX() + 80 && _img29.getX() - 80 < _imgGl.getX();
                chely29 = _imgGl.getY() < _img29.getY() + 80 && _img29.getY() - 80 < _imgGl.getY();

                chelx30 = _imgGl.getX() < _img30.getX() + 80 && _img30.getX() - 80 < _imgGl.getX();
                chely30 = _imgGl.getY() < _img30.getY() + 80 && _img30.getY() - 80 < _imgGl.getY();

                chelx31 = _imgGl.getX() < _img31.getX() + 80 && _img31.getX() - 80 < _imgGl.getX();
                chely31 = _imgGl.getY() < _img31.getY() + 80 && _img31.getY() - 80 < _imgGl.getY();

                chelx32 = _imgGl.getX() < _img32.getX() + 80 && _img32.getX() - 80 < _imgGl.getX();
                chely32 = _imgGl.getY() < _img32.getY() + 80 && _img32.getY() - 80 < _imgGl.getY();

                chelx33 = _imgGl.getX() < _img33.getX() + 80 && _img33.getX() - 80 < _imgGl.getX();
                chely33 = _imgGl.getY() < _img33.getY() + 80 && _img33.getY() - 80 < _imgGl.getY();

                chelx34 = _imgGl.getX() < _img34.getX() + 80 && _img34.getX() - 80 < _imgGl.getX();
                chely34 = _imgGl.getY() < _img34.getY() + 80 && _img34.getY() - 80 < _imgGl.getY();

                chelx35 = _imgGl.getX() < _img35.getX() + 80 && _img35.getX() - 80 < _imgGl.getX();
                chely35 = _imgGl.getY() < _img35.getY() + 80 && _img35.getY() - 80 < _imgGl.getY();

                chelx36 = _imgGl.getX() < _img36.getX() + 80 && _img36.getX() - 80 < _imgGl.getX();
                chely36 = _imgGl.getY() < _img36.getY() + 80 && _img36.getY() - 80 < _imgGl.getY();

                chelx37 = _imgGl.getX() < _img37.getX() + 80 && _img37.getX() - 80 < _imgGl.getX();
                chely37 = _imgGl.getY() < _img37.getY() + 80 && _img37.getY() - 80 < _imgGl.getY();

                chelx38 = _imgGl.getX() < _img38.getX() + 80 && _img38.getX() - 80 < _imgGl.getX();
                chely38 = _imgGl.getY() < _img38.getY() + 80 && _img38.getY() - 80 < _imgGl.getY();

                chelx39 = _imgGl.getX() < _img39.getX() + 80 && _img39.getX() - 80 < _imgGl.getX();
                chely39 = _imgGl.getY() < _img39.getY() + 80 && _img39.getY() - 80 < _imgGl.getY();

                chelx40 = _imgGl.getX() < _img40.getX() + 80 && _img40.getX() - 80 < _imgGl.getX();
                chely40 = _imgGl.getY() < _img40.getY() + 80 && _img40.getY() - 80 < _imgGl.getY();

                chelx41 = _imgGl.getX() < _img41.getX() + 80 && _img41.getX() - 80 < _imgGl.getX();
                chely41 = _imgGl.getY() < _img41.getY() + 80 && _img41.getY() - 80 < _imgGl.getY();

                chelx42 = _imgGl.getX() < _img42.getX() + 80 && _img42.getX() - 80 < _imgGl.getX();
                chely42 = _imgGl.getY() < _img42.getY() + 80 && _img42.getY() - 80 < _imgGl.getY();

                chelx43 = _imgGl.getX() < _img43.getX() + 80 && _img43.getX() - 80 < _imgGl.getX();
                chely43 = _imgGl.getY() < _img43.getY() + 80 && _img43.getY() - 80 < _imgGl.getY();

                chelx44 = _imgGl.getX() < _img44.getX() + 80 && _img44.getX() - 80 < _imgGl.getX();
                chely44 = _imgGl.getY() < _img44.getY() + 80 && _img44.getY() - 80 < _imgGl.getY();

                chelx45 = _imgGl.getX() < _img45.getX() + 80 && _img45.getX() - 80 < _imgGl.getX();
                chely45 = _imgGl.getY() < _img45.getY() + 80 && _img45.getY() - 80 < _imgGl.getY();

                chelx46 = _imgGl.getX() < _img46.getX() + 80 && _img46.getX() - 80 < _imgGl.getX();
                chely46 = _imgGl.getY() < _img46.getY() + 80 && _img46.getY() - 80 < _imgGl.getY();

                chelx47 = _imgGl.getX() < _img47.getX() + 80 && _img47.getX() - 80 < _imgGl.getX();
                chely47 = _imgGl.getY() < _img47.getY() + 80 && _img47.getY() - 80 < _imgGl.getY();

                chelx48 = _imgGl.getX() < _img48.getX() + 80 && _img48.getX() - 80 < _imgGl.getX();
                chely48 = _imgGl.getY() < _img48.getY() + 80 && _img48.getY() - 80 < _imgGl.getY();

                chelx49 = _imgGl.getX() < _img49.getX() + 80 && _img49.getX() - 80 < _imgGl.getX();
                chely49 = _imgGl.getY() < _img49.getY() + 80 && _img49.getY() - 80 < _imgGl.getY();
                _finishx = _imgGl.getX() < _imgFin.getX() + 80 && _imgFin.getX() - 80 < _imgGl.getX();
                _finishy = _imgGl.getY() < _imgFin.getY() + 80 && _imgFin.getY() - 80 < _imgGl.getY();

                if (_finishx && _finishy) {
                    _btnDown.setClickable(false);
                    _btnUp.setClickable(false);
                    _btnRight.setClickable(false);
                    _btnLeft.setClickable(false);
                    _intent = new Intent();
                    _intent.putExtra("back21", 0+"");
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
                        _imgGl.setY(1200);
                        _imgGl.setX(120);
                    }
                }
            }
        });
        _btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl.setY(_imgGl.getY() + 40);
                chelx = _imgGl.getX() < _img28.getX() + 80 && _img28.getX() - 80 < _imgGl.getX();
                chely = _imgGl.getY() < _img28.getY() + 80 && _img28.getY() - 80 < _imgGl.getY();

                chelx2 = _imgGl.getX() < _img1.getX() + 80 && _img1.getX() - 80 < _imgGl.getX();
                chely2 = _imgGl.getY() < _img1.getY() + 80 && _img1.getY() - 80 < _imgGl.getY();

                chelx3 = _imgGl.getX() < _img2.getX() + 80 && _img2.getX() - 80 < _imgGl.getX();
                chely3 = _imgGl.getY() < _img2.getY() + 80 && _img2.getY() - 80 < _imgGl.getY();

                chelx4 = _imgGl.getX() < _img3.getX() + 80 && _img3.getX() - 80 < _imgGl.getX();
                chely4 = _imgGl.getY() < _img3.getY() + 80 && _img3.getY() - 80 < _imgGl.getY();

                chelx28 = _imgGl.getX() < _img4.getX() + 80 && _img4.getX() - 80 < _imgGl.getX();
                chely28 = _imgGl.getY() < _img4.getY() + 80 && _img4.getY() - 80 < _imgGl.getY();

                chelx5 = _imgGl.getX() < _img5.getX() + 80 && _img5.getX() - 80 < _imgGl.getX();
                chely5 = _imgGl.getY() < _img5.getY() + 80 && _img5.getY() - 80 < _imgGl.getY();

                chelx6 = _imgGl.getX() < _img6.getX() + 80 && _img6.getX() - 80 < _imgGl.getX();
                chely6 = _imgGl.getY() < _img6.getY() + 80 && _img6.getY() - 80 < _imgGl.getY();

                chelx7 = _imgGl.getX() < _img7.getX() + 80 && _img7.getX() - 80 < _imgGl.getX();
                chely7 = _imgGl.getY() < _img7.getY() + 80 && _img7.getY() - 80 < _imgGl.getY();

                chelx8 = _imgGl.getX() < _img8.getX() + 80 && _img8.getX() - 80 < _imgGl.getX();
                chely8 = _imgGl.getY() < _img8.getY() + 80 && _img8.getY() - 80 < _imgGl.getY();

                chelx9 = _imgGl.getX() < _img9.getX() + 80 && _img9.getX() - 80 < _imgGl.getX();
                chely9 = _imgGl.getY() < _img9.getY() + 80 && _img9.getY() - 80 < _imgGl.getY();

                chelx10 = _imgGl.getX() < _img10.getX() + 80 && _img10.getX() - 80 < _imgGl.getX();
                chely10 = _imgGl.getY() < _img10.getY() + 80 && _img10.getY() - 80 < _imgGl.getY();

                chelx11 = _imgGl.getX() < _img11.getX() + 80 && _img11.getX() - 80 < _imgGl.getX();
                chely11 = _imgGl.getY() < _img11.getY() + 80 && _img11.getY() - 80 < _imgGl.getY();

                chelx12 = _imgGl.getX() < _img12.getX() + 80 && _img12.getX() - 80 < _imgGl.getX();
                chely12 = _imgGl.getY() < _img12.getY() + 80 && _img12.getY() - 80 < _imgGl.getY();

                chelx13 = _imgGl.getX() < _img13.getX() + 80 && _img13.getX() - 80 < _imgGl.getX();
                chely13 = _imgGl.getY() < _img13.getY() + 80 && _img13.getY() - 80 < _imgGl.getY();

                chelx14 = _imgGl.getX() < _img14.getX() + 80 && _img14.getX() - 80 < _imgGl.getX();
                chely14 = _imgGl.getY() < _img14.getY() + 80 && _img14.getY() - 80 < _imgGl.getY();

                chelx15 = _imgGl.getX() < _img15.getX() + 80 && _img15.getX() - 80 < _imgGl.getX();
                chely15 = _imgGl.getY() < _img15.getY() + 80 && _img15.getY() - 80 < _imgGl.getY();

                chelx16 = _imgGl.getX() < _img16.getX() + 80 && _img16.getX() - 80 < _imgGl.getX();
                chely16 = _imgGl.getY() < _img16.getY() + 80 && _img16.getY() - 80 < _imgGl.getY();

                chelx17 = _imgGl.getX() < _img17.getX() + 80 && _img17.getX() - 80 < _imgGl.getX();
                chely17 = _imgGl.getY() < _img17.getY() + 80 && _img17.getY() - 80 < _imgGl.getY();

                chelx18 = _imgGl.getX() < _img18.getX() + 80 && _img18.getX() - 80 < _imgGl.getX();
                chely18 = _imgGl.getY() < _img18.getY() + 80 && _img18.getY() - 80 < _imgGl.getY();

                chelx19 = _imgGl.getX() < _img19.getX() + 80 && _img19.getX() - 80 < _imgGl.getX();
                chely19 = _imgGl.getY() < _img19.getY() + 80 && _img19.getY() - 80 < _imgGl.getY();

                chelx20 = _imgGl.getX() < _img20.getX() + 80 && _img20.getX() - 80 < _imgGl.getX();
                chely20 = _imgGl.getY() < _img20.getY() + 80 && _img20.getY() - 80 < _imgGl.getY();

                chelx21 = _imgGl.getX() < _img21.getX() + 80 && _img21.getX() - 80 < _imgGl.getX();
                chely21 = _imgGl.getY() < _img21.getY() + 80 && _img21.getY() - 80 < _imgGl.getY();

                chelx22 = _imgGl.getX() < _img22.getX() + 80 && _img22.getX() - 80 < _imgGl.getX();
                chely22 = _imgGl.getY() < _img22.getY() + 80 && _img22.getY() - 80 < _imgGl.getY();

                chelx23 = _imgGl.getX() < _img23.getX() + 80 && _img23.getX() - 80 < _imgGl.getX();
                chely23 = _imgGl.getY() < _img23.getY() + 80 && _img23.getY() - 80 < _imgGl.getY();

                chelx24 = _imgGl.getX() < _img24.getX() + 80 && _img24.getX() - 80 < _imgGl.getX();
                chely24 = _imgGl.getY() < _img24.getY() + 80 && _img24.getY() - 80 < _imgGl.getY();

                chelx25 = _imgGl.getX() < _img25.getX() + 80 && _img25.getX() - 80 < _imgGl.getX();
                chely25 = _imgGl.getY() < _img25.getY() + 80 && _img25.getY() - 80 < _imgGl.getY();

                chelx26 = _imgGl.getX() < _img26.getX() + 80 && _img26.getX() - 80 < _imgGl.getX();
                chely26 = _imgGl.getY() < _img26.getY() + 80 && _img26.getY() - 80 < _imgGl.getY();

                chelx27 = _imgGl.getX() < _img27.getX() + 80 && _img27.getX() - 80 < _imgGl.getX();
                chely27 = _imgGl.getY() < _img27.getY() + 80 && _img27.getY() - 80 < _imgGl.getY();

                chelx29 = _imgGl.getX() < _img29.getX() + 80 && _img29.getX() - 80 < _imgGl.getX();
                chely29 = _imgGl.getY() < _img29.getY() + 80 && _img29.getY() - 80 < _imgGl.getY();

                chelx30 = _imgGl.getX() < _img30.getX() + 80 && _img30.getX() - 80 < _imgGl.getX();
                chely30 = _imgGl.getY() < _img30.getY() + 80 && _img30.getY() - 80 < _imgGl.getY();

                chelx31 = _imgGl.getX() < _img31.getX() + 80 && _img31.getX() - 80 < _imgGl.getX();
                chely31 = _imgGl.getY() < _img31.getY() + 80 && _img31.getY() - 80 < _imgGl.getY();

                chelx32 = _imgGl.getX() < _img32.getX() + 80 && _img32.getX() - 80 < _imgGl.getX();
                chely32 = _imgGl.getY() < _img32.getY() + 80 && _img32.getY() - 80 < _imgGl.getY();

                chelx33 = _imgGl.getX() < _img33.getX() + 80 && _img33.getX() - 80 < _imgGl.getX();
                chely33 = _imgGl.getY() < _img33.getY() + 80 && _img33.getY() - 80 < _imgGl.getY();

                chelx34 = _imgGl.getX() < _img34.getX() + 80 && _img34.getX() - 80 < _imgGl.getX();
                chely34 = _imgGl.getY() < _img34.getY() + 80 && _img34.getY() - 80 < _imgGl.getY();

                chelx35 = _imgGl.getX() < _img35.getX() + 80 && _img35.getX() - 80 < _imgGl.getX();
                chely35 = _imgGl.getY() < _img35.getY() + 80 && _img35.getY() - 80 < _imgGl.getY();

                chelx36 = _imgGl.getX() < _img36.getX() + 80 && _img36.getX() - 80 < _imgGl.getX();
                chely36 = _imgGl.getY() < _img36.getY() + 80 && _img36.getY() - 80 < _imgGl.getY();

                chelx37 = _imgGl.getX() < _img37.getX() + 80 && _img37.getX() - 80 < _imgGl.getX();
                chely37 = _imgGl.getY() < _img37.getY() + 80 && _img37.getY() - 80 < _imgGl.getY();

                chelx38 = _imgGl.getX() < _img38.getX() + 80 && _img38.getX() - 80 < _imgGl.getX();
                chely38 = _imgGl.getY() < _img38.getY() + 80 && _img38.getY() - 80 < _imgGl.getY();

                chelx39 = _imgGl.getX() < _img39.getX() + 80 && _img39.getX() - 80 < _imgGl.getX();
                chely39 = _imgGl.getY() < _img39.getY() + 80 && _img39.getY() - 80 < _imgGl.getY();

                chelx40 = _imgGl.getX() < _img40.getX() + 80 && _img40.getX() - 80 < _imgGl.getX();
                chely40 = _imgGl.getY() < _img40.getY() + 80 && _img40.getY() - 80 < _imgGl.getY();

                chelx41 = _imgGl.getX() < _img41.getX() + 80 && _img41.getX() - 80 < _imgGl.getX();
                chely41 = _imgGl.getY() < _img41.getY() + 80 && _img41.getY() - 80 < _imgGl.getY();

                chelx42 = _imgGl.getX() < _img42.getX() + 80 && _img42.getX() - 80 < _imgGl.getX();
                chely42 = _imgGl.getY() < _img42.getY() + 80 && _img42.getY() - 80 < _imgGl.getY();

                chelx43 = _imgGl.getX() < _img43.getX() + 80 && _img43.getX() - 80 < _imgGl.getX();
                chely43 = _imgGl.getY() < _img43.getY() + 80 && _img43.getY() - 80 < _imgGl.getY();

                chelx44 = _imgGl.getX() < _img44.getX() + 80 && _img44.getX() - 80 < _imgGl.getX();
                chely44 = _imgGl.getY() < _img44.getY() + 80 && _img44.getY() - 80 < _imgGl.getY();

                chelx45 = _imgGl.getX() < _img45.getX() + 80 && _img45.getX() - 80 < _imgGl.getX();
                chely45 = _imgGl.getY() < _img45.getY() + 80 && _img45.getY() - 80 < _imgGl.getY();

                chelx46 = _imgGl.getX() < _img46.getX() + 80 && _img46.getX() - 80 < _imgGl.getX();
                chely46 = _imgGl.getY() < _img46.getY() + 80 && _img46.getY() - 80 < _imgGl.getY();

                chelx47 = _imgGl.getX() < _img47.getX() + 80 && _img47.getX() - 80 < _imgGl.getX();
                chely47 = _imgGl.getY() < _img47.getY() + 80 && _img47.getY() - 80 < _imgGl.getY();

                chelx48 = _imgGl.getX() < _img48.getX() + 80 && _img48.getX() - 80 < _imgGl.getX();
                chely48 = _imgGl.getY() < _img48.getY() + 80 && _img48.getY() - 80 < _imgGl.getY();

                chelx49 = _imgGl.getX() < _img49.getX() + 80 && _img49.getX() - 80 < _imgGl.getX();
                chely49 = _imgGl.getY() < _img49.getY() + 80 && _img49.getY() - 80 < _imgGl.getY();

                chelx99 = _imgGl.getX() < _img99.getX() + 80 && _img99.getX() - 80 < _imgGl.getX();
                chely99 = _imgGl.getY() < _img99.getY() + 80 && _img99.getY() - 80 < _imgGl.getY();


                _finishx = _imgGl.getX() < _imgFin.getX() + 80 && _imgFin.getX() - 80 < _imgGl.getX();
                _finishy = _imgGl.getY() < _imgFin.getY() + 80 && _imgFin.getY() - 80 < _imgGl.getY();
                if (_finishx && _finishy) {
                    _btnDown.setClickable(false);
                    _btnUp.setClickable(false);
                    _btnRight.setClickable(false);
                    _btnLeft.setClickable(false);
                    _intent = new Intent();
                    _intent.putExtra("back21", 0+"");
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
                            || (chelx99 && chely99)){
                        Toast.makeText(getApplication(), "Проиграл", Toast.LENGTH_SHORT).show();
                        _imgGl.setY(1200);
                        _imgGl.setX(120);
                    }
                }
            }
        });
        _btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl.setX(_imgGl.getX() - 40);
                chelx = _imgGl.getX() < _img28.getX() + 80 && _img28.getX() - 80 < _imgGl.getX();
                chely = _imgGl.getY() < _img28.getY() + 80 && _img28.getY() - 80 < _imgGl.getY();

                chelx2 = _imgGl.getX() < _img1.getX() + 80 && _img1.getX() - 80 < _imgGl.getX();
                chely2 = _imgGl.getY() < _img1.getY() + 80 && _img1.getY() - 80 < _imgGl.getY();

                chelx3 = _imgGl.getX() < _img2.getX() + 80 && _img2.getX() - 80 < _imgGl.getX();
                chely3 = _imgGl.getY() < _img2.getY() + 80 && _img2.getY() - 80 < _imgGl.getY();

                chelx4 = _imgGl.getX() < _img3.getX() + 80 && _img3.getX() - 80 < _imgGl.getX();
                chely4 = _imgGl.getY() < _img3.getY() + 80 && _img3.getY() - 80 < _imgGl.getY();

                chelx28 = _imgGl.getX() < _img4.getX() + 80 && _img4.getX() - 80 < _imgGl.getX();
                chely28 = _imgGl.getY() < _img4.getY() + 80 && _img4.getY() - 80 < _imgGl.getY();

                chelx5 = _imgGl.getX() < _img5.getX() + 80 && _img5.getX() - 80 < _imgGl.getX();
                chely5 = _imgGl.getY() < _img5.getY() + 80 && _img5.getY() - 80 < _imgGl.getY();

                chelx6 = _imgGl.getX() < _img6.getX() + 80 && _img6.getX() - 80 < _imgGl.getX();
                chely6 = _imgGl.getY() < _img6.getY() + 80 && _img6.getY() - 80 < _imgGl.getY();

                chelx7 = _imgGl.getX() < _img7.getX() + 80 && _img7.getX() - 80 < _imgGl.getX();
                chely7 = _imgGl.getY() < _img7.getY() + 80 && _img7.getY() - 80 < _imgGl.getY();

                chelx8 = _imgGl.getX() < _img8.getX() + 80 && _img8.getX() - 80 < _imgGl.getX();
                chely8 = _imgGl.getY() < _img8.getY() + 80 && _img8.getY() - 80 < _imgGl.getY();

                chelx9 = _imgGl.getX() < _img9.getX() + 80 && _img9.getX() - 80 < _imgGl.getX();
                chely9 = _imgGl.getY() < _img9.getY() + 80 && _img9.getY() - 80 < _imgGl.getY();

                chelx10 = _imgGl.getX() < _img10.getX() + 80 && _img10.getX() - 80 < _imgGl.getX();
                chely10 = _imgGl.getY() < _img10.getY() + 80 && _img10.getY() - 80 < _imgGl.getY();

                chelx11 = _imgGl.getX() < _img11.getX() + 80 && _img11.getX() - 80 < _imgGl.getX();
                chely11 = _imgGl.getY() < _img11.getY() + 80 && _img11.getY() - 80 < _imgGl.getY();

                chelx12 = _imgGl.getX() < _img12.getX() + 80 && _img12.getX() - 80 < _imgGl.getX();
                chely12 = _imgGl.getY() < _img12.getY() + 80 && _img12.getY() - 80 < _imgGl.getY();

                chelx13 = _imgGl.getX() < _img13.getX() + 80 && _img13.getX() - 80 < _imgGl.getX();
                chely13 = _imgGl.getY() < _img13.getY() + 80 && _img13.getY() - 80 < _imgGl.getY();

                chelx14 = _imgGl.getX() < _img14.getX() + 80 && _img14.getX() - 80 < _imgGl.getX();
                chely14 = _imgGl.getY() < _img14.getY() + 80 && _img14.getY() - 80 < _imgGl.getY();

                chelx15 = _imgGl.getX() < _img15.getX() + 80 && _img15.getX() - 80 < _imgGl.getX();
                chely15 = _imgGl.getY() < _img15.getY() + 80 && _img15.getY() - 80 < _imgGl.getY();

                chelx16 = _imgGl.getX() < _img16.getX() + 80 && _img16.getX() - 80 < _imgGl.getX();
                chely16 = _imgGl.getY() < _img16.getY() + 80 && _img16.getY() - 80 < _imgGl.getY();

                chelx17 = _imgGl.getX() < _img17.getX() + 80 && _img17.getX() - 80 < _imgGl.getX();
                chely17 = _imgGl.getY() < _img17.getY() + 80 && _img17.getY() - 80 < _imgGl.getY();

                chelx18 = _imgGl.getX() < _img18.getX() + 80 && _img18.getX() - 80 < _imgGl.getX();
                chely18 = _imgGl.getY() < _img18.getY() + 80 && _img18.getY() - 80 < _imgGl.getY();

                chelx19 = _imgGl.getX() < _img19.getX() + 80 && _img19.getX() - 80 < _imgGl.getX();
                chely19 = _imgGl.getY() < _img19.getY() + 80 && _img19.getY() - 80 < _imgGl.getY();

                chelx20 = _imgGl.getX() < _img20.getX() + 80 && _img20.getX() - 80 < _imgGl.getX();
                chely20 = _imgGl.getY() < _img20.getY() + 80 && _img20.getY() - 80 < _imgGl.getY();

                chelx21 = _imgGl.getX() < _img21.getX() + 80 && _img21.getX() - 80 < _imgGl.getX();
                chely21 = _imgGl.getY() < _img21.getY() + 80 && _img21.getY() - 80 < _imgGl.getY();

                chelx22 = _imgGl.getX() < _img22.getX() + 80 && _img22.getX() - 80 < _imgGl.getX();
                chely22 = _imgGl.getY() < _img22.getY() + 80 && _img22.getY() - 80 < _imgGl.getY();

                chelx23 = _imgGl.getX() < _img23.getX() + 80 && _img23.getX() - 80 < _imgGl.getX();
                chely23 = _imgGl.getY() < _img23.getY() + 80 && _img23.getY() - 80 < _imgGl.getY();

                chelx24 = _imgGl.getX() < _img24.getX() + 80 && _img24.getX() - 80 < _imgGl.getX();
                chely24 = _imgGl.getY() < _img24.getY() + 80 && _img24.getY() - 80 < _imgGl.getY();

                chelx25 = _imgGl.getX() < _img25.getX() + 80 && _img25.getX() - 80 < _imgGl.getX();
                chely25 = _imgGl.getY() < _img25.getY() + 80 && _img25.getY() - 80 < _imgGl.getY();

                chelx26 = _imgGl.getX() < _img26.getX() + 80 && _img26.getX() - 80 < _imgGl.getX();
                chely26 = _imgGl.getY() < _img26.getY() + 80 && _img26.getY() - 80 < _imgGl.getY();

                chelx27 = _imgGl.getX() < _img27.getX() + 80 && _img27.getX() - 80 < _imgGl.getX();
                chely27 = _imgGl.getY() < _img27.getY() + 80 && _img27.getY() - 80 < _imgGl.getY();

                chelx29 = _imgGl.getX() < _img29.getX() + 80 && _img29.getX() - 80 < _imgGl.getX();
                chely29 = _imgGl.getY() < _img29.getY() + 80 && _img29.getY() - 80 < _imgGl.getY();

                chelx30 = _imgGl.getX() < _img30.getX() + 80 && _img30.getX() - 80 < _imgGl.getX();
                chely30 = _imgGl.getY() < _img30.getY() + 80 && _img30.getY() - 80 < _imgGl.getY();

                chelx31 = _imgGl.getX() < _img31.getX() + 80 && _img31.getX() - 80 < _imgGl.getX();
                chely31 = _imgGl.getY() < _img31.getY() + 80 && _img31.getY() - 80 < _imgGl.getY();

                chelx32 = _imgGl.getX() < _img32.getX() + 80 && _img32.getX() - 80 < _imgGl.getX();
                chely32 = _imgGl.getY() < _img32.getY() + 80 && _img32.getY() - 80 < _imgGl.getY();

                chelx33 = _imgGl.getX() < _img33.getX() + 80 && _img33.getX() - 80 < _imgGl.getX();
                chely33 = _imgGl.getY() < _img33.getY() + 80 && _img33.getY() - 80 < _imgGl.getY();

                chelx34 = _imgGl.getX() < _img34.getX() + 80 && _img34.getX() - 80 < _imgGl.getX();
                chely34 = _imgGl.getY() < _img34.getY() + 80 && _img34.getY() - 80 < _imgGl.getY();

                chelx35 = _imgGl.getX() < _img35.getX() + 80 && _img35.getX() - 80 < _imgGl.getX();
                chely35 = _imgGl.getY() < _img35.getY() + 80 && _img35.getY() - 80 < _imgGl.getY();

                chelx36 = _imgGl.getX() < _img36.getX() + 80 && _img36.getX() - 80 < _imgGl.getX();
                chely36 = _imgGl.getY() < _img36.getY() + 80 && _img36.getY() - 80 < _imgGl.getY();

                chelx37 = _imgGl.getX() < _img37.getX() + 80 && _img37.getX() - 80 < _imgGl.getX();
                chely37 = _imgGl.getY() < _img37.getY() + 80 && _img37.getY() - 80 < _imgGl.getY();

                chelx38 = _imgGl.getX() < _img38.getX() + 80 && _img38.getX() - 80 < _imgGl.getX();
                chely38 = _imgGl.getY() < _img38.getY() + 80 && _img38.getY() - 80 < _imgGl.getY();

                chelx39 = _imgGl.getX() < _img39.getX() + 80 && _img39.getX() - 80 < _imgGl.getX();
                chely39 = _imgGl.getY() < _img39.getY() + 80 && _img39.getY() - 80 < _imgGl.getY();

                chelx40 = _imgGl.getX() < _img40.getX() + 80 && _img40.getX() - 80 < _imgGl.getX();
                chely40 = _imgGl.getY() < _img40.getY() + 80 && _img40.getY() - 80 < _imgGl.getY();

                chelx41 = _imgGl.getX() < _img41.getX() + 80 && _img41.getX() - 80 < _imgGl.getX();
                chely41 = _imgGl.getY() < _img41.getY() + 80 && _img41.getY() - 80 < _imgGl.getY();

                chelx42 = _imgGl.getX() < _img42.getX() + 80 && _img42.getX() - 80 < _imgGl.getX();
                chely42 = _imgGl.getY() < _img42.getY() + 80 && _img42.getY() - 80 < _imgGl.getY();

                chelx43 = _imgGl.getX() < _img43.getX() + 80 && _img43.getX() - 80 < _imgGl.getX();
                chely43 = _imgGl.getY() < _img43.getY() + 80 && _img43.getY() - 80 < _imgGl.getY();

                chelx44 = _imgGl.getX() < _img44.getX() + 80 && _img44.getX() - 80 < _imgGl.getX();
                chely44 = _imgGl.getY() < _img44.getY() + 80 && _img44.getY() - 80 < _imgGl.getY();

                chelx45 = _imgGl.getX() < _img45.getX() + 80 && _img45.getX() - 80 < _imgGl.getX();
                chely45 = _imgGl.getY() < _img45.getY() + 80 && _img45.getY() - 80 < _imgGl.getY();

                chelx46 = _imgGl.getX() < _img46.getX() + 80 && _img46.getX() - 80 < _imgGl.getX();
                chely46 = _imgGl.getY() < _img46.getY() + 80 && _img46.getY() - 80 < _imgGl.getY();

                chelx47 = _imgGl.getX() < _img47.getX() + 80 && _img47.getX() - 80 < _imgGl.getX();
                chely47 = _imgGl.getY() < _img47.getY() + 80 && _img47.getY() - 80 < _imgGl.getY();

                chelx48 = _imgGl.getX() < _img48.getX() + 80 && _img48.getX() - 80 < _imgGl.getX();
                chely48 = _imgGl.getY() < _img48.getY() + 80 && _img48.getY() - 80 < _imgGl.getY();

                chelx49 = _imgGl.getX() < _img49.getX() + 80 && _img49.getX() - 80 < _imgGl.getX();
                chely49 = _imgGl.getY() < _img49.getY() + 80 && _img49.getY() - 80 < _imgGl.getY();
                _finishx = _imgGl.getX() < _imgFin.getX() + 80 && _imgFin.getX() - 80 < _imgGl.getX();
                _finishy = _imgGl.getY() < _imgFin.getY() + 80 && _imgFin.getY() - 80 < _imgGl.getY();
                if (_finishx && _finishy) {

                    _btnDown.setClickable(false);
                    _btnUp.setClickable(false);
                    _btnRight.setClickable(false);
                    _btnLeft.setClickable(false);
                    _intent = new Intent();
                    _intent.putExtra("back21", 0+"");
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
                        _imgGl.setY(1200);
                        _imgGl.setX(120);
                    }
                }
            }
        });
        _btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _imgGl.setX(_imgGl.getX() + 40);
                chelx = _imgGl.getX() < _img28.getX() + 80 && _img28.getX() - 80 < _imgGl.getX();
                chely = _imgGl.getY() < _img28.getY() + 80 && _img28.getY() - 80 < _imgGl.getY();

                chelx2 = _imgGl.getX() < _img1.getX() + 80 && _img1.getX() - 80 < _imgGl.getX();
                chely2 = _imgGl.getY() < _img1.getY() + 80 && _img1.getY() - 80 < _imgGl.getY();

                chelx3 = _imgGl.getX() < _img2.getX() + 80 && _img2.getX() - 80 < _imgGl.getX();
                chely3 = _imgGl.getY() < _img2.getY() + 80 && _img2.getY() - 80 < _imgGl.getY();

                chelx4 = _imgGl.getX() < _img3.getX() + 80 && _img3.getX() - 80 < _imgGl.getX();
                chely4 = _imgGl.getY() < _img3.getY() + 80 && _img3.getY() - 80 < _imgGl.getY();

                chelx28 = _imgGl.getX() < _img4.getX() + 80 && _img4.getX() - 80 < _imgGl.getX();
                chely28 = _imgGl.getY() < _img4.getY() + 80 && _img4.getY() - 80 < _imgGl.getY();

                chelx5 = _imgGl.getX() < _img5.getX() + 80 && _img5.getX() - 80 < _imgGl.getX();
                chely5 = _imgGl.getY() < _img5.getY() + 80 && _img5.getY() - 80 < _imgGl.getY();

                chelx6 = _imgGl.getX() < _img6.getX() + 80 && _img6.getX() - 80 < _imgGl.getX();
                chely6 = _imgGl.getY() < _img6.getY() + 80 && _img6.getY() - 80 < _imgGl.getY();

                chelx7 = _imgGl.getX() < _img7.getX() + 80 && _img7.getX() - 80 < _imgGl.getX();
                chely7 = _imgGl.getY() < _img7.getY() + 80 && _img7.getY() - 80 < _imgGl.getY();

                chelx8 = _imgGl.getX() < _img8.getX() + 80 && _img8.getX() - 80 < _imgGl.getX();
                chely8 = _imgGl.getY() < _img8.getY() + 80 && _img8.getY() - 80 < _imgGl.getY();

                chelx9 = _imgGl.getX() < _img9.getX() + 80 && _img9.getX() - 80 < _imgGl.getX();
                chely9 = _imgGl.getY() < _img9.getY() + 80 && _img9.getY() - 80 < _imgGl.getY();

                chelx10 = _imgGl.getX() < _img10.getX() + 80 && _img10.getX() - 80 < _imgGl.getX();
                chely10 = _imgGl.getY() < _img10.getY() + 80 && _img10.getY() - 80 < _imgGl.getY();

                chelx11 = _imgGl.getX() < _img11.getX() + 80 && _img11.getX() - 80 < _imgGl.getX();
                chely11 = _imgGl.getY() < _img11.getY() + 80 && _img11.getY() - 80 < _imgGl.getY();

                chelx12 = _imgGl.getX() < _img12.getX() + 80 && _img12.getX() - 80 < _imgGl.getX();
                chely12 = _imgGl.getY() < _img12.getY() + 80 && _img12.getY() - 80 < _imgGl.getY();

                chelx13 = _imgGl.getX() < _img13.getX() + 80 && _img13.getX() - 80 < _imgGl.getX();
                chely13 = _imgGl.getY() < _img13.getY() + 80 && _img13.getY() - 80 < _imgGl.getY();

                chelx14 = _imgGl.getX() < _img14.getX() + 80 && _img14.getX() - 80 < _imgGl.getX();
                chely14 = _imgGl.getY() < _img14.getY() + 80 && _img14.getY() - 80 < _imgGl.getY();

                chelx15 = _imgGl.getX() < _img15.getX() + 80 && _img15.getX() - 80 < _imgGl.getX();
                chely15 = _imgGl.getY() < _img15.getY() + 80 && _img15.getY() - 80 < _imgGl.getY();

                chelx16 = _imgGl.getX() < _img16.getX() + 80 && _img16.getX() - 80 < _imgGl.getX();
                chely16 = _imgGl.getY() < _img16.getY() + 80 && _img16.getY() - 80 < _imgGl.getY();

                chelx17 = _imgGl.getX() < _img17.getX() + 80 && _img17.getX() - 80 < _imgGl.getX();
                chely17 = _imgGl.getY() < _img17.getY() + 80 && _img17.getY() - 80 < _imgGl.getY();

                chelx18 = _imgGl.getX() < _img18.getX() + 80 && _img18.getX() - 80 < _imgGl.getX();
                chely18 = _imgGl.getY() < _img18.getY() + 80 && _img18.getY() - 80 < _imgGl.getY();

                chelx19 = _imgGl.getX() < _img19.getX() + 80 && _img19.getX() - 80 < _imgGl.getX();
                chely19 = _imgGl.getY() < _img19.getY() + 80 && _img19.getY() - 80 < _imgGl.getY();

                chelx20 = _imgGl.getX() < _img20.getX() + 80 && _img20.getX() - 80 < _imgGl.getX();
                chely20 = _imgGl.getY() < _img20.getY() + 80 && _img20.getY() - 80 < _imgGl.getY();

                chelx21 = _imgGl.getX() < _img21.getX() + 80 && _img21.getX() - 80 < _imgGl.getX();
                chely21 = _imgGl.getY() < _img21.getY() + 80 && _img21.getY() - 80 < _imgGl.getY();

                chelx22 = _imgGl.getX() < _img22.getX() + 80 && _img22.getX() - 80 < _imgGl.getX();
                chely22 = _imgGl.getY() < _img22.getY() + 80 && _img22.getY() - 80 < _imgGl.getY();

                chelx23 = _imgGl.getX() < _img23.getX() + 80 && _img23.getX() - 80 < _imgGl.getX();
                chely23 = _imgGl.getY() < _img23.getY() + 80 && _img23.getY() - 80 < _imgGl.getY();

                chelx24 = _imgGl.getX() < _img24.getX() + 80 && _img24.getX() - 80 < _imgGl.getX();
                chely24 = _imgGl.getY() < _img24.getY() + 80 && _img24.getY() - 80 < _imgGl.getY();

                chelx25 = _imgGl.getX() < _img25.getX() + 80 && _img25.getX() - 80 < _imgGl.getX();
                chely25 = _imgGl.getY() < _img25.getY() + 80 && _img25.getY() - 80 < _imgGl.getY();

                chelx26 = _imgGl.getX() < _img26.getX() + 80 && _img26.getX() - 80 < _imgGl.getX();
                chely26 = _imgGl.getY() < _img26.getY() + 80 && _img26.getY() - 80 < _imgGl.getY();

                chelx27 = _imgGl.getX() < _img27.getX() + 80 && _img27.getX() - 80 < _imgGl.getX();
                chely27 = _imgGl.getY() < _img27.getY() + 80 && _img27.getY() - 80 < _imgGl.getY();

                chelx29 = _imgGl.getX() < _img29.getX() + 80 && _img29.getX() - 80 < _imgGl.getX();
                chely29 = _imgGl.getY() < _img29.getY() + 80 && _img29.getY() - 80 < _imgGl.getY();

                chelx30 = _imgGl.getX() < _img30.getX() + 80 && _img30.getX() - 80 < _imgGl.getX();
                chely30 = _imgGl.getY() < _img30.getY() + 80 && _img30.getY() - 80 < _imgGl.getY();

                chelx31 = _imgGl.getX() < _img31.getX() + 80 && _img31.getX() - 80 < _imgGl.getX();
                chely31 = _imgGl.getY() < _img31.getY() + 80 && _img31.getY() - 80 < _imgGl.getY();

                chelx32 = _imgGl.getX() < _img32.getX() + 80 && _img32.getX() - 80 < _imgGl.getX();
                chely32 = _imgGl.getY() < _img32.getY() + 80 && _img32.getY() - 80 < _imgGl.getY();

                chelx33 = _imgGl.getX() < _img33.getX() + 80 && _img33.getX() - 80 < _imgGl.getX();
                chely33 = _imgGl.getY() < _img33.getY() + 80 && _img33.getY() - 80 < _imgGl.getY();

                chelx34 = _imgGl.getX() < _img34.getX() + 80 && _img34.getX() - 80 < _imgGl.getX();
                chely34 = _imgGl.getY() < _img34.getY() + 80 && _img34.getY() - 80 < _imgGl.getY();

                chelx35 = _imgGl.getX() < _img35.getX() + 80 && _img35.getX() - 80 < _imgGl.getX();
                chely35 = _imgGl.getY() < _img35.getY() + 80 && _img35.getY() - 80 < _imgGl.getY();

                chelx36 = _imgGl.getX() < _img36.getX() + 80 && _img36.getX() - 80 < _imgGl.getX();
                chely36 = _imgGl.getY() < _img36.getY() + 80 && _img36.getY() - 80 < _imgGl.getY();

                chelx37 = _imgGl.getX() < _img37.getX() + 80 && _img37.getX() - 80 < _imgGl.getX();
                chely37 = _imgGl.getY() < _img37.getY() + 80 && _img37.getY() - 80 < _imgGl.getY();

                chelx38 = _imgGl.getX() < _img38.getX() + 80 && _img38.getX() - 80 < _imgGl.getX();
                chely38 = _imgGl.getY() < _img38.getY() + 80 && _img38.getY() - 80 < _imgGl.getY();

                chelx39 = _imgGl.getX() < _img39.getX() + 80 && _img39.getX() - 80 < _imgGl.getX();
                chely39 = _imgGl.getY() < _img39.getY() + 80 && _img39.getY() - 80 < _imgGl.getY();

                chelx40 = _imgGl.getX() < _img40.getX() + 80 && _img40.getX() - 80 < _imgGl.getX();
                chely40 = _imgGl.getY() < _img40.getY() + 80 && _img40.getY() - 80 < _imgGl.getY();

                chelx41 = _imgGl.getX() < _img41.getX() + 80 && _img41.getX() - 80 < _imgGl.getX();
                chely41 = _imgGl.getY() < _img41.getY() + 80 && _img41.getY() - 80 < _imgGl.getY();

                chelx42 = _imgGl.getX() < _img42.getX() + 80 && _img42.getX() - 80 < _imgGl.getX();
                chely42 = _imgGl.getY() < _img42.getY() + 80 && _img42.getY() - 80 < _imgGl.getY();

                chelx43 = _imgGl.getX() < _img43.getX() + 80 && _img43.getX() - 80 < _imgGl.getX();
                chely43 = _imgGl.getY() < _img43.getY() + 80 && _img43.getY() - 80 < _imgGl.getY();

                chelx44 = _imgGl.getX() < _img44.getX() + 80 && _img44.getX() - 80 < _imgGl.getX();
                chely44 = _imgGl.getY() < _img44.getY() + 80 && _img44.getY() - 80 < _imgGl.getY();

                chelx45 = _imgGl.getX() < _img45.getX() + 80 && _img45.getX() - 80 < _imgGl.getX();
                chely45 = _imgGl.getY() < _img45.getY() + 80 && _img45.getY() - 80 < _imgGl.getY();

                chelx46 = _imgGl.getX() < _img46.getX() + 80 && _img46.getX() - 80 < _imgGl.getX();
                chely46 = _imgGl.getY() < _img46.getY() + 80 && _img46.getY() - 80 < _imgGl.getY();

                chelx47 = _imgGl.getX() < _img47.getX() + 80 && _img47.getX() - 80 < _imgGl.getX();
                chely47 = _imgGl.getY() < _img47.getY() + 80 && _img47.getY() - 80 < _imgGl.getY();

                chelx48 = _imgGl.getX() < _img48.getX() + 80 && _img48.getX() - 80 < _imgGl.getX();
                chely48 = _imgGl.getY() < _img48.getY() + 80 && _img48.getY() - 80 < _imgGl.getY();

                chelx49 = _imgGl.getX() < _img49.getX() + 80 && _img49.getX() - 80 < _imgGl.getX();
                chely49 = _imgGl.getY() < _img49.getY() + 80 && _img49.getY() - 80 < _imgGl.getY();
                _finishx = _imgGl.getX() < _imgFin.getX() + 80 && _imgFin.getX() - 80 < _imgGl.getX();
                _finishy = _imgGl.getY() < _imgFin.getY() + 80 && _imgFin.getY() - 80 < _imgGl.getY();
                if (_finishx && _finishy) {

                    _btnDown.setClickable(false);
                    _btnUp.setClickable(false);
                    _btnRight.setClickable(false);
                    _btnLeft.setClickable(false);
                    _intent = new Intent();
                    _intent.putExtra("back21", 0+"");
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
                        _imgGl.setY(1200);
                        _imgGl.setX(120);
                    }
                }
            }
        });
    }
}