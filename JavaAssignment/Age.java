import java.util.*;
public class Age{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter first person age: ");
	int person1 = input.nextInt();
	
	System.out.println("Enter second person age: ");
	int person2 = input.nextInt();

	if(person1 > person2){
		System.out.println("The first person is the oldest");
		System.out.println("The second person is the youngest");
	}else if(person1 < person2){
		System.out.println("The first person is the youngest");
		System.out.println("The second person is the oldest");	
		}

	}
}