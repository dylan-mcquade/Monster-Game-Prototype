package System;

public class MType {
    private int typeID;
    private int[] weaknesses = new int[5];
    private int[] resistances = new int[5];

    public MType(int type){
        this.typeID = type;
        switch (type){
            case 1:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
            case 2:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
            case 3:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
            case 4:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
            case 5:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
            case 6:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
            case 7:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
            case 8:
                weaknesses[0] = 2;
                resistances[0] = 1;
                return;
             default:
                 System.out.println("Unknown type passed.");
                 return;
        }

    }
}
