package Monsters;
import Attacks.FireBall;
import Attacks.ShockJaw;
import Attacks.SlipstreamSmash;
import Attacks.Waterjet;
import System.Monster;

public class Multiraptor extends Monster{
    public Multiraptor(){
        super(10,10,10,10,10,10,10,1,
                new ShockJaw(), new FireBall(), new SlipstreamSmash(), new Waterjet());
    }
}
