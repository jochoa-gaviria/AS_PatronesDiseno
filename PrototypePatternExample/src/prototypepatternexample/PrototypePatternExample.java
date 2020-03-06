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
public class PrototypePatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        GestorEnemigo objGP = new GestorEnemigo();
        
        // Obtenemos el Guerrero original
        System.out.println("\nGUERRERO!!");
        Enemigo g1 = objGP.getEnemigo("Warrior1");
        System.out.println("==============================");
        
        // Mostramos su datos
        System.out.println("El Guerrero original se llama [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        
        // Obtener un segundo Guerrero (clon del anterior)
        Enemigo g2 = objGP.getClon("Warrior1");
        
        // Mostrar los datos  (ambos tienen datos similares)
        System.out.println("Clon del Guerrero creado:");
        System.out.println("Su nombre es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
        System.out.println("==============================");
        
        // Modificamos el Guerrero clonado
        g2.setNombre("Warrior2");
        g2.setArma("HACHA");
        
        // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
        System.out.println("Tras modificar el clon, ahora se llama [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]\n");
        System.out.println("El nombre del Guerrero original es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        
        // Modificamos el Guerrero original
        g1.setNombre("Warrior-1");
        g1.setArma("MAZO");
        
        // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
        System.out.println("Tras modificar el original, ahora es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]\n");
        System.out.println("El nombre del clon es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
        
        
        
        //====================================================================
         System.out.println("\nHECHICERO!!");
        Enemigo hechicero1 = objGP.getEnemigo("Sorcerer1");
         System.out.println("==============================");
        
        // Mostramos su datos
        System.out.println("El Hechicero original se llama [" + hechicero1.getNombre() + "]");
        System.out.println("Su arma es [" + hechicero1.getArma() + "]");
        System.out.println("==============================");
        
         Enemigo hechicero2 = objGP.getClon("Sorcerer1");
         
        // Mostrar los datos  (ambos tienen datos similares)
        System.out.println("Clon del Hechicero creado:");
        System.out.println("Su nombre es [" + hechicero2.getNombre() + "]");
        System.out.println("Su arma es [" + hechicero2.getArma() + "]");
        System.out.println("==============================");
        
        
         // Modificamos el Guerrero clonado
        hechicero2.setNombre("Sorcerer2");
        hechicero2.setArma("Hechizo");
        
        // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
        System.out.println("Tras modificar el clon, ahora se llama [" + hechicero2.getNombre() + "]");
        System.out.println("Su arma es [" + hechicero2.getArma() + "]\n");
        System.out.println("El nombre del Hechicero original es [" + hechicero1.getNombre() + "]");
        System.out.println("Su arma es [" + hechicero1.getArma() + "]");
        System.out.println("==============================");
        
        // Modificamos el Guerrero original
        hechicero1.setNombre("Sorcerer-1");
        hechicero1.setArma("Degenerativo");
        
        // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
        System.out.println("Tras modificar el original, ahora es [" + hechicero1.getNombre() + "]");
        System.out.println("Su arma es [" + hechicero1.getArma() + "]\n");
        System.out.println("El nombre del clon es [" + hechicero2.getNombre() + "]");
        System.out.println("Su arma es [" + hechicero2.getArma() + "]");
        
    }
}
