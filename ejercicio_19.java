package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_19 {
    public static void ejecutar(String[] args) {
        // En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología. El presupuesto anual
        // del hospital se reparte conforme a la siguiente tabla:
        // Área Porcentaje del presupuesto
        // Ginecología 40%
        // Traumatología 30%
        // Pediatría 30%
        // Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestado.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el monto presupuestado: ");
        double presupuesto = scan.nextDouble();
        double Ginecología = (presupuesto * 40)/100;
        double Traumatología = (presupuesto * 30)/100;
        double Pediatria =  (presupuesto * 30)/100;
        System.out.println("Cantidad de dinero que recibirá las areas; ");
        System.out.println("Ginecología: " + Ginecología);
        System.out.println("Traumatología: " + Traumatología);
        System.out.println("Pediatria: " + Pediatria);
      
    }
}
