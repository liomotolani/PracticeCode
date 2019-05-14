public class Facilitator{
	private String firstName;
	private String lastName;
	private int facilitatorId;
	private boolean giveAssignment;
	private String askQuestion;
	private boolean giveLecture;
	private boolean getAssignment;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
			return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
			return lastName;
	}

	public void setFacilitatorId(int facilitatorId){
		this.facilitatorId = facilitatorId;
	}

	public int getFacilitatorId(){
			return facilitatorId;
	}
	
	public void setGiveAssignment( ){
		this.giveAssignment = true;
	}

	public boolean getGiveAssignment(){
			return giveAssignment;
	}
	public void setGiveLecture( ){
		this.giveLecture = true;
	}

	public boolean getGiveLecture(){
			return giveLecture;
	}
	public void setAskQuestion(String askQuestion ){
		this.askQuestion = askQuestion;
	}

	public String getAskQuestion(){
			return askQuestion;
	}

	







}