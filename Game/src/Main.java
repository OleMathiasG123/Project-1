import javax.swing.JFrame;



	public class Main implements Runnable {

		private static final long serialVersionUID = 1L;
		 boolean Running =false;
static Thread thread;
		public static void main(String[]args) {
				thread =new Thread();
		}

		
		public void run() {
			while (Running){
				
			}
		}
		
		public synchronized void Start() {
		
			thread.start();
		}
		@SuppressWarnings("deprecation")
		public synchronized void Stop() {
thread.stop();			
		}
			
		}
	