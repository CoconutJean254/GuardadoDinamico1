/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Empleado extends Persona{    
    String FechaNacimiento; 
    String idEmpleado; 

    public Empleado(String FechaNacimiento, Nacionalidad nacionalidad, String DNI, String NombresApellidos, Sexo sexo, String Telefono, String Correo, String Direccion, String Distrito) {
        super(nacionalidad, DNI, NombresApellidos, sexo, Telefono, Correo, Direccion, Distrito);
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getIdEmpleado() {
        return DNI;
    }                
}
