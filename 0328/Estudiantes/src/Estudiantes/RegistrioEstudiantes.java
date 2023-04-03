
package Estudiantes;

import java.util.ArrayList;
import java.util.Iterator;
import Estudiantes.EstudianteInternacional;
/**
 *
 * @author anali
 */

public class RegistrioEstudiantes extends Estudiantes{

    public RegistrioEstudiantes(String nombre, String apellido, int edad, int nota_promedio) {
        super(nombre, apellido, edad, nota_promedio);
    }

    public RegistrioEstudiantes() {
    }
    
    Estudiantes a = new Estudiantes();
    ArrayList<Estudiantes> Estudiantes = new ArrayList();
    
    public String estudiantes[];
    
       
    public void mostrar()
    {
            System.out.println("Elige una opcion.\n");
            System.out.println("1. Insertar un alumno\n");
            System.out.println("2. Eliminar un alumno\n");
            System.out.println("3. Buscar un alumno\n");
            System.out.println("4. Salir\n");
            
    }
    public void eliminar(String nombre2)
    {
        Iterator<Estudiantes> it = Estudiantes.iterator();
        while(it.hasNext()){
            Estudiantes a = it.next();
            if(a.getNombre().equals(nombre2))
            {
                it.remove();
                System.out.println(nombre2+" eliminado exitosamente");
            }
        }
    }   
     public void agregar(Estudiantes x)
    {
        
        Estudiantes.add(x);
       
    }   
      public void buscar(String nombre2)
    {
        for (Estudiantes Estudiantes : Estudiantes) {
            if(Estudiantes.getNombre().equals(nombre2))
            {
                System.out.println("-------------------------------");
                System.out.println("Nombre: "+Estudiantes.getNombre()+" Apellido: "+Estudiantes.getApellido()+ " Edad: "+Estudiantes.getEdad()+ " Nota Promedio:"+Estudiantes.getNota_promedio());
                System.out.println("-------------------------------");
            }
        }
        
    }
      
        public void mostrarTodo (){
        System.out.println("\nMostrando todos los Estudiantes:");
        for (Estudiantes Estudiantes : Estudiantes) {
             System.out.println("Nombre: "+Estudiantes.getNombre()+" Apellido: "+Estudiantes.getApellido()+ " Edad: "+Estudiantes.getEdad()+ " Nota Promedio:"+Estudiantes.getNota_promedio());
        }
        System.out.println();
    }

 
  
      
}
