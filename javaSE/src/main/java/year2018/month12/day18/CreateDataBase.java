package year2018.month12.day18;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Crate DataBase
 *
 * @author dage
 */
public class CreateDataBase {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql:/localhost/3306/dada";

    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

    }

}
