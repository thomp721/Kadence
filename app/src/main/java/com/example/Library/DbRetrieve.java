import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.xml.transform.result;

public class DbRetrieve() {
	private Connection con;
	private Statement statement;
	private ResultSet resultSet;

	Public DbConnect() {
		try{
			Class.forName("com.mysql.jdbc.driver");
			con = DriverManager.getConnection("flowing-athlete-266208:us-central1:boilerplaydeluxe", "root", "boilerup");
			statement = con.createStatement();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	Public String retrieveSongUID(String genre, String heartRange, int entryID) {
		String moveToDB = "USE " + genre;
		String selectFromTable = "SELECT uid FROM " + heartRange + "WHERE entryID=\"" + entryID + "\";";
		resultSet = moveToDb.createStatement();
		resultSet = selectFromTable.createStatement;
	}
}
