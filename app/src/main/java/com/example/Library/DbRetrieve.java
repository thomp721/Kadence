package com.example.Library;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
//import javax.xml.transform.result;

public class DbRetrieve {
	private Connection con;
	private Statement statement;
	private ResultSet resultSet;

	public DbRetrieve() {
		try{
			Class.forName("com.mysql.jdbc.driver");
			con = DriverManager.getConnection("flowing-athlete-266208:us-central1:boilerplaydeluxe", "root", "boilerup");
			statement = con.createStatement();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public String retrieveSongUID(String genre, String heartRange, int entryID) {
		try {
			String moveToDB = "USE " + genre;
			String selectFromTable = "SELECT uid FROM " + heartRange + "WHERE entryID=\"" + entryID + "\";";
			resultSet = statement.executeQuery(moveToDB);
			resultSet = statement.executeQuery(selectFromTable);
			return selectFromTable;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return "";
	}

	public Soundtrack retrieveSoundtrack(int entryID) {
		try {
			String moveToDB = "USE soundtracks;";
			resultSet = statement.executeQuery(moveToDB);
			String selectFromTable = "SELECT ";
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return new Soundtrack();
	}
}
