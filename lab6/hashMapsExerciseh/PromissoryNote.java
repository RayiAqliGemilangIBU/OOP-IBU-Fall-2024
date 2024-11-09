package lab6.hashMapsExerciseh;

import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> loans;

    public PromissoryNote(){
        loans = new HashMap<String, Double>();
    }

    public void setLoan(String key, double value){
        loans.put(key, value);
    }

    public double howMuchIsDebt ( String key){
        if(loans.containsKey(key)){
            return loans.get(key);
        }
        return 0;
    }

}
