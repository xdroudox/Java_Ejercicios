import Java_Ejercicios.*;
import java.util.Scanner;
import java.lang.reflect.Method;

public class menu 
{
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
            if (ejercicio >= 1 && ejercicio <= 23) {
                ejecutarEjercicio(ejercicio, args);
            } else if (ejercicio != 0) {
                System.out.println("Ejercicio no encontrado");
            }
        } while (ejercicio != 0);

        System.out.println("Salida del menú exitosa");
        scan.close();
    }
    private static void ejecutarEjercicio(int numero, String[] args) {
        try {
            Class<?> clase = Class.forName("Java_Ejercicios.ejercicios_secuenciales");
            Method metodo = clase.getMethod("ejercicio" + numero, String[].class);
            metodo.invoke(null, (Object) args);
        } catch (Exception e) {
            System.out.println("Error al ejecutar el ejercicio " + numero);
            e.printStackTrace();
        }
    }
        
}

