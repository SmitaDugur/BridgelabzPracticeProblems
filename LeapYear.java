package BasicProgram;
import java.util.Scanner;

public class LeapYear {
   public static void main(String args[])
   {
   int year=0;
    System.out.println("Enter an Year :: ");
    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();

    if(year>=9999 && year<=1000) {
      System.out.println("you enter a four digit number"+year);
    }
    else
    {
      System.out.println("you are not entered digit number"+year);

    }

    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
       System.out.println(" year is a leap year");
    else
       System.out.println(" year is not a leap year");
     }
}


