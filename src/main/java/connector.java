

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author max
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {
    // Informasi koneksi ke database
    private static final String URL = "jdbc:mysql://localhost:3306/Borrow_App"; 
    private static final String USERNAME = "root"; //
    private static final String PASSWORD = ""; //

    // Metode untuk mendapatkan koneksi ke database
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Mendaftar driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Membuat koneksi
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Koneksi ke database berhasil.");
        } catch (ClassNotFoundException | SQLException e) {
    System.out.println("Koneksi gagal: " + e.getMessage());
    e.printStackTrace();
}
        return connection;
    }

    // Metode untuk menutup koneksi
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Koneksi database ditutup.");
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
            // Lakukan operasi database di sini
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }
}
