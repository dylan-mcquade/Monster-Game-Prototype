package System;

public class Status {
    //boolean: true = monster has status, false = normal
    private boolean burn, sleep, fatigue, poison;
    //int: charge is turns remaining until attack goes off, recharge is turns remaining until monster can attack again
    private int charge, recharge;

    //default constructor, no statuses.
    public Status(){
        burn = false;
        sleep = false;
        fatigue = false;
        poison = false;
        charge = 0;
        recharge = 0;
    }

    public Status(boolean burn, boolean sleep, boolean fatigue, boolean poison, int charge, int recharge) {
        this.burn = burn;
        this.sleep = sleep;
        this.fatigue = fatigue;
        this.poison = poison;
        this.charge = charge;
        this.recharge = recharge;
    }

    //Million getters and setters
    public boolean isBurn() {
        return burn;
    }

    public void setBurn(boolean burn) {
        this.burn = burn;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

    public boolean isPoison() {
        return poison;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getRecharge() {
        return recharge;
    }

    public void setRecharge(int recharge) {
        this.recharge = recharge;
    }
}
