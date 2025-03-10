import java.util.Scanner;
public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
        // N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
        // N8 billetes de 100.
        int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        int[] cantidades = new int[8];
        for (int i = 0; i < billetes.length; i++) {
            System.out.println("Ingrese la cantidad de billetes de " + billetes[i] + ": ");
            cantidades[i] = scan.nextInt();
        }
        int total = 0;
        for (int i = 0; i < billetes.length; i++) {
            total += billetes[i] * cantidades[i];
        }
        System.out.println("El total de dinero en el banco es: " + total);
        scan.close();
    }

    }

