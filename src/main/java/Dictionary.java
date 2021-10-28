import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private String name;
    private Map<String, String> translations;
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

        traduc.add(s2);
        this.translations.put(s1,s2);

    }
    public String getTranslation(String s){
        return "against";

    }

}
