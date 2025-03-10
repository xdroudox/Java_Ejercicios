import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        // Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
        // desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
        // el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el sueldo base: ");
        Double s_base = scan.nextDouble();
        System.out.println("Ingrese el monto de la venta #1: ");
        Double venta1 = scan.nextDouble();
        System.out.println("Ingrese el monto de la venta #2: ");
        Double venta2 = scan.nextDouble();
        System.out.println("Ingrese el monto de la venta #3: ");
        Double venta3 = scan.nextDouble();
        Double comisiones = (venta1 + venta2 + venta3) * 0.10;
        Double s_total= s_base + comisiones;
        System.out.println("Las ganancias por comisiones es de " + comisiones + " y el total que recibira es de " + s_total);
        scan.close();

    }
}
