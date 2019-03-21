package System;
import java.util.ArrayList;

public class AttackList {
    private ArrayList<Attack> attackList = new ArrayList<Attack>();

    public AttackList(){

    }

    public AttackList(Attack attack1, Attack attack2, Attack attack3, Attack attack4){
        attackList.add(attack1);
        attackList.add(attack2);
        attackList.add(attack3);
        attackList.add(attack4);
    }

    public void addAttack(Attack attack){
        attackList.add(attack);
    }
}
