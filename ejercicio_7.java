import java.util.Scanner;
import java.util.regex.Matcher;
public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matcher matcher;
        // Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
        // siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.
        System.out.println("Ingrese la cantidad en metros: ");
        Double metros = scan.nextDouble();
        Double pulgadas = metros * 39.27;
        Double pies = pulgadas / 12;
        System.out.println("Los metros en pulgadas equivalen a " + String.format("%.2f",pulgadas)  + " pulgadas");
        System.out.println("Los metros en pies equivalen a " + String.format("%.2f",pies) + " pies");
    }
}
