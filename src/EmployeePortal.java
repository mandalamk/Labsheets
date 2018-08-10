import java.util.ArrayList;
import java.util.Map;

public interface EmployeePortal {

	void addEmployee(Employee51 e);

	void getDetails(Employee51 e);

	void getByScheme(String s);

	void removeEmployee(Employee51 e);

	ArrayList<Employee51> sorting(Map<? extends Integer, ? extends Employee51> map);

}