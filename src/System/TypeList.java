package System;
import java.util.ArrayList;
public class TypeList {
    private ArrayList<MType> types = new ArrayList<MType>();
    private ArrayList<MType> resistances = new ArrayList<MType>();
    private ArrayList<MType> weaknesses = new ArrayList<MType>();

    public TypeList(){

    }

    public TypeList(MType type1){
        types.add(type1);
        for (MType t : type1.getResistances()) {
            resistances.add(t);
        }
        for (MType t : type1.getWeaknesses()){
            weaknesses.add(t);
        }
    }

    public TypeList(MType type1, MType type2){
        types.add(type1);
        types.add(type2);
        for (MType t : type1.getResistances()) {
            resistances.add(t);
        }
        for (MType t : type1.getWeaknesses()){
            weaknesses.add(t);
        }        for (MType t : type2.getResistances()) {
            resistances.add(t);
        }
        for (MType t : type2.getWeaknesses()){
            weaknesses.add(t);
        }
    }

    public void addType(MType type){
        types.add(type);
        for (MType t : type.getResistances()){
            resistances.add(t);
        }
        for (MType t : type.getWeaknesses()){
            weaknesses.add(t);
        }
    }

    public void removeType(MType type){
        types.remove(type);
        for (MType t : type.getResistances()){
            resistances.remove(t);
        }
        for (MType t : type.getWeaknesses()){
            weaknesses.remove(t);
        }
    }

    public void addResistance(MType type){
        resistances.add(type);
    }

    public void addWeakness(MType type){
        weaknesses.add(type);
    }

    public void removeResistance(MType type){
        resistances.remove(type);
    }

    public void removeWeakness(MType type){
        weaknesses.remove(type);
    }

}
