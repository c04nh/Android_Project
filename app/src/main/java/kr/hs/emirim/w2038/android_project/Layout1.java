package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Layout1 extends AppCompatActivity {
    Button korean, snack, japanese, chinese, western, asian, chicken, dessert, fastfood, lunchbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);
        korean = findViewById(R.id.korean);
        japanese = findViewById(R.id.japanese);
        chinese = findViewById(R.id.chinese);
        western = findViewById(R.id.western);
        asian = findViewById(R.id.asian);
        chicken = findViewById(R.id.chicken);
        dessert = findViewById(R.id.dessert);
        fastfood = findViewById(R.id.fastfood);
        lunchbox = findViewById(R.id.lunchbox);
    }
}