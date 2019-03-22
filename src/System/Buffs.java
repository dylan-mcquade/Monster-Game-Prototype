package System;

public class Buffs {
    private float attack, defense, magicAttack, magicDefense, speed, skill;

    public Buffs(){
        attack = defense = magicAttack = magicDefense =  speed = skill = 0;
    }

    //Million getters and setters
    public float getAttack(){
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public float getDefense() {
        return defense;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public float getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(float magicAttack) {
        this.magicAttack = magicAttack;
    }

    public float getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(float magicDefense) {
        this.magicDefense = magicDefense;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSkill() {
        return skill;
    }

    public void setSkill(float skill) {
        this.skill = skill;
    }
}
