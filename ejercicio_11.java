import java.util.Scanner;
public class ejercicio_11 {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
    //Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora
    // normal y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del
    // valor de una hora normal. Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%
    // de política habitacional y 7% para caja de ahorro. Si se le asignan 25000 Bolívares por actualización
    // académica, 17300 Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
    // muestre las asignaciones, las deducciones y el sueldo neto del trabajador.
    
    System.out.println("Ingrese nombre del trabajador ");
    String nombre = scan.nextLine();
    System.out.println("Ingrese las horas totales laboradas ");
    int horas = scan.nextInt();
    System.out.println("Ingrese las horas extras laboradas ");
    int hora_extra = scan.nextInt();
    System.out.println("Ingrese la cantidad de hijos");
    int c_hijos = scan.nextInt();
    double valor_h = 6189;
    double v_extras = (valor_h*0.25);
    double sueldo_base = ((horas*valor_h)+(hora_extra*v_extras));
    
    //asignaciones
    double asignaciones = 25000+(17300*c_hijos)+18000;
    //deducciones 
    double deducciones = sueldo_base*0.14;
    //sueldo neto
    double sueldo_neto = sueldo_base+asignaciones-deducciones;
    System.out.println("Nombre del empleado "+ nombre);
    System.out.println("Valor total por " +horas+ " horas laboradas: "+ (horas*valor_h)+" Bolivares");
    System.out.println("Valor total por " +hora_extra+ " horas extras laboradas: "+ (hora_extra*v_extras) +" Bolivares");
    System.out.println("El valor de su sueldo base es "+ sueldo_base +" Bolivares");
    System.out.println("El valor de sus asignaciones es "+ asignaciones +" Bolivares");
    System.out.println("El valor de sus deducciones es "+ String.format("%.3f",deducciones) +" Bolivares");
    System.out.println("El valor de su sueldo neto es "+ sueldo_neto +" Bolivares");
    scan.close();
    }
   
}
