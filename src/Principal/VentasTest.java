/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Dominio.Orden;
import Dominio.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class VentasTest {
   
    /**
     * @param args the command line arguments
     */
    public static Scanner in = new Scanner(System.in);
    
    public static ArrayList <Producto> lista = new ArrayList<>();
    
    public static ArrayList <ArrayList> ordenLista = new ArrayList <ArrayList>();
    
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        
        int opcion = -1;
        
        while (opcion != 0){
            System.out.println("BIENVENIDO:");
            System.out.println("==========");
            System.out.println("\t Escoja una de las siguientes opciones");
            System.out.println("\t1) Hacer una Orden");
            System.out.println("\t2) Mostrar Orden");
            System.out.println("\t3) Mostrar total");
            System.out.println("\t0) Salir");
            opcion = in.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Nueva orden creada:\n");
                    
                    otroPro(lista);
                    break;
                case 2:
                   Orden ord;
                    mostrarOrdenes(ordenLista);
                    System.out.println("Seleccione la orden a mostrar: ");
                    int a = in.nextInt()-1;
                    System.out.println("Pulse intro para continuar.");
                    in.nextLine();
                    ord = ordenLista.get(a);
                    ord.mostrarOrden();
                    
                    
                    break;
                case 3:
                    mostrarOrdenes(ordenLista);
                    break;
                default:
                    System.out.println("Inserte un número entre el 0 y el 3.");
                    break;
            }
            
        }
        
    }
    
//    crea un array temporal de producto que se añade en un array list, al final
//            el array es limpiado
    
    public static void adProducto(){
        Producto proTemp [] = new Producto[1];
        System.out.println("Introduzca el nombre del producto:");
        String nom = in.nextLine();
        in.nextLine();
        System.out.println("Introduzca el precio:");
        double pre = in.nextDouble();
        in.nextLine();
        proTemp[0] = new Producto(nom , pre);
        lista.add(proTemp[0]);
    }
    
//    bucle para añadir indefinidos productos al arrayList al final esta se limpia
//    para ser usada en otra orden
    public static void otroPro(ArrayList <Producto> lista){
        
        
        System.out.println("¿Desea introducir otro producto?");
        System.out.println("y(sí)/n(no)");
        char a = in.next().charAt(0);
        while (a != 'y' && a!='n'){
            System.out.println("introduzca un valor válido (y ó n)");
            a = in.next().charAt(0);
        }
        while(a == 'y'){
            adProducto();
            System.out.println("¿Desea introducir otro producto?");
            System.out.println("y(sí)/n(no)");
            a = in.next().charAt(0);
        }
        adOrden();
    }
    
//    crea un array temporal de orden que se añade en un arrayList, al final
//            el array es limpiado
    
    public static void adOrden(){
        int indice = 0;
        Orden ord;
        ArrayList <Producto> listaProductos;
        listaProductos = lista.clone();
        ArrayList <Orden> ordTemp = new ArrayList <Orden>();
        ord = ordTemp.get(indice);
        ord = new Orden(lista);
        ordenLista.add(ordTemp);
        indice ++;
    }
    
//    Visualiza el id y el predio total de cada orden
    
    public static void mostrarOrdenes(ArrayList <Orden> ordenLista){
        for(int i = 0 ; i < ordenLista.size() ; i++){
            System.out.println("Orden: "+ordenLista.get(i).getIdOrden()+"\t"
                    + ordenLista.get(i).calcularTotal()+"€");
        }
    }
    
}
