/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.util.Scanner;


public class Envio extends Venta {
    
    public double calcularCostoEnvio(double distancia) {
    double costoBase = 5000; // costo base por envío
    double costoPorKilometro = 1; // costo adicional por cada kilómetro de distancia
    double costoTotal = costoBase + (distancia * costoPorKilometro);
    return costoTotal;
    }
    
    public void costoD()
    {
        double distancia = 20; // distancia en kilómetros
        double costoEnvio = calcularCostoEnvio(distancia);
        System.out.println("El costo de envío es: $" + costoEnvio);
    }
}
