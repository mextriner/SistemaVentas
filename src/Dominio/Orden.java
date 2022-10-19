/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Principal.VentasTest;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    static int contadorOrden;
    int idOrden;
    ArrayList <Producto> lista;
    
    final int MAX_PRODUCTOS = 10; 

    private Orden() {
        contadorOrden++;
        idOrden = contadorOrden;
    }
    
    

    public Orden(ArrayList <Producto> lista) {
        this();
        this.lista = lista;
    }
    
    public void agregarProducto(Producto producto){        
        if (lista.size() < MAX_PRODUCTOS){
            lista.add(producto);
            System.out.println("Producto agregado correctamente");
        }else{
            System.out.println("No se pudo agregar el producto, límite alcanzado");
        }
        
    }

    public int getIdOrden() {
        return idOrden;
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    
    
    
    public double calcularTotal(){
        double total = 0;
        for(int i = 0 ; i < lista.size() ; i ++){
            total += lista.get(i).getPrecio();
        }
        return total;
    }
    
    
    
    public void mostrarOrden(){
        System.out.println("ID Orden:" + idOrden);
        System.out.println("\n\tProductos: ");
        for(int i = 0 ; i < lista.size() ; i ++){
            System.out.println(lista.get(i).toString());
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.idOrden;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orden other = (Orden) obj;
        if (this.idOrden != other.idOrden) {
            return false;
        }
        return true;
    }
    
    
}



