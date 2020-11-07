package com.mycompany.wif3007project1;

import java.util.ArrayList;

public class PreviousLivingRoom implements PreviousLivingRoomCareTaker,PreviousLivingRoomOriginator{
    private Background background;
    private ArrayList<Furniture> furnitures;

    public PreviousLivingRoom(Background background, ArrayList<Furniture> furnitures){
        this.background = background;
        this.furnitures = furnitures;
    }
    @Override
    public Background getBackground(){
        return background;
    }
    @Override
    public ArrayList<Furniture> getFurnitures(){
        return furnitures;
    }
}
