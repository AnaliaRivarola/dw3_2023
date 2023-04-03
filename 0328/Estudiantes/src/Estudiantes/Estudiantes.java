
package Estudiantes;

/**
 *
 * @author anali
 */


public class Estudiantes {
    public String nombre;
    public String apellido;
    public int edad;
    public int nota_promedio;

    public Estudiantes(String nombre, String apellido, int edad, int nota_promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota_promedio = nota_promedio;
    }

    public Estudiantes(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Estudiantes() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getNota_promedio() {
        return nota_promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota_promedio(int nota_promedio) {
        this.nota_promedio = nota_promedio;
    }
    
    public void mostrarDetalles()
    {
    }

    
}
