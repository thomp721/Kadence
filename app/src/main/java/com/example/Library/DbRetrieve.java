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

			String selectFromTable = "SELECT time FROM entries WHERE entryID=\"" + entryID + "\";";
			Double time = Double.parseDouble(statement.executeQuery(selectFromTable));

			selectFromTable = "SELECT heartRange FROM entries WHERE entryID=\"" + entryID + "\";";
			String heartRange = statement.executeQuery(selectFromTable);

			selectFromTable = "SELECT genre FROM entries WHERE entryID=\"" + entryID + "\";";
			String genre = statement.executeQurey(selectFromTable);

			Soundtrack soundtrack = new Soundtrack(heartRange, time, genre);
			return soundtrack;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return new Soundtrack();
	}

	public int storeSoundtrack(String heartRange, Double time, String genre) {
		try {
			String moveToDB = "USE soundtracks;";
			resultSet = statement.executeQuery(moveToDB);

			String sendToDB = "INSERT INTO entries (time, heartRange, genre) VALUES("heartRange", "time.toString()", "genre");";
			resultSet = statement.executeQuery(moveToDB);

			return 1;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return -1;
	}
}
