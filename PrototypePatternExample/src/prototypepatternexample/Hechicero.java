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
public class Hechicero extends Enemigo
{
    public Hechicero() {
        System.out.println("Hechicero creado");
    }
    // ------------------------------
    @Override
    public void atacar() {
        System.out.println("El hechicero ataca");
    }
    // ------------------------------
    @Override
    public void detener() {
        System.out.println("El hechiero se detiene");
    }
}