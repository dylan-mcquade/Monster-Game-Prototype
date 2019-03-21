package Attacks;
import System.Attack;
import Types.Water;

public class Waterjet extends Attack{
    public Waterjet(){
        super(false, true, "Waterjet", new Water(), 10, 10);
    }
}
