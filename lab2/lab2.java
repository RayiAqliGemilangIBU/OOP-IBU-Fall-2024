import java.util.Scanner;
public class lab2 {
    
    // 1.Create a program that asks the user
    //  for a password. If the password is 
    //  right, a secret message is shown to 
    //  the user.



// public static void main(String[] args){

//     Scanner input = new Scanner(System.in);

//     String truePassword = "carrot";
//     boolean userStatus = false;

//     while (userStatus==false){


//         System.out.println("Enter the password bro:");
//         String userInput = input.nextLine();

        
//         if (userInput.equals(truePassword)){
//             System.out.print("true jirrr");
//             System.out.println("Secret message is = geda gedi sigma ");
//             userStatus = true;
//         } else {
//             System.out.print("Wrong password bro");
    
//         }

//     }


// }

// 2.Create a program that asks the user for three numbers and then prints their sum.

// public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     int numOfNumbers = 3;
//     int sum = 0;
//     while ( numOfNumbers!= 0){
//         System.out.println("Enter number =");
//         int userNumber = input.nextInt();
//         sum += userNumber;
//         numOfNumbers--;
//     }
//     System.out.println("Sum of your numbers = "+ sum);
// }

// 3. Create a program that reads numbers from the user and prints their sum. The program should stop asking
//  for numbers when the user enters the number 0. 

// public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     int sum = 0;
//     int userNumber = -1;
    
//     while(userNumber != 0){
//         System.out.println("Enter number broooooo =");
//         userNumber = input.nextInt();
//         sum += userNumber;
//     }
//     System.out.println("Sum of your numbers = "+ sum);
// }

// 4. Create a program that asks the user for the first
//  number and the last number and then prints all numbers
//   between those two. Use a while loop.
// If the first number is greater than the last number, the 
// program prints those numbers. 

// public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.println("input first Number = ");
//     int fNum = input.nextInt();
//     System.out.println("input second Number = ");
//     int sNum = input.nextInt();
//     int sum = 0;
    

//     if (fNum > sNum){
//         System.out.println("fNum");
//     } else {
//         while (fNum < (sNum-1)){
//             fNum++;
//             sum += fNum;
//         }
//     }

//     System.out.println(sum);

// }
 
// 5. Create a program that calculates the sum of 
// 20+21+22+...+2n, where n is a number entered by the user. 
// The notation 2i means raising the number 2 to the power of i,
//  for example 24 = 2*2*2*2 = 16. In Java we cannot write ab
//   directly, but instead we can calculate the power with the 
//    Math.pow(number, power). Note that the command returns a 
//    number of double types (i.e. floating point number). A double 
//    can be converted into the int type (i.e. whole number) as
//     follows: int result = (int)Math.pow(2, 3). This assigns 
//     the value of 23 to the variable result. 

// public static void main (String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.println("wahat sum 2^n that you want ? ");
//     int n = input.nextInt();
//     System.err.println(sum(n));

// }

// public static int sum(int number){
//     int result = ((int)(Math.pow(2, (number+1))) -1);
//     return result;
// }



// or using while loop

// public static void main (String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.println("wahat sum 2^n that you want ? ");
//     int n = input.nextInt();
//     int sum = 1;
//     while ( n > 0){
//         sum += (int)(Math.pow(2, n));
//         n--;
//     }
//     System.out.println(sum);
// }


//6.  Create a method printText that prints the following
// string of characters: "In the beginning there were the
// swamp, the hoe and Java." and a line break.  Users should
// be able to enter  how many times the text should be printed.

// public static void main (String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.println("how many line that u want? ");
//     int n = input.nextInt();
//     printText(n);
// }

    

//     public static void printText(int num){
//         while (num!= 0) {

//             System.out.println("In the beginning there were the // swamp, the hoe and Java.");
//             num--;
//         }
//     }


// }

// 7. Create a method called drawStarsPiramid that will
//  accept the number of rows as a parameter and print
//   a half pyramid shape where the number of rows will 
//   be dictated by the sent parameter. 

// public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.println("How many rows do you want, bro?");
//     int n = input.nextInt();
//     drawStarsPiramid(n);
// }

// public static void drawStarsPiramid(int num) {
//     for (int i = 1; i <= num; i++) {  
//         for (int j = 1; j <= i; j++) { 
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }


// 8. Write a program to print the inverted half pyramid shape as shown in the image below?
// public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.println("how many row you want bro?");
//     int n = input.nextInt();
//     printInversPyramid(n);
// }

// public static void printInversPyramid(int num){
//     for (int i = num; i > 0 ; i--){
//         for (int j = 0; j < i ; j++ ){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }

// 9. Create a method called drawStarsPiramid that will
//  accept the number of rows as a parameter and print
//   a half pyramid shape where the number of rows will 
//   be dictated by the sent parameter. 

// public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.println("How many rows do you want, bro?");
//     int n = input.nextInt();
//     numPiramid(n);
// }

// public static void numPiramid(int num) {
//     for (int i = 1; i <= num; i++) {  
//         for (int j = 1; j <= i; j++) { 
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }

// 10.In this exercise, you need to create a guess
//  number game. The user enters  a number, which is
//   in the range 0 to 100 (both 0 and 100 are possible).
//     Then the user has the chance to guess once, what 
//     the number is. The program should print 
//     "The number is lower", "The number is greater" 
//     or "Congratulations, your guess is correct!" 
//     depending on the number the user typed. 
//     The guessing should be made repeatedly until 
//     the user types the right number. The program 
//     also needs to include a variable of type int, 
//     which is used to count the guesses the user has
//      made. The program should always print the 
//      number of guesses along with the answer. In the 
//      end your game should look like this:

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Guess the nummber");
    int guess = input.nextInt();
    guessNum(guess);

    

    
}
public static void guessNum(int num) {
    Scanner input = new Scanner(System.in);
    int numTrue = 56;
    int numTry = 0;
    boolean guessStatus = false;

    while (!guessStatus) {
        numTry++;
        if (num < numTrue) {
            System.out.println("Try bigger, bro.");
        } else if (num > numTrue) {
            System.out.println("Try smaller, bro.");
        } else {
            System.out.println("You got it, bro!");
            System.out.println("You tried " + numTry + " times.");
            guessStatus = true;
        }
        
       
        if (!guessStatus) {
            System.out.println("Guess again:");
            num = input.nextInt();
        }
    }
}


}