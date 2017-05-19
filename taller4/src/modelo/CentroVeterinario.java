/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author invitado
 */
public class CentroVeterinario {
    
    private int cantidadMascotas=0;
    private HashMap mascotas;
  
    
    public HashMap getHashMap(){
        return mascotas;
    }
    
    public void Agregar(int id, int dia, int mes, int anio, int peso,String nombre,String raza){
        cantidadMascotas=+1;
        Mascota m = new Mascota(id, dia, mes, anio, peso, nombre, raza);
        mascotas.put(cantidadMascotas, m);
    }
    
    public modificar(int peso,String nombre,String raza){
        
    
    }
    
    public Mascota buscar(int id){
        if(mascotas.containsKey(id)){
            
        }
        
    }
    
    
}
