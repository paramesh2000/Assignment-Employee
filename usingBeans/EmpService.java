package usingBeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpService {

	@Autowired
	private EmpRepository repo;

	@Transactional
	public void save(Employee emp) {

		repo.save(emp);
	}

	public void upd() {
		repo.upd();
	}

	public void del(int eid) {
		repo.del(eid);
	}
}
