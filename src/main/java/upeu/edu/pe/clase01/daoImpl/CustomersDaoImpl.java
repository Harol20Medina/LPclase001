package upeu.edu.pe.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.entity.Customers;
import upeu.edu.pe.clase01.entity.Invoices;
@Component
public class CustomersDaoImpl implements Operaciones<Customers>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customers read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> readAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT *FROM invoices";
		return jdbcTemplate.query( SQL, new BeanPropertyRowMapper<Customers>(Customers.class));
	}



