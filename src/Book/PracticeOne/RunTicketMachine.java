package Book.PracticeOne;

public class RunTicketMachine
{
    public static void main (String [] args)
    {
        TicketMachine myTicket = new TicketMachine(2);
        myTicket.getBalance();
        myTicket.getPrice();
        myTicket.insertMoney(5);
        myTicket.printTicket();
    }
}
