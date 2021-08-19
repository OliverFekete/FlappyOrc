package com.chromosome.warriors.flappyorc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap gameBackground;


    public BitmapBank(Resources resources) {
        gameBackground = BitmapFactory.decodeResource(resources, R.drawable.barbarian_village_game_background);
        gameBackground = scaleImage(gameBackground);
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

    public Bitmap scaleImage(Bitmap bitmap) {
        float widthHeightRatio = getGameBackgroundWidth() / (float) getGameBackgroundHeight();

        /*
        We'll multiply widthHeightRatio with screenHeight to get scaled width width of the bitmap.
        Then call create ScaledBitmap() to create a new bitmap, scaled from an existing bitmap, when possible
         */
        int backgroundScaleWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaleWidth, AppConstants.SCREEN_HEIGHT, false);
    }
}
