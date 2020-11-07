package com.mycompany.wif3007project1;

public class DecorationLight extends Light {
    @Override
    public void lightUp(){
        System.out.println("Decoration Light light up way");
    }
    @Override
    public void lightAnimation(){
        System.out.println("Light Animation is Decoration Light style");
    }
    @Override
    public void display(){
        System.out.println("Decoration light display");
    }
}
