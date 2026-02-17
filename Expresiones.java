package triangulo;

import java.util.Scanner;
public class Expresiones {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Ingrese los valores ===");
        
        System.out.print("Ingrese A: ");
        double a = scanner.nextDouble();
        
        System.out.print("Ingrese B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Ingrese C: ");
        double c = scanner.nextDouble();
        
        System.out.print("Ingrese X: ");
        double x = scanner.nextDouble();
        
        System.out.print("Ingrese Y: ");
        double y = scanner.nextDouble();
        
        System.out.print("Ingrese Z: ");
        double z = scanner.nextDouble();
        
        System.out.print("Ingrese D: ");
        double d = scanner.nextDouble();
        
        System.out.print("Ingrese X1: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Ingrese Y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Ingrese X2: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Ingrese Y2: ");
        double y2 = scanner.nextDouble();
        
        System.out.print("Ingrese R: ");
        double r = scanner.nextDouble();
        
        System.out.println("Resultados");
        
        // a) √(b² - 4ac)
        //Math.sqrt(): significa raiz cuadrada
        double expr_a = Math.sqrt(b * b - 4 * a * c);
        System.out.println("a) √(b^2 - 4ac) = " + expr_a);
        
        // b) (x^2 + y^2) / z^2
        double expr_b = (x * x + y * y) / (z * z);
        System.out.println("b) (x^2 + y^2) / z^2 = " + expr_b);
        
        // c) (3x + 2y) / (2z)
        double expr_c = (3 * x + 2 * y) / (2 * z);
        System.out.println("c) (3x + 2y) / (2z) = " + expr_c);
        
        // d) (a + b) / (c - d)
        double expr_d = (a + b) / (c - d);
        System.out.println("d) (a + b) / (c - d) = " + expr_d);
        
        // e) 4x^2 - 2x + 7
        double expr_e = 4 * x * x - 2 * x + 7;
        System.out.println("e) 4x^2 - 2x + 7 = " + expr_e);
        
         // f) (x + y) / (x - 3x/5)
        double expr_f = (x + y) / (x - 3 * x / 5);
        System.out.println("f) (x + y) / (x - 3x/5) = " + expr_f);
        
        // g) a / (bc)
        double expr_g = a / (b * c);
        System.out.println("g) a / (bc) = " + expr_g);
        
        // h) xyz
        double expr_h = x * y * z;
        System.out.println("h) xyz = " + expr_h);
        
        // i) (y2 - y1) / (x2 - x1)
        double expr_i = (y2 - y1) / (x2 - x1);
        System.out.println("i) (y2 - y1) / (x2 - x1) = " + expr_i);
        
        // j) 2πr
        double expr_j = 2 * Math.PI * r;
        System.out.println("j) 2πr = " + expr_j);
        
        // k) (4/3)πr^3
         double expr_k = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("k) (4/3)πr^3 = " + expr_k);
        
        // l) √((x2 - x1)^2 + (y2 - y1)^2)
        double expr_l = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("l) √((x2 - x1)^2 + (y2 - y1)^2) = " + expr_l);
        
        
    }
    
}


