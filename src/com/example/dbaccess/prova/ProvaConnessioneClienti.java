package com.example.dbaccess.prova;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class ProvaConnessioneClienti {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver"); //

		String username = "HR";
		String password = "hr";
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		// creare una java.sql.connection
		Connection connection = DriverManager.getConnection(url, username, password);
		// creiamo lo statemente
		String sql = "select id, nome, cognome, email , indirizzo, citta, provincia, cap from clienti";
		PreparedStatement ps = connection.prepareStatement(sql);
		// ottenimento dati
		ResultSet rs = ps.executeQuery();

		// rs si posiziona sulla prima tupla del risultato
		while (rs.next()) {
			// prendo il risultato

			System.out.print("ID" + rs.getInt(1));
			System.out.print(" NOME: " + rs.getString(2));
			System.out.print(" COGNOME: " + rs.getString(3));
			System.out.print(" EMAIL: " + rs.getString(4));
			System.out.print(" INDIRIZZO: " + rs.getString(5));
			System.out.print(" CITTA: " + rs.getString(6));
			System.out.println(" PROVINCIA: " + rs.getString(7));
			System.out.println(" CAP: " + rs.getInt(8));
		}

		// shutdown
		rs.close();
		ps.close();

		connection.close();
	}

}
