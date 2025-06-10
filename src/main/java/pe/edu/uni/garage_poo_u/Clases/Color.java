/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Color {    
    private String Codigo; 
    private String Nombre; 

    public Color(String Nombre) {        
        this.Nombre = Nombre;
        switch(Nombre){
            case "No especificado":
                this.Codigo="0";
                break;
            case "Negro":
                this.Codigo="1";
                break;
            case "Gris":
                this.Codigo="2";
                break;
            case "Plata":
                this.Codigo="3";
                break;
            case "Azul":
                this.Codigo="4";
                break;
            case "Verde":
                this.Codigo="5";
                break;
            case "Rojo":
                this.Codigo="6";
                break;
            case "Amarillo":
                this.Codigo="7";
                break;
            case "Blanco":
                this.Codigo="8";
        }
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }                        
                   
}
