package com.mycompany.wif3007project1;

public class EnvironmentLight extends Light {
    @Override
    public void lightUp(){
        System.out.println("Environment Light light up way");
    }
    @Override
    public void lightAnimation(){
        System.out.println("Light Animation is Environment Light style");
    }
    @Override
    public void display(){
        System.out.println("Environment light display");
    }
}
