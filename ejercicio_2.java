import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[]args){
        // Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
        // después de un mes si el banco paga a razón de 2% mensual.
        Scanner Scan = new Scanner(System.in);
        System.out.println("Ingrese el monto de dinero que desea invertir");
        Double capital = Scan.nextDouble();
        Double interes = capital * 0.02;
        Double total = capital + interes;
        System.out.println("Ganancias de interes del 2% mensual es de " +interes +"COP y su capital total es " +total +"COP");

    }
}
