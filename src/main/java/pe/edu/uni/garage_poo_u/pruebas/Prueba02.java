/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.pruebas;

import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.garage_poo_u.model.Empleado;
import pe.edu.uni.garage_poo_u.model.EmpleadoDAO;

/**
 *
 * @author EDUARDO
 */
public class Prueba02 {
    public static void main(String[] args) {
        try {                        
            String u="jperez"; 
            String c="123";                    
            
            EmpleadoDAO service = new EmpleadoDAO();                                  
            boolean validacion=service.validarUsuario(u, c); 
            
            if(validacion){
                System.out.println("Usuario y contrasenia validos. ");
            }else{
                System.out.println("Invalidos. ");
            }                                    
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }    
}
