package autoprojects;
import java.util.Scanner;

public class StringPractice
{
    public static void main(String[] args)
    {
        System.out.println("Enter the name of your county council");
        Scanner county = new Scanner(System.in);
        String countyname = county.nextLine();

        System.out.println(countyname.toUpperCase());
        System.out.println(countyname.toLowerCase());
        System.out.println("Enter the first three letters of your county");
        String check = county.nextLine();
        boolean printCounty = countyname.contains(check);
        System.out.println(printCounty);



    }
}
