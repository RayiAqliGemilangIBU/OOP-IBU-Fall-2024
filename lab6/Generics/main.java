package lab6.Generics;

import java.util.List;

public class main {
    public static void main(String[] args) {

        List< Integer > integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List < Double > doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);

        sumOddEven.calculateNumberSum(integers);
        sumOddEven.calculateNumberSum(doubles);

        List < Integer > numbers = List.of(1, 2, 3, 4, 5, 6);
        List < String > colors = List.of("Red", "Green", "Orange");

        List < Integer > reversedNumbers = ReversedList.reverseList(numbers);
        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed numbers: " + reversedNumbers);

        List < String > reversedWords = ReversedList.reverseList(colors);
        System.out.println("\nOriginal list of colors: " + colors);
        System.out.println("Reversed colors: " + reversedWords);

    }





}
