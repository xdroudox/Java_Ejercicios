import java.util.Scanner;
public class ejercicio_21 {
    public static void main(String[] args) {
        // Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
        // todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
        // inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
        // como resultado.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número de naranjas: ");
        int X = scan.nextInt();
        System.out.println("Ingrese el precio de la naranja por docena: ");
        int Y = scan.nextInt();
        System.out.println("Ingrese el valor de venta obtenido de las naranjas: ");
        int K = scan.nextInt();
        double num_docenas = X /12;
        double costo_total = Y * num_docenas;
        double porcentaje = ((K-costo_total )* 100 /costo_total) ;
        System.out.println("El porcentaje de ganancia es: "+porcentaje+"%");
    }
}
