package Book.PracticeOne;

public class TicketMachine
{
    //The price of a ticket from this machine
    private int price;
    //The amount of money entered by a customer so far.
    private int balance;
    //The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there are no checks to ensure this.
     */

    public TicketMachine(int cost)
    {
        this.price = cost;
        this.balance = 0;
        this.total = 0;
        // Return the price of a ticket.
    }
    public int getPrice()
    {
        return price;
    }
    /**
    Return the amount of money already inserted for the next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    /**
     * Print a ticket.
     * Update the total collected and reduce the balance to zero
     */
    public void printTicket()
    {
        //Simulate the printing of a ticket
        System.out.println("###############");
        System.out.println("# The Jubilee Line #");
        System.out.println("# Ticket # ");
        System.out.println(" # " + price + "pence. ");
        System.out.println("###############");
        System.out.println();

        //update the total collected with the balance.
        total = total+balance;
        //clear balance.
        balance = 0;
    }

}
