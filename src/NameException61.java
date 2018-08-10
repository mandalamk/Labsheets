
public class NameException61 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NameException61() {
		super();
	}
	
	NameException61(String s)
	{
		System.out.println(s);
		System.out.println("NameException called!");
	}
	
	public void checkFname(String s) throws NameException61
	{
		if(s == null)
		{
			throw new NameException61("First name is empty!");
		}
	}
	public static void main(String[] args) {

		NameException61 ne = new NameException61();
		try{
			Person23 p = new Person23();
			ne.checkFname(p.getFname());
			System.out.println(p.getFname());
		}
		catch(NameException61 e){
			//System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Code over!");
		}
	}

}
