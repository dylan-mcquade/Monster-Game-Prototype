package Attacks;
import System.Attack;
import Types.Fire;

public class FireBall extends Attack {
    public FireBall(){
        super(false, true, "Fire Ball", new Fire(), 10, 10);
    }
}
