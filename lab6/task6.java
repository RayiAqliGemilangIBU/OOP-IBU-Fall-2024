package lab6;

public class task6 {
public static void main(String[] args) {
    int[] array = {5, 1, 3, 4, 2};
    printElegantly(array);
}
    public static void printElegantly(int[]array) {
        for (int i=0; i < array.length ; i++ ) {
            if (i==array.length-1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
    }
}