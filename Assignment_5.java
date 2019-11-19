import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How long do you want the array?");
        int loop = scan.nextInt();
        double ave = 0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        int great = 1;
        int less = 1;
        if (loop > 0) {
            double[] list = new double[loop];
            for (int i = 0; i <= (list.length - 1); i++) {
                System.out.println("Enter a number:");
                double num = scan.nextDouble();
                list[i] = num;
                ave += num;

                if (num > max) {
                    max = num;
                }
                if ((num < min)){
                    min = num;
                }
                if ((i >0)&&(list[i]<list[i-1])){
                    great = 0;
                }
                if ((i >0)&&(list[i]>list[i-1])){
                     less = 0;
                }

            }
            System.out.print("Your array is {");
            for (int i = 0; i < (list.length - 1); i++) {
                System.out.print(list[i] + ", ");

            }
            System.out.println(list[list.length-1]+"}");

            ave = ave/loop;
            System.out.println("The average is "+ave);
            System.out.println("The range is "+(max-min));
            if (great == 1){
                System.out.println("The array is sorted in increasing order");
            } else if (less == 1){
                System.out.println("The array is sorted in decreasing order");
            } else{
                System.out.println("The array is unsorted");
            }

        } else {
            System.out.println("Not a valid length!");
        }
    }
}
