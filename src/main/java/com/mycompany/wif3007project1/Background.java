package com.mycompany.wif3007project1;

public class Background {
    private int positionX;
    private int positionY;
    private boolean status;
    private String source;

    public Background(int positionX, int positionY, boolean status) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public int getPositionY() {
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
