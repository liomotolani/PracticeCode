
public class AirConditioner{
	private String color;
	private int weight;
	private String model;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getWeight(){
		return weight;
	}	

	public static void main(String[] args){
	AirConditioner type1 = new AirConditioner();//constructor is a method that helps you create a new class,
	AirConditioner type2 = new AirConditioner();//We invoke it to create a new object(type1 and type2). by using new AirConditional()

	type1.setColor("green");
	type2.setColor("brown");
	type1.setWeight(20);
    
	System.out.printf("%s%n%s%n%d",type1.getColor(),type2.getColor(),type1.getWeight());

			
	}
}