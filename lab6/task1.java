package lab6;

public class task1 {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 6, 11};
        System.out.println("smallest: " + smallest(values));

    }


    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array){
            if (i < smallest){
                smallest = i ;
            }
        }
        return smallest;
    }

}

