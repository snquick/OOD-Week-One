
public class Water extends TreatsDecorator {
	public Water(Ticket ticket) {
		this.ticket = ticket;
	}
 
	public String getDescription() { // Appends to the ticket object description
		return ticket.getDescription() + ", Water";
	}
 
	public double cost() {
		return 1.55 + ticket.cost();
	}
}
