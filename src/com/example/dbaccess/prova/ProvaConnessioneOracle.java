package com.example.dbaccess.prova;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class ProvaConnessioneOracle {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 
		
		String username = "HR";
		String password = "hr";
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		//creare una java.sql.connection
		Connection connection = DriverManager.getConnection(url,username,password);
		// creiamo lo statemente
		String sql ="select 123 * 555 from dual";
		PreparedStatement ps = connection.prepareStatement(sql);
		//otteniamo i dati
		ResultSet rs = ps.executeQuery();
		//mi posiziono sulla prima tupla del risultato
		rs.next();
		//prendo il risultato
		String risultato = rs.getNString(1);
		
		System.out.println("Execute OK: "+risultato);
		//shutdown
		rs.close();
		ps.close();
		
		connection.close();
		}

}
