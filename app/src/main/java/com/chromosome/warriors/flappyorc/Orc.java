package com.chromosome.warriors.flappyorc;

public class Orc {

    private int orcX, orcY, currentFrame;
    public static int maxFrame;

    public Orc() {
        orcX = AppConstants.SCREEN_WIDTH / 2 - AppConstants.getBitmapBank().getOrcWidth() / 2;
        orcY = AppConstants.SCREEN_HEIGHT / 2 - AppConstants.getBitmapBank().getOrcHeight() / 2;
        currentFrame = 0;
        maxFrame = 5;
    }

    public int getOrcX() {
        return orcX;
    }

    public void setOrcX(int orcX) {
        this.orcX = orcX;
    }

    public int getOrcY() {
        return orcY;
    }

    public void setOrcY(int orcY) {
        this.orcY = orcY;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

}
