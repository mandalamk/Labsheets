import java.util.Scanner;

interface ServiceEmployee {
  
  public void setEmpDetails(Employee51 e);
  public void display(Employee51 e);
  public void setInsSch(Employee51 e);
}

public class Service51 implements ServiceEmployee{
	
	Scanner sc= new Scanner(System.in);
	int empId,salary;
	String name,designation;

	public void setEmpDetails(Employee51 e){
		System.out.println("Enter employee id : ");
		empId=sc.nextInt();
		e.setEmpId(empId);
		System.out.println("Enter employee name : ");
		name=sc.next();
		e.setName(name);
		System.out.println("Enter employee salary : ");
		salary=sc.nextInt();
		e.setSalary(salary);
		System.out.println("Enter employee designation : ");
		designation=sc.next();
		e.setDesignation(designation);	
		setInsSch(e);
	}
	
	public void setInsSch(Employee51 e){
		if(salary<40000)
			e.setInsSch("No Scheme");
		else if(salary>5000 && salary<20000)
			e.setInsSch("Scheme C");
		else if(salary<40000)
			e.setInsSch("Scheme B");
		else if(salary>40000)
			e.setInsSch("Scheme A");
	}
	
	public void display(Employee51 e){
		System.out.println("Employee details --->\n");
		System.out.println("Employee Name ---> "+e.getName());
		System.out.println("Employee Id ---> "+e.getEmpId());
		System.out.println("Employee Designation ---> "+e.getDesignation());
		System.out.println("Employee Salary ---> "+e.getSalary());
		System.out.println("Employee Insurance Scheme ---> "+e.getInsSch());
		
	}

}


	

