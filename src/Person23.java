
public class Person23 {
	
	private String fname;
	private String lname;
	private char gen;
	
	
	Person23()
	{

	}
	
	Person23(String fname, String lname, char gen)
	{
		this.fname = fname;
		this.lname = lname;
		this.gen = gen;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	
	
}
