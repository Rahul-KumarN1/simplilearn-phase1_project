package sljava;

public class ImpPart implements One,Two{
	public void show() {
		
		One.super.show();
		Two.super.show();
		
	}


	public static void main(String[] args) {
		
			ImpPart test = new ImpPart();
			
			test.show();
		
	}

}
