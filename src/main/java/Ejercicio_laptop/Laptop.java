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
public class Laptop {
    //Atributos
    private String color;
    private String marca;
    private double precio;
    
    //Métodos Getter y Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Método constructor
    public Laptop(){
    }
    
    public Laptop(String color, String marca, double precio){
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }
    //Métodos
    public void imprimirDatos(){
        System.out.println("El color de la laptop es " + this.getColor() + ", la marca es " + this.getMarca() + " y el precio es " + this.getPrecio());
    }
    
}
