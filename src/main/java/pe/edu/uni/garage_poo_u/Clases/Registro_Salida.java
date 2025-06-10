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
public class Registro_Salida {
    String FechaSalida; 
    String HoraSalida; 
    String idCliente2; 
    String idEmpleado2;                     
    Tipo_Documento TipoDocumento;     

    public Registro_Salida(String FechaSalida, String HoraSalida, String idCliente2, String idEmpleado2, Tipo_Documento TipoDocumento) {
        this.FechaSalida = FechaSalida;
        this.HoraSalida = HoraSalida;
        this.idCliente2 = idCliente2;
        this.idEmpleado2 = idEmpleado2;
        this.TipoDocumento = TipoDocumento;
    }
    
    public String toString(){
        return FechaSalida+"   "+HoraSalida+"   "+idCliente2+"   "+idEmpleado2+"   "+TipoDocumento.getCodigo();        
    }
    
    public void guardarSalida(String linea) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("C:/Users/EDUARDO/Desktop/" + linea, true));

        br.write(toString());
        br.write("\n");
        br.close();
    }
    
    
}
