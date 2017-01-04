package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sg-0036936 on 03/01/2017.
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/izihub", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
