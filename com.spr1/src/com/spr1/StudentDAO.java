package com.spr1;

import org.springframework.jdbc.core.*;
import com.spr1.Student;
import org.springframework.dao.*;
import java.sql.*;

public class StudentDAO {
		JdbcTemplate jdbcTemplate;
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
		{
			this.jdbcTemplate=jdbcTemplate;
		}
		
		public int save(Student s)
		{
			String qry="insert into student values("+s.getId()+ ",'"+ s.getName() +"', '"+ s.getCourse()+ "' , '"+ s.getGrade()+ "')";
			return jdbcTemplate.update(qry);
		}
		public Boolean savePS(Student s)
		{
			String qry="insert into student values(?,?,?,?)";
			return jdbcTemplate.execute(qry,new PreparedStatementCallback<Boolean>()
					{
				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException
				{
					ps.setInt(1,s.getId());
					ps.setString(2,s.getName());
					ps.setString(3,s.getCourse());
					ps.setString(4, s.getGrade());
					return ps.execute();			
				}
					});
		}
}
