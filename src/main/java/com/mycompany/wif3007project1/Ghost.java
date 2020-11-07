package com.mycompany.wif3007project1;

public class Ghost extends  DecorativeAccessories implements DecorationInterface {
    private Animation animation;
    public void display(){
        System.out.println("Ghost is displayed");
    }
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public Animation getAnimation() {
        return animation;
    }
}
