package ooprogramming.Code.revision;
import java.util.Scanner;

public class BankAcc
{
    private  String pinnum;
    private int balance;
    private int withdraw;
    private int deposit;
    private boolean isPinCorrect = true;

    public BankAcc()
    {
        this.pinnum = "5678";
        this.balance = 3000;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.isPinCorrect = isPinCorrect;
    }

        public void withdrawMoney()
        {
            System.out.println("Please enter your pin number");
            Scanner scan = new Scanner(System.in);
            String inputPin = scan.nextLine();
            if (inputPin.equals(pinnum)) {
                System.out.println("Please enter the amount you wish to withdraw");
                String withd = scan.nextLine();
                withdraw = Integer.parseInt(withd);
                if (withdraw <= balance) {
                    this.balance = balance - withdraw;
                    System.out.println("The balance on your account is " + this.balance);
                } else if (withdraw > balance) {
                    System.out.println("You do not have enough money in your account for this withdrawal");
                }
            }
            else
            {
                System.out.println("Please input the correct pin number");

            }


        }

        public void  depositMoney()
        {
            System.out.println("Please enter your pin number");
            Scanner scan = new Scanner(System.in);
            String inputPin = scan.nextLine();
            if(inputPin.equals(pinnum))
            {
                System.out.println("Please enter the amount you wish to deposit");
                String depo = scan.nextLine();
                deposit = Integer.parseInt(depo);
                this.balance = balance + deposit;
                System.out.println("The balance on your account is " + this.balance);
            }
            else
            {
                System.out.println("You have entered the incorrect pin, please try again");
            }

        }

    }

