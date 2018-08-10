import java.util.*;

class Operations {

	public Operations() {
		// TODO Auto-generated constructor stub
	}

	
	public String ChangeCase(String s) {
		return s;
		// TODO Auto-generated method stub
		
	}


	public String RemoveDuplicates(String s) {
		
		String str="";
		//String s = new String(x);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				str+=s.charAt(i);
			}
			s = s.replace(s.charAt(i),' ');
		}
		return str;
		// TODO Auto-generated method stub
		
	}


	public String ReplaceOdd(String s) {
		return s;
		// TODO Auto-generated method stub
		
	}


	public String AddString(String s, String s2) {
		return s2;
		// TODO Auto-generated method stub
		
	}

}


public class OperationChoice31
{
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		n = sc.nextInt();
		Operations o = new Operations();
		switch(n)
		{
			case 1:
				o.AddString(s,s);
				break;
			case 2:
				o.ReplaceOdd(s);
				break;
			case 3:
				System.out.println(o.RemoveDuplicates(s));
				break;
			case 4:
				o.ChangeCase(s);
				break;
		}
		
		System.out.println("works!");
		sc.close();

	}

}

