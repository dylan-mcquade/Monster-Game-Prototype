package System;

public class Stats {
    private float baseAttack, baseDefense, baseMagicAttack, baseMagicDefense, baseSpeed, baseSkill,
                  totalAttack, totalDefense, totalMagicAttack, totalMagicDefense, totalSpeed, totalSkill;
    private int baseHealth, currentHealth;

    public Stats(){
        baseAttack = baseDefense = baseMagicAttack = baseMagicDefense = baseSpeed = baseSkill =
                totalAttack = totalDefense = totalMagicAttack = totalMagicDefense = totalSpeed = totalSkill = 0;
        currentHealth = baseHealth = 0;
    }

    public Stats(float attack, float defense, float magicAttack, float magicDefense, float speed, float skill, int health){
        baseAttack = attack;
        baseDefense = defense;
        baseMagicAttack = magicAttack;
        baseMagicDefense = magicDefense;
        baseSpeed = speed;
        baseSkill = skill;
        baseHealth = health;
    }

    //Million getters and setters
    public float getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(float baseAttack) {
        this.baseAttack = baseAttack;
    }

    public float getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(float baseDefense) {
        this.baseDefense = baseDefense;
    }

    public float getBaseMagicAttack() {
        return baseMagicAttack;
    }

    public void setBaseMagicAttack(float baseMagicAttack) {
        this.baseMagicAttack = baseMagicAttack;
    }

    public float getBaseMagicDefense() {
        return baseMagicDefense;
    }

    public void setBaseMagicDefense(float baseMagicDefense) {
        this.baseMagicDefense = baseMagicDefense;
    }

    public float getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(float baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public float getBaseSkill() {
        return baseSkill;
    }

    public void setBaseSkill(float baseSkill) {
        this.baseSkill = baseSkill;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public float getTotalAttack() {
        return totalAttack;
    }

    public void setTotalAttack(float totalAttack) {
        this.totalAttack = totalAttack;
    }

    public float getTotalDefense() {
        return totalDefense;
    }

    public void setTotalDefense(float totalDefense) {
        this.totalDefense = totalDefense;
    }

    public float getTotalMagicAttack() {
        return totalMagicAttack;
    }

    public void setTotalMagicAttack(float totalMagicAttack) {
        this.totalMagicAttack = totalMagicAttack;
    }

    public float getTotalMagicDefense() {
        return totalMagicDefense;
    }

    public void setTotalMagicDefense(float totalMagicDefense) {
        this.totalMagicDefense = totalMagicDefense;
    }

    public float getTotalSpeed() {
        return totalSpeed;
    }

    public void setTotalSpeed(float totalSpeed) {
        this.totalSpeed = totalSpeed;
    }

    public float getTotalSkill() {
        return totalSkill;
    }

    public void setTotalSkill(float totalSkill) {
        this.totalSkill = totalSkill;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
}
