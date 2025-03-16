package Java_Ejercicios;
import java.util.Scanner;
public class ejercicio_12 {
    public static void ejecutar(String[] args) {
        // Calcule y muestre, a un alumno, cuál será su promedio general en las tres materias más difíciles que
        // cursa y cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se
        // muestra a continuación:
        // Matemática Examen 90% y 10% del promedio de tres tareas.
        // Física Examen 80% y 20% del promedio de dos tareas.
        // Química Examen 85% y 15% del promedio de tres tareas.
        Scanner scan = new Scanner(System.in);
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
}
