public class Car{
	private String color;
	private int length;
	private boolean hasWheel;
	private boolean isBus;
	private String model;
	private int numberOfWheel;
	
	public void setColor(String color){
		this.color = color;	
	}
	public String getColor(){
		return color;
	}
	public void setLength(int length){
		this.length = length;
	}
	public int getLength(){
		return length;
	}
	public boolean isHasWheel(){ 
		return hasWheel;
	}
	public void setHasWheel(){
		this.hasWheel = true;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	public void setNumberOfWheel(int numberOfWheel){
		this.numberOfWheel = numberOfWheel;
	}
	public int getNumberOfWheel(){
		return numberOfWheel;
	}

	public static void main(String[] args){
	Car bmw = new Car();
	Car toyota = new Car();
	bmw.setColor("Red");
	bmw.setLength(25);
	bmw.setModel("LX");
	bmw.setNumberOfWheel(4);
	bmw.setHasWheel();

	toyota.setColor("Red");
	toyota.setLength(25);
	toyota.setModel("LX");
	toyota.setNumberOfWheel(4);

	System.out.println("The bmw car has the following properties : ");
	System.out.printf("%s%n%d%n%s%n%d%n%s%n",bmw.getColor(),bmw.getLength(),bmw.getModel(),bmw.getNumberOfWheel(),bmw.isHasWheel());
	

	System.out.println("The toyota car has the following properties : ");
	System.out.printf("%s%n%d%n%s%n%d%n%s",toyota.getColor(),toyota.getLength(),toyota.getModel(),toyota.getNumberOfWheel(),toyota.isHasWheel());
	
	}

}














