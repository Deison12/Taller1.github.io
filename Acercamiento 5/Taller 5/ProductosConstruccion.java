
/**
 * Write a description of class ProductosConstruccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductosConstruccion
{
    private final String identificacion;
    private String nombre;
    private double precio;
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        if(precio >= 0) this.precio = precio;
        else this.precio = 0;
    }
    
    ProductosConstruccion(String identificacion, String nombre, double precio){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setPrecio(precio);
    }
    
    double calcularPromedioVentasC(){
        return (precio);
    }
}
