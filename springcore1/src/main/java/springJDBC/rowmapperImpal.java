package springJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowmapperImpal implements RowMapper<student2> {

	@Override
	public student2 mapRow(ResultSet rs, int rowNum) throws SQLException {
		student2 s = new student2();
		s.setName( rs.getString(1));
		s.setPassword(rs.getString(2));
		s.setCourse(rs.getString(3));
		s.setEmail(rs.getString(4));
		return s;
	}

}
