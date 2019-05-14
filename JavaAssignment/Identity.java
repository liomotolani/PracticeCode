import java.util.*;
public class Identity{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter gender: ");

	int gender = input.nextInt();
	
	if(gender == 1){
			System.out.println("Woman");
		}
		else{
			System.out.println("Man");
		}
	}	
}