
class Timer extends Thread{
	
	//System.out.println("Timer woke up!");
	int i=0;
	
	public void run()
	{
		try {
			while(true)
			{
				System.out.println(i);
				Thread.sleep(10000);
				i+=10;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class Timer82 {

	public Timer82() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Timer start");
		Timer t = new Timer();
		t.start();
		
	}

}
