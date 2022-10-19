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
    
    public static ArrayList <Orden> historialVenta = new ArrayList<>();
    
//    indice me permite crear nuevos objetos de tipo Orden dentro del ArrayList
    
    public static int indice = 0;
    
    
    
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
            System.out.println("\t3) Mostrar Total");
            System.out.println("\t4) Terminar Orden");
            System.out.println("\t0) Salir");
            opcion = in.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Orden Creada");
                    in.nextLine();
                    otroPro();
                    break;
                case 2:
                    in.nextLine();
                    Orden ord;
                    mostrarOrdenes(historialVenta);
                    System.out.println("Seleccione la orden a mostrar: ");
                    int a = in.nextInt()-1;
                    System.out.println("Pulse intro para continuar.");
                    in.nextLine();
                    ord = historialVenta.get(a);
                    ord.mostrarOrden();
                    System.out.println("Pulse intro para continuar.");
                    in.nextLine();
                    
                    break;
                case 3:
                    in.nextLine();
                    mostrarOrdenes(historialVenta);
                    break;
                    
                case 4:
                    in.nextLine();
                    System.out.println("Orden Terminada");
                    System.out.println("Pulse intro para continuar");
                    in.nextLine();
                    indice++;
                    break;
                    
                default:
                    System.out.println("Inserte un número entre el 0 y el 4.");
                    break;
            }
            
        }
        
    }
    
//    crea un array temporal de producto que se añade en un array list, al final
//            el array es limpiado
    
    public static void adProducto(ArrayList <Producto> lista){
        
        Producto proTemp;
        System.out.println("Introduzca el nombre del producto:");
        String nom = in.nextLine();
        System.out.println("Introduzca el precio:");
        double pre = in.nextDouble();
        in.nextLine();
//        Instancio el Producto y lo añado al ArrayList de la Orden del indice
//          correspondiente
        proTemp = new Producto(nom , pre);
        lista.add(proTemp);
        
    }
    
//    bucle para añadir indefinidos productos al arrayList al final esta se limpia
//    para ser usada en otra orden
    
    
    public static void otroPro(){
//        Creo y añado la orden al arratList
        ArrayList <Producto> lista = new ArrayList<>();
        Orden entrada;
        entrada = new Orden(lista);
        historialVenta.add(entrada);
        
        System.out.println("¿Desea introducir un producto?");
        System.out.println("y(sí)/n(no)");
        char a = in.next().toLowerCase().charAt(0);
        in.nextLine();
        
        while (a != 'y' && a!='n'){
            System.out.println("introduzca un valor válido (y ó n)");
            a = in.next().toLowerCase().charAt(0);
            in.nextLine();
        }
        
        while(a == 'y'){
            adProducto(lista);
            System.out.println("¿Desea introducir otro producto?");
            System.out.println("y(sí)/n(no)");
            a = in.next().charAt(0);
            in.nextLine();
            
        }
        if(historialVenta.get(indice).getLista().size() >= 10){
            indice++;
        }
    }
    
    
       
        
    
    
//    Visualiza el id y el predio total de cada orden
    
    public static void mostrarOrdenes(ArrayList <Orden> historialVenta){
        for(int i = 0 ; i < historialVenta.size() ; i++){
            System.out.println("Orden: "+historialVenta.get(i).getIdOrden()+"\t"
                    + historialVenta.get(i).calcularTotal()+"€");
        }
    }
    
}
