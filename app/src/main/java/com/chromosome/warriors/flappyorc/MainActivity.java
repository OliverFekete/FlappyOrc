package com.chromosome.warriors.flappyorc;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppConstants.initialization(this.getApplicationContext());
    }

    public void startGame(View view) {
        Log.i("ImageButton", "clicked!");
        Intent intent = new Intent(this, GameActivity.class); //this is the glue between two activity
        startActivity(intent);
        finish();
    }
}