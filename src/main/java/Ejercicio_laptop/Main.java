/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_laptop;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        
        laptop1.setColor("Negro");
        laptop1.setMarca("Dell");
        laptop1.setPrecio(15000.99);
        laptop1.imprimirDatos();
    }
    
}
