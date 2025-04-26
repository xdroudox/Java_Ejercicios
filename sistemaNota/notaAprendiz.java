package sistemaNota;
import java.util.Scanner;
import java.util.ArrayList;

public class notaAprendiz {

    // Clase aprendiz que maneja la información de los estudiantes
    public static class aprendiz {
        private String nombre;
        private ArrayList<Double> notas;
        private double promedio;

        // Constructor
        public aprendiz(String nombre) {
            this.nombre = nombre;
            this.notas = new ArrayList<>();
            this.promedio = 0;
        }

        // Métodos getter
        public String getNombre() {
            return nombre;
        }

        public ArrayList<Double> getNotas() {
            return notas;
        }

        public double getPromedio() {
            return promedio;
        }

        // Método para calcular el promedio
        public void calcularPromedio() {
            double notaTotal = 0;

            for (int i = 0; i < notas.size();i++){
                double nota = notas.get(i);
                notaTotal += nota;
            }
            this.promedio = notaTotal / notas.size();
        }

        // Método para agregar una nueva nota
        public void agregarNotas(double nota) {
            this.notas.add(nota);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<aprendiz> listaAprendices = new ArrayList<>();
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Sistema de calificaciones de aprendices SENA");
            System.out.println("Seleccione la opción que desea realizar:");
            System.out.println("Opción 1: Calificar aprendiz");
            System.out.println("Opción 2: Visualizar aprendiz");
            System.out.println("Opción 3: Eliminar aprendiz");
            System.out.println("Opción 4: Salir del sistema");

            opcion = scan.nextInt();

            switch (opcion) {
                // Opción 1
                case 1:
                    String continuar = "si";
                    while (continuar.equalsIgnoreCase("si")) {
                        System.out.println("Ingrese el nombre del aprendiz:");
                        scan.nextLine(); 
                        String nombre = scan.nextLine();
                        aprendiz estudiante = new aprendiz(nombre);

                        System.out.println("Ingrese las notas del aprendiz (00 a 100). Ingrese 0 para finalizar:");
                        double nota = 0;
                        do {
                            nota = scan.nextDouble();
                            if (nota != 0) {
                                estudiante.agregarNotas(nota); // Agregar nota al aprendiz
                            }
                        } while (nota != 0);

                        estudiante.calcularPromedio(); // Calcular el promedio de las notas
                        listaAprendices.add(estudiante); // Agregar el estudiante a la lista

                        System.out.println("Nombre: " + estudiante.getNombre());
                        System.out.println("Notas: " + estudiante.getNotas());
                        System.out.println("Promedio: " + estudiante.getPromedio());

                        System.out.println("¿Desea ingresar otro aprendiz? (si/no)");
                        continuar = scan.next();
                    }
                    break;

                // Opción 2
                case 2:
                    continuar = "si";
                    while (continuar.equalsIgnoreCase("si")) {
                    if (listaAprendices.isEmpty()) {
                        System.out.println("No hay aprendices registrados.");
                    } else {
                        for (int i = 0; i < listaAprendices.size(); i++) {
                            System.out.println((i + 1) + ". " + listaAprendices.get(i).getNombre());
                        }

                            System.out.println("Seleccione el número del aprendiz para visualizar su promedio:");
                            int numAprendiz = scan.nextInt();
                            while (numAprendiz <= 0 || numAprendiz > listaAprendices.size()) {
                                System.out.println("Número inválido. Por favor, ingrese un número entre 1 y " + listaAprendices.size() + ":");
                                numAprendiz = scan.nextInt();
                            }
                                aprendiz numSeleccionado = listaAprendices.get(numAprendiz - 1);
                                System.out.println("Nombre: " + numSeleccionado.getNombre());
                                System.out.println("Notas: " + numSeleccionado.getNotas());
                                System.out.println("Promedio: " + numSeleccionado.getPromedio());
                        }
                        System.out.println("¿Desea visualizar otro aprendiz? (si/no)");
                        continuar = scan.next();
                    } 
                    break;

                // Opción 3
                case 3:
                    continuar = "si";
                    while (continuar.equalsIgnoreCase("si")) {
                    if (listaAprendices.isEmpty()) {
                        System.out.println("No hay aprendices registrados.");
                    } else {
                        for (int i = 0; i < listaAprendices.size(); i++) {
                            System.out.println((i + 1) + ". " + listaAprendices.get(i).getNombre());
                        }
                        System.out.println("Seleccione el número del aprendiz que desea eliminar:");
                        int numAprendiz = scan.nextInt();
                        while (numAprendiz <= 0 || numAprendiz > listaAprendices.size()) {
                            System.out.println("Número inválido. Por favor, ingrese un número entre 1 y " + listaAprendices.size() + ":");
                            numAprendiz = scan.nextInt();
                        }
                        listaAprendices.remove(numAprendiz-1);
                        System.out.println("Aprendiz eliminado con exito");
                    }
                    System.out.println("¿Desea ingresar otro aprendiz? (si/no)");
                    continuar = scan.next();
                    }
                    break;

                // Opción 4
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
        System.out.println("Has salido con exito!!!");

        scan.close(); 
    }
}
