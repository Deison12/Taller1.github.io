
/**
 * Write a description of class CalculadorPromedioVentas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CalculadorPromedioVentas
{ public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        int numeroProductos = 0, opcionMenu = 0;
        Productos[] losProductos = new Productos[50];
        String identificacion,nombre;
        double precio;
        double promedio = 0;
        while(opcionMenu !=3 ){
         System.out.println("\n Menu de Opciones");
         System.out.println("1. Adicionar Productos");
         System.out.println("2. Calcular Promedio de ventas");
         System.out.println("3. Salir");
         System.out.println("Elija una de las Opciones");
         opcionMenu = sc.nextInt();
         
             if(opcionMenu ==1 ){
              System.out.println("Digite la identificacion del producto: ");
              identificacion = sc.next();
              System.out.println("Digite el nombre del producto: ");
              nombre = sc.next();
              System.out.println("Digite el precio del producto: ");
              precio = sc.nextDouble();
              Productos unProducto = new Productos(identificacion,nombre,precio);
              losProductos[numeroProductos] = unProducto;
              numeroProductos++;
            }
            else if(opcionMenu ==2){
                for(int i=0; i<numeroProductos; i++){
                    promedio = promedio + losProductos[i].calcularPromedioVentas()/numeroProductos;
                }
                System.out.println("\n El promedio de las venta es: " + promedio );
            }
        }
    
    
    

      }
}
