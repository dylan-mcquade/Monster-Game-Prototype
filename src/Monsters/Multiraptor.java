package Monsters;
import Attacks.FireBall;
import Attacks.ShockJaw;
import Attacks.SlipstreamSmash;
import Attacks.Waterjet;
import System.Monster;
import System.TypeList;
import Types.Fire;

public class Multiraptor extends Monster{
    public Multiraptor(){
        super(10,10,10,10,10,10,10,new TypeList(new Fire()),
                new ShockJaw(), new FireBall(), new SlipstreamSmash(), new Waterjet());
    }
}
