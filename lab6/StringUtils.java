package lab6;

public class StringUtils {
    public static boolean included(String word, String searched){
        word = word.toLowerCase();
        searched = searched.toLowerCase();
        return word.contains(searched);
    }
}
