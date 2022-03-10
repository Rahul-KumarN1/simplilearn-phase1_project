package sljava;

public class ThreadsCreation extends Thread {
public void run(){  
		
		for(int i=1;i<4;i++){  
		    try{
		    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		    
		    
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
		  // System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());  //what is current prirotiy of thread
		   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
		  // System.out.println("The thread group is:" + Thread.currentThread().getName()+ " :::" + Thread.currentThread().getThreadGroup()); // a group in whihc thread is assgined
		   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
		  // System.out.println("Is my thread Daemon or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon()); // this thread always run in background
		  } 
	}
		
		 public static void main(String args[]){  
		  
			 ThreadsCreation m1=new ThreadsCreation();  
			 ThreadsCreation m2=new ThreadsCreation();  
			 ThreadsCreation m3=new ThreadsCreation();
		  
		  m1.setName("IT");
		  m2.setName("Finance");
		  m3.setName("HR");
		 
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY); 
		  
		  //m2.setDaemon(true); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();
		 }

}
