package com.chromosome.warriors.flappyorc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap gameBackground;

    public BitmapBank(Resources resources) {
        gameBackground = BitmapFactory.decodeResource(resources, R.drawable.barbarian_village_game_background);
    }

    public Bitmap getGameBackground() {
        return gameBackground;
    }

    public int getGameBackgroundWidth() {
        return gameBackground.getWidth();
    }

    public int getGameBackgroundHeight() {
        return gameBackground.getHeight();
    }
}
