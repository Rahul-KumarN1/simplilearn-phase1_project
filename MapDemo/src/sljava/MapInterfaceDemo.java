package sljava;
import java.util.*;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> emp
        = new HashMap<String, Integer>();

    emp.put("Ram",(100));
    emp.put("Raju",(200));
    emp.put("Ratnesh",(300));
    emp.put("Ranjan",(400));

    
    for (Map.Entry<String, Integer> details :
         emp.entrySet()) {

        System.out.print(details.getKey() + ":");
        System.out.println(details.getValue());
    }
}

	

}
