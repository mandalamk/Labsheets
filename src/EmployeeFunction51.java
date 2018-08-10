import java.util.*;


public class EmployeeFunction51 {

	public static void main(String args[]) {
		Service51 s=new Service51();
		Employee51 e = new Employee51();
		System.out.println("Choose the option --> \n1.Enter Details\n2.Insurance Scheme\n3.Display");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i){
		case 1:s.setEmpDetails(e);
		break;
		case 2:s.setInsSch(e);
		break;
		case 3:s.display(e);
		break;
		default:
			System.out.println("Incorrect Input");
			
		sc.close();
		}
	}
}