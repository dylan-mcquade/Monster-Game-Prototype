package System;

public class Attack {
    private boolean physical, damaging;
    private String name;
    private int typeID;
    private float damage, accuracy;

    public Attack(){
        physical = damaging = true;
        name = "";
        typeID = 0;
        damage = accuracy = 0;
    }

    public Attack(boolean physical, boolean damaging, String name, int typeID, float damage, float accuracy){
        this.physical = physical;
        this.damaging = damaging;
        this.name = name;
        this.typeID = typeID;
        this.damage = damage;
        this.accuracy = accuracy;
    }

}
