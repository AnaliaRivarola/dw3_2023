
package Estudiantes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
    Scanner lector = new Scanner(System.in);
    ArrayList<Estudiantes> Estudiantes = new ArrayList();
    
    public String estudiantes[];
    
    @Override
        public void mostrarDetalles(){}
       
    public void mostrar()
    {
            System.out.println("Elige una opcion.\n");
            System.out.println("1. Insertar un alumno\n");
            System.out.println("2. Eliminar un alumno\n");
            System.out.println("3. Buscar un alumno\n");
            System.out.println("4. Salir\n");
            
    }
    public void eliminar()
    {
        System.out.println("Introduce el nombre del estudiante que desea eliminar");
        String nombre2 = lector.next();
        Iterator<Estudiantes> it = Estudiantes.iterator();
        while(it.hasNext()){
            Estudiantes a = it.next();
            if(a.getNombre().equals(nombre2))
            {
                it.remove();
            }
        }
    }   
     public void agregar()
    {
        
        System.out.println("Ingrese un nombre");
        nombre = lector.next();
        System.out.println("Ingrese un apellido");
        apellido = lector.next();
        System.out.println("Ingrese una edad");
        edad = lector.nextInt();
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setEdad(edad);
            a.setNota_promedio(nota_promedio);
            Estudiantes.add(a);
       
    }   
      public void buscar()
    {
        if(Estudiantes == null || Estudiantes.isEmpty())
        {
            System.out.println("-------------------------------\n");
            System.out.println("Lista Vacia\n");
            System.out.println("-------------------------------\n");
        }else
        {
            for(Estudiantes a: Estudiantes)
            {
            System.out.println("-------------------------------\n");
            System.out.println("Nombre: "+a.getNombre()+" Apellido: "+a.getApellido()+ " Edad: "+a.getEdad());
            System.out.println("-------------------------------\n");
            }
        }
        
    }
      
  
      
}
