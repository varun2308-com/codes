class BookMain {
	public static void main(String args[]) {
		Book b1 = new Book();
		Book b2 = new Book("java", "varun");
		Book b3 = new Book("OOPS concepts", "varun", 500);
		
		b1.display();
		b2.display();
		b3.display();
	}
}