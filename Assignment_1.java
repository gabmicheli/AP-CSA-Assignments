import java.util.Scanner;
import java.lang.Math;

/*
Please enter ratings from the movie review website.
75
99
10

Please enter ratings from the focus group.
84.5
92.3

Please enter the average movie critic rating.
87.42

Average website rating: 61.333333333333336
Average focus group rating: 88.4
Average movie critic rating: 87.42
Overall movie rating: 82.49666666666667
 */

public class Assignment_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter ratings from the movie review website.");
        int web1= scan.nextInt();
        int web2= scan.nextInt();
        int web3= scan.nextInt();
        System.out.println("Please enter ratings from the focus group.");
        double foc1= scan.nextDouble();
        double foc2= scan.nextDouble();
        System.out.println("Please enter the average movie critic rating.");
        double crit= scan.nextDouble();
        double ave1= ((double)(web1+web2+web3)/3);
        double ave2= (double) ((foc1+foc2)/2);
        double ave3= (double) crit;
        double tot= (double) (.2* ave1)+(.3* ave2)+(.5*ave3);
        System.out.println("Average website rating: "+ ave1);
        System.out.println("Average focus group rating: "+ ave2);
        System.out.println("Average movie critic rating: "+ ave3);
        System.out.println("Overall movie rating: "+tot);
    }
}
