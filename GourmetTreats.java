
public class GourmetTreats extends TreatsDecorator {
	public GourmetTreats(Ticket ticket) {
		this.ticket = ticket;
	}
 
	public String getDescription() { // Appends to the ticket object description
		return ticket.getDescription() + ", Gourmet Treat";
	}
 
	public double cost() {
		return 5.59 + ticket.cost();
	}

}
