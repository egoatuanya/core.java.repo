package ooprogramming.Code.revision;

public class RunBankAcc2
{
    public static void main(String [] args)
    {
        BankAcc2 myaccount = new BankAcc2(4500);
        int mybalance = myaccount.accountBalance();
        System.out.println(mybalance);
    }
}
