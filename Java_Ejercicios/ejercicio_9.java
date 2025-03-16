package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_9 {
    public static void ejecutar(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
        // hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%.
        // Valor de hora laboral $6.189
        double valor_h = 6189;
        System.out.println("Ingrese las horas totales laboradas");
        int horas = scan.nextInt();
        double salario = (horas*valor_h)- (horas*valor_h)*0.20;
        System.out.println("El salario neto es de " + salario +" COP");
       
    }
}
