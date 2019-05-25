
/**
 * TicketMachine models a ticket machine that issues flat-fare tickets.
 * The price of a ticket is specified via the contructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of montey, and will only print a ticket 
 * if enough money has been input.
 * 
 */
public class TicketMachine
{
    private int price;   // The price of a ticket from this machine.
    private int balance; // The amount of money entered by a customer so far.
    private int total;   // The total amount of money collected by this machine.

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Return the amount of money already inserted for the next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    /**
     * Receive an amount of money in cents from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount: " + amount);
        }
    }
    
    /**
     * Print a ticket if enough money has been inserted, and 
     * reduce the current balance by the ticket price. 
     * Print an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            //Simutate the printing of a ticket.
            System.out.println("#####################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("#####################");
            System.out.println();
            
            // Update the totl collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least: " + (price - balance) + " cents.");
        }
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int refund = balance;
        balance = 0;
        return refund;
    }
}
