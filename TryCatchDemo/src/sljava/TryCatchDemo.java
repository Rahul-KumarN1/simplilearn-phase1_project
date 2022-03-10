package sljava;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		  int b = 20;
		  try {
		   int fractionresult=b/a;;
		   System.out.println("This line will not be Executed");
		  } catch (ArithmeticException e) {
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println("End Of Operation");

	}

}
