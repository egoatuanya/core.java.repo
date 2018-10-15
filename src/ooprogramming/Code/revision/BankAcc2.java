package ooprogramming.Code.revision;
import java.util.Scanner;

public class BankAcc2
{
    private String pinnum;
    private double balance;
    private double withdraw;
    private double deposit;

    public BankAcc2(double balance)
    {
        this.pinnum = "7890";
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit= deposit;
    }
    public double accountDeposit(double deposit)
    {
        String mypin = getPin();
        if (mypin.equals(pinnum))
        {
            this.balance = balance + deposit;
            return this.balance;
        }
        else
        {
            return 0.0;
        }
    }

    public double accountWithdrawal(double withdraw)
    {
        String mypin = getPin();

            if (mypin.equals(pinnum)) {
                if (withdraw < balance) {
                    this.balance = balance - withdraw;
                    return this.balance;
                } else {
                    System.out.println("You have insufficient funds to make a withdrawal");
                    return 0.0;
                }
            }
            else
            {
                System.out.println("You have entered an incorrect pin number");
                return 0.0;

            }
        }


    public double accountBalance()
    {
        String mypin = getPin();
        if (mypin.equals(pinnum))
        {
            return balance;
        }
        else
        {
            return 0.0;
        }



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
            return "";
        }


    }
}
