
public class SavingsAcc42 extends Account {

	public SavingsAcc42(double balance, String name, int age) {
		super(balance, name, age);
		// TODO Auto-generated constructor stub
	}

	private final double minBal = 1000;
	

	public double getMinBal() {
		return minBal;
	}

	public void withdraw(double amt)
	{
		if(getBalance()-amt<getMinBal())
		{
			System.out.println("Not Possible");
		}
		else
		{
			setBalance(getBalance()-amt);
		}
	}

}
