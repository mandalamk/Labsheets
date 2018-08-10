import java.util.*;


class ExceptionExample extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ExceptionExample(String s)
	{
		super(s);
	}
}


public class MyException63{

	public void checkSalary(int salary) throws ExceptionExample
	{
		if(salary<3000)
		{
			throw new ExceptionExample("Less!");
		}
	}

	public static void main(String[] args)
	{
		MyException63 me = new MyException63();
		try{
			Employee51 e = new Employee51();
			e.setSalary(1000);
			me.checkSalary(e.getSalary());
			System.out.print("Good!");
		}
		catch(ExceptionExample e){
			System.out.print(e.getMessage());
		}
		
		
	}
}
