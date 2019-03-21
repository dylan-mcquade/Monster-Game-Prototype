package Types;
import System.MType;
import java.util.ArrayList;

public class Earth extends MType{
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public Earth(boolean inUse){
        resistances.add(new Fire());
        resistances.add(new Electric());
        weaknesses.add(new Water());
        weaknesses.add(new Wind());
    }

    public Earth(){

    }
}
