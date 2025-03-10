import java.util.Scanner;
public class ejercicio_15 {
    public static void main(String[] args) {
        // Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
        // anterior, la lectura actual y el costo por kilovatio.
        // Estrato 1: $349,8 por kWh para consumos hasta el límite de subsistencia.
        // Estrato 2: $867,8 por kWh para consumos hasta el límite de subsistencia.
        // Estrato 3: $737,6 por kWh para consumos hasta el límite de subsistencia.
        // Estratos 4, 5 y 6: $1.041 por kWh para todo consumo.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la lectura anterior Kwh/mes: ");
        int lectura_anterior = scan.nextInt();
        System.out.println("Ingrese la lectura actual kwh/mes: ");
        int lectura_actual = scan.nextInt();
        System.out.println("Ingrese su estrato 1-6: ");
        int estrato = scan.nextInt();
        double precio = 0;
        switch (estrato) {
            case 1:
                precio = 349.8;
                break;
            case 2:
                precio = 867.8;
                break;
            case 3:
                precio = 737.6;
                break;
            default: 
                precio = 1041;
            break;
        }
        int consumo = lectura_actual - lectura_anterior; 
        double pago_actual = consumo * precio ;
        System.out.println("Consumo del mes: " + consumo + " kWh");
        System.out.println("Pago de electricidad este mes: " + pago_actual);
        scan.close();
    }
}
