import java.util.Scanner;
public class ejercicio_18 {
    public static void main(String[] args) {
        // Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que
        // surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre
        // lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
        // del litro es de 100 Bolívares.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de galones que surtió el surtidor:");
        double galones = scan.nextDouble();
        double litros = galones * 3.785;
        double precio = litros * 100;
        System.out.println("El precio a pagar es: " + precio + " Bolivares");
        scan.close();
    }
}
