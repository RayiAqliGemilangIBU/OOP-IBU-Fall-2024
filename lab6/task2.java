package lab6;

public class task2 {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 6, 11};
        System.out.println("Index of smallest: " + indexOfSmallest(values));
}

public static int indexOfSmallest (int[] array){
    int smaallest = array[0];
    int IndexOfSmallest = 0;
    for (int i = 1; i < array.length; i++) {
        if (array[i] < smaallest)
            IndexOfSmallest = i;
    }
    return IndexOfSmallest;
}
}

