public class FootBaller{
	private String name;
	private String age;
	private String position;
	private String foot;
	
	public void setDetails(String name,String age,String position,String foot){
	this.name = name;
	this.age = age;
	this.position = position;
	this.foot = foot;
	}
	public String getDetails(){
	 return name + " " + age + " " + position + " " +foot;
	}
	
	public void running(){
	System.out.println("I can run");
	}
	
	public void kicking(){
	System.out.println("He Kicked the ball");
	}
	
	public void jumping(){
	System.out.println("He jumped");
	}
	
	public void tackling(){
	System.out.println("tackled");
	}
	
}