import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ConnectionDemo {

    // this is a demo to use jdbc - mysql to access data

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demodb";
        String user = "root";
        String pass = "abc123";
        String sqlQuery = "select * from employees";

        try {
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user, pass);
            System.out.println("connected to the database.");

            // 2. Create a statement
            Statement myStmt = myConn.createStatement();

            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery(sqlQuery);

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("id") + ". " +
                        myRs.getString("name") + ", " +
                        myRs.getString("email") + ", " +
                        myRs.getString("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
