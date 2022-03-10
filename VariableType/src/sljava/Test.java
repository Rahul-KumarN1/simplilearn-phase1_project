package sljava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1 = new Employee(101, "tom", 50000);
		
		System.out.println(emp1);
		Employee emp2 = new Employee(102, "ravi", 60000);
		
		System.out.println("emp2 "+emp2);
		
		System.out.println("emp1 "+emp1);

	}
	static {
		
		System.out.println("Before main static block");
	}

	}


