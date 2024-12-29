package week13.strategy;

public class UpperCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}