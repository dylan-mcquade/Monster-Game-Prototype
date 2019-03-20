package System;

import java.util.ArrayList;
import java.util.List;

public class Type {
    String name = "";
    private List<String> weaknesses = new <String>ArrayList();
    private List<String> resistances = new <String>ArrayList();

    public Type(){
        weaknesses = new <String>ArrayList();
        resistances = new <String>ArrayList();
        name = "";
    }
}
