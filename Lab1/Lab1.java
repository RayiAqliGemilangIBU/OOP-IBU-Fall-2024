//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

// 1. Create a program that prints your name to the screen.

// public class Main {
//    public static void main(String[] args){
//        System.out.println("My name is Rayi Aqli Gemilang");
//    }
// }

// 2. Create a program that prints out the following:
// (print hello world and new line)
//public class Main {
//    public static void main(String[] args){
//        System.out.println("hello world");
//        System.out.print(" (And all people of the world)");
//    }
//}

//3. Create a program that counts and displays how many seconds there are in
//    a year. You can assume that a year consists of 365 days
//    (therefore the year is not a leap year).

//public class Main{
//    public static void main(String[] args){
//        System.out.println("In a year, there are " + (365*24*60*60) + " seconds");
//    }
//}

//4.  Create a program that asks the user for two integers and then prints their sum.

//import java.util.Scanner;
//
//public class Main {
//
//
//
//    public static int SumOfTwo(int NumF, int NumS) {
//     return NumF + NumS;
//    }
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter first Number");
//        int NumF = input.nextInt();
//        System.out.print("Enter second Number");
//        int NumS = input.nextInt();
//
//        System.out.print("Sum of " + NumF + " and " + NumS + "= " + SumOfTwo(NumF, NumS));
//
//    }
//}

//5. Create a program that asks the user for a number and tells if the
//number is positive (i.e. greater than zero).

//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("input the number :");
//        int Num = input.nextInt();
//        if (Num > 0){
//            System.out.print(" That is positif number");
//        }
//        else{
//            System.out.print("That not positive number");
//        }
//
//    }
//
//}
//
//6.Create a program that asks the user for two numbers and prints the greater
//of those two. The program should also handle the case in which the two numbers
//are equal.

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("input first number");
//        int FNum = input.nextInt();
//        System.out.print("input second number");
//        int SNum = input.nextInt();
//        if (FNum == SNum){
//            System.out.print("Equal");
//        } else if (FNum > SNum){
//            System.out.print( "First > Second");
//        } else {
//            System.out.print( "Second > First");
//        }
//
//    }
//
//
//}
