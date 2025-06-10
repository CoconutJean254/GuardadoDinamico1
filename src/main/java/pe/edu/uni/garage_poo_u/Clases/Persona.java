/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Persona {
    protected Nacionalidad nacionalidad; 
    protected String DNI; 
    protected String NombresApellidos;
    protected Sexo sexo; 
    protected String Telefono, Correo, Direccion, Distrito;

    public Persona(Nacionalidad nacionalidad, String DNI, String NombresApellidos, Sexo sexo, String Telefono, String Correo, String Direccion, String Distrito) {
        this.nacionalidad = nacionalidad;
        this.DNI = DNI;
        this.NombresApellidos = NombresApellidos;
        this.sexo = sexo;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Distrito = Distrito;                
    }        
    
    @Override
    public String toString(){
        return nacionalidad.toString()+"   "+DNI+"   "+NombresApellidos+"   "+sexo.toString()+"   "+
                Telefono+"   "+Correo+"   "+Direccion+"   "+Distrito; 
    }
    
}
