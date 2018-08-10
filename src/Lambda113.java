@FunctionalInterface
interface getValues
{
	public boolean acceptableStrings(String user, String pass);
}

public class Lambda113 {

	public Lambda113() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getValues gv = (user,pass)->checking(user,pass);
		System.out.println(gv.acceptableStrings("admin","adin"));
		
	}

	private static boolean checking(String user, String pass) {
		return (user.equals("admin") && pass.equals("admin"));
	}

}
