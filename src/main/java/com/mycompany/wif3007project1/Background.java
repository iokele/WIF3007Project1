package com.mycompany.wif3007project1;

public class Background {
    private int positionX;
    private int positionY;
    private boolean status;

    public Background(int positionX, int positionY, boolean status) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.status = status;
    }

    public void display(){
        System.out.println("This is background");
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPisotionY() {
        return positionY;
    }

    public void setPostionY(int postionY) {
        this.positionY = postionY;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
