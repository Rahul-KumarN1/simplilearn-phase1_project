package sljava;
class OuterClass {
	int a=5;
	 
    class InnerClass {
    	int b=7;
    	
    	public void run(){
    		System.out.println("Hello");
    	}

    }
}

public class InnerDemo {
	//Here we cannot have static method because inner class is implicit with outer class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.b+myOuter.a);
        myInner.run();
	}

}

