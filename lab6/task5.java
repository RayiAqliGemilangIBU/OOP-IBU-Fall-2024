package lab6;
import java.util.Scanner;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));


    }



}

class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;


            if (array[mid] == searchedValue) {
                return true;
            }


            if (array[mid] > searchedValue) {
                last = mid - 1;
            } else {

                first = mid + 1;
            }
        }


        return false;
    }
}