package com.mycompany.wif3007project1;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args){
        LivingRoom livingRoom = LivingRoom.getLivingRoomImp();//Get the Living Room Object
        Background background = new Background(0,0,true);//create a new background
        background.setPositionX(2);
        background.setPostionY(2);
        background.isStatus();
        System.out.println("X:" +background.getPositionX()+ "Y: "+background.getPositionY());
        background.display();
        livingRoom.setBackground(background);//Set a new background for Living Room
        SofaFactory sofaFactory = new SofaFactory();
        Furniture sofa = (Furniture) sofaFactory.createSofa(2); // Need to change the sofa type to Furniture
        sofa.display(); // Here will display sofaTypeB
        ArrayList<Furniture> furnitures = new ArrayList<>(); //A list of Furniture to store all selected furniture
        furnitures.add(sofa);

        Light lightA = new EnvironmentLight();
        furnitures.add(lightA);
        lightA.lightUp();
        lightA.lightAnimation();
        lightA.lightOff();

        Light lightB = new DecorationLight();
        furnitures.add(lightB);
        lightB.lightUp();
        lightA.lightAnimation();
        lightA.lightOff();

        DecorativeAccessories pumpkin = new Pumpkin();
        pumpkin.setSource("Source address");
        pumpkin.setPositionX(0);
        pumpkin.setPositionY(0);
        Animation animationPumpkin = new Animation();
        animationPumpkin.setEntranceBehaviour(new FadeIn());
        animationPumpkin.setExitBehaviour(new FadeOut());
        animationPumpkin.setLoopingBehviour(new Floating());
        ((Pumpkin) pumpkin).setAnimation(animationPumpkin);
        ((Pumpkin) pumpkin).getAnimation().performEntrance();
        ((Pumpkin) pumpkin).getAnimation().performLooping();
        ((Pumpkin) pumpkin).getAnimation().performExit();
        furnitures.add(pumpkin);
    }
}
