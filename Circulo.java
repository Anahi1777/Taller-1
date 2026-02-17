
package triangulo;

import java.util.Scanner;

  public class Circulo {
      
    public static void main(String[] args){
        
     Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();
        
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        
        System.out.println("Radio: " + radio);
        System.out.println("Longitud: " + longitud);
        System.out.println("Área: " + area);
    
    } 
}


