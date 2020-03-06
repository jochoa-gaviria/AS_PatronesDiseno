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
public class Guerrero extends Enemigo
{
    public Guerrero() {
        System.out.println("Guerrero creado");
    }
    
    // ------------------------------
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }
    
    // ------------------------------
    @Override
    public void detener() {
        System.out.println("El guerrero se detiene");
    }
}