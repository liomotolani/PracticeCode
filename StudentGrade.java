import java.util.*;
public class StudentGrade{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter student grade :");
		int grade = input.nextInt();
		if(grade>60){
		 System.out.println("Passed");
		}else{
			System.out.println("Failed");	
		}
	}
}