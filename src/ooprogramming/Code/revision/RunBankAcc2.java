package ooprogramming.Code.revision;

public class RunBankAcc2
{
    public static void main(String [] args)
    {
       BankAcc2 myaccount = new BankAcc2(4500);
       double initialbalance = myaccount.accountBalance();
       System.out.println(initialbalance);
       double mybalance = myaccount.accountWithdrawal(250.50);
       System.out.println(mybalance);
       double depositbalance = myaccount.accountDeposit(500);
       System.out.println(depositbalance);
    }
}
