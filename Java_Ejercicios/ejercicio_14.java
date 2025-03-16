package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_14 {
    public static void ejecutar(String[] args) {
        // El siguiente sistema de ecuaciones lineales:
        // aX + bY = c
        // dX + eY = f
        // se resuelve con las fórmulas:
        // X = ce - bf/ae – bd 
        // Y = af - cd /ae – bd}
        // calcule y muestre el valor de X e Y.
        Scanner scan = new Scanner(System.in);
        String [] letras = {"a", "b", "c", "d", "e", "f" };
        int [] valores = new int[6];
        for (int i = 0; i < letras.length; i++ ){
            System.out.println("Ingrese el valor de " + letras[i] + ":");
            valores[i] =scan.nextInt();
        };
        double a = valores[0];
        double b = valores[1];
        double c = valores[2];
        double d = valores[3];
        double e = valores[4];
        double f = valores[5];
        double x = (c * e - b * f) / (a * e - b * d);
        double y = (a * f - c * d) / (a * e - b * d);
        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
       
    }
}
