package kr.hs.emirim.w2038.android_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    Button btnStart, btnLogin, btnCreateAccount;
    ViewFlipper v_fllipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("고시촌에서 뭐 먹지?");

        Intent intent = new Intent(this, Splash.class);
        startActivity(intent);
        v_fllipper = findViewById(R.id.image_slide);

        v_fllipper.setFlipInterval(2000);
        v_fllipper.setAutoStart(true);

        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

            Intent intent = new Intent(getApplicationContext(),Korean.class);
            startActivity(intent);

            return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}