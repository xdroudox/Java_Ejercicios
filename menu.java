import Java_Ejercicios.*;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ejercicio;

        do {
            System.out.println("---------------- Menu de Ejercicios ----------------");
            for (int i = 1; i <= 23; i++) {
                System.out.println("Ejercicio ---> " + i);
            }
            System.out.println("Ingrese el numero del ejercicio o 0 para finalizar");
            ejercicio = scan.nextInt();
            switch (ejercicio) {
                case 1: ejercicio_1.ejecutar(args); break;
                case 2: ejercicio_2.ejecutar(args); break;
                case 3: ejercicio_3.ejecutar(args); break;
                case 4: ejercicio_4.ejecutar(args); break;
                case 5: ejercicio_5.ejecutar(args); break;
                case 6: ejercicio_6.ejecutar(args); break;
                case 7: ejercicio_7.ejecutar(args); break;
                case 8: ejercicio_8.ejecutar(args); break;
                case 9: ejercicio_9.ejecutar(args); break;
                case 10: ejercicio_10.ejecutar(args); break;
                case 11: ejercicio_11.ejecutar(args); break;
                case 12: ejercicio_12.ejecutar(args); break;
                case 13: ejercicio_13.ejecutar(args); break;
                case 14: ejercicio_14.ejecutar(args); break;
                case 15: ejercicio_15.ejecutar(args); break;
                case 16: ejercicio_16.ejecutar(args); break;
                case 17: ejercicio_17.ejecutar(args); break;
                case 18: ejercicio_18.ejecutar(args); break;
                case 19: ejercicio_19.ejecutar(args); break;
                case 20: ejercicio_20.ejecutar(args); break;
                case 21: ejercicio_21.ejecutar(args); break;
                case 22: ejercicio_22.ejecutar(args); break;
                case 23: ejercicio_23.ejecutar(args); break;
                case 0: System.out.println("Salida del menu exitosa"); break;
                default: System.out.println("Ejercicio no encontrado");
            }
        } while (ejercicio != 0);

        scan.close();
    }
}
