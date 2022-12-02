/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
        private static final String[] ASIGNATURAS = new String[]{"Matematicas",
        "Historia"};
    //Array de Estudiantes
    private static est[] estudiantes;
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //nuevo 
        // TODO code application logic here
             int opcion = 0;
        do {
            System.out.println("\n\t\tMENU UNIVERSIDAD");
            System.out.println("\t\t---- -----------\n");
            System.out.println("[1] -- Registrar nuevos Estudiantes");
            System.out.println("[2] -- Listar notas definitivas de Asignaturas por cada Estudiante");
            System.out.println("[3] -- Listar promedio general de cada Estudiante");
            System.out.println("[4] -- Listar promedio de nota definitiva de todos los Estudiantes por Asignatura");
            System.out.println("[9] -- TERMINAR PROGRAMA");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    registrarNuevosEstudiantes();
                    break;
                case 2:
                    listarNotasDefinitivas();
                    break;
                case 3:
                    listarPromedioEstudiantes();
                    break;
                case 4:
                    listarPromediosNotasDefinitivas();
                    break;
                case 9:
                    System.out.println("\n\t\tFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("Opción equivocada");
            }
        } while (opcion != 9);
    }

    private static void registrarNuevosEstudiantes() {
        //Inicializamos array de Estudiantes
        estudiantes = new est[2];
        //Por cada Estudiante, registraremos 5 Asignaturas, con 3 notas parciales
        for (int est = 0; est < estudiantes.length; est++) {
            System.out.println("\n\nRegistrando Estudiante #" + (est + 1));
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            //Registramos Estudiante en el array
        //    estudiantes[est] = new est(nombre);
            //Para este Estudiante, registramos ahora 5 Asignaturas
            for (int asig = 0; asig < ASIGNATURAS.length; asig++) {
                //Construimos la Asignatura, tomando el nombre del array predefinido
                asig asignatura = new asig(ASIGNATURAS[asig]);
                //Ahora, hay que pedir 3 notas parciales para esta Asignatura
                System.out.println("\nNotas parciales de " + ASIGNATURAS[asig]);
                for (int i = 0; i < 3; i++) {
                    System.out.print("Parcial #" + (i + 1) + ": ");
                    int parcial = Integer.parseInt(teclado.nextLine());
                    //Registramos parcial en la Asignatura, indicando la posición donde debe registrarse
                    asignatura.registrarNotaParcial(parcial, i);
                }
                estudiantes[est].registrarAsignatura(asignatura, asig);
            }

        }
    }

    private static void listarNotasDefinitivas() {
        if (estudiantes == null) {
            System.out.println("No hay Estudiantes registrados.");
        } else {
            System.out.println("\n\tNOTAS DEFINITIVAS POR ESTUDIANTES");
            //Recorremos cada Asignatura
            for (int asig = 0; asig < ASIGNATURAS.length; asig++) {
                System.out.println("\n- Asignatura: " + ASIGNATURAS[asig]);
                //Recorremos cada Estudiante para obtener su nota en la Asignatura actual
                for (est estu : estudiantes) {
                    System.out.println("Nombre: " + estu.getNombre());
                    System.out.println("Nota Definitiva: " + estu.getNotaDeAsignatura(asig));
                }
            }
        }
    }

    private static void listarPromedioEstudiantes() {
        if (estudiantes == null) {
            System.out.println("No hay Estudiantes registrados.");
        } else {
            System.out.println("\n\tPROMEDIO GENERAL POR ESTUDIANTES");
            //Recorremos Estudiantes y les pedimos su promedio
            for (est estu : estudiantes) {
                System.out.println("\nNombre: " + estu.getNombre());
                System.out.println("Promedio General: " + estu.getPromedioGeneral());
            }
        }
    }

    private static void listarPromediosNotasDefinitivas() {
        if (estudiantes == null) {
            System.out.println("No hay Estudiantes registrados.");
        } else {
            System.out.println("\n\tPROMEDIOS NOTAS DEFINITIVAS");
            //Recorremos Asignaturas
            for (int asig = 0; asig < ASIGNATURAS.length; asig++) {
                System.out.println("\nAsignatura: " + ASIGNATURAS[asig]);

                int sumaNotas = 0;
                for (est estu : estudiantes) {
                    sumaNotas += estu.getNotaDeAsignatura(asig);
                }
                //Tenemos la suma, calculamos promedio
                System.out.println("Promedio de notas: " + (sumaNotas / estudiantes.length));
            }
        }
    }
    }
    

