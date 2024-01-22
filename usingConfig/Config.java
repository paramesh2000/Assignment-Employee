package usingConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class Config {
	public static void main(String[] args) {
		EmployeeServices es = new EmployeeServices();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpConfiguration.class);
		EmployeeServices employeeDAO = context.getBean(EmployeeServices.class);
		Employee employee = new Employee(1, "Saran", 25, "developer", 20000);
		es.createEmployee(employee);
		employee = new Employee(2, "Atif", 30, "developer", 55032);
		es.createEmployee(employee);

		Employee getEmployee = es.viewEmployee(2);
		System.out.println(getEmployee);

		Employee updatedEmployee = new Employee(3, "Sindubath", 30, "T.Lead", 60023);
		es.updateEmployee(updatedEmployee);

		es.removeEmployee(2);

		List<Employee> list = es.getEmployeeList();
		System.out.println("list of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
