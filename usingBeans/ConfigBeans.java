package usingBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.concentrix.spring_transaction_demo.config.BeanConfig;
//import com.concentrix.spring_transaction_demo.model.Employee;
//import com.concentrix.spring_transaction_demo.service.EmpService;

public class ConfigBeans {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		context.registerShutdownHook();

		EmpService service = context.getBean(EmpService.class);

		Employee emp = new Employee(1, "Paramesh", 35, "Angular", 44);
		// Employee emp1 = new Employee(3,"Ravi",20,"HR",34321);
		service.save(emp);
		service.upd();
		service.del(108);

		context.close();

	}
}