/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EDUARDO
 */
public class AccesoDB {    

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=ProyectoGarage;encrypt=true;TrustServerCertificate=true";
        String user = "sa";
        String pass = "sql";
        try {
            Class.forName(driver).getDeclaredConstructor().newInstance();
            cn = DriverManager.getConnection(urlDB, user, pass);
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encuentra el driver");
        } catch (Exception e) {
            throw new SQLException("No se conecto a la base de datos");
        }
        return cn;
    }
}
