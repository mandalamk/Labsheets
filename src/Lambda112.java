import java.util.Scanner;

@FunctionalInterface
interface StringSpace
{
	public String StringSpacer(String s);
}

public class Lambda112 {

	public Lambda112() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		StringSpace sp = (sring)->changer(sring);
		System.out.println(sp.StringSpacer(s));
		sc.close();

	}

	private static String changer(String s) {
		// TODO Auto-generated method stub
		String str="";
		
		for(int i=0;i<s.length();i++)
		{
			str = str + s.charAt(i)+" ";
		}
		
		return str;
		
	}

}
