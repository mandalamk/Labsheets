
class NumberThread extends Thread
{
	public void run(int n)
	{
		System.out.println(n);
	}
}

class Factorial extends Thread
{
	public void run(int n)
	{
		int fact=1;
		int x=n;
		
		while(x>0)
		{
			fact = fact*x;
			x--;
		}
		
		System.out.println(fact);
	}
}


public class FactorialThread83 {

	public FactorialThread83() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NumberThread nt = new NumberThread();
		Factorial f = new Factorial();
		
		while(true)
		{
			int n = (int)(Math.random()*10);
			nt.run(n);
			NumberThread.sleep(2000);
			f.run(n);
			Factorial.sleep(2000);

		}
		
		

	}

}
