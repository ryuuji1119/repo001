package com.example.dbaccess.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.dbaccess.bean.ClientiException;
import com.example.dbaccess.bean.Cliente;

public class ProvaLetturaClienti {

	public static void main(String[] args) throws ClientiException {
		/*
		 * // 1) caricamento del driver
		 * Class.forName("oracle.jdbc.driver.OracleDriver"); // required solo per v. < 4
		 */

		String username = "HR";
		String password = "hr";
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		String sql = "select id, nome, cognome, email, indirizzo, citta, provincia, cap from clienti order by nome";

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cliente c = Cliente.create(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				System.out.println(c);
			}
		} catch (SQLException e) {
			throw new ClientiException("Errore di lettura clienti", e);
		} finally { // eseguito sempre
			System.out.println("Finally ...");
			try { rs.close(); } catch (Exception e) {}
			try { ps.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}

	}

}