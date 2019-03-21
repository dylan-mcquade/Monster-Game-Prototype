package Types;
import System.MType;
import java.util.ArrayList;

public class Water extends MType{
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public Water(boolean inUse){
        resistances.add(new Fire());
        weaknesses.add(new Plant());
        weaknesses.add(new Electric());
    }

    public Water(){

    }
}
