import java.util.Scanner;
import java.lang.Math;
/*
Welcome. What is your name?
Jane Doe
Hello Jane Doe. Try your best to crack the code!

PHASE 1
Enter a number:
3
Correct!

PHASE 2
Enter a number:
40
Correct!

PHASE 3
Enter a number:
6
Correct!
You have cracked the code!
 */
public class Assignment_3 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("Welcome. What is your name?");
       String name = scan.nextLine();
       System.out.println("Hello "+ name +". Try your best to crack the code!");
       System.out.println("\nPHASE 1\n" + "Enter a number:");
       int one = scan.nextInt();
       if (one == 3){
           System.out.println("Correct!");
           System.out.println("PHASE 2\n" + "Enter a number:");
           int two = scan.nextInt();
           if ((two == 1)||((two >= 33)&&(two <=100))){
               System.out.println("Correct!");

               System.out.println("PHASE 3\n" + "Enter a number:");
               int three = scan.nextInt();
               if (((three % 3 == 0)||(three % 7 == 0))&&(three > 0)){
                   System.out.println("Correct!");
                   System.out.println("You have cracked the code!");

               } else {
                   System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
               }
           } else {
               System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
           }
       } else {
            System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
       }

    }
}
