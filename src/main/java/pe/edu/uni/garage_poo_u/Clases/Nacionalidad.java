/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Nacionalidad {
    int Codigo; 
    String Nombre; 

    public Nacionalidad(String Nombre) {
        if(Nombre.equals("Peruana")){
            this.Codigo=1; 
        }else if(Nombre.equals("Extranjera")){
            this.Codigo=2; 
        }else if(Nombre.equals("No especificado")){
            this.Codigo=0; 
        }                        
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return Integer.toString(Codigo); 
    }
    
    
                             
}
