package Types;
import System.MType;
import java.util.ArrayList;

public class Fire extends MType{
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public Fire(boolean inUse){
        resistances.add(new Plant());
        weaknesses.add(new Water());
        weaknesses.add(new Earth());
    }

    public Fire(){

    }
}
