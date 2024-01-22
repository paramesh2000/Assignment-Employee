package usingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Config {
	public static void main(String[] args) {
		EmployeeServices es = new EmployeeServices();
		ApplicationContext con = new FileSystemXmlApplicationContext("spring.xml");
		EmployeeServices emp = con.getBean("employeeService", EmployeeServices.class);
		Employee employee = new Employee(1, "Paramesh", 21, "developer", 20000);
		es.createEmployee(employee);
		employee = new Employee(2, "sindu", 30, "developer", 55032);
		es.createEmployee(employee);
		Employee getEmployee = es.viewEmployee(2);
		System.out.println(getEmployee);

		Employee updatedEmployee = new Employee(3, "praveen", 35, "tester", 60023);
		es.updateEmployee(updatedEmployee);
		es.removeEmployee(2);

		List<Employee> list = es.getEmployeeList();
		System.out.println("list of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
