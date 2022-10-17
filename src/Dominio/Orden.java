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

    public Orden() {
        contadorOrden++;
        idOrden = contadorOrden;
    }
    
    

    public Orden( ArrayList <Producto> lista, int contadorOrden) {
        this();
        this.lista = lista;
        this.contadorOrden = contadorOrden;
    }
    
    public void agregarProducto(Producto producto){        
        if (lista.size() < MAX_PRODUCTOS){
            lista.add(producto);
            System.out.println("Producto agregado correctamente");
        }else{
            System.out.println("No se pudo agregar el producto");
        }
        
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
    
    
}



