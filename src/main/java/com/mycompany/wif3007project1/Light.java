package com.mycompany.wif3007project1;

public abstract class Light extends Furniture implements  LightInterface {
    private int color;
    final void LightProcess(){
        lightUp();
        lightAnimation();
        lightOff();
    }
    abstract void lightAnimation();
    abstract void lightUp();
    void lightOff(){
        System.out.println("Light Off");
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
