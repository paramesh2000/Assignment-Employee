package usingBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class EmpRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(Employee emp) {
		String sql = "insert into Employee values(?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {emp.getEid(), emp.getEname(), emp.getEage(),emp.getDepartment(),emp.getSalary()});
	}
	public void upd() {
		String sq = "update Employee set ename='Ganesh',department='hr' where eid=110";
		jdbcTemplate.update(sq);
	
	}
	public void del(int eid) {
		String s = "delete from Employee where eid = ?";
		jdbcTemplate.update(s, new Object[] {eid});
	}
}