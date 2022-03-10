package simplilearnjava;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFile {
	
	public static void main(String[] args) throws IOException
	 {
	 createFileUsingFileClass();
	 createFileUsingFileOutputStreamClass();
	 createFileIn_NIO();
	 }
	 private static void createFileUsingFileClass() throws IOException
	 {
	 File file = new File("E:\\GitProjects\\FileHandlingDemo\\file.txt");
	 
	 //Create the file
	 if (file.createNewFile()){
	 System.out.println("File is created!");
	 }else{
	 System.out.println("File already exists.");
	 }
	 FileWriter writer = new FileWriter(file);
	 writer.write("Test data");
	 writer.close();
	 }
	 private static void createFileUsingFileOutputStreamClass() throws IOException
	 {
	 String data = "Welcome to the world of Java";
	 FileOutputStream out = new FileOutputStream("E:\\GitProjects\\FileHandlingDemo\\file.txt");
	 out.write(data.getBytes());
	 out.close();
	 }
	 private static void createFileIn_NIO() throws IOException
	 {
	 String data = "Welcome to the world of Java";
	 Files.write(Paths.get("E:\\GitProjects\\FileHandlingDemo\\file.txt"), data.getBytes());
	 List<String> lines = Arrays.asList("1st line", "2nd line");
	 Files.write(Paths.get("file6.txt"),
	 lines,
	 StandardCharsets.UTF_8,
	 StandardOpenOption.CREATE,
	 StandardOpenOption.APPEND);
	 }

}
