package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Spring_student>{
	public Spring_student mapRow(ResultSet rs,int rowNum) throws SQLException{
		Spring_student s = new Spring_student();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setMarks(rs.getInt("marks"));
		return s;
	}
}
