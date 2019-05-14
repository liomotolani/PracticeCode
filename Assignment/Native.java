public class Native{
	private String firstName;
	private String lastName;
	private int nativeId;
	private boolean submitAssignment;
	private boolean takeLecture;
	private boolean takeAssignment;

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

	public void setNativeId(int nativeId){
		this.nativeId = nativeId;
	}

	public int getNativeId(){
			return nativeId;
	}
	
	public void setTakeAssignment( ){
		this.takeAssignment = true;
	}

	public boolean getTakeAssignment(){
			return takeAssignment;
	}
	public void setTakeLecture( ){
		this.takeLecture = true;
	}

	public boolean getTakeLecture(){
			return takeLecture;
	}
	public void setSubmitAssignment( ){
		this.submitAssignment = true;
	}

	public boolean getSubmitAssignment(){
			return submitAssignment;
	}

	








}