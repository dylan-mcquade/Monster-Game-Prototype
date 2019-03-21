package Types;
import System.MType;
import java.util.ArrayList;

public class Electric extends MType{
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public Electric(boolean inUse){
        weaknesses.add(new Earth());
    }

    public Electric(){

    }
}
