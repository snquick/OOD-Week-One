/* Developer: Stephanie Quick
 * Program: Dog Theater (Decorator Pattern)
 * Description: Bring your dog to the Dog Theater! Pamper your pup to the fullest with gourmet dog treats
 * and 4K movies of cats being chased. 
 * Date: September 3 2020  */

public class DogTheater {
	public static void main(String[] args) {
		System.out.println("          ********************************************************************");
		System.out.println("Welcome to the Gourmet Dog Theater! Bring your puppers for a 4K action film and gourmet treats!");
		System.out.println("          ********************************************************************");
		System.out.println(" ");
		
		// prints out first receipt 
		Ticket ticket = new BigDoggo();
		ticket = new Water(ticket); // adding the water object to the ticket 
		ticket = new GourmetTreats(ticket);
		System.out.println("Receipt #1: " + ticket.getDescription() + " = "
				+ " $" + ticket.cost());
 
		// receipt #2
		Ticket ticket2 = new Puppy();
		ticket2 = new Water(ticket2);
		ticket2 = new Human(ticket2);
		ticket2 = new PeanutbutterTreat(ticket2);
		System.out.println("Receipt #2: " + ticket2.getDescription() + " = " 
				+ " $" + ticket2.cost());
		
		// receipt #3
		Ticket ticket3 = new BigDoggo();
		ticket3 = new Water(ticket3);
		System.out.println("Receipt #3: " + ticket3.getDescription() + " = " 
				+ " $" + ticket3.cost());
		
		// receipt #4
		Ticket ticket4 = new BigDoggo();
		ticket4 = new Human(ticket4);
		ticket4 = new PeanutbutterTreat(ticket4);
		System.out.println("Receipt #4: " + ticket4.getDescription() + " = " 
				+ " $" + ticket4.cost());
	}

}
