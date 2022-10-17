/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Dominio.Orden;
import Dominio.Producto;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class VentasTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto a = new Producto("Pack Boligrafo",9.36);
        Producto b = new Producto("Teclado",10);
        Producto c = new Producto("Rstón",20);
        Producto d = new Producto("Rstón",20);
        Producto e = new Producto("Rstón",20);
        Producto f = new Producto("Rstón",20);
        Producto g = new Producto("Rstón",20);
        Producto h = new Producto("Rstón",20);
        Producto i = new Producto("Rstón",20);
        Producto j = new Producto("Rstón",20);
        Producto k = new Producto("Rstón",20);
        Producto l = new Producto("Rstón",20);
        Producto m = new Producto("Rstón",20);
        
        ArrayList lista = new ArrayList <Producto>();
        lista.add(a);
        lista.add(b);
        
        Orden o = new Orden(lista, 0);
        
        o.agregarProducto(c);
        o.agregarProducto(d);
        o.agregarProducto(e);
        o.agregarProducto(f);
        o.agregarProducto(g);
        o.agregarProducto(h);
        o.agregarProducto(i);
        o.agregarProducto(j);
        o.agregarProducto(k);
        o.agregarProducto(l);
        o.agregarProducto(m);
        
        o.mostrarOrden();
        
        System.out.println("Precio total de la orden: "+ o.calcularTotal() +"€");
    }
    
}
