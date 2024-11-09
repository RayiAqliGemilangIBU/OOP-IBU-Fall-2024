package lab6.hashMapsExerciseh;

import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }

    public String translate(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }else{
            return "Word not found";
        }
    }

    public void add(String word, String meaning){
        dictionary.put(word, meaning);
    }

    public int amountOfWords(){
        return dictionary.size();
    }

    public ArrayList<String> translationList(){

        ArrayList<String> translateList = new ArrayList<String>();
        for (String word : dictionary.keySet()){
            translateList.add(word + " = " + dictionary.get(word));
        }
        return  translateList;
    }

}
