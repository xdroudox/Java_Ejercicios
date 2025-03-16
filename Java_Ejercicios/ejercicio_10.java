package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_10 {
    public static void ejecutar(String[] args) {
        Scanner Scan = new Scanner(System.in);
    
    // El cambio de divisas en la bolsa de Madrid el 25/08/1987 fue el siguiente
    // 100 chelines austríacos = 956.871 pesetas
    // 1 dólar EEUU = 122.499 pesetas
    // 100 dracmas griegos = 88.607 pesetas
    // 100 francos belgas = 323.728 pesetas
    // 1 franco francés = 20.110 pesetas
    // 1 libra esterlina = 178.938 pesetas
    // 100 liras italianas = 9.289 pesetas
    // Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas. Lea una
    // cantidad en dracmas griegos e imprima su equivalente en francos franceses. Finalmente, lea una
    // cantidad en pesetas e imprima su equivalente en dólares y liras italianas.
        //chelines austriacos a pesetas
        System.out.println("Ingrese la cantidad de chelines austriacos");
        double Chelines_A = Scan.nextDouble();
        double unidad_chelines = 956.871/100;
        double pesetas = Chelines_A*unidad_chelines; 
        System.out.println("El valoir de chelines en pesetas es; " + String.format("%.4f",pesetas ) );
        //dracmas griegos a francos franceses
        System.out.println("Ingrese la cantidad de dracmas");
        double dracmas = Scan.nextDouble();
        double unidad_dracmas = 88.607/100; 
        double unidad_ff = 20.110;
        double franco_frances = (dracmas*unidad_dracmas)/unidad_ff;
        System.out.println("El valoir de dracmas griegos en francos franceses es; " + String.format("%.4f",franco_frances ));
         //pesetas a dolares y libras italianas
         System.out.println("Ingrese la cantidad de pesetas");
        double peseta = Scan.nextDouble();
        double unidad_dolares = 122.499;
        double unidad_italianas = 9.289/100;
        double dolares = peseta/unidad_dolares; 
        double libras_italianas = peseta/unidad_italianas; 
        System.out.println("El valor de pesetas en dolares es; " + String.format("%.4f",dolares )+ " y en libras italianas es: "+ String.format("%.4f",libras_italianas ) );
        
    }
}
