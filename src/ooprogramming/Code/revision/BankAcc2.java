package ooprogramming.Code.revision;
import java.util.Scanner;

public class BankAcc2
{
    private String pinnum;
    private int balance;
    private int withdraw;
    private int deposit;

    public BankAcc2(int balance)
    {
        this.pinnum = "7890";
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit= deposit;
    }

    public int accountBalance()
    {
        String mypin = getPin();

        return balance;
    }
    private String getPin()
    {
        System.out.println("Please enter your pin number");
        Scanner scan = new Scanner(System.in);
        String mypin = scan.nextLine();
        if(pinnum.equals(mypin))
        {
            System.out.println("Access granted");
            return pinnum;
        }
        else
        {
            System.out.println("Access denied, please enter your pin number againg");
        }


    }
}
