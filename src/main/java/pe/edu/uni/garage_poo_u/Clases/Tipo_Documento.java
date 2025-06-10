/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Tipo_Documento {
    String Codigo; 
    String Nombre; 

    public Tipo_Documento(String Nombre) {        
        this.Nombre = Nombre;
        if(Nombre.equals("Boleta")){
            Codigo="1"; 
        }else if(Nombre.equals("Factura")){
            Codigo="2"; 
        }
    }        

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
