//exp6.java

/* 1.Write a Java program that accepts two integers from the user and performs division. Handle the exception that occurs when the denominator is zero and display an appropriate error message. 

2. Write a Java program that accepts an index number from the user and prints the corresponding element from an array. Handle both invalid input and array index out of bounds exceptions using multiple catch blocks.

3.Write a Java program to demonstrate the use of try, catch, and finally blocks. Show that the finally block executes whether an exception occurs or not. 

4. Write a Java program to check voting eligibility. If the user’s age is less than 18, explicitly throw an exception using the throw keyword and handle it properly. 

5. Write a Java program to create a user-defined exception called InvalidAmountException. The program should simulate a bank withdrawal system and throw the custom exception when the withdrawal amount exceeds the account balance. */


//1 

// class division{
//     public static void main(String[] args) {
//         int numerator = 10;
//         int denominator = 0;
//         try {
//             int result = numerator / denominator;
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero. Please provide a non-zero denominator.");
//         }
//     }
// }

//2 
// import java.util.Scanner;
// import java.util.InputMismatchException;
// class index{
//     public static void main(String[] args){
//         //taking input from user
//         Scanner sc = new Scanner(System.in);
//         int[] arr = {10, 20, 30, 40, 50};
//         try {
//             System.out.print("Enter the index number: ");
//             int index = sc.nextInt();
//             System.out.println("Element at index " + index + ": " + arr[index]);
//         } 
//         catch (InputMismatchException e) {
//             System.out.println("Error: Invalid input.");
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Error: Index out of bounds.");
//         } 
//     }
// }


//3 
// import java.util.Scanner;
// class fin{
//     public static void main(String[] ar){
//         try{
//             System.out.println("Inside try block.");
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter a denominator: ");
//             int denominator = sc.nextInt();
//             int result = 10 / denominator; // This will cause an exception
//             System.out.println("Result: " + result);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Caught an exception: " + e.getMessage());
//         }
//         finally{
//             System.out.println("This will always execute.");
//         }
//     }
// }

//4 
// import java.util.Scanner;
// class Vote{
//     public static void main(String[] ar){
//         try{
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter your age: ");
//             int age = sc.nextInt();
//             if (age < 18) {
//                 throw new Exception("You are not eligible to vote.");
//             } 
//             else {
//                 System.out.println("You are eligible to vote.");
//             }
//         }
//         catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }


//5 
// import java.util.Scanner;
// class InvalidAmountException extends Exception {}
// class withdraw{
//     public static void main(String[] ar){
//         Scanner sc = new Scanner(System.in);
//         double bal = 1000.0;
//         System.out.print("Enter the withdrawal amount: ");
//         double withdraw = sc.nextDouble();
//         //user defined exception
//         try {
//             if (withdraw > bal) {
//                 throw new InvalidAmountException();
//             }
//             System.out.println("Withdrawal successful. Remaining balance: " + (bal - withdraw));

//         } catch (InvalidAmountException e) {
//             System.out.println("Error: Withdrawal amount exceeds account balance.");
//         }
//     }
// }
