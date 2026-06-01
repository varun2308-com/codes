class Person {
	void speak() {
		System.out.println("I am a person");
	}
}

class Student extends Person {
	void study() {
		System.out.println("I am studying");
	}
	
	public static void main(String args[]) {
		Student s = new Student();
		s.speak();
		s.study();
	}
}