import java.util.Scanner;
public class ejercicio_20 {
    public static void main(String[] args) { 
        // Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares
        // Y de intereses en 4 años. La fórmula del interés es:
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor inicial del prestamo");
        double prestamo = scan.nextDouble();
        System.out.println("Ingrese el valor de pago recibido despues de 4 años");
        double pago = scan.nextDouble();
        double intereses = (pago - prestamo)/4;
        double porcentaje = (intereses*100)/prestamo;
        System.out.println("El porcentaje anual cobrado por el prestamo es: " + porcentaje + "%");
    }
}