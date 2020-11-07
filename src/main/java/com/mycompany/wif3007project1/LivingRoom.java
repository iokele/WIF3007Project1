package com.mycompany.wif3007project1;

import java.util.ArrayList;

public class LivingRoom implements LivingRoomInterface {
    private static LivingRoom livingRoomImp;
    private Background background;
    private ArrayList<Furniture> furniture;
    private LivingRoom(){

    }
    public static LivingRoom getLivingRoomImp(){
        if (livingRoomImp == null){
            livingRoomImp = new LivingRoom();
        }
        return livingRoomImp;
    }
    @Override
    public PreviousLivingRoomCareTaker backupLastLivingRoomImp(){
        return new PreviousLivingRoom(background,furniture);
    }
    @Override
    public void restorePreviousLivingRoomImp(PreviousLivingRoomCareTaker memento){
        this.background = ((PreviousLivingRoomOriginator) memento).getBackground();
        this.furniture = ((PreviousLivingRoomOriginator)memento).getFurniture();
    }
    @Override
    public void display(){}
    @Override
    public void setBackground(Background background){
        this.background =background;
    }
    @Override
    public void addFurniture(Furniture furniture){
        this.furniture.add(furniture);
    }
}
