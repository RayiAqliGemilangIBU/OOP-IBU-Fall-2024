package lab6;


public class task3  {

    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

    }


    public static int indexOfTheSmallestStartingFrom (int[] array, int index){
        int smallest = array[index];
        int indexOfSmallest = index;

        for ( int i = index+1 ; i < array.length ; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i ;
            }
        }
        return indexOfSmallest;
    }
}


























