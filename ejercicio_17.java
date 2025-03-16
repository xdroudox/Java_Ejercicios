package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_17 {
    public static void ejecutar(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
        // requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado.
        System.out.println("Ingrese el precio final pagado por el producto:");
        double p_final = scan.nextDouble();
        System.out.println("Ingrese el precio de venta al público (PVP) del producto:");
        double pvp = scan.nextDouble();
        double porcentaje = (((pvp - p_final)*100)/pvp);
        System.out.println("El porcentaje de descuento aplicado es: " + String.format("%.2f",porcentaje)+ "%");
       
    }
}
