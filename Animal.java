class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animal {
	void sound() {
		System.out.println("Meow");
	}
	
	public static void main(String args[]) {
		Animal a = new Cat();
		a.sound();
	}
}