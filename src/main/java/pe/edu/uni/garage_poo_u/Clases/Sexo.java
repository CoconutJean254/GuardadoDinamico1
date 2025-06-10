/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Sexo {
    int Codigo; 
    String Nombre; 

    public Sexo(String Nombre) {
        if(Nombre.equals("Masculino")){
            this.Codigo=1; 
        }else if(Nombre.equals("Femenino")){
            this.Codigo=2; 
        }                
        this.Nombre = Nombre;
    }        
    @Override
    public String toString() {
        return Integer.toString(Codigo); 
    }
}
