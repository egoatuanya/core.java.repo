package ooprogramming;
import java.util.Scanner;



public class BarkingPrimaryTrust
{
    public static void main(String[] args)
    {


    AcademyTrust barking = new AcademyTrust();
    Scanner scan = new Scanner(System.in);
    System.out.println("Please, input the child's name");
    String barkingname = scan.nextLine();
    System.out.println("Please, enter the child's age");
    String barkingage = scan.nextLine();
    int barkingage2 = Integer.parseInt(barkingage);

    barking.details(barkingname,barkingage2);
}


}
