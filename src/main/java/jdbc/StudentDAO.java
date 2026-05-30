package jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	private JdbcTemplate jdbcTemplate;
	
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	// insert data 
	
	public void saveStudent(Spring_student s) {
		String sql = "INSERT INTO Spring_student VALUES (?,?,?)";
		jdbcTemplate.update(sql,s.getId(),s.getName(),s.getMarks());
		System.out.println("Inserted");
	}
	// fetching data
	
	public List<Spring_student> getStudents(){
		String sql = "SELECT * FROM Spring_student";
		return jdbcTemplate.query(sql, new StudentRowMapper());
	}
}
