package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_23{
    public static void ejecutar(String[] args) { 
        // Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
        // harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
        // Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
        // produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
        // kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
        // Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
        // N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilogramos de harina obtenidos (M): ");
        int M = scanner.nextInt();
        System.out.print("Ingrese la cantidad de litros de aceite obtenidos (N): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el precio por bulto de harina (B1): ");
        int B1 = scanner.nextInt();
        System.out.print("Ingrese el precio por caja de aceite (B2): ");
        int B2 = scanner.nextInt();
        System.out.print("Ingrese el precio por kg de harina sobrante (B3): ");
        double B3 = scanner.nextDouble();
        System.out.print("Ingrese el precio por litro de aceite sobrante (B4): ");
        double B4 = scanner.nextDouble();
        int bultosHarina = M / 24;
        int harinaSobrante = M % 24;
        int cajasAceite = N / 15;
        int aceiteSobrante = N % 15;
        double ingresoBultosHarina = bultosHarina * B1;
        double ingresoHarinaSobrante = harinaSobrante * B3;
        double ingresoCajasAceite = cajasAceite * B2;
        double ingresoAceiteSobrante = aceiteSobrante * B4;
        double ingresoTotal = ingresoBultosHarina + ingresoHarinaSobrante + ingresoCajasAceite + ingresoAceiteSobrante;
        System.out.println("Ingreso Total: Bs. " + ingresoTotal);
      
    }
}