package System;

public class Monster {
    private Stats stats = new Stats();
    private Buffs buffs = new Buffs();
    private Status status = new Status();

    public Monster(){
        stats = new Stats();
        buffs = new Buffs();
        status = new Status();
    }

    public Monster(float attack, float defense, float magicAttack, float magicDefense, float speed, float skill, int health){
        stats = new Stats(attack, defense, magicAttack, magicDefense, speed, skill, health);
        buffs = new Buffs();
        status = new Status();
    }

    public void updateStats(){
        stats.setTotalAttack(stats.getBaseAttack() + (stats.getBaseAttack()*buffs.getAttack()));
        stats.setTotalDefense(stats.getBaseDefense() + (stats.getBaseDefense()*buffs.getDefense()));
        stats.setTotalMagicAttack(stats.getBaseMagicAttack() + (stats.getBaseMagicAttack()*buffs.getMagicAttack()));
        stats.setTotalMagicDefense(stats.getBaseMagicDefense() + (stats.getBaseMagicDefense()*buffs.getMagicDefense()));
        stats.setTotalSpeed(stats.getBaseSpeed() + (stats.getBaseSpeed()*buffs.getSpeed()));
        stats.setTotalSkill(stats.getBaseSkill() + (stats.getBaseSkill()*buffs.getSkill()));
    }
}
