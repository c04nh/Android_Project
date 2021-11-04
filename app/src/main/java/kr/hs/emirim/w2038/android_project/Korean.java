package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Korean extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,
            btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30,
            btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        //툴바 생성
        Toolbar toolbar = findViewById(R.id.next_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundColor(Color.rgb(231, 255, 113));
        toolbar.setTitleTextColor(Color.rgb(100, 98, 98));

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);
        btn30 = findViewById(R.id.btn30);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn35 = findViewById(R.id.btn35);
        btn36 = findViewById(R.id.btn36);
        btn37 = findViewById(R.id.btn37);
        btn38 = findViewById(R.id.btn38);
        btn39 = findViewById(R.id.btn39);
        btn40 = findViewById(R.id.btn40);


        btn1.setOnClickListener(btnListener);
        btn2.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
        btn5.setOnClickListener(btnListener);
        btn6.setOnClickListener(btnListener);
        btn7.setOnClickListener(btnListener);
        btn8.setOnClickListener(btnListener);
        btn9.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
        btn11.setOnClickListener(btnListener);
        btn12.setOnClickListener(btnListener);
        btn13.setOnClickListener(btnListener);
        btn14.setOnClickListener(btnListener);
        btn15.setOnClickListener(btnListener);
        btn16.setOnClickListener(btnListener);
        btn17.setOnClickListener(btnListener);
        btn18.setOnClickListener(btnListener);
        btn19.setOnClickListener(btnListener);
        btn20.setOnClickListener(btnListener);
        btn21.setOnClickListener(btnListener);
        btn22.setOnClickListener(btnListener);
        btn23.setOnClickListener(btnListener);
        btn24.setOnClickListener(btnListener);
        btn25.setOnClickListener(btnListener);
        btn26.setOnClickListener(btnListener);
        btn27.setOnClickListener(btnListener);
        btn28.setOnClickListener(btnListener);
        btn29.setOnClickListener(btnListener);
        btn30.setOnClickListener(btnListener);
        btn31.setOnClickListener(btnListener);
        btn32.setOnClickListener(btnListener);
        btn33.setOnClickListener(btnListener);
        btn34.setOnClickListener(btnListener);
        btn35.setOnClickListener(btnListener);
        btn36.setOnClickListener(btnListener);
        btn37.setOnClickListener(btnListener);
        btn38.setOnClickListener(btnListener);
        btn39.setOnClickListener(btnListener);
        btn40.setOnClickListener(btnListener);

    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home: {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.btn1:
                    intent = new Intent(Korean.this, Korean01.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent = new Intent(Korean.this, Korean02.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent = new Intent(Korean.this, Korean03.class);
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent = new Intent(Korean.this, Korean04.class);
                    startActivity(intent);
                    break;
                case R.id.btn5:
                    intent = new Intent(Korean.this, Korean05.class);
                    startActivity(intent);
                    break;
                case R.id.btn6:
                    intent = new Intent(Korean.this, Korean06.class);
                    startActivity(intent);
                    break;
                case R.id.btn7:
                    intent = new Intent(Korean.this, Korean07.class);
                    startActivity(intent);
                    break;
                case R.id.btn8:
                    intent = new Intent(Korean.this, Korean08.class);
                    startActivity(intent);
                    break;
                case R.id.btn9:
                    intent = new Intent(Korean.this, Korean09.class);
                    startActivity(intent);
                    break;
                case R.id.btn10:
                    intent = new Intent(Korean.this, Korean10.class);
                    startActivity(intent);
                    break;
                case R.id.btn11:
                    intent = new Intent(Korean.this, Korean11.class);
                    startActivity(intent);
                    break;
                case R.id.btn12:
                    intent = new Intent(Korean.this, Korean12.class);
                    startActivity(intent);
                    break;
                case R.id.btn13:
                    intent = new Intent(Korean.this, Korean13.class);
                    startActivity(intent);
                    break;
                case R.id.btn14:
                    intent = new Intent(Korean.this, Korean14.class);
                    startActivity(intent);
                    break;
                case R.id.btn15:
                    intent = new Intent(Korean.this, Korean15.class);
                    startActivity(intent);
                    break;
                case R.id.btn16:
                    intent = new Intent(Korean.this, Korean16.class);
                    startActivity(intent);
                    break;
                case R.id.btn17:
                    intent = new Intent(Korean.this, Korean17.class);
                    startActivity(intent);
                    break;
                case R.id.btn18:
                    intent = new Intent(Korean.this, Korean18.class);
                    startActivity(intent);
                    break;
                case R.id.btn19:
                    intent = new Intent(Korean.this, Korean19.class);
                    startActivity(intent);
                    break;
                case R.id.btn20:
                    intent = new Intent(Korean.this, Korean20.class);
                    startActivity(intent);
                    break;
                case R.id.btn21:
                    intent = new Intent(Korean.this, Korean21.class);
                    startActivity(intent);
                    break;
                case R.id.btn22:
                    intent = new Intent(Korean.this, Korean22.class);
                    startActivity(intent);
                    break;
                case R.id.btn23:
                    intent = new Intent(Korean.this, Korean23.class);
                    startActivity(intent);
                    break;
                case R.id.btn24:
                    intent = new Intent(Korean.this, Korean24.class);
                    startActivity(intent);
                    break;
                case R.id.btn25:
                    intent = new Intent(Korean.this, Korean25.class);
                    startActivity(intent);
                    break;
                case R.id.btn26:
                    intent = new Intent(Korean.this, Korean26.class);
                    startActivity(intent);
                    break;
                case R.id.btn27:
                    intent = new Intent(Korean.this, Korean27.class);
                    startActivity(intent);
                    break;
                case R.id.btn28:
                    intent = new Intent(Korean.this, Korean28.class);
                    startActivity(intent);
                    break;
                case R.id.btn29:
                    intent = new Intent(Korean.this, Korean29.class);
                    startActivity(intent);
                    break;
                case R.id.btn30:
                    intent = new Intent(Korean.this, Korean30.class);
                    startActivity(intent);
                    break;
                case R.id.btn31:
                    intent = new Intent(Korean.this, Korean31.class);
                    startActivity(intent);
                    break;
                case R.id.btn32:
                    intent = new Intent(Korean.this, Korean32.class);
                    startActivity(intent);
                    break;
                case R.id.btn33:
                    intent = new Intent(Korean.this, Korean33.class);
                    startActivity(intent);
                    break;
                case R.id.btn34:
                    intent = new Intent(Korean.this, Korean34.class);
                    startActivity(intent);
                    break;
                case R.id.btn35:
                    intent = new Intent(Korean.this, Korean35.class);
                    startActivity(intent);
                    break;
                case R.id.btn36:
                    intent = new Intent(Korean.this, Korean36.class);
                    startActivity(intent);
                    break;
                case R.id.btn37:
                    intent = new Intent(Korean.this, Korean37.class);
                    startActivity(intent);
                    break;
                case R.id.btn38:
                    intent = new Intent(Korean.this, Korean38.class);
                    startActivity(intent);
                    break;
                case R.id.btn39:
                    intent = new Intent(Korean.this, Korean39.class);
                    startActivity(intent);
                    break;
                case R.id.btn40:
                    intent = new Intent(Korean.this, Korean40.class);
                    startActivity(intent);
                    break;
            }
        }
    };

}