/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author invitado
 */
public class controladora {
    
    private static String DRIVER = "com.mysql.jdbc.Driver";
    
    private static Connection conexion;
    
    private static Statement consulta;
    
    private static String IP = "mysql2.eisc.univalle.edu.co";
    
    
    
    /**
     * Inicia la base de datos
     */
    public static void iniciarDB(){
        try{
            Class.forName(DRIVER).newInstance();
            
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException e){
            JOptionPane.showMessageDialog(null, "Error al cargar el Controlador");
        }
    }
    
    public static void main(String args[]){
        
    }

}
