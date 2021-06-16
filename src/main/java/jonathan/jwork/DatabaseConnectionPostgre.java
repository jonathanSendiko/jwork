package jonathan.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class berisikan data dan konfigurasi yang digunakan untuk melakukan koneksi ke database postgresql
 * secara local
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class DatabaseConnectionPostgre {

    public static Connection connection(){
        Connection c = null;
        Statement stmt = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "jo1jo2jo3jo4";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
