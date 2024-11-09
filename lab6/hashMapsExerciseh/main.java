package lab6.hashMapsExerciseh;

import java.util.*;

public class main {
    public static void main(String[] arry){
        HashMap<String, String> names = new HashMap<String, String> ();

        names.put("matt", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");


        System.out.println(names.get("mikael"));


        PromissoryNote mattisNote = new PromissoryNote();

        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        mattisNote.setLoan("Arto", 11.5);

        System.out.println(mattisNote.howMuchIsDebt("Arto"));
        System.out.println(mattisNote.howMuchIsDebt("Joel"));


        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();

        for(String translation: translations){
            System.out.println(translation);
        }

        String input = "translate\n" + "monkey\n"  +
                "translate\n" + "cheese\n" +
                "add\n"  + "cheese\n" + "juusto\n" +
                "translate\n" + "cheese\n" +
                "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary2 = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary2);
        ui.start();
    }



}
