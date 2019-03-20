package System;

import java.util.ArrayList;

public class MType {
    private ArrayList<Integer> typeID = new ArrayList<Integer>();
    private ArrayList<Integer> resistances = new ArrayList<Integer>();
    private ArrayList<Integer> weaknesses = new ArrayList<Integer>();

    public MType(){
    }

    public MType(int type) {
        typeID.add(type);
        switch (type) {
            case 1:
                weaknesses.add(2);
                resistances.add(1);
                return;
            case 2:
                weaknesses.add(1);
                resistances.add(2);
                return;
            case 3:
                weaknesses.add(4);
                weaknesses.add(5);
                resistances.add(7);
                return;
            case 4:
                weaknesses.add(7);
                weaknesses.add(8);
                resistances.add(3);
                return;
            case 5:
                weaknesses.add(4);
                weaknesses.add(6);
                resistances.add(3);
                resistances.add(8);
                return;
            case 6:
                return;
            case 7:
                weaknesses.add(3);
                weaknesses.add(8);
                resistances.add(4);
                resistances.add(6);
                return;
            case 8:
                weaknesses.add(5);
                return;
            default:
                System.out.println("Unknown type passed.");
                return;
        }
    }

    public void gainResistance(int typeID){
        resistances.add(typeID);
    }

    public void gainWeaknesses(int typeID){
        weaknesses.add(typeID);
    }

    public void gainType(int type){
        typeID.add(type);
    }

    public void loseType(int type){
        typeID.remove(type);
    }
}
