package sljava;

public class TypeCast {

	public static void main(String[] args) {
		// TypeCasting are of two types
		//explicit and Implicit type
		byte d=20;
		int n=d;
		System.out.println("Implicit type from byte to int"+ n);
		int num=128;
		byte b=(byte)num;
		System.out.println("Explicit type from int to byte"+ b);
		

	}

}
