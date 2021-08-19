package com.chromosome.warriors.flappyorc;

import android.graphics.Canvas;

public class GameEngine {

    BackgroundImage backgroundImage;
    Orc orc;

    public GameEngine() {
        backgroundImage = new BackgroundImage();
        orc = new Orc();
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

    public void updateAndDrawOrc(Canvas canvas) {
        int currentFrame = orc.getCurrentFrame();
        canvas.drawBitmap(AppConstants.getBitmapBank().getSpinningOrc(currentFrame), orc.getOrcX(), orc.getOrcY(), null);
        currentFrame++;
        //If it exceeds maxFrame re-initialize to 0
        if (currentFrame > Orc.maxFrame) {
            currentFrame = 0;
        }
        orc.setCurrentFrame(currentFrame);
    }
}
