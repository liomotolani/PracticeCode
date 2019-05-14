public class ClassRoom{

	private int numberOfChair;
	private int numberOfAirConditioner;
	private String className;
	private boolean whiteScreen;
	private boolean whiteBoard;
	private int numberOfWhiteBoard;

	public void setNumberOfChair(int numberOfChair){
		this.numberOfChair = numberOfChair;
	}
	public int getNumberOfChair(){
		return numberOfChair;
	}
	
	public void setNumberOfAirConditioner(int numberOfAirConditioner){
		this.numberOfAirConditioner = numberOfAirConditioner;
	}
	public int getNumberOfAirConditioner(){
		return numberOfAirConditioner;
	}
	public void setClassName(String className){
		this.className = className;
	}
	public String getClassName(){
		return className;
	}
	public void setNumberOfWhiteBoard(int numberOfWhiteBoard){
		this.numberOfWhiteBoard = numberOfWhiteBoard;
	}
	public int getNumberOfWhiteBoard(){
		return numberOfWhiteBoard;
	}
	
	public void setWhiteScreen(){
		this.whiteScreen = true;
	}
	public boolean getWhiteScreen(){
		return whiteScreen;
	}
	
	public void setWhiteBoard(){
		this.whiteBoard = true;
	}
	public boolean getWhiteBoard(){
		return whiteBoard;
       }


}