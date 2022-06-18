package cars;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 5421541454L;
	boolean isPunctured = false;
	String bikeName = "Royal Enfield";
	double runningKM = 200.1232;
	public static void main(String[] args) {
	TwoWheeler Obj = new TwoWheeler(); 	
	System.out.println(Obj.noOfWheels);
	System.out.println(Obj.noOfMirrors);
	System.out.println(Obj.chassisNumber);
	System.out.println(Obj.bikeName);
	System.out.println(Obj.runningKM);
}
}
