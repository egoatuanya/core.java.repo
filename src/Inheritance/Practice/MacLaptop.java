package Inheritance.Practice;

import PracticeAccess.Laptop;

public class MacLaptop extends Laptop
{
    public static void main(String args [])
    {
        MacLaptop maclaptop = new MacLaptop();
        maclaptop.laptopModel = "EASDF";
        maclaptop.camera();
        System.out.println(maclaptop.laptopModel);
        System.out.println(maclaptop.laptopMake);
        System.out.println(maclaptop.laptopPrice);




    }
}
