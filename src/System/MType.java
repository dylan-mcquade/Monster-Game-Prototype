package System;

import java.util.ArrayList;

public class MType {
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public MType(){

    }

    public void addResistance(MType type){
        resistances.add(type);
    }

    public void addWeakness(MType type){
        weaknesses.add(type);
    }
}
