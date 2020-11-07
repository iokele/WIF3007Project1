package com.mycompany.wif3007project1;

public class SofaFactory {
    public SofaInterface createSofa(int type){
        if (type ==1){
            return  new SofaTypeA();
        }
        else {
            return new SofaTypeB();
        }
    }
}
