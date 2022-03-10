package sljava;

class Teacher
{ 
private void display() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 

public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher obj=new Teacher();
		obj.display();
		// Trying to access private method of another class
        // It will show a error that method display from the class Teacher is not visible.
	}

}
