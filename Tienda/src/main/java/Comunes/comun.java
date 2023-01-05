/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunes;

/**
 *
 * @author jsbsan
 */
public class comun {
    
/**
 * Cambia el numero dado en formato cadena, eliminando el punto y cambia la coma decimal por el punto decimal.
 * @param s
 * @return cadena con un numero con punto decimal y sin coma de millares.
 */
 public  static String cambiaComaPorPunto(String s) {
        String c;
        c = s.replaceAll("\\.", "");
        c = c.replaceAll("\\,", ".");
        // System.out.println(s + " -> " + c); 
        return c;
    }




}