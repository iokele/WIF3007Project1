package com.mycompany.wif3007project1;

import java.util.ArrayList;

public class PreviousLivingRoom implements PreviousLivingRoomCareTaker,PreviousLivingRoomOriginator{
    private Background background;
    private ArrayList<Furniture> furniture;

    public PreviousLivingRoom(Background background, ArrayList<Furniture> furniture){
        this.background = background;
        this.furniture = furniture;
    }
    @Override
    public Background getBackground(){
        return background;
    }
    @Override
    public ArrayList<Furniture> getFurniture(){
        return furniture;
    }
}
