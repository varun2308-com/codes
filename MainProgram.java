package program;

import entity.Product;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product(101, "Maggi Vegetable Noodles", 15);
		Product product5 = new Product(102, "Maggi Atta Noodles", 25);
		Product product6 = new Product(101, "Maggi Vegetable Noodles", 15);
		
		System.out.println(product1);
		System.out.println(product1.toString());
		System.out.println();
		System.out.println(product2);
		System.out.println(product2.toString());
		System.out.println();
		System.out.println(product3);
		System.out.println(product3.toString());
		System.out.println();
		System.out.println(product4);
		System.out.println(product4.toString());
		System.out.println();
		System.out.println(product5);
		System.out.println(product5.toString());
		System.out.println();
		System.out.println(product6);
		System.out.println(product6.toString());
				
		/*System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println(product3.hashCode());
		System.out.println(product4.hashCode());
		System.out.println(product5.hashCode());
		System.out.println(product6.hashCode());*/
		
		/*Product product = new Product(101, "Maggi Vegetable Noodles", 15);
		String name = product.toString();
		System.out.println(name);
		int hashCode = product.hashCode();
		System.out.println(hashCode);*/
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Product Name: ");
		String proName = scanner.nextLine();
		System.out.print("Enter Product ID: ");
		int proId = scanner.nextInt();
		System.out.print("Enter Product Price: ");
		double proPrice = scanner.nextDouble();
		
		Product product = new Product(proId, proName, proPrice);
		System.out.println("\nProduct Saved Successfully.");
		
		//VIEW THE DATA STORED IN THE OBJECT
		System.out.println("\nProduct Details:");
		
		System.out.println("Product ID: " + product.getId());
		System.out.println("Product Name: " + product.getName());
		System.out.println("Product Price: " + product.getPrice());*/
		
		/*int productId = product.getId();
		String productName = product.getName();
		double productPrice = product.getPrice();
		
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);*/
		
		//COMPARE VALUES STORED IN TWO OBJECTS 
		/*Product product1 = new Product(101, "Maggi Vegetable Noodles", 15);
		//Product product2 = new Product(102, "Maggi Atta Noodles", 25);
		//Product product2 = new Product(101, "Maggi Atta Noodles", 25);
		Product product2 = new Product(101, "Maggi Vegetable Noodles", 15);
		
		if ( (product1.getId() == product2.getId()) && 
			 (product1.getName().equals(product2.getName())) && 
			 (product1.getPrice() == product2.getPrice()) ) {
			System.out.println("Same product");
		} else {
			System.out.println("Different product");
		}*/
		
		/*int product1Id = product1.getId();
		int product2Id = product2.getId();
		
		String product1Name = product1.getName();
		String product2Name = product2.getName();
		
		double product1Price = product1.getPrice();
		double product2Price = product2.getPrice();
		
		if ( (product1Id == product2Id) && 
			 (product1Name.equals(product2Name)) && 
			 (product1Price == product2Price) ) {
			System.out.println("Same product");
		} else {
			System.out.println("Different product");
		}*/	
	}
}
		
		