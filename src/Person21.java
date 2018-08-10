import java.util.*;

public class Person21 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name:");
		String fname = sc.nextLine();
		System.out.println("Enter Last name:");
		String lname = sc.nextLine();
		System.out.println("Enter Gender:");
		String gen = sc.nextLine();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		System.out.println("Enter weight:");
		int weight = sc.nextInt();

		System.out.println("Person Details \n");
		System.out.println("----------------- \n");
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
		System.out.println("Gender :"+gen);
		System.out.println("Age :"+age);
		System.out.println("Weight :"+weight);

	}
}
