package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    Button korean, snack, japanese, chinese, western, etc, chicken, pizza, dessert, fastfood, lunchbox, fusion;

    ViewFlipper v_fllipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, Splash.class);
        startActivity(intent);
        v_fllipper = findViewById(R.id.image_slide);

        v_fllipper.setFlipInterval(2000);
        v_fllipper.setAutoStart(true);

        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);

        korean = findViewById(R.id.korean);
        snack = findViewById(R.id.snack);
        japanese = findViewById(R.id.japanese);
        chinese = findViewById(R.id.chinese);
        western = findViewById(R.id.western);
        etc = findViewById(R.id.etc);
        chicken = findViewById(R.id.chicken);
        pizza = findViewById(R.id.pizza);
        dessert = findViewById(R.id.dessert);
        fastfood = findViewById(R.id.fastfood);
        lunchbox = findViewById(R.id.lunchbox);
        fusion = findViewById(R.id.fusion);

        korean.setOnClickListener(btnListener);
        snack.setOnClickListener(btnListener);
        japanese.setOnClickListener(btnListener);
        chinese.setOnClickListener(btnListener);
        western.setOnClickListener(btnListener);
        etc.setOnClickListener(btnListener);
        chicken.setOnClickListener(btnListener);
        pizza.setOnClickListener(btnListener);
        dessert.setOnClickListener(btnListener);
        fastfood.setOnClickListener(btnListener);
        lunchbox.setOnClickListener(btnListener);
        fusion.setOnClickListener(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.korean:
                    intent = new Intent(MainActivity.this, Korean.class);
                    startActivity(intent);
                    break;
                case R.id.snack:
                    intent = new Intent(MainActivity.this, Snack.class);
                    startActivity(intent);
                    break;
                case R.id.japanese:
                    intent = new Intent(MainActivity.this, Japanese.class);
                    startActivity(intent);
                    break;
                case R.id.chinese:
                    intent = new Intent(MainActivity.this, Chinese.class);
                    startActivity(intent);
                    break;
                case R.id.western:
                    intent = new Intent(MainActivity.this, Western.class);
                    startActivity(intent);
                    break;
                case R.id.etc:
                    intent = new Intent(MainActivity.this, Etc.class);
                    startActivity(intent);
                    break;
                case R.id.chicken:
                    intent = new Intent(MainActivity.this, Chicken.class);
                    startActivity(intent);
                    break;
                case R.id.pizza:
                    intent = new Intent(MainActivity.this, Pizza.class);
                    startActivity(intent);
                    break;
                case R.id.dessert:
                    intent = new Intent(MainActivity.this, Dessert.class);
                    startActivity(intent);
                    break;
                case R.id.fastfood:
                    intent = new Intent(MainActivity.this, Fastfood.class);
                    startActivity(intent);
                    break;
                case R.id.lunchbox:
                    intent = new Intent(MainActivity.this, Lunchbox.class);
                    startActivity(intent);
                    break;
                case R.id.fusion:
                    intent = new Intent(MainActivity.this, Fusion.class);
                    startActivity(intent);
                    break;

            }



        }
    };
}