import java.util.Scanner;
public class ejercicio_5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
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
} 
