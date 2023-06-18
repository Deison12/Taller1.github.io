package Taller1;


/**
 * Write a description of class Calculador_Promedio_Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calculador_Promedio_Ventas
{
    public static void main(String[] args){
        int cantidadProductos;
        double promedio = 0;
        
        Scanner objCpv = new Scanner(System.in);
        
        System.out.println("INGRESE LA CANTIDAD DE PRODUCTOS A EVALUAR: ");
        cantidadProductos = objCpv.nextInt();
        
        int[] identificacion = new int[cantidadProductos];
        char[] nombres = new char[cantidadProductos];
        double[] precio = new double[cantidadProductos];
        
        for (int i=0; i<cantidadProductos; i++){
            
            System.out.println("INGRESE LA IDENTIFICACION DEL PRODUCTO: "+ (i+1)); 
            identificacion[i] = objCpv.nextInt();
            
            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO: "+ (i+1)); 
            nombres[i] = objCpv.next().charAt(0);
            
            System.out.println("INGRESE EL VALOR DE VENTA DEL PRODUCTO: "+ (i+1)); 
            precio[i] = objCpv.nextDouble();
            
        }
        for (int i=0; i<cantidadProductos; i++){
            promedio = promedio + precio[i] / cantidadProductos;    
            
            
        }
        System.out.println("El promedio de ventas es: " + promedio);
    }
}
