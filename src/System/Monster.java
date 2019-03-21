package System;

public class Monster {
    private Stats stats = new Stats();
    private Buffs buffs = new Buffs();
    private Status status = new Status();
    private TypeList typeList = new TypeList();
    private AttackList attacks = new AttackList();

    public Monster(){
        stats = new Stats();
        buffs = new Buffs();
        status = new Status();
        typeList = new TypeList();
        attacks = new AttackList();
    }

    public Monster(float attack, float defense, float magicAttack, float magicDefense, float speed, float skill, int health,
                   TypeList typeList, Attack attack1, Attack attack2, Attack attack3, Attack attack4){
        stats = new Stats(attack, defense, magicAttack, magicDefense, speed, skill, health);
        this.typeList = typeList;
        buffs = new Buffs();
        status = new Status();
        attacks = new AttackList(attack1, attack2, attack3, attack4);
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
