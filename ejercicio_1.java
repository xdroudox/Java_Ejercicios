package Java_Ejercicios;
import java.util.Scanner;

public class ejercicio_1 {
    public static void ejecutar (String[]args){
        System.out.println("Obtener el promedio de edad de tres personas.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Igrese edades");
        int edad1 = scan.nextInt();
        int edad2 = scan.nextInt();
        int edad3 = scan.nextInt();
        int promedio = (edad1 + edad2 + edad3) / 3;
        System.out.println("El promedio de las edades es: "+promedio);
        
    }

}