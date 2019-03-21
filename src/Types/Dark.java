package Types;
import System.MType;
import java.util.ArrayList;

public class Dark extends MType{
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public Dark(boolean inUse){
        resistances.add(new Dark());
        weaknesses.add(new Light());
    }

    public Dark(){

    }


}
