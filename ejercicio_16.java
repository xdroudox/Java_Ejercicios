package Java_Ejercicios;
public class ejercicio_16{
    public static void ejecutar(String[] args) {
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
}
    
