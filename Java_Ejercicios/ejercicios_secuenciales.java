package Java_Ejercicios;
import java.util.Scanner;


public class ejercicios_secuenciales {
    static Scanner scan = new Scanner(System.in);
    public static void ejercicio1 (String[]args){
        System.out.println("Obtener el promedio de edad de tres personas.");
        
        System.out.println("Igrese edades");
        int edad1 = scan.nextInt();
        int edad2 = scan.nextInt();
        int edad3 = scan.nextInt();
        int promedio = (edad1 + edad2 + edad3) / 3;
        System.out.println("El promedio de las edades es: "+promedio); 
    }

    public static void ejercicio2 (String[]args){
        // Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
        // después de un mes si el banco paga a razón de 2% mensual.
        System.out.println("Ingrese el monto de dinero que desea invertir");
        Double capital = scan.nextDouble();
        Double interes = capital * 0.02;
        Double total = capital + interes;
        System.out.println("Ganancias de interes del 2% mensual es de " +interes +"COP y su capital total es " +total +"COP");
    }

    public static void ejercicio3 (String[] args) {
        // Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
        // desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
        // el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones.
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
    }

    public static void ejercicio4 (String[] args) {
        // Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
        // deberá pagar finalmente por su compra.
        System.out.println("Ingrese monto de la compra");
        double monto = scan.nextDouble();
        double descuento = monto * 0.15;
        double monto_final = monto - descuento;
        System.out.println("El total a pagar es de "+ monto_final);
    }

    public static void ejercicio5 (String[] args) {
        
        // Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
        // se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
        // 30% de la calificación del examen final y 15% de la calificación de un trabajo final.
        System.out.println("A continuacion obtendra su calificacion final la cual esta entre 00 y 100");
        System.out.println("Ingresa las 3 calificaciones de los parciales la cual equivale al 55% de la calificación final");
        double parcial1 = scan.nextDouble();
        double parcial2 = scan.nextDouble();   
        double parcial3 = scan.nextDouble();
        double p_parciales = ((parcial1 + parcial2 + parcial3) /3);
        System.out.println("Ingresa la calificación fianl del examen el cual equivale al 30%");
        double examen = scan.nextDouble();
        System.out.println("Ingresa la calificación del trabajo final el cual equivale al 15%");
        double t_final = scan.nextDouble();
        double calficacion_final = (p_parciales*0.55 + examen*0.30+ t_final*0.15);
        System.out.println("Calificación final = " + calficacion_final);
        if (calficacion_final >= 60) {
            System.out.println("Aprobado");
                
        } else {
            System.out.println("Reprobo");
        }
        
    }    
    
    public static void ejercicio6 (String[] args) {
        // Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
        // de estudiantes.
        System.out.println("Ingrese el número total de estudiantes: ");
        int t_estudiantes = scan.nextInt();
        System.out.println("Ingrese el número total de hombres: ");
        int hombres = scan.nextInt();
        System.out.println("El número total de mujeres: ");
        int mujeres = (t_estudiantes - hombres);
        System.out.println(mujeres);
        System.out.println("El porcentaje de hombres es "+((hombres*100)/t_estudiantes)+ "%");
        System.out.println("El porcentaje total de mujeres es "+ ((mujeres*100)/t_estudiantes)+ "%");
       
    }

    public static void ejercicio7 (String[] args) {
        
        // Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
        // siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.
        System.out.println("Ingrese la cantidad en metros: ");
        Double metros = scan.nextDouble();
        Double pulgadas = metros * 39.27;
        Double pies = pulgadas / 12;
        System.out.println("Los metros en pulgadas equivalen a " + String.format("%.2f",pulgadas)  + " pulgadas");
        System.out.println("Los metros en pies equivalen a " + String.format("%.2f",pies) + " pies");
      
    }

    public static void ejercicio8 (String[] args) {
        // Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
        // √p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2
        
        
        System.out.println("Ingrese el primer lado en cm (a)");
        double a = scan.nextDouble();
        System.out.println("Ingrese el primer lado en cm (b)");
        double b = scan.nextDouble();
        System.out.println("Ingrese el primer lado en cm (c)");
        double c = scan.nextDouble();

        if ( a+b > c && b+ c > a && a + c > b){
             double perimetro = ((a + b + c)/2);
             double S_Area = (perimetro*((perimetro-a)*(perimetro-b)*(perimetro-c)));
             double Area = Math.sqrt(S_Area);
             System.out.println("El area del triangulo es " + String.format("%.2f",Area) + "cm²");
             
        }else{
            System.out.println("ERROR: La suma de los lados no crean un triangulo");
        };
        
    }

    public static void ejercicio9 (String[] args) {
        
        // Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
        // hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%.
        // Valor de hora laboral $6.189
        double valor_h = 6189;
        System.out.println("Ingrese las horas totales laboradas");
        int horas = scan.nextInt();
        double salario = (horas*valor_h)- (horas*valor_h)*0.20;
        System.out.println("El salario neto es de " + salario +" COP");
       
    }

    public static void ejercicio10 (String[] args) {
        
    
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
        double Chelines_A = scan.nextDouble();
        double unidad_chelines = 956.871/100;
        double pesetas = Chelines_A*unidad_chelines; 
        System.out.println("El valoir de chelines en pesetas es; " + String.format("%.4f",pesetas ) );
        //dracmas griegos a francos franceses
        System.out.println("Ingrese la cantidad de dracmas");
        double dracmas = scan.nextDouble();
        double unidad_dracmas = 88.607/100; 
        double unidad_ff = 20.110;
        double franco_frances = (dracmas*unidad_dracmas)/unidad_ff;
        System.out.println("El valoir de dracmas griegos en francos franceses es; " + String.format("%.4f",franco_frances ));
         //pesetas a dolares y libras italianas
         System.out.println("Ingrese la cantidad de pesetas");
        double peseta = scan.nextDouble();
        double unidad_dolares = 122.499;
        double unidad_italianas = 9.289/100;
        double dolares = peseta/unidad_dolares; 
        double libras_italianas = peseta/unidad_italianas; 
        System.out.println("El valor de pesetas en dolares es; " + String.format("%.4f",dolares )+ " y en libras italianas es: "+ String.format("%.4f",libras_italianas ) );
        
    }

    public static void ejercicio11 (String[]args){
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
   
    }

    public static void ejercicio12 (String[] args) {
        // Calcule y muestre, a un alumno, cuál será su promedio general en las tres materias más difíciles que
        // cursa y cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se
        // muestra a continuación:
        // Matemática Examen 90% y 10% del promedio de tres tareas.
        // Física Examen 80% y 20% del promedio de dos tareas.
        // Química Examen 85% y 15% del promedio de tres tareas.
        
        //matematicas
        System.out.println("Ingrese la nota del examen de Matemática");
        double m_examen = scan.nextDouble();
        double s_taream = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota de la tarea ");
            double m_tarea = scan.nextDouble();
            s_taream =+m_tarea;
         }
        double nota_matematicas= (m_examen*0.90)+((s_taream/3)*0.10);
         System.out.println("Las nota de materia de matematicas es: "+nota_matematicas);
         
         //fisica
        System.out.println("Ingrese la nota del examen de fisica");
        double f_examen = scan.nextDouble();
        double s_tareaf = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese la nota de la tarea ");
            double f_tarea = scan.nextDouble();
            s_tareaf =+f_tarea;
         }
        double nota_fisica= (f_examen*0.80)+((s_tareaf/2)*0.20);
        System.out.println("La nota de la materia de fisica es : "+nota_fisica);

        //quimica
        System.out.println("Ingrese la nota del examen de quimica ");
        double q_examen = scan.nextDouble();
        double s_tareaq = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota de la tarea ");
            double q_tarea = scan.nextDouble();
            s_tareaq +=q_tarea;
         }
        double nota_quimica= (q_examen*0.85)+((s_tareaq/2)*0.15);
        System.out.println("La nota de la materia de quimica es : "+ nota_quimica);
        
    }

    public static void ejercicio13 (String[] args) {
        
        // Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
        // N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
        // N8 billetes de 100.
        int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        int[] cantidades = new int[8];
        for (int i = 0; i < billetes.length; i++) {
            System.out.println("Ingrese la cantidad de billetes de " + billetes[i] + ": ");
            cantidades[i] = scan.nextInt();
        }
        int total = 0;
        for (int i = 0; i < billetes.length; i++) {
            total += billetes[i] * cantidades[i];
        }
        System.out.println("El total de dinero en el banco es: " + total);
        
    }

    public static void ejercicio14 (String[] args) {
        // El siguiente sistema de ecuaciones lineales:
        // aX + bY = c
        // dX + eY = f
        // se resuelve con las fórmulas:
        // X = ce - bf/ae – bd 
        // Y = af - cd /ae – bd}
        // calcule y muestre el valor de X e Y.
        
        String [] letras = {"a", "b", "c", "d", "e", "f" };
        int [] valores = new int[6];
        for (int i = 0; i < letras.length; i++ ){
            System.out.println("Ingrese el valor de " + letras[i] + ":");
            valores[i] =scan.nextInt();
        };
        double a = valores[0];
        double b = valores[1];
        double c = valores[2];
        double d = valores[3];
        double e = valores[4];
        double f = valores[5];
        double x = (c * e - b * f) / (a * e - b * d);
        double y = (a * f - c * d) / (a * e - b * d);
        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
       
    }

    public static void ejercicio15 (String[] args) {
        // Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
        // anterior, la lectura actual y el costo por kilovatio.
        // Estrato 1: $349,8 por kWh
        // Estrato 2: $867,8 por kWh
        // Estrato 3: $737,6 por kWh 
        // Estratos 4, 5 y 6: $1.041 por kWh
        
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
        System.out.println("Consumo del mes: " + consumo + " Kwh");
        System.out.println("Pago de electricidad este mes: " + pago_actual);
        
    }

    public static void ejercicio16 (String[] args) {
        // Una empresa X trabaja con láminas de hierro para fabricar una pieza. Se conoce que (a) la lámina
        // mide en promedio 4 metros de largo por 1.5 metros de ancho; (b) la pieza a fabricar consume 0.5
        // metros en total. Se requiere que calcule y muestre cuántas piezas se fabrican con una lámina y
        // cuánto será el desperdicio.
        double largo = 4;
        double ancho = 1.5;
        double consumo = 0.5; //suponiendo que 0.5 es en m² 
        int piezas = 0;
        double area = largo * ancho;
        while (area >= consumo) { 
            area -= consumo;
            piezas++;
        }
        System.out.println("Las piezas totales son : "+piezas);
        System.out.println("El residuo total es "+area +"m²");
    } 
    
    public static void ejercicio17 (String[] args) {
        
        // Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
        // requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado.
        System.out.println("Ingrese el precio final pagado por el producto:");
        double p_final = scan.nextDouble();
        System.out.println("Ingrese el precio de venta al público (PVP) del producto:");
        double pvp = scan.nextDouble();
        double porcentaje = (((pvp - p_final)*100)/pvp);
        System.out.println("El porcentaje de descuento aplicado es: " + String.format("%.2f",porcentaje)+ "%");
       
    }

    public static void ejercicio18 (String[] args) {
        // Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que
        // surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre
        // lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
        // del litro es de 100 Bolívares.
        
        System.out.println("Ingrese la cantidad de galones que surtió el surtidor:");
        double galones = scan.nextDouble();
        double litros = galones * 3.785;
        double precio = litros * 100;
        System.out.println("El precio a pagar es: " + precio + " Bolivares");
       
    }

    public static void ejercicio19 (String[] args) {
        // En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología. El presupuesto anual
        // del hospital se reparte conforme a la siguiente tabla:
        // Área Porcentaje del presupuesto
        // Ginecología 40%
        // Traumatología 30%
        // Pediatría 30%
        // Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestado.
        
        System.out.println("Ingrese el monto presupuestado: ");
        double presupuesto = scan.nextDouble();
        double Ginecología = (presupuesto * 40)/100;
        double Traumatología = (presupuesto * 30)/100;
        double Pediatria =  (presupuesto * 30)/100;
        System.out.println("Cantidad de dinero que recibirá las areas; ");
        System.out.println("Ginecología: " + Ginecología);
        System.out.println("Traumatología: " + Traumatología);
        System.out.println("Pediatria: " + Pediatria);
      
    }

    public static void ejercicio20 (String[] args) { 
        // Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares
        // Y de intereses en 4 años. La fórmula del interés es:
        
        System.out.println("Ingrese el valor inicial del prestamo");
        double prestamo = scan.nextDouble();
        System.out.println("Ingrese el valor de pago recibido despues de 4 años");
        double pago = scan.nextDouble();
        double intereses = (pago - prestamo)/4;
        double porcentaje = (intereses*100)/prestamo;
        System.out.println("El porcentaje anual cobrado por el prestamo es: " + porcentaje + "%");
    }

    public static void ejercicio21 (String[] args) {
        // Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
        // todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
        // inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
        // como resultado.
        
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

    public static void ejercicio22 (String[] args) {
        // Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
        // cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
        // recargo en el pago del computador por cuotas.
        
        System.out.println("Ingrese el precio del computador: ");
        double precio = scan.nextDouble();
        System.out.println("Ingrese el monto por cuota mensual: ");
        double precio_cuotas = scan.nextDouble();
        precio_cuotas *= 12;
        double recargo = (precio_cuotas - precio) / precio * 100;
        System.out.println("El recargo es: " + recargo + "% por el pago en cuotas");
        
    }

    public static void ejercicio23 (String[] args) { 
        // Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
        // harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
        // Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
        // produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
        // kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
        // Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
        // N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895
        System.out.print("Ingrese la cantidad de kilogramos de harina obtenidos (M): ");
        int M = scan.nextInt();
        System.out.print("Ingrese la cantidad de litros de aceite obtenidos (N): ");
        int N = scan.nextInt();
        System.out.print("Ingrese el precio por bulto de harina (B1): ");
        int B1 = scan.nextInt();
        System.out.print("Ingrese el precio por caja de aceite (B2): ");
        int B2 = scan.nextInt();
        System.out.print("Ingrese el precio por kg de harina sobrante (B3): ");
        double B3 = scan.nextDouble();
        System.out.print("Ingrese el precio por litro de aceite sobrante (B4): ");
        double B4 = scan.nextDouble();
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

    

