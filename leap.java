import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    	int year ;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("2016");
    	year = scan.nextInt();
    	scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println("  Leap Year.");
        else
            System.out.println("  not a Leap Year.");
    }
}
