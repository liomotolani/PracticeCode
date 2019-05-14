public class Security{
	private String firstName;
	private String lastName;
	private int securityId;
	private boolean openGate;
	private boolean sleepOnDuty;

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

	public void setSecurityId(int securityId){
		this.securityId = securityId;
	}

	public int getSecurityId(){
			return securityId;
	}
	
	public void setOpenGate( ){
		this.openGate = true;
	}

	public boolean getOpenGate(){
			return openGate;
	}
	public void setSleepOnDuty( ){
		this.sleepOnDuty = true;
	}

	public boolean getSleepOnDuty(){
			return sleepOnDuty;
	}




}