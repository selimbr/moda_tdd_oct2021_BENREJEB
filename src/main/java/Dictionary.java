import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private String name;
    private Map<String,List<String>> translations;
    private List<String> traduc;


    public Dictionary(String name) {
        this.name = name;
        this.translations=new HashMap<>();
        this.traduc= new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }
    public boolean isEmpty(){
        return translations.isEmpty();
    }
    public void addTranslation(String s1,String s2){
        if(translations.containsKey(s1)){
            List<String> l= new ArrayList<>();
            l.add(s2);
            this.translations.put(s1,l);

        }
        else{
            List<String> l= new ArrayList<>();
            translations.put(s1,l);
        }
    }
    public String getTranslation(String s){
        return "against";

    }

    public List<String> getMultipleTranslation(String s1){
        return this.translations.get(s1);

    }
    public String getInverse(String s1){
        String s2= null;
        for(String key: this.translations.keySet()) {
             List<String> i = this.translations.get(key);
                if (i.contains(s1)) {
                    s2 = key;

                    break;
                }
        }

        return s2;
    }

}
