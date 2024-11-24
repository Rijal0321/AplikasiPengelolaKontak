import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {
        public static Connection getKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/pengelola_kontak"; // Sesuaikan nama database
            String pengguna = "root"; // Sesuaikan username MySQL
            String sandi = ""; // Sesuaikan password MySQL
            return DriverManager.getConnection(url, pengguna, sandi);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
        
}
