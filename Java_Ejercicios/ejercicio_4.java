package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_4 {
    public static void ejecutar(String[] args) {
        // Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
        // deberá pagar finalmente por su compra.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese monto de la compra");
        double monto = scan.nextDouble();
        double descuento = monto * 0.15;
        double monto_final = monto - descuento;
        System.out.println("El total a pagar es de "+ monto_final);
      
        
    }
}
