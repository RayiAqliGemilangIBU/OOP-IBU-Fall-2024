public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("how many row you want bro?");
    int n = input.nextInt();
    printInversPyramid(n);
}

public static void printInversPyramid(int num){
    for (int i = num; i > 0 ; i--){
        for (int j = 1; j < i ; j++ ){
            System.out.print("* ");
        }
    }
}
