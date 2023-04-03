//
package Estudiantes;

import java.util.ArrayList;



/**
 *
 * @author anali
 */
public  class  EstudianteInternacional extends Estudiantes
{
    private  String p_origen = "Estados Unidos";
    ArrayList<EstudianteInternacional> estudiantes = new ArrayList<>();
    public EstudianteInternacional() {
    }

    public EstudianteInternacional(String nombre, String apellido, int edad, int nota_promedio, String p_origen) {
        super(nombre, apellido, edad, nota_promedio);
        this.p_origen = p_origen;
    }



    public void setP_origen(String p_origen) {
        this.p_origen = p_origen;
    }
    
    
  public void EstudianteInte(Estudiantes inte, String x)
  {
      if (inte instanceof EstudianteInternacional) 
        {
            System.out.println(x+" Es un estudiante internacional");
            
        } else if (inte instanceof Estudiantes) {
            System.out.println("Es un Estudiante Paraguayo");
        }
  }
  
          
}
