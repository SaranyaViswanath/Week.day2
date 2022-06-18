package cars;

public class MyCar {
			public static void main(String[] args) {
			Car newobj = new Car();
			System.out.println(newobj.applyBreak());
			System.out.println(newobj.applyGear());
			System.out.println(newobj.switchOnAc());
			newobj.applyAcclerate();
		}

}
