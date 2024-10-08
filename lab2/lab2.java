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

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("input first Number = ");
    int fNum = input.nextInt();
    System.out.println("input second Number = ");
    int sNum = input.nextInt();
    int sum = 0;
    

    if (fNum > sNum){
        System.out.println("fNum");
    } else {
        while (fNum < (sNum-1)){
            fNum++;
            sum += fNum;
        }
    }

    System.out.println(sum);

}
 






}
