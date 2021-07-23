package com.example.dbaccess.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.dbaccess.bean.Employee;
import com.example.dbaccess.bean.EmployeeException;


public class ProvaLetturaEmployee {
	private static final Logger log = LogManager.getLogger(ProvaLetturaEmployee.class);

	public static void main(String[] args) throws EmployeeException {

		String username = "HR";
		String password = "hr";
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		String sql = "select employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID  from employees order by first_name";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;


		try {
			connection = DriverManager.getConnection(url, username, password);
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			
			while (rs.next()) {
				//log.debug(rs.getString(2));
			//	System.out.println(rs.getString(3));
				Employee em = Employee.create(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11) );
				System.out.println(em);
			}
		} catch (SQLException e) {
			throw new EmployeeException("Errore di lettura", e);
		} finally { // eseguito sempre
			
			System.out.println("Siamo nel Finally");
			try { rs.close(); } catch (Exception e) {}
			try { ps.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}

	}

}




