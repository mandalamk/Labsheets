
public class AgeException62 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException62(String m) {
		System.out.println(m);
		System.out.println("AgeException Called");
	}
	
	public AgeException62() {
		super();
	}

	public void checkAge(int age) throws AgeException62
	{
		if(age<15)
			throw new AgeException62("Error Occured!");
	}

	public static void main(String[] args) {
		
		AgeException62 ae = new AgeException62();
		try{
			Account t = new Account(0," ", 0);
			t.setAge(5);
			ae.checkAge(t.getAge());
			System.out.println("eligible!");
		}
		catch(AgeException62 e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Code ran!");
		}
	}

}
