public class AccountTest{
 	public static void main(String[] args){
		Account details = new Account();
		AirConditioner first = new AirConditioner();
		details.setName("James");
		first.setColor("Yellow");
	System.out.println( "My name is: "+ details.getName());
	System.out.println( "My AC color is: "+ first.getColor());
	}
}