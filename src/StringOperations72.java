import java.util.ArrayList;


public class StringOperations72 {

	//private String s1,s2;
	public StringOperations72() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Character> ReplaceAlt(String s1, String s2)
	{
		ArrayList<Character> al = new ArrayList<Character>();
		int i;
		
		for(i=0;i<s2.length();i++)
		{
			if(i%2==0)
				al.add(s1.charAt(i));
			else
				al.add(s2.charAt(i));
		}
		
		while(i!=s1.length())
		{
			al.add(s1.charAt(i));
			i++;
		}
		return al;
	}
	
	
	public String ReplaceLast(String s1, String s2)
	{
		String s="";
		if(s1.indexOf(s2) == s1.lastIndexOf(s2))
		{
			s = s1+s2;
		}
		else if(s1.contains(s2)==false){
			s = s1+s2;
		}
		
		String r = reverse(s2);
		s = s1.substring(0, s1.lastIndexOf(s2));
		s += r;
		s += s1.substring(s1.lastIndexOf(s2)+r.length());
		 
		return s;
	}
	
	
	public String DeleteOccurence(String s1, String s2)
	{
		String s="";
		
		if(s1.indexOf(s2) == s1.lastIndexOf(s2))
		{
			s = s1;
		}
		else if(s1.contains(s2)==false){
			s = s1;
		}
		
		s = s1.substring(0,s1.indexOf(s2)+s2.length()).replace(s2, "");
		
		return s;
	}
	
	public String AddHalf(String s1, String s2)
	{
		String s = "";
		
		s = s2.substring(0,(int)Math.ceil((double)s2.length())) + s1 + s2.substring((int)Math.ceil((double)s2.length())+1);
		return s;
	}
	
	public ArrayList<Character> replaceChar(String s1, String s2)
	{
		ArrayList<Character> al = new ArrayList<Character>();
		int i;
		for(i=0;i<s2.length();i++)
		{
			if(s2.contains(Character.toString(s1.charAt(i))))
			{
				al.add('*'); 
			}
			else{
				al.add(s1.charAt(i));
			}
		}
		
		while(i!=s1.length())
		{
			al.add(s1.charAt(i));
			i++;
		}
		
		return al;
	}
	
	private String reverse(String s2) {
		// TODO Auto-generated method stub
		String r="";
		
		for(int i=s2.length()-1;i>=0;i--)
			r +=s2.charAt(i);
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
