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

	public static void main(String[] args){
	 Security first = new Security();

	 first.setFirstName("Olayinka");
	 first.setLastName("Oluwaseun");
	 first.setSecurityId(1);
	 first.setOpenGate();
	 first.setSleepOnDuty();

	System.out.printf("%s%n%s%n%d%n%s%n%s",first.getFirstName(),first.getLastName(),first.getSecurityId(),first.getOpenGate(),first.getSleepOnDuty());
	
	}








}