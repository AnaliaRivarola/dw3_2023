//
package Estudiantes;

import java.util.Scanner;

/**
 *
 * @author anali
 */
public  class  EstudianteInternacional extends Estudiantes
{
    private  String p_origen;
    Scanner lector = new Scanner(System.in);
    public EstudianteInternacional() {
    }

    public EstudianteInternacional(String nombre, String apellido, int edad, int nota_promedio, String p_origen) {
        super(nombre, apellido, edad, nota_promedio);
        this.p_origen = p_origen;
    }
    
    
    
    public void EstudianteInt(){
        System.out.println("Ingrese su nacionalidad");
        p_origen = lector.next();
        System.out.println("Nacionalidad"+p_origen);
    }
    
}
