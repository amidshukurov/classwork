package classroom.web11_28_19.history;

import classroom.web11_28_19.database.DbConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbOps {
  public static void insert_user(String name, String a, String operation, String b, int result) throws SQLException {
    Connection conn = DbConn.get();
    String SQLI = "insert into calchistory (name, a, operation, b, result) values (?, ?, ?, ?, ?)";
    PreparedStatement stmt = conn.prepareStatement(SQLI);
    stmt.setString(1, name);
    stmt.setString(2, a);
    stmt.setString(3, operation);
    stmt.setString(4, b);
    stmt.setInt(5, result);
    stmt.execute();
  }
  }

