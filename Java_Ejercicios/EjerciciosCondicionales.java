package Java_Ejercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EjerciciosCondicionales {
    static Scanner scan = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    /*Un hombre desea saber cuánto dinero se generará por concepto de intereses sobre la cantidad
        que tiene en inversión en el banco. El decidirá reinvertir los intereses siempre y cuando éstos
        excedan a $7000 y en ese caso, desea saber cuánto dinero tendrá finalmente en su cuenta.*/

    public static class Inversion {
        private double cantidad;
        private double TasaIntereses;
        
        public Inversion(double cantidad, double TasaIntereses) {
            this.cantidad = cantidad;
            this.TasaIntereses = TasaIntereses;
        }
        public double getCantidad() {
            return cantidad;
        }
    
        public double getIntereses() {
            return TasaIntereses;
        }
        
        public double calcularIntereses() {
            return cantidad * (TasaIntereses/100 );
        }

        public double calcularTotal() {
            return cantidad + calcularIntereses();
        }

    }
    public static void ejercicio24(String[] args) {
        System.out.println("Agregue la cantidad de dinero que tiene en la cuenta:");
        double cantidad = scan.nextDouble();
        System.out.println("Agregue la tasa de intereses (%):");
        double tasaIntereses = scan.nextDouble();
        Inversion inversion = new Inversion(cantidad, tasaIntereses);
        double Total = inversion.calcularTotal();
        double Intereses = inversion.calcularIntereses();
        if (Intereses > 7000) {
            System.out.println("Los intereses generados son $" + df.format(Intereses) + ", puede reinvertir.");
        } else {
            System.out.println("Los intereses generados son $" + df.format(Intereses) + ", no puede reinvertir.");
        }
        
        System.out.println("El total de dinero en la cuenta es: $" + df.format(Total));      
    }
    

    /* Ejercicio 25:
    Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le aplique un aumento del 15% si su 
    sueldo es inferior a Bs. 40.000 y 12% en caso contrario. Imprima el nuevo sueldo del trabajador. */

    public static class Trabajador {
        private double sueldo;

        public Trabajador(double sueldo) {
            this.sueldo = sueldo;
        }

        public double getSueldo() {
            return sueldo;
        }

        public double calcularNuevoSueldo() {
            if (sueldo < 40000) {
                return sueldo + (sueldo * 0.15);
            } else {
                return sueldo + (sueldo * 0.12);
            }
        }
    }

    public static void ejercicio25(String[] args) {
        System.out.println("Ingrese el sueldo del trabajador:");
        double sueldo = scan.nextDouble();

        Trabajador trabajador = new Trabajador(sueldo);
        double nuevoSueldo = trabajador.calcularNuevoSueldo();

        System.out.println("El nuevo sueldo del trabajador es: Bs. " + nuevoSueldo);
    }

    /* Ejercicio 26:
    Dados los datos A, B, C y D que representan números enteros;
    calcule el resultado de:
    Si D=0 (A-C)^2
    Si D>0 (A-B)^3 / D */

    public static class Operacion {
        private int a, b, c, d;

        public Operacion(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public int getA() { return a; }
        public int getB() { return b; }
        public int getC() { return c; }
        public int getD() { return d; }

        public double calcularResultado() {
            if (d == 0) {
                return Math.pow((a - c), 2);
            } else {
                return Math.pow((a - b), 3) / d;
            }
        }
    }

    public static void ejercicio26(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese A:");
        int a = scan.nextInt();
        System.out.println("Ingrese B:");
        int b = scan.nextInt();
        System.out.println("Ingrese C:");
        int c = scan.nextInt();
        System.out.println("Ingrese D:");
        int d = scan.nextInt();

        Operacion op = new Operacion(a, b, c, d);
        double resultado = op.calcularResultado();

        System.out.println("El resultado es: " + resultado);
    }

    /* Ejercicio 27:
    Analizar si los dos primeros valores corresponden a una figura (triángulo, círculo o rectángulo)
    comparando el área con el tercer valor dado. */

    public static class Figura {
        private double valor1, valor2, valor3;

        public Figura(double valor1, double valor2, double valor3) {
            this.valor1 = valor1;
            this.valor2 = valor2;
            this.valor3 = valor3;
        }

        public double areaTriangulo() {
            return (valor1 * valor2) / 2;
        }

        public double areaCirculo() {
            return Math.PI * Math.pow(valor1, 2); 
        }

        public double areaRectangulo() {
            return valor1 * valor2;
        }

        public String identificarFigura() {
            if (areaTriangulo() == valor3) {
                return "Triángulo";
            } else if (areaCirculo() == valor3) {
                return "Círculo";
            } else if (areaRectangulo() == valor3) {
                return "Rectángulo";
            } else {
                return "No coincide con ninguna figura";
            }
        }
    }

    public static void ejercicio27(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese el valor 1:");
        double v1 = scan.nextDouble();
        System.out.println("Ingrese el valor 2:");
        double v2 = scan.nextDouble();
        System.out.println("Ingrese el valor 3:");
        double v3 = scan.nextDouble();

        Figura figura = new Figura(v1, v2, v3);
        String tipo = figura.identificarFigura();

        System.out.println("La figura es: " + tipo);
    }
    /* Ejercicio 28:
    Una empresa hace una compra. Si es mayor a 500000, invierte 55%, pide 30% al banco y el resto a crédito.
    Si no pasa de 500000, invierte 70% y lo demás a crédito. El crédito tiene un 20% de interés. */

    public static class Compra {
        private double monto;

        public Compra(double monto) {
            this.monto = monto;
        }

        public double getMonto() {
            return monto;
        }

        public void calcularPagos() {
            double inversion, banco = 0, credito, interes;
            if (monto > 500000) {
                inversion = monto * 0.55;
                banco = monto * 0.30;
                credito = monto - inversion - banco;
            } else {
                inversion = monto * 0.70;
                credito = monto - inversion;
            }
            interes = credito * 0.20;
            System.out.println("Inversión: " + inversion);
            System.out.println("Crédito: " + credito);
            System.out.println("Interés: " + interes);
            if (monto > 500000) {
                System.out.println("Préstamo bancario: " + banco);
            }
        }
    }

    public static void ejercicio28(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese el monto total de la compra:");
        double monto = scan.nextDouble();

        Compra compra = new Compra(monto);
        compra.calcularPagos();
    }

    /* Ejercicio 29:
    Una empresa tiene 3 departamentos. Si uno de ellos vende más del 33% del total,
    se le da un bono del 20% del salario. Calcular el total que reciben los empleados. */

    public static class Departamento {
        private double ventas;
        private double salario;

        public Departamento(double ventas, double salario) {
            this.ventas = ventas;
            this.salario = salario;
        }

        public double getVentas() {
            return ventas;
        }

        public double calcularPago(double totalVentas) {
            if (ventas > totalVentas * 0.33) {
                return salario + (salario * 0.20);
            } else {
                return salario;
            }
        }
    }

    public static void ejercicio29(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Ingrese ventas del departamento 1:");
        double v1 = scan.nextDouble();
        System.out.println("Ingrese ventas del departamento 2:");
        double v2 = scan.nextDouble();
        System.out.println("Ingrese ventas del departamento 3:");
        double v3 = scan.nextDouble();
        System.out.println("Ingrese salario mensual de cada vendedor:");
        double salario = scan.nextDouble();

        double totalVentas = v1 + v2 + v3;

        Departamento d1 = new Departamento(v1, salario);
        Departamento d2 = new Departamento(v2, salario);
        Departamento d3 = new Departamento(v3, salario);

        System.out.println("Pago D1: " + d1.calcularPago(totalVentas));
        System.out.println("Pago D2: " + d2.calcularPago(totalVentas));
        System.out.println("Pago D3: " + d3.calcularPago(totalVentas));
    }

    /* Ejercicio 30:
    Formar un número de 4 cifras con A, B, C y D, redondearlo a la centena más próxima. */

    public static class Redondeador {
        private int a, b, c, d;

        public Redondeador(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public int formarNumero() {
            return a * 1000 + b * 100 + c * 10 + d;
        }

        public int redondearCentena() {
            int numero = formarNumero();
            int resto = numero % 100;
            if (resto >= 50) {
                return numero + (100 - resto);
            } else {
                return numero - resto;
            }
        }
    }

    public static void ejercicio30(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese A:");
        int a = scan.nextInt();
        System.out.println("Ingrese B:");
        int b = scan.nextInt();
        System.out.println("Ingrese C:");
        int c = scan.nextInt();
        System.out.println("Ingrese D:");
        int d = scan.nextInt();

        Redondeador r = new Redondeador(a, b, c, d);
        System.out.println("Número original: " + r.formarNumero());
        System.out.println("Número redondeado a la centena más próxima: " + r.redondearCentena());
    }
    /* Ejercicio 31:
    Calcular el pago de alquiler de un carro según la distancia recorrida. */

    public static class Alquiler {
        private int km;

        public Alquiler(int km) {
            this.km = km;
        }

        public int calcularPago() {
            if (km <= 300) {
                return 5000;
            } else if (km <= 1000) {
                return 5000 + (km - 300) * 200;
            } else {
                return 5000 + (700 * 200) + (km - 1000) * 150;
            }
        }
    }

    public static void ejercicio31(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilómetros recorridos:");
        int km = scan.nextInt();

        Alquiler alquiler = new Alquiler(km);
        System.out.println("El pago total es: Bs. " + alquiler.calcularPago());
    }

    /* Ejercicio 32:
    Verificar si P^3 + Q^4 - 2*P^2 > 680 */

    public static class Comparacion {
        private int p, q;

        public Comparacion(int p, int q) {
            this.p = p;
            this.q = q;
        }

        public boolean verificarExpresion() {
            return Math.pow(p, 3) + Math.pow(q, 4) - 2 * Math.pow(p, 2) > 680;
        }
    }

    public static void ejercicio32(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese P:");
        int p = scan.nextInt();
        System.out.println("Ingrese Q:");
        int q = scan.nextInt();

        Comparacion comp = new Comparacion(p, q);
        if (comp.verificarExpresion()) {
            System.out.println("Se cumple la expresión con P = " + p + " y Q = " + q);
        } else {
            System.out.println("No se cumple la expresión.");
        }
    }

    /* Ejercicio 33:
    Aplicar descuento según el monto de la compra */

    public static class Descuento {
        private String cliente;
        private double monto;

        public Descuento(String cliente, double monto) {
            this.cliente = cliente;
            this.monto = monto;
        }

        public double calcularDescuento() {
            if (monto < 500) return 0;
            else if (monto <= 1000) return monto * 0.05;
            else if (monto <= 7000) return monto * 0.11;
            else if (monto <= 15000) return monto * 0.18;
            else return monto * 0.25;
        }

        public double totalPagar() {
            return monto - calcularDescuento();
        }

        public void mostrar() {
            System.out.println("Cliente: " + cliente);
            System.out.println("Monto compra: " + monto);
            System.out.println("Descuento: " + calcularDescuento());
            System.out.println("Total a pagar: " + totalPagar());
        }
    }

    public static void ejercicio33(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese nombre del cliente:");
        String nombre = scan.next();
        System.out.println("Ingrese monto de la compra:");
        double monto = scan.nextDouble();

        Descuento d = new Descuento(nombre, monto);
        d.mostrar();
    }

    /* Ejercicio 34:
    Calcular el nuevo sueldo de un trabajador según su categoría. */

    public static class SueldoCategoria {
        private char categoria;
        private double sueldo;

        public SueldoCategoria(char categoria, double sueldo) {
            this.categoria = categoria;
            this.sueldo = sueldo;
        }

        public double calcularAumento() {
            switch (categoria) {
                case 'A': return sueldo * 0.15;
                case 'B': return sueldo * 0.12;
                case 'C': return sueldo * 0.10;
                case 'D': return sueldo * 0.08;
                default: return 0;
            }
        }

        public double nuevoSueldo() {
            return sueldo + calcularAumento();
        }
    }

    public static void ejercicio34(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese la categoría del trabajador (A, B, C, D):");
        char cat = scan.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el sueldo actual:");
        double sueldo = scan.nextDouble();

        SueldoCategoria sc = new SueldoCategoria(cat, sueldo);
        System.out.println("Nuevo sueldo: " + sc.nuevoSueldo());
    }

    /* Ejercicio 35:
    Determinar el deporte apropiado según la temperatura. */

    public static class Deporte {
        private double temperatura;

        public Deporte(double temperatura) {
            this.temperatura = temperatura;
        }

        public String deporteSugerido() {
            if (temperatura >= 10 && temperatura <= 20) return "Marcha";
            else if (temperatura > 20 && temperatura <= 30) return "Tenis";
            else if (temperatura > 30 && temperatura <= 40) return "Natación";
            else return "Ningún deporte recomendado";
        }
    }

    public static void ejercicio35(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        double temp = scan.nextDouble();

        Deporte d = new Deporte(temp);
        System.out.println("Deporte recomendado: " + d.deporteSugerido());
    }

    /* Ejercicio 36:
    Desglosar una cantidad en billetes. */

    public static class Billetes {
        private int cantidad;

        public Billetes(int cantidad) {
            this.cantidad = cantidad;
        }

        public void mostrarDesglose() {
            int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10};
            for (int b : billetes) {
                int n = cantidad / b;
                if (n > 0) System.out.println(n + " billetes de " + b);
                cantidad %= b;
            }
        }
    }

    public static void ejercicio36(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese la cantidad en bolívares:");
        int cantidad = scan.nextInt();

        Billetes billetes = new Billetes(cantidad);
        billetes.mostrarDesglose();
    }

    /* Ejercicio 37:
    Determinar si los lados forman un triángulo y su tipo. Calcular área si es válido. */

    public static class Triangulo {
        private double a, b, c;

        public Triangulo(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean esTriangulo() {
            return a + b > c && a + c > b && b + c > a;
        }

        public String tipo() {
            if (a == b && b == c) return "Equilátero";
            else if (a == b || b == c || a == c) return "Isósceles";
            else return "Escaleno";
        }

        public double area() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }

    public static void ejercicio37(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese los tres lados del triángulo:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        Triangulo t = new Triangulo(a, b, c);
        if (t.esTriangulo()) {
            System.out.println("Es un triángulo " + t.tipo());
            System.out.println("Área: " + t.area());
        } else {
            System.out.println("No es un triángulo válido.");
        }
    }

    /* Ejercicio 38:
    Determinar signo del zodiaco y edad según fecha de nacimiento. */

    public static class Persona {
        private int dia, mes, anio;

        public Persona(int dia, int mes, int anio) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }

        public int calcularEdad() {
            java.time.LocalDate hoy = java.time.LocalDate.now();
            return hoy.getYear() - anio;
        }

        public String signoZodiaco() {
            String[] signos = {
                "Capricornio", "Acuario", "Piscis", "Aries", "Tauro", "Géminis",
                "Cáncer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario"
            };
            int[] diasLimite = {20, 19, 20, 20, 21, 21, 22, 23, 23, 23, 22, 21};

            int indice = mes - 1;
            if (dia > diasLimite[indice]) {
                indice = (indice + 1) % 12;
            }
            return signos[indice];
        }
    }

    public static void ejercicio38(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Ingrese día de nacimiento:");
        int d = scan.nextInt();
        System.out.println("Ingrese mes de nacimiento:");
        int m = scan.nextInt();
        System.out.println("Ingrese año de nacimiento:");
        int a = scan.nextInt();

        Persona p = new Persona(d, m, a);
        System.out.println("Edad: " + p.calcularEdad());
        System.out.println("Signo del zodiaco: " + p.signoZodiaco());
    }

    /* Ejercicio 39:
   Una persona comprará un automóvil si al cabo de 3 años la devaluación de éste no es mayor que 
   la mitad del incremento del valor del terreno. Determinar si debe comprar el automóvil.
    */

    public static class Bien {
        private double valorInicial;
        private double porcentajeAuto;
        private double porcentajeTerreno;

        public Bien(double valorInicial, double porcentajeAuto, double porcentajeTerreno) {
            this.valorInicial = valorInicial;
            this.porcentajeAuto = porcentajeAuto;
            this.porcentajeTerreno = porcentajeTerreno;
        }

        public boolean decision() {
            double valorAuto = valorInicial - (valorInicial * porcentajeAuto / 100);
            double valorTerreno = valorInicial + (valorInicial * porcentajeTerreno / 100);
            double perdidaAuto = valorInicial - valorAuto;
            double gananciaTerreno = valorTerreno - valorInicial;

            return perdidaAuto <= (gananciaTerreno / 2);
        }
    }

    public static void ejercicio39(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Valor del bien:");
        double valor = scan.nextDouble();
        System.out.println("Devaluación del auto (%):");
        double deval = scan.nextDouble();
        System.out.println("Aumento del terreno (%):");
        double aumento = scan.nextDouble();

        Bien bien = new Bien(valor, deval, aumento);

        if (bien.decision()) {
            System.out.println("Debe comprar el automóvil.");
        } else {
            System.out.println("No debe comprar el automóvil.");
        }
    }

    /* Ejercicio 40:
   Calcular y mostrar el monto que debe pagar un suscriptor por consumo de luz eléctrica,
   según el costo por kilovatio hora y el rango de consumo.
    */

    public static class Luz {
        private int lecturaAnterior;
        private int lecturaActual;

        public Luz(int lecturaAnterior, int lecturaActual) {
            this.lecturaAnterior = lecturaAnterior;
            this.lecturaActual = lecturaActual;
        }

        public int getConsumo() {
            return lecturaActual - lecturaAnterior;
        }

        public double calcularMonto() {
            int consumo = getConsumo();
            if (consumo <= 100) {
                return consumo * 2.622;
            } else if (consumo <= 300) {
                return consumo * 79.78;
            } else if (consumo <= 500) {
                return consumo * 89.52;
            } else {
                return consumo * 97.95;
            }
        }
    }

    public static void ejercicio40(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Lectura anterior:");
        int ant = scan.nextInt();
        System.out.println("Lectura actual:");
        int act = scan.nextInt();

        Luz l = new Luz(ant, act);
        System.out.println("Consumo: " + l.getConsumo() + " Kwh");
        System.out.println("Monto a pagar: Bs. " + l.calcularMonto());
    }



}
