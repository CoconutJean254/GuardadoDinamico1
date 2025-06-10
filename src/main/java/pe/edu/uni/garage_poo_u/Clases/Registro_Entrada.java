/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.garage_poo_u.Clases;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author EDUARDO
 */
public class Registro_Entrada extends Registro{
    String FechaIngreso; 
    String HoraIngreso; 
    int idCliente1; 
    int idEmpleado1; 

    public Registro_Entrada(String FechaIngreso, String HoraIngreso, int idCliente1, int idEmpleado1, int idRegistro, int Nivel, String Zona) {
        super(idRegistro, Nivel, Zona);
        this.FechaIngreso = FechaIngreso;
        this.HoraIngreso = HoraIngreso;
        this.idCliente1 = idCliente1;
        this.idEmpleado1 = idEmpleado1;
    }
            
    @Override
    public void Añadir(){
        try(RandomAccessFile f = new RandomAccessFile("FILE","rw")){                   
            f.seek(0);
            f.writeInt(idRegistro);
            f.writeInt(Nivel);
            f.writeUTF(Zona);
            f.writeUTF(FechaIngreso);
            f.writeUTF(HoraIngreso);
            f.writeInt(idCliente1);
            f.writeInt(idEmpleado1);                                   
        }catch(IOException e){                                
            e.printStackTrace();                                
        }
        
        
        
    }           
    
}
