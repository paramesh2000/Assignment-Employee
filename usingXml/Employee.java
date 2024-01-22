package usingXml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	private int eid;
	private String ename;
	private int eage;
	private String department;
	private double salary;
}
