import Java_Ejercicios.*;
import java.util.Scanner;
import java.lang.reflect.Method;

public class menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ejercicio;
        do {
            System.out.println("--------------- Menu de Ejercicios ----------------");
            for (int i = 1; i <= 40; i++) {
                System.out.println("Ejercicio ---> " + i);
            }
            System.out.println("Ingrese el número del ejercicio o 0 para finalizar:");
            ejercicio = scan.nextInt();

            if (ejercicio >= 1 && ejercicio <= 40) {
                ejecutarEjercicio(ejercicio, args);
            } else if (ejercicio != 0) {
                System.out.println("Ejercicio no encontrado.");
            }
        } while (ejercicio != 0);

        System.out.println("Salida del menú exitosa.");
        scan.close();
    }

    private static void ejecutarEjercicio(int numero, String[] args) {
        String claseNombre = "";

        if (numero >= 1 && numero <= 23) {
            claseNombre = "Java_Ejercicios.ejercicios_secuenciales";
        } else if (numero >= 24 && numero <= 40) {
            claseNombre = "Java_Ejercicios.EjerciciosCondicionales";
        }

        try {
            Class<?> clase = Class.forName(claseNombre);
            Method metodo = clase.getMethod("ejercicio" + numero, String[].class);
            metodo.invoke(null, (Object) args);
        } catch (Exception e) {
            System.out.println("Error al ejecutar el ejercicio " + numero);
            e.printStackTrace();
        }
    }
}

