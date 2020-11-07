package com.mycompany.wif3007project1;

public interface LivingRoomInterface {
    PreviousLivingRoomCareTaker backupLastLivingRoomImp();
    void restorePreviousLivingRoomImp(PreviousLivingRoomCareTaker memento);
    void setBackground( Background backGround);
    void addFurniture(Furniture furniture);
    void display();
}
