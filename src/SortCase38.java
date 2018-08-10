import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortCase38 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> a3 = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=n;
		while(i>-1)
		{
			String s="";
			s = sc.nextLine();
			al.add(s);
			i--;
		}
		
		Collections.sort(al);
		a3 = changeCase(al);
		System.out.println(a3);
		sc.close();
		
	}

	private static ArrayList<String> changeCase(ArrayList<String> al) {
		
		int size = al.size();
		ArrayList<String> a2 = new ArrayList<String>();
		int i;
		for(i=0;i<=size/2;i++)
		{
			a2.add(al.get(i).toUpperCase());
		}
		
		for(i=size/2+1;i<size;i++)
		{
			a2.add(al.get(i).toLowerCase());
		}
		return a2;
	}

}
