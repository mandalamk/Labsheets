import java.util.Random;



class CustomerThread extends Thread
{
	boolean gotProduct;
	public void run(BillingThread bt) throws InterruptedException
	{
		
		gotProduct = new Random().nextBoolean();
		
		if(gotProduct==true)
		{
			System.out.println("Customer has product!");
			Thread.sleep(500);
			State st = bt.getState();
			State w = State.TIMED_WAITING;
			if(st==w)
				bt.notify();
		}
		else{
			System.out.println("No product!");
			//System.out.println(6/0);
		}
	}

}

class BillingThread extends Thread{
	
	public void run(CustomerThread ct) throws InterruptedException
	{
		if(ct.gotProduct==true)
		{
			System.out.println("Billing done!");
			Thread.sleep(2000);
		}
		else{
			System.out.println("Billing Counter waiting!");
			new CustomerThread().start();
			Thread.sleep(2000);
		}
	}
	
}
public class ElectronicShop84 {

	public ElectronicShop84() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		while(true){
			BillingThread bt = new BillingThread();
			CustomerThread ct = new CustomerThread();
			ct.run(bt);
			bt.run(ct);
		}
		
	
	}

}
