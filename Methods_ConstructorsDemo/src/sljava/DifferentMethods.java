package sljava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class DifferentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in); // HAS A reln
		
		System.out.println("Enter product price and percentage");
		
			double price =	scanner.nextDouble();
			double percentage = scanner.nextDouble();
			
			DifferentMethods  diff =  new DifferentMethods();
			
			System.out.println(diff.toString());
					
		//double discount =	diff.findDiscount(price);
			
			double   discount = diff.findDiscount(price, percentage);

				System.out.println("Your Discount Amoutn is Rs. "+discount);
				
				
			List<Employee> empList =	DifferentMethods.getListEmployees();
				
			System.out.println(empList);
		
	}
	

	
	public  double   findDiscount(double price) { // compile time polymorphism
												// or static polymorphism
		
		
			return     (price*10) / 100;
		
	}

	
	public  double   findDiscount(double price,double percentage) {
		
		
		return     (price*percentage) / 100;
	
}



	@Override   // runtime or dynamic polymorphism 
	public String toString() {
		return "This class overrides toString()";
	}
	
	public static List<Employee>  getListEmployees() {
		
				List<Employee>  list = new ArrayList<Employee>();
		
				list.add(new Employee(101, "tom", 9000));
				list.add(new Employee(102, "smith", 12000));
				list.add(new Employee(103,"ford",7000));
				
				
				return list;

	}

}
