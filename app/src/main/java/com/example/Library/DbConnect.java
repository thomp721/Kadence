import java.sql.*;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.transform.Result;

public class DbConnect {
    private Connection con; //store co
    private Statement st;
    private ResultSet rs;

    public DbConnect() {
        try{
            Class.forName("com.mysql.jdbc.driver");
            con = DriverManager.getConnection("flowing-athlete-266208:us-central1:boilerplaydeluxe",
                    "root", "boilerup");
            st = con.createStatement();
        }catch(Exception e) {
            System.out.println("Error: "+e);
        }
    }

    public void getData() {
        try {
            String selectGenre = "USE rap";
            String selectHR = "SELECT * FROM resting;";
            rs = st.executeQuery(selectGenre);
            rs = st.executeQuery(selectHR);
        }catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
