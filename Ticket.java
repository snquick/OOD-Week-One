// The ticket class's main purpose is to create the description and cost objects 
public abstract class Ticket {
	String description = "Unknown";
	  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
