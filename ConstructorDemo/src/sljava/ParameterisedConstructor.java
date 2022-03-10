package sljava;

import java.io.*;


class ComEmployee {

 String name;
 int id;

 ComEmployee(String name, int id)
 {
     this.name = name;
     this.id = id;
 }
}


class ParameterConstructor {

 public static void main(String[] args)
 {
     
	 ComEmployee emp = new ComEmployee("Rahul", 25);
     System.out.println("EmployeeName :" + emp.name
                        + " and EmployeeID :" + emp.id);
 }
}
