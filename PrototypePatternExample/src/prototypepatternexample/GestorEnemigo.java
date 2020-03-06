/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepatternexample;

/**
 *
 * @author jocho
 */

import java.util.Hashtable;
public class GestorEnemigo {
        
    // Para almacenar los objetos de tipo Prototype que se vayan creando
    private Hashtable hEnemigos = new Hashtable();
    
    // ------------------------------
    public GestorEnemigo()
    {
        // Crear un Hechicero y asignarle propiedades
        Enemigo h1 = new Hechicero();
        h1.setNombre("Sorcerer1");
        h1.setArma("Encantamiento");
        
        // Guardarlo
        this.addEnemigo( h1.getNombre(), h1 );
        
        // Crear un Guerrero y asignarle propiedades
        Enemigo g1 = new Guerrero();
        g1.setNombre("Warrior1");
        g1.setArma("ESPADA");
        
        // Guardarlo
        this.addEnemigo( g1.getNombre(), g1 );
    }
    
    // ------------------------------
    public void addEnemigo( String nombre, Enemigo objEnemigo )
    {
         this.hEnemigos.put( nombre, objEnemigo );
    }
    
    // ------------------------------
    public Enemigo getEnemigo( String nombre )
    {
         Enemigo objPrototipo = (Enemigo) hEnemigos.get( nombre );
         return objPrototipo;
    }
    
    
    // ------------------------------
     public Enemigo getClon( String nombre ) throws CloneNotSupportedException
    {
        // Localizar el objeto deseado
         Enemigo objPrototipo = (Enemigo) hEnemigos.get( nombre );
    
        // Devolver un clon
         return (Enemigo) objPrototipo.clonar();
    }
}
