class Book {
	String title;
	int pages;
	
	Book() {
		title = "Varun";
		pages = 100;
	}
	
	Book(String t, int p) {
		title = t;
		pages = p;
	}
	
	public static void main(String args[]) {
		Book b1 = new Book();
		Book b2 = new Book("java",450);
		
		System.out.println(b1.title + " - " + b1.pages);
		System.out.println(b2.title + " - " + b2.pages);
	}
}