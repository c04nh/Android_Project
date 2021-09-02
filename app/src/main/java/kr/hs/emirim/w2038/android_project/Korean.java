package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Korean extends AppCompatActivity {
    Button back, btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        back = findViewById(R.id.back);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(btnListener);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Korean.this, Layout1.class);
                startActivity(intent);
            }
        });
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.btn1:
                    intent = new Intent(Korean.this, Korean1.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent = new Intent(Korean.this, Korean2.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}