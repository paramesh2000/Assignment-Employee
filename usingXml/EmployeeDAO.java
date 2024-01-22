package usingXml;

public interface EmployeeDAO {
	void createEmployee(Employee employee);
	
	Employee viewEmployee(int eid);
	
	void updateEmployee(Employee employee);
	
	void removeEmployee(int eid);
}
