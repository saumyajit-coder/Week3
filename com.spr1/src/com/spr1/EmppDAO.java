package com.spr1;

import org.springframework.jdbc.core.*;
import com.spr1.Empp;
import org.springframework.dao.*;
import java.sql.*;

public class EmppDAO {
		JdbcTemplate jdbcTemplate;
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
		{
			this.jdbcTemplate=jdbcTemplate;
		}
		public int save(Empp s)
		{
			String qry="insert into empp values("+s.getEmp_id()+ ",'"+ s.getName() +"', '"+ s.getDesi()+ "' , '"+ s.getSalary()+ "')";
			return jdbcTemplate.update(qry);
		}
		public Boolean savePS(Empp s)
		{
			String qry="insert into empp values(?,?,?,?)";
			return jdbcTemplate.execute(qry,new PreparedStatementCallback<Boolean>()
					{
				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException
				{
					ps.setInt(1,s.getEmp_id());
					ps.setString(2,s.getName());
					ps.setString(3,s.getDesi());
					ps.setDouble(4, s.getSalary());
					return ps.execute();			
				}
					});
		}
}
