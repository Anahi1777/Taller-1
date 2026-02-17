/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

/**
 *
 * 
 */

// importamos la herramienta scanner para leer datos del usuario
import java.util.Scanner;

public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea un objeto para leer lo que escribe el usuario
        // Scaner es el tipo de dato (como double, int)
        // leer es el nombre de la variable
        // new Scaner es crear un objeto nuevo 
        // system in de donde lee del teclado
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.print("Ingrese la base: ");
        // next double captura los datos numericos
        double base = leer.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        double altura = leer.nextDouble();
        
        double S = 0.5 * base * altura;
        
        System.out.println("S = " + S);
    }
}
       

    

        // TODO code application logic here
    
    


