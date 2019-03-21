package System;

public class Attack {
    private boolean physical, damaging;
    private String name;
    private MType type;
    private float damage, accuracy;

    public Attack(){
        physical = damaging = true;
        name = "";
        damage = accuracy = 0;
    }

    public Attack(boolean physical, boolean damaging, String name, MType type, float damage, float accuracy){
        this.physical = physical;
        this.damaging = damaging;
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.accuracy = accuracy;
    }

}
