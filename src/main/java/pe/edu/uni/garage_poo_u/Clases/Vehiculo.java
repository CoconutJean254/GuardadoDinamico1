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
public class Vehiculo {
    private Tipo_Vehiculo tipoVehiculo; 
    private String idMarcaModelo; 
    private Color color; 
    private String nroPlaca; 
    private boolean Lunas_Polarizadas; 

    public Vehiculo(Tipo_Vehiculo tipoVehiculo, Marca_Modelo MarcaModelo, Color color, String nroPlaca, boolean Lunas_Polarizadas) {
        this.tipoVehiculo = tipoVehiculo;        
        this.color = color;
        this.nroPlaca = nroPlaca;
        this.Lunas_Polarizadas = Lunas_Polarizadas;                
        this.idMarcaModelo = nroPlaca + MarcaModelo.getCodigo();                        
    }

    public String getIdMarcaModelo() {
        return idMarcaModelo;
    }
    
     @Override
    public String toString(){
        String val; 
        if(Lunas_Polarizadas){
            val="1"; 
        }else{
            val="0"; 
        }        
        return getIdMarcaModelo()+"   "+tipoVehiculo.getCodigo()+"   "+color.getCodigo()+nroPlaca+val; 
    }
    
    public void guardarVehiculo(String linea) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("C:/Users/EDUARDO/Desktop/" + linea, true));

        br.write(toString());
        br.write("\n");
        br.close();
    }
    
    
    
    
    
    
    
    
    
    
}
