
import java.util.Scanner;
public class CalculadorPromedioVentas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numeroProductos;
        Productos[] losProductos = new Productos[50];
        String identificacion, nombre;
        double precio;
        double promedio = 0;
        
        System.out.println("Digite el numero de productos: ");
        numeroProductos = sc.nextInt();
        
        for(int i = 0; i < numeroProductos; i++){
            System.out.println("Digite la Identificacion del producto: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto: ");
            precio = sc.nextDouble();
            
            Productos unProducto = new Productos(identificacion, nombre, precio);
            losProductos[i] = unProducto;
        }
        for(int i = 0; i < numeroProductos; i++)
            promedio = promedio + losProductos[i].calcularPromedioVentas() / numeroProductos;
        
        System.out.println("\n El promedio de notas es: " + promedio); 
    }
}

