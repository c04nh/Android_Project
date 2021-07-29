package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout1 extends AppCompatActivity {
    Button korean, snack, japanese, chinese, western, etc, chicken, pizza, dessert, fastfood, lunchbox, fusion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);
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

        korean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Layout1.this, Korean.class);
                startActivity(intent);
            }
        });
    }
}