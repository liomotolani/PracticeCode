public class SemiColonVillage{
	public static void main(String[] args){

	ClassRoom first = new ClassRoom();

	 first.setNumberOfChair(30);
	 first.setNumberOfAirConditioner(2);
	 first.setClassName("ILU-IWED");
	 first.setNumberOfWhiteBoard(2);
	 first.setWhiteBoard();

	
	System.out.printf("%d%n%d%n%s%n%d%n%s%n%s",first.getNumberOfChair(),
	first.getNumberOfAirConditioner(),first.getClassName(),
	first.getNumberOfWhiteBoard(),first.getWhiteBoard(),first.getWhiteScreen());

	Facilitator second = new Facilitator();
	 second.setFirstName("Olayinka");
	 second.setLastName("Oluwaseun");
	 second.setFacilitatorId(1);
	 second.setAskQuestion("What is JAVA ?");
	 second.setGiveAssignment();

	System.out.printf("%s%n%s%n%d%n%s%n%s",second.getFirstName(),second.getLastName(),
	second.getFacilitatorId(),second.getAskQuestion(),second.getGiveAssignment());

	 Native third = new Native();

	 third.setFirstName("Olayinka");
	 third.setLastName("Oluwaseun");
	 third.setNativeId(1);
	 third.setTakeLecture();
	 third.setTakeAssignment();

	System.out.printf("%s%n%s%n%d%n%s%n%s%n%s",third.getFirstName(),third.getLastName(),third.getNativeId(),
	third.getSubmitAssignment(),third.getTakeAssignment(),third.getTakeLecture());

	Security fourth = new Security();

	 fourth.setFirstName("Olayinka");
	 fourth.setLastName("Oluwaseun");
	 fourth.setSecurityId(1);
	 fourth.setOpenGate();
	 fourth.setSleepOnDuty();

	System.out.printf("%s%n%s%n%d%n%s%n%s",fourth.getFirstName(),fourth.getLastName(),
	fourth.getSecurityId(),fourth.getOpenGate(),fourth.getSleepOnDuty());


}
}