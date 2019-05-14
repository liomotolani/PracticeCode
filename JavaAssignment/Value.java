import java.util.*; 

public class Value{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter integer value: ");
	
	int anyInteger = input.nextInt();
	if(anyInteger > 0){
 		System.out.println("The value of m = " +anyInteger);
		System.out.println("The value of n = 1");

		} else if(anyInteger == 0){
 		System.out.println("The value of m = " +anyInteger);
		System.out.println("The value of n = 0");
		} else if(anyInteger < 0){
 		System.out.println("The value of m = " +anyInteger);
		System.out.println("The value of n = -1");
		}else{
			
			}
	}
}