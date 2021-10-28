import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String name;
    Map<String, String> translations;


    public Dictionary(String name) {
        this.name = name;
        this.translations=new HashMap<>();
    }

    public String getName(){
        return this.name;
    }
    public boolean isEmpty(){
        return true;
    }
    public void addTranslation(String s1,String s2){


    }
    public String getTranslation(String s){
        return "against";

    }

}
