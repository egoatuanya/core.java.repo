package ooprogramming;
import java.util.Scanner;

public class DiffCars
{
    public static void main (String [] args)
    {
        Cars fordCar = new Cars();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the model of your car");
        String model = scan.nextLine();
        if(model.equalsIgnoreCase("Sylvester") )
        {
            fordCar.isAuto = true;
            fordCar.move();
        }
        //fordCar.chasisnum = 45678;
        //fordCar.make = "Sylvester";
        //fordCar.isAuto = true;
        //fordCar.modelnum = "SYL345";


        //fordCar.move();
    }
}
