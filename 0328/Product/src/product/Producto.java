
package product;

/**
 *
 * @author anali
 */
public class Producto implements Comparable<Producto>{
    public String nombre;
    public String descripcion;
    public int precio;
    public int cantidadStk;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, int precio, int cantidadStk) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStk = cantidadStk;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadStk() {
        return cantidadStk;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadStk(int cantidadStk) {
        this.cantidadStk = cantidadStk;
    }
    
    @Override
    public int compareTo(Producto otroProducto) {
        return this.precio - otroProducto.getPrecio();
    }
    
}
