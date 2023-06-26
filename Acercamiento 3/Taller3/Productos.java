
/**
 * Write a description of class Productos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Productos
{

    String identificacion;
    String nombre;
    double precio;
    Productos (String identificacion, String nombre, double precio){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    double calcularPromedioVentas(){
    return(precio);
    }
    
}
