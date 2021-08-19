package com.chromosome.warriors.flappyorc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap gameBackground;
    Bitmap[] spinningOrc;


    public BitmapBank(Resources resources) {
        gameBackground = BitmapFactory.decodeResource(resources, R.drawable.barbarian_village_game_background);
        gameBackground = scaleImage(gameBackground);
        spinningOrc = new Bitmap[6];
        spinningOrc[0] = BitmapFactory.decodeResource(resources, R.drawable.orc_1);
        spinningOrc[1] = BitmapFactory.decodeResource(resources, R.drawable.orc_2);
        spinningOrc[2] = BitmapFactory.decodeResource(resources, R.drawable.orc_3);
        spinningOrc[3] = BitmapFactory.decodeResource(resources, R.drawable.orc_4);
        spinningOrc[4] = BitmapFactory.decodeResource(resources, R.drawable.orc_5);
        spinningOrc[5] = BitmapFactory.decodeResource(resources, R.drawable.orc_6);
    }

    public Bitmap getGameBackground() {
        return gameBackground;
    }

    public Bitmap getSpinningOrc(int frame) {
        return spinningOrc[frame];
    }

    public int getGameBackgroundWidth() {
        return gameBackground.getWidth();
    }

    public int getGameBackgroundHeight() {
        return gameBackground.getHeight();
    }

    public int getOrcWidth() {
        return spinningOrc[0].getWidth();
    }

    public int getOrcHeight() {
        return spinningOrc[0].getHeight();
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
