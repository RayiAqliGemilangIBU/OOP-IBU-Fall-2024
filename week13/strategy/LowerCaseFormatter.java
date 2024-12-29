package week13.strategy;

public class LowerCaseFormatter  implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}