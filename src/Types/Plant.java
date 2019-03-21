package Types;
import System.MType;
import java.util.ArrayList;

public class Plant extends MType{
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public Plant(boolean inUse){
        resistances.add(new Wind());
        resistances.add(new Water());
        weaknesses.add(new Fire());
        weaknesses.add(new Electric());
    }

    public Plant(){

    }
}
