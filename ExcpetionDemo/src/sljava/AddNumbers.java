package sljava;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		try {
			for (int i = 0; i < args.length; i++) {
				sum = sum + Integer.parseInt(args[i]); // a = a+b;
			}
		} catch (NumberFormatException e) {

			System.out.println(" not a number");
		} // a+ =b;
		finally {

			// code which mandatory to execute irrespective of exp
			// System.exit(0);
			System.out.println("finally block executed...");
			
			try {
				
				int num = 9/0;
			}catch(Exception e) {
				
				
			}
			finally {}
		}

		System.out.println(sum);

	}

}
