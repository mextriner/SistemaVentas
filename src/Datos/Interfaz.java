/*
 * Aquí ca el CRUD*/
package Datos;

/**
 *
 * @author Alumno Mañana
 */
public interface Interfaz {
    
    public void crearArchivo(String nombre);
    public void escribirArchivo(String nombre, String contenido);
    public void agregarArchivo(String nombre, String contenido);
    public void leerArchivo(String nombre);
    public void leerArchivoPorPalabra(String nombre);

}
