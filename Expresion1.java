/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author Sebastian
 */
public class Expresion1 {
     public static void main(String[] args) {
        double A = 2;
        double B = 5;
        
        // Expresión: 3 * A - 4 * B / A ^ 2
        //Math.pow: elevar al cuadrado
        double resultado = 3 * A - 4 * B / Math.pow(A, 2);
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("Resultado: " + resultado);
    }
    
}
