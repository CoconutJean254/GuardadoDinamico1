package pe.edu.uni.garage_poo_u;

import pe.edu.uni.garage_poo_u.ControlAcceso;
import pe.edu.uni.garage_poo_u.Clases.Registro;
import pe.edu.uni.garage_poo_u.Clases.Registro_Entrada;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args){        
        ControlAcceso m = new ControlAcceso();                        
        m.setResizable(false);
        m.setTitle("Sistema de Gestion de Estacionamiento de Vehiculos");
        m.setVisible(true);                
    }
}
