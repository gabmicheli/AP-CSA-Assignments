import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Assignment_4 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("Type the message to be shortened");
       String mess = scan.nextLine();
       int a = 0;
       int b = 0;
       int rep = 0;
       int vow = 0;
       String result = "";
       if (mess.length()< 10){
           System.out.print("This doesn't need shortening!");
       } else{
           mess = mess.toLowerCase();
           while (mess.length()>a){
               if (((a != 0) && (mess.charAt(a-1)!=' '))&&((mess.charAt(a) == 'a') || (mess.charAt(a) == 'e')||(mess.charAt(a) == 'i')||(mess.charAt(a) == 'o')||(mess.charAt(a) == 'u'))){
                   vow++;
                   result += mess.substring(b,a);
                   b = a+1;
               } else if ((a != 0) && (mess.charAt(a-1) == mess.charAt(a))){
                   rep ++;
                   result += mess.substring(b,a);
                   b = a+1;
               }
               a++;
           }
           if ((result.length()+vow+rep) != mess.length()){
               result += mess.substring(b);
           }

           System.out.println("Shortened message: "+result);
           System.out.println("Repeated letters removed: "+ rep);
           System.out.println("Vowels removed: "+ vow);
           System.out.println("Total characters saved: "+(vow+rep));
       }

    }
}
