/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estudiantes;

import java.util.Scanner;

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
            RegistrioEstudiantes a1 = new RegistrioEstudiantes();
            EstudianteInternacional i = new EstudianteInternacional();
            Scanner lector = new Scanner(System.in);
            System.out.println("Introduzca 0 para empezar");
            int opcion = lector.nextInt();
            while(opcion!=4)
            {
                a1.mostrar();
                opcion = lector.nextInt();
                switch (opcion) { 
                case 1 -> {
                   
                    a1.agregar();
                    i.EstudianteInt();
                    }
               case 2 -> a1.eliminar();
                    
               case 3 -> // secuencia de sentencias.
                    a1.buscar();
             }
            
            }
            
    }
    
}
