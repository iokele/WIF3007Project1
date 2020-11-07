package com.mycompany.wif3007project1;

public class Pumpkin extends Furniture implements DecorativeAccessoriesInterface {
    private Animation animation;
    public void display(){
        System.out.println("Pumpkin is displayed");
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }
}
