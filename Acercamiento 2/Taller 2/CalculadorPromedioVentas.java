
/**
 * Write a description of class CalculadorPromedioVentas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CalculadorPromedioVentas
{  
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int numeroProductos;
        Productos[] Losproductos = new Productos[50];
        String identificacion, nombre;
        double precio;
        double promedio =0;
    
        System.out.println("Digite la cantidad de productos: ");
        numeroProductos = sc.nextInt();
    
        for(int i=0; i < numeroProductos; i++){
            System.out.println("Digite la identificacion del producto: ");
            identificacion = sc.next();
            System.out.println("Digite el nomnbre del producto: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto: ");
            precio = sc.nextDouble();
        
            Productos unProducto = new Productos();
            unProducto.identificacion = identificacion;
            unProducto.nombre = nombre;
            unProducto.precio = precio;
       
            Losproductos[i]= unProducto;
        }
        for(int i = 0; i< numeroProductos; i++){
            double sum = (Losproductos[i].precio);
            promedio = promedio + sum/ numeroProductos;
        }
        System.out.println(" El promedio de la ventas es: " + promedio);
    }
    
}
