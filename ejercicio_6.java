import java.util.Scanner;
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        // Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
        // de estudiantes.
        System.out.println("Ingrese el número total de estudiantes: ");
        int t_estudiantes = sacn.nextInt();
        System.out.println("Ingrese el número total de hombres: ");
        int hombres = sacn.nextInt();
        System.out.println("El número total de mujeres: ");
        int mujeres = (t_estudiantes - hombres);
        System.out.println(mujeres);
        System.out.println("El porcentaje de hombres es "+((hombres*100)/t_estudiantes)+ "%");
        System.out.println("El porcentaje total de mujeres es "+ ((mujeres*100)/t_estudiantes)+ "%");
        sacn.close();
    }
}
