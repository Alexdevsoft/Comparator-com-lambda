package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class CompareTest {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Smartphone", 2000.00));
		list.add(new Product("Fog�o", 400.00));
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
	
		
		
		for(Product p : list) {
			System.out.println(p);
		}
		

	}

}
