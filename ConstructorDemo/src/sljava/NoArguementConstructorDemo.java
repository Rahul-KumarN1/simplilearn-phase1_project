package sljava;

class CompanyEmployee {
    int num;
    String name;
 
    CompanyEmployee() { System.out.println("Constructor called"); }
}
  
class DefaultConstructor {
    public static void main(String[] args)
    {
        
    	CompanyEmployee emp = new CompanyEmployee();
  
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(emp.name);
        System.out.println(emp.num);
    }



}
