public class Account {
	
	private static long accNum=1;
	private double balance;
	private Person accHolder;
	
	public Account(double balance, String name, int age)
	{
		setAccNum(getAccNum() + 1);
		this.setBalance(balance);
		accHolder = new Person(name,age);
	}



	public int getAge()
	{
		return accHolder.getAge();
	}
	
	public void setAge(int age)
	{
		accHolder.setAge(age);
	}
	
	public static long getAccNum() {
		return accNum;
	}


	public static void setAccNum(long accNum) {
		Account.accNum = accNum;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt)
	{
		double bal = getBalance()+amt;
		setBalance(bal);
	}
	
	public void withdraw(double amt)
	{
		setBalance(getBalance()-amt);
	}


	public Person getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
}
