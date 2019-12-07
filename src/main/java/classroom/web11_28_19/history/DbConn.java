package classroom.web11_28_19.history;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

    private static Connection conn;

    public static Connection get() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/CalcHistory",
                    "postgres",
                    System.getenv("PG_PWD")
            );
        }
        return conn;
    }
}
