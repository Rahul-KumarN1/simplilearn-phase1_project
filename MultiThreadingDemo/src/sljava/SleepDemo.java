package sljava;

public class SleepDemo {
public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.print(e);
			}
		}
		// In this program,main thread goes into sleep mode.
		// All the outputs are generated after 1 second sleep.
		

	}

}
