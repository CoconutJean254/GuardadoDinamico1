/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author EDUARDO
 */
public class Cliente extends Persona{
    private String idCliente;    
    private String NroLicencia; 

    public Cliente(String NroLicencia, Nacionalidad nacionalidad, String DNI, String NombresApellidos, Sexo sexo, String Telefono, String Correo, String Direccion, String Distrito) {
        super(nacionalidad, DNI, NombresApellidos, sexo, Telefono, Correo, Direccion, Distrito);        
        this.NroLicencia = NroLicencia;
    }        
        
    public String getidCliente(){
        return DNI;                         
    }        
    
    @Override
    public String toString(){
        return getidCliente()+"   "+super.toString()+"   "+NroLicencia; 
    }
    
    public void guardarCliente(String linea) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("C:/Users/EDUARDO/Desktop/" + linea, true));

        br.write(toString());
        br.write("\n");
        br.close();
    }
    
    
    
}
