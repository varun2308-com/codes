class Battery {
	void charging() {
		System.out.println("Battery charging...");
	}
}

class Mobile {
	Battery b = new Battery();
	
	void powerOn() {
	b.charging();
	System.out.println("Mobile is ON");
	}
	
	public static void main(String args[]) {
		Mobile m = new Mobile();
		m.powerOn();
	}
}