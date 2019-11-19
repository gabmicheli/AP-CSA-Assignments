import java.util.Scanner;
import java.lang.Math;

/*
Seconds Since Unix Epoch:
999999999

Year: 2002
Month: 1
Day: 24
Hour: 1
Min: 46
Sec: 39


Seconds Since Unix Epoch:
178437

Year: 1970
Month: 0
Day: 2
Hour: 1
Min: 33
Sec: 57
 */

public class Assignment_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Seconds Since Unix Epoch");
        int sec = scan.nextInt();
        int sec_year = 31104000;
        int year = (int)(sec/sec_year);
        int mod_year = (int)(sec%sec_year);
        int sec_month = 2592000;
        int month = (int)(mod_year/sec_month);
        int mod_month = (int)(mod_year%sec_month);
        int sec_day = 86400;
        int day = (int)(mod_month/sec_day);
        int mod_day = (int)(mod_month%sec_day);
        int sec_hour = 3600;
        int hour = (int)(mod_day/sec_hour);
        int mod_hour = (int)(mod_day%sec_hour);
        int sec_min = 60;
        int min = (int)(mod_hour/sec_min);
        int mod_min = (int)(mod_hour%sec_min);
        sec = (int)(mod_min);
        year = year+1970;
        System.out.println("Year: "+year+ "\nMonth: "+month+"\nDay: "+day+"\nHour: "+hour+"\nMin: "+min+"\nSec: "+sec);

    }
}
