/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
public class Marca_Modelo {
    private String Codigo; 
    private String Nombre; 

    public Marca_Modelo(String Nombre) {        
        this.Nombre=Nombre;
        switch(Nombre){
            case "TOYOTA":
                this.Codigo="100";
                break;
            case "YARIS":
                this.Codigo="101";
                break;
            case "COROLLA":
                this.Codigo="102";
                break;
            case "LEXUS":
                this.Codigo="103";
                break;
            case "NISSAN":
                this.Codigo="200";
                break;
            case "SENTRA":
                this.Codigo="201";
                break;
            case "SUNNY":
                this.Codigo="202";
                break;
            case "TIDA":
                this.Codigo="203";
                break;
            case "VERSA":
                this.Codigo="204";
                break;
            case "HONDA":
                this.Codigo = "300";
                break;
            case "FORD":
                this.Codigo="400";
        }       
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }
    
    

    
        
        
                                 
}
