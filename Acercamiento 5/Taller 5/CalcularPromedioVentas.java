
/**
 * Write a description of class CalcularPromedioVentas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CalcularPromedioVentas
{
  public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Ferreteria miFerreteria = new Ferreteria("830105953-7","FerrePadilla","Modelia");
        String identificacion, nombre, curso;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de productos de Griferia: ");
        int numeroProductos1 = sc.nextInt();
        for(int i = 0; i < numeroProductos1; i++){
            double precio;
            System.out.println("Digite la Identificacion del producto: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto: ");
            precio = sc.nextDouble();         
            miFerreteria.adicionarProductosGriferia(identificacion, nombre, precio);
        }
                
        System.out.println("Digite el numero de productos de Construccion: ");
        int numeroProductos2 = sc.nextInt();
        for(int i = 0; i < numeroProductos2; i++){
            double precio;
            System.out.println("Digite la Identificacion del producto: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto: ");
            precio = sc.nextDouble();
            miFerreteria.adicionarProductoConstruccion(identificacion, nombre, precio);
        }
        
        System.out.println("Digite el numero de procuctos de Decoracion: ");
        int numeroProductos3 = sc.nextInt();
        for(int i = 0; i < numeroProductos3; i++){
            double precio;            
            System.out.println("Digite la Identificacion del producto: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto: ");
            precio = sc.nextDouble();          
            miFerreteria.adicionarProductosDecorativos(identificacion, nombre, precio);
        }
        
        promedio = miFerreteria.calcularPromedioGeneral();
        System.out.println("\n El promedio de notas es: " + promedio); 
    }
}
