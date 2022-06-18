package cars;

public class Car {
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.applyBreak());
		System.out.println(obj.applyGear());
		System.out.println(obj.switchOnAc());
		obj.applyAcclerate();
	}
		public String applyBreak() {
		return "Break Applied";
	}
		public String applyGear() {
			return "Gear Applied";
		}
		public boolean switchOnAc() {
			return true;
	}
		public void applyAcclerate() {
			System.out.println("Acclerate Applied");
		}
}
