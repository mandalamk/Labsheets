import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ArrayRev71 {

	//static ArrayList<Integer> al = new ArrayList<Integer>();
	static TreeSet<Integer> al = new TreeSet<Integer>();
	public ArrayRev71() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Numbers: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		getReverse(arr);
		
		System.out.println(al);
		/*
		for(int i=0;i<arr.length;i++)
			System.out.println(al.get(i));
		*/
		sc.close();
			
	}

	private static void getReverse(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			String s = Integer.toString(arr[i]);
			String str = reverse(s);
			int num = Integer.parseInt(str);
			System.out.println(num);
			al.add(num);	
		}
		
		//Collections.sort(al);
	}

	private static String reverse(String s) {
		
		String str="";
		for(int i =s.length()-1;i>=0;i--)
		{
			str += s.charAt(i);
		}
		return str;
	}

}
