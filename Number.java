import java.util.*;
public class Number{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		if(number > 0){
		System.out.println("Number is positive");	
		} else{
			System.out.println("Number is negative");
		}
	}
}