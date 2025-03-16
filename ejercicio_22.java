package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_22 {
    public static void ejecutar(String[] args) {
        // Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
        // cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
        // recargo en el pago del computador por cuotas.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el precio del computador: ");
        double precio = scan.nextDouble();
        System.out.println("Ingrese el monto por cuota mensual: ");
        double precio_cuotas = scan.nextDouble();
        precio_cuotas *= 12;
        double recargo = (precio_cuotas - precio) / precio * 100;
        System.out.println("El recargo es: " + recargo + "% por el pago en cuotas");
        
    }
}
