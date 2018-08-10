class Person{
	
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.setName(name);
		setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}

public class TestingAccounts41
{
	public static void main(String[] args)
	{
		Account acc1 = new Account(2000,"smith",13);
		Account acc2 = new Account(3000,"Kathy",34);
		SavingsAcc42 sa = new SavingsAcc42(5000,"lkhv",56);
		acc1.deposit(2000);
		acc2.withdraw(1000);
		sa.withdraw(4500);
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getAge());
		System.out.println(acc2.getBalance());
		System.out.println(sa.getBalance());
		
		//System.out.print("done!");
		
	}
	
	
}