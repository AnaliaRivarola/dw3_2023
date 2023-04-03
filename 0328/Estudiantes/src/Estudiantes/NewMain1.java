/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estudiantes;



/**
 *
 * @author anali
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //public void mostrarDetalles(){
        
        
        Estudiantes es1 = new Estudiantes("Analia","Rivarola",20,4);
        Estudiantes es2 = new Estudiantes("Juan","Lopez",21,3);
        Estudiantes es3 = new Estudiantes("Maira","Suarez",18,5);
        Estudiantes es4 = new Estudiantes("Mateo","Barrios",22,2);
        Estudiantes inte = new EstudianteInternacional("Kairo","Mainz",22,5,"Estados Unidos");
        RegistrioEstudiantes a = new RegistrioEstudiantes();
        EstudianteInternacional i = new EstudianteInternacional();
        a.agregar(es1);
        a.agregar(es2);
        a.agregar(es3);
        a.agregar(es4);
        a.agregar(inte);
        
        
        a.mostrarTodo();
        
        i.EstudianteInte(inte,"Kairo");
           
        a.buscar("Maira");
        
           
        a.mostrarTodo();
        
           
        a.eliminar("Mateo");
        
           
        a.mostrarTodo();
    }
    
}
