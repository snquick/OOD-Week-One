
public class PeanutbutterTreat extends TreatsDecorator {
	public PeanutbutterTreat(Ticket ticket) {
		this.ticket = ticket;
	}
 
	public String getDescription() { // Appends to the ticket object description
		return ticket.getDescription() + ", Peanutbutter Treat";
	}
 
	public double cost() { // Adds this treat's cost to the total cost 
		return 3.50 + ticket.cost();
	}
}
