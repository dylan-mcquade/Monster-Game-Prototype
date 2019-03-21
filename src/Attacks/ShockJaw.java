package Attacks;
import System.Attack;
import Types.Electric;

public class ShockJaw extends Attack {
    public ShockJaw(){
        super(true, true, "Shock Jaw", new Electric(), 10, 10);
    }
}
