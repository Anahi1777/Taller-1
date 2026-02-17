package triangulo;

import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la tarifa horaria: ");
        
        double tarifaHoraria = scanner.nextDouble();
        
        System.out.print("Ingrese las horas trabajadas diariamente: ");
        double horasDiarias = scanner.nextDouble();
        
        double salarioSemanal = tarifaHoraria * horasDiarias * 7;
        
        System.out.println("Salario semanal: " + salarioSemanal);
    }
    
}


