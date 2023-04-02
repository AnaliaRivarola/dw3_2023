
package product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 *
 * @author anali
 */
public class Venta extends Producto implements Comparable<Producto> {
    Producto a1 = new Producto();
    ArrayList<Producto> productos = new ArrayList<>();
    
    public String Productos[];
        
    
    public void eliminar(String nombre2)
    {
        Iterator<Producto> it = productos.iterator();
        while(it.hasNext()){
            Producto a1 = it.next();
            if(a1.getNombre().equals(nombre2))
            {
                it.remove();
                System.out.println(nombre2+" eliminado exitosamente");
            }
        }
    }
    

     public void agregar(Producto x)
    {          
        productos.add(x);
       
    }   
      public void buscar(String nombre2)
    {
        
        for (product.Producto producto : productos) {
            if(producto.getNombre().equals(nombre2))
            {
                System.out.println("-------------------------------");
                System.out.println("Nombre: "+producto.getNombre()+" Descripcion: "+producto.getDescripcion()+ " Precio: "+producto.getPrecio()+ "Cantidad en Stock: "+producto.getCantidadStk());
                System.out.println("-------------------------------");
            }
        }
        }
           

    public void mostrarTodo(){
        System.out.println("\nMostrando todos los productos:");
        for (Producto producto : productos) {
            System.out.println("Nombre: "+producto.getNombre()+" Descripcion: "+producto.getDescripcion()+ " Precio: "+producto.getPrecio()+ "Cantidad en Stock: "+producto.getCantidadStk());
        }
        System.out.println();
    }
      
    public void ordenar()
    {
        Collections.sort(productos);
        System.out.println("Lista ordenada exitosamente.");
    }
}
