package sample;

public class ThreadOperation implements Runnable {
	
	Thread thread;
	String thread_name;
	
	public ThreadOperation(String thread_name) {
		this.thread_name = thread_name;
	}

	@Override
	public void run() {
		
		for(int i=0; i< 4;i++) {
			try {
				thread.sleep(3000);
				System.out.println("Thread execution"+ i);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public void createThread() {
		thread = new Thread(this, thread_name);
		thread.start();
	}

}
