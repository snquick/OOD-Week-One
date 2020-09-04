public class Human extends TreatsDecorator{
	public Human(Ticket ticket) {
		this.ticket = ticket;
	}
 
	public String getDescription() {
		return ticket.getDescription() + ", Human";
	}
 
	public double cost() {
		return 2.49 + ticket.cost();
	}
}
