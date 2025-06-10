/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.pruebas;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.garage_poo_u.db.AccesoDB;
import pe.edu.uni.garage_poo_u.model.Empleado;
import pe.edu.uni.garage_poo_u.model.EmpleadoDAO;

/**
 *
 * @author EDUARDO
 */
public class Prueba01 {
    public static void main(String[] args) {
        try{
            Connection cn=AccesoDB.getConnection(); 
            System.out.println("Conexion ok");
            cn.close();
        }catch (Exception e){
            System.err.println(e.getMessage());             
        }
    }    
}
