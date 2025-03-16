package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_8 {
    public static void ejecutar(String[] args) {
        // Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
        // √p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer lado en cm (a)");
        double a = scan.nextDouble();
        System.out.println("Ingrese el primer lado en cm (b)");
        double b = scan.nextDouble();
        System.out.println("Ingrese el primer lado en cm (c)");
        double c = scan.nextDouble();

        if ( a+b > c && b+ c > a && a + c > b){
             double perimetro = ((a + b + c)/2);
             double S_Area = (perimetro*((perimetro-a)*(perimetro-b)*(perimetro-c)));
             double Area = Math.sqrt(S_Area);
             System.out.println("El area del triangulo es " + String.format("%.2f",Area) + "cm²");
             
        }else{
            System.out.println("ERROR: La suma de los lados no crean un triangulo");
        };
        
    }
}
