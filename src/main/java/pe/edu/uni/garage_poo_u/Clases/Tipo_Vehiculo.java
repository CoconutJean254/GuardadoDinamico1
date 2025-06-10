/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Tipo_Vehiculo {
    private String Codigo;
    private String Nombre;
    
    public Tipo_Vehiculo(String Nombre){
        this.Nombre=Nombre;
        switch(Nombre){
            case "No especificado":
                this.Codigo="0";
                break;
            case "Sedan":
                this.Codigo="1";
                break;
            case "SUV":
                this.Codigo="2";
                break;
            case "Pickup":
                this.Codigo="3";
            
        }                        
    }               

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }
            
}
