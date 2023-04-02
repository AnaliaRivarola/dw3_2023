
package product;
import java.util.Scanner;

/**
 *
 * @author anali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1 = new Producto("Jabon","Marca Yuri",5000,60);
        Producto producto2 = new Producto("Agua","Marca Dasani",3500,60);
        Producto producto3 = new Producto("Chupetin","Marca Arcor",1000,60);
        
        Venta a = new Venta(); 
        a.agregar(producto1);
        a.agregar(producto2);
        a.agregar(producto3);
        
        a.buscar("Jabon");
        
        a.mostrarTodo();
        
        a.ordenar();
        
        a.mostrarTodo();
        
        a.eliminar("Agua");
        
        a.mostrarTodo();
        
        Envio env = new Envio();
        env.costoD();
        
    }
    
}
