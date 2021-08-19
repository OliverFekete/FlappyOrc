package com.chromosome.warriors.flappyorc;

import android.graphics.Canvas;

public class GameEngine {

    BackgroundImage backgroundImage;

    public GameEngine() {
        backgroundImage = new BackgroundImage();
    }

    public void updateAndDrawBackgroundImage(Canvas canvas) {
        backgroundImage.setBackgroundImageX(backgroundImage.getBackgroundImageX() - backgroundImage.getBackgroundImageVelocity());
        if (backgroundImage.getBackgroundImageX() < -AppConstants.getBitmapBank().getGameBackgroundWidth()) {
            backgroundImage.setBackgroundImageX(0);
        }
        canvas.drawBitmap(AppConstants.getBitmapBank().getGameBackground(), backgroundImage.getBackgroundImageX(), backgroundImage.getBackgroundImageY(), null);
        if (backgroundImage.getBackgroundImageX() < -(AppConstants.getBitmapBank().getGameBackgroundWidth() - AppConstants.SCREEN_WIDTH)) {
            canvas.drawBitmap(AppConstants.getBitmapBank().getGameBackground(), backgroundImage.getBackgroundImageX() + AppConstants.getBitmapBank().getGameBackgroundWidth(), backgroundImage.getBackgroundImageY(), null);
        }
    }
}
