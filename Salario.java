/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author Sebastian
 */

import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lo que gana por hora preguntamos
        System.out.print("Ingrese la tarifa horaria: ");
        
        double tarifaHoraria = scanner.nextDouble();
        
        //Horas que trabaja cada día
        System.out.print("Ingrese las horas trabajadas diariamente: ");
        double horasDiarias = scanner.nextDouble();
        
        // Calcular salario semanal (7 días)
        double salarioSemanal = tarifaHoraria * horasDiarias * 7;
        
        System.out.println("Salario semanal: " + salarioSemanal);
    }
    
}
