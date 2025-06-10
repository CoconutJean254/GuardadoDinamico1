/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.model;

import pe.edu.uni.garage_poo_u.db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDUARDO
 */
public class EmpleadoDAO {
    
    Connection cn; 
    
    public EmpleadoDAO() throws SQLException{
        AccesoDB con = new AccesoDB(); 
        cn=con.getConnection(); 
    }
                
    public List<Empleado> listarEmpleados(){
        PreparedStatement ps; 
        ResultSet rs;
        
        List<Empleado> lista = new ArrayList<>(); 
        try{
            ps=cn.prepareStatement("SELECT idEmpleado, nacionalidad, tipoDocumento, numIdentificacion, "
                    + "fechaNacimiento, nombres, apellidoPaterno, apellidoMaterno, sexo, Correo, direccion" 
                    + " distrito, salario, cargo, estadoEmpleado, nombreUsuario, contrasenia");                                                                                                      
            rs=ps.executeQuery();
            
            while(rs.next()){
                int id=rs.getInt("idEmpleado"); 
                String nacionalidad=rs.getString("nacionalidad"); 
                String tipoDocumento=rs.getString("tipoDocumento"); 
                String numIdentificacion=rs.getString("numIdentificacion"); 
                java.sql.Date fechaNacimiento=rs.getDate("fechaNacimiento");   
                String nombres=rs.getString("nombres");       
                String apellidoPaterno=rs.getString("apellidoPaterno");       
                String apellidoMaterno=rs.getString("apellidoMaterno");       
                char sexo=rs.getString("sexo").charAt(0); 
                String Correo=rs.getString("Corre");             
                String direccion=rs.getString("direccion");            
                String distrito=rs.getString("distrito");             
                double salario=rs.getDouble("salario");             
                String cargo=rs.getString("cargo");             
                String estadoEmpleado=rs.getString("estadoEmpleado");
                String nombreUsuario=rs.getString("nombreUsuario");
                String contrasenia=rs.getString("contrasenia");
                
                Empleado empleado = new Empleado(id, nacionalidad, tipoDocumento, numIdentificacion, tipoDocumento, nombres, apellidoPaterno, apellidoMaterno, sexo, Correo, direccion, distrito, salario, cargo, estadoEmpleado, nombreUsuario, contrasenia);
                lista.add(empleado); 
            }                       
            
            return lista; 
        }catch(SQLException e){
            System.out.println(e.toString());
            return null; 
        }                                        
    }
    
    public Empleado mostrarEmpleados(int _id){
        PreparedStatement ps; 
        ResultSet rs;
        
        Empleado empleado = null; 
        try{
            ps=cn.prepareStatement("SELECT idEmpleado, nacionalidad, tipoDocumento, numIdentificacion, "
                    + "fechaNacimiento, nombres, apellidoPaterno, apellidoMaterno, sexo, Correo, direccion" 
                    + " distrito, salario, cargo, estadoEmpleado, nombreUsuario, contrasenia WHERE id=?"); 
            ps.setInt(1,_id);
            rs=ps.executeQuery();
            
            while(rs.next()){
                int id=rs.getInt("idEmpleado"); 
                String nacionalidad=rs.getString("nacionalidad"); 
                String tipoDocumento=rs.getString("tipoDocumento"); 
                String numIdentificacion=rs.getString("numIdentificacion"); 
                java.sql.Date fechaNacimiento=rs.getDate("fechaNacimiento");   
                String nombres=rs.getString("nombres");       
                String apellidoPaterno=rs.getString("apellidoPaterno");       
                String apellidoMaterno=rs.getString("apellidoMaterno");       
                char sexo=rs.getString("sexo").charAt(0); 
                String Correo=rs.getString("Corre");             
                String direccion=rs.getString("direccion");            
                String distrito=rs.getString("distrito");             
                double salario=rs.getDouble("salario");             
                String cargo=rs.getString("cargo");             
                String estadoEmpleado=rs.getString("estadoEmpleado");
                String nombreUsuario=rs.getString("nombreUsuario");
                String contrasenia=rs.getString("contrasenia");
                
                empleado = new Empleado(id, nacionalidad, tipoDocumento, numIdentificacion, tipoDocumento, nombres, apellidoPaterno, apellidoMaterno, sexo, Correo, direccion, distrito, salario, cargo, estadoEmpleado, nombreUsuario, contrasenia);                
            }                                   
            return empleado; 
        }catch(SQLException e){
            System.out.println(e.toString());
            return null; 
        }                                        
    }    
    public boolean validarUsuario(String nombreUsuario, String contrasenia){
        boolean val=false; 
        PreparedStatement ps; 
        ResultSet rs;
        
        Empleado empleado = null; 
        try{
            ps=cn.prepareStatement("SELECT nombreUsuario ,contrasenia FROM Empleado WHERE nombreUsuario=? "
                    + "AND contrasenia=?");             
            ps.setString(1, nombreUsuario);
            ps.setString(2, contrasenia);
            rs=ps.executeQuery(); 
            
            if(rs.next()){
                val=true;
            }            
        }catch(SQLException e){
            System.out.println("El usuario o contrasenia no corresponden" + e.toString());            
        }   
        return val; 
    }            
}
