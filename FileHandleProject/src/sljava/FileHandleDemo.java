package sljava;
import java.io.*;
class FileHandleDemo {
	 public static void appendStrToFile(String fileName,
             String str)
{

try {


BufferedWriter out = new BufferedWriter(
new FileWriter(fileName, true));
out.write(str);

out.close();
}
catch (IOException e) {

System.out.println("exception occurred" + e);
}
}
	 public static void main(String[] args) throws Exception
	    {
	        String fileName = ("E:\\GitProjects\\FileHandleProject\\Filehandle.txt");
	
	        try {
	            BufferedWriter out = new BufferedWriter(
	                new FileWriter(fileName));

	            out.write("Name created in the file \n");
	            out.close();
	        }
	        catch (IOException e) {
	            System.out.println("Exception Occurred" + e);
	        }
	        String str = "All the operations performed";
	        appendStrToFile(fileName, str);
	        try {
	            BufferedReader in = new BufferedReader(
	                new FileReader("E:\\GitProjects\\FileHandleProject\\Filehandle.txt"));
	 
	            String mystring;
	            while ((mystring = in.readLine()) != null) {
	                System.out.println(mystring);
	            }
	        }
	        catch (IOException e) {
	            System.out.println("Exception Occurred" + e);
	        }
	    }

}
