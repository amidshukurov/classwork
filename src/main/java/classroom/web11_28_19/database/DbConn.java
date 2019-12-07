package classroom.web11_28_19.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
    private static Connection conn;

    public static Connection get() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/amid_db",
                    "postgres",
                    // RUN/Edit configration/Environment Variables
                    "Amid-21392139");
        }
        return conn;
    }
}
