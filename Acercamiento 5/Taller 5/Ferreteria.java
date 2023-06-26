
/**
 * Write a description of class Ferreteria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ferreteria
{   private final String nit;
    private String nombreFerreteria;
    private String direccion;
    private ProductosGriferia[] producto1;
    private ProductosConstruccion[] producto2;
    private ProductosDecorativos[] producto3;    
    private int numeroProducto1;
    private int numeroProducto2;
    private int numeroProducto3;    
    
    public Ferreteria(String nit,String nombreFerreteria,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreFerreteria(nombreFerreteria);
        setDireccion(direccion);        
        producto1 = new ProductosGriferia[50];
        producto2 = new ProductosConstruccion[50];
        producto3 = new ProductosDecorativos[50];        
        numeroProducto1 = 0;
        numeroProducto2 = 0;
        numeroProducto3 = 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreFerreteria(){
        return nombreFerreteria;
    }
    public void setNombreFerreteria(String nombreFerreteria){
        if(nombreFerreteria != null){
            this.nombreFerreteria = nombreFerreteria;
        }else{
            this.nombreFerreteria = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumeroProducto1(){
        return numeroProducto1;
    }
    
    public int getNumeroProducto2(){
        return numeroProducto2;
    }
    
    public int getNumeroProducto3(){
        return numeroProducto3;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numeroProducto1; i++){
            promedio = promedio + producto1[i].calcularPromedioVentasG() / numeroProducto1;
        }
        for(int i = 0; i < numeroProducto2; i++){
            promedio = promedio + producto2[i].calcularPromedioVentasC() / numeroProducto2;
        }
        for(int i = 0; i < numeroProducto3; i++){
            promedio = promedio + producto3[i].calcularPromedioVentasD() / numeroProducto3;
        }
        return promedio / 3;
    }
    public void adicionarProductosGriferia(String identificacion, String nombre,double precio){
        producto1[numeroProducto1] = new ProductosGriferia(identificacion, nombre, precio);
        numeroProducto1++;
    }
    
    public void adicionarProductoConstruccion(String identificacion, String nombre, double precio){
        producto2[numeroProducto2]  = new ProductosConstruccion(identificacion, nombre, precio);
        numeroProducto2++;
    }
    
    public void adicionarProductosDecorativos(String identificacion, String nombre,double precio){
        producto3[numeroProducto3] = new ProductosDecorativos(identificacion, nombre, precio);
        numeroProducto3++;
    }
}
