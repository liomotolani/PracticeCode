import java.util.*;

public class FootBallerDriver{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	FootBaller player1 = new FootBaller();

	System.out.println("Enter your name: ");
	 String theName = input.nextLine();

	System.out.println("Enter your age: ");
	 String theAge = input.nextLine();

	System.out.println("Enter your position: ");
	 String thePosition = input.nextLine();

	System.out.println("Enter your foot: ");
	 String theFoot = input.nextLine();

	player1.setDetails(theName, theAge, thePosition, theFoot);
	System.out.println(player1.getDetails());

	}
}