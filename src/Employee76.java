import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Employee76 extends Service51 implements EmployeePortal{
	
	private static HashMap<Integer,Employee51> hm = new HashMap<Integer,Employee51>();
	
	/* (non-Javadoc)
	 * @see EmployeePortal#addEmployee(Employee51)
	 */
	@Override
	public void addEmployee(Employee51 e)
	{
		setEmpDetails(e);
		hm.put(e.getEmpId(),e);
	}
	
	/* (non-Javadoc)
	 * @see EmployeePortal#getDetails(Employee51)
	 */
	@Override
	public void getDetails(Employee51 e)
	{
		/*
		System.out.println((e.getName()));
		System.out.println(e.getEmpId());
		System.out.println(e.getDesignation());
		System.out.println(e.getSalary());
		System.out.println(e.getInsSch());
		*/
		display(e);
	}
	
	/* (non-Javadoc)
	 * @see EmployeePortal#getByScheme(java.lang.String)
	 */
	@Override
	public void getByScheme(String s)
	{
		Iterator<Entry<Integer, Employee51>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,Employee51> pair = (Map.Entry<Integer,Employee51>)it.next();
			if(pair.getValue().getInsSch() == s)
			{
				getDetails(pair.getValue());
			}
		}
		
		
	}
	
	/* (non-Javadoc)
	 * @see EmployeePortal#removeEmployee(Employee51)
	 */
	@Override
	public void removeEmployee(Employee51 e)
	{
		hm.remove(e.getEmpId());
	}
	
	/* (non-Javadoc)
	 * @see EmployeePortal#sorting(java.util.Map)
	 */
	@Override
	public ArrayList<Employee51> sorting(Map<? extends Integer, ? extends Employee51> map)
	{
		ArrayList<Employee51> list = new ArrayList<Employee51>(map.values());
		
		

		Collections.sort(list, new Comparator<Employee51>()
				{
					public int compare(Employee51 e1, Employee51 e2)
					{
						return e1.getSalary()-e2.getSalary();
					}
				});
		
		return list;
	}
		
	private void displayAL(ArrayList<Employee51> al) {
		
		Iterator<Employee51> it = al.iterator();
		
		while(it.hasNext())
		{
			getDetails(it.next());
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		EmployeePortal es = new Employee76();
		Employee51 e1 = new Employee51();
		//Employee51 e2 = new Employee51();
		//Employee51 e3 = new Employee51();
		ArrayList<Employee51> al = new ArrayList<Employee51>();
		
		es.addEmployee(e1);
		System.out.println(e1.hashCode());
		//es.addEmployee(e2);
		//System.out.println(e2.hashCode());
		//es.addEmployee(e3);
		//System.out.println(e3.hashCode());
		es.getDetails(e1);
		//System.out.println(hm.size());
		//System.out.println("by scheme");
		//es.getByScheme("Scheme A");
		//es.removeEmployee(e2);
		//System.out.println(hm.size());
		//System.out.println("sorted");
		//al = es.sorting(hm);
		//es.displayAL(al);
	}


}