/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

/**
 *
 * @author EDUARDO
 */
abstract public class Registro {
    int idRegistro; 
    int Nivel; 
    String Zona;

    public Registro(int idRegistro, int Nivel, String Zona) {
        this.idRegistro = idRegistro;
        this.Nivel = Nivel;
        this.Zona = Zona;
    }
            
    public void Añadir(){}; 
            
}
