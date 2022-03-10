package sljava;

public class JoinDemo extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("child thread:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			//child thread
		}
	}

	public static void main(String[] args) throws InterruptedException{
		
		JoinDemo jd=new JoinDemo();
		jd.start();
		jd.join();
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("main thread:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// first child thread executes and child thread is completed main thread joins him and starts being executed

	}

}
