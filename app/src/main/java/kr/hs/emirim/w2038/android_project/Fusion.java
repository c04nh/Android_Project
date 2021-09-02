package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fusion extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fusion);

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fusion.this, Layout1.class);
                startActivity(intent);
            }
        });
    }
}