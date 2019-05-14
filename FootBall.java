public class FootBall{
	private String name;
	private int age;
	private String position;
	private String foot;
	private boolean run;
	private boolean kick;
	private boolean jump;
	private boolean tackle;
	
	public void setName(String name){
	this.name = name;
	}
	public String getName(){
	 return name;
	}
	public void setPosition(String position){
	this.position = position;
	}
	public String getPosition(){
	 return position;
	}
	public void setFoot(String foot){
	this.foot = foot;
	}
	public String getFoot(){
	 return foot;
	}
	public void setAge(int age){
	this.age = age;
	}
	public int getAge(){
	 return age;
	}
	public void running(){
	this.run = true;
	}
	public boolean running(){
		return run;
	}
	public void kicking(){
	this.kick = true;
	}
	public boolean kicking(){
		return kick;
	}
	public void jumping(){
	this.jump = true;
	}
	public boolean jumping(){
		return jump;
	}
	public void tackling(){
	this.tackle = true;
	}
	public boolean tackling(){
		return tackle;
	}
}