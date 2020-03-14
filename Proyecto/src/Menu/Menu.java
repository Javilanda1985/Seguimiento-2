package Menu;

import Clases.*;

import java.net.PortUnreachableException;
import java.util.*;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Nube> nubecita = new ArrayList<Nube>();
    public static Estudiante estudiante;

    public static void main(String[] args){
        boolean aux=false;
        do{
            System.out.println("*****************************");
            System.out.print("");
            System.out.println("--------UNIVERSIDAD---------");
            System.out.println("(1) Ingresar datos");
            System.out.println("(2) Ver Materias");
            System.out.println("(3) Ver Estudiantes");
            System.out.println("(9) Salir");
            System.out.print("Selecionar: ");
            int opc = sc.nextInt();

            switch(opc) {
                case 1:
                    Crear();
                    System.out.print("");
                    break;
                case 2:
                    ListadoMaterias();
                    System.out.print("");
                    break;
                case 3:
                    ListadoEstudiantes();
                    System.out.print("");
                    break;
                case 9:
                    aux=true;
                    break;
                default:
                    System.out.println("Error indice invalido");
            }
        } while (aux ==false);
    }

    private static void ListadoEstudiantes() {
        System.out.println("*****************************");
        System.out.println("     Listado Estudiantes");
        for (int i = 0; i < nubecita.size() ; i++) {
            System.out.println("Codigo: " + nubecita.get(i).getEstudiantes().getCod() + " Nombre: " + nubecita.get(i).getEstudiantes().getNombre());
        }
    }

    private static void ListadoMaterias() {
        System.out.println("*****************************");
        System.out.println("     Listado Materias");
        for (int i = 0; i < nubecita.size() ; i++) {
            System.out.println("Codigo: " + nubecita.get(i).getMaterias().getCod() + " Nombre: " + nubecita.get(i).getMaterias().getNombre());
        }
    }

    private static void Crear() {
        System.out.println("*****************************");
        System.out.println("      Ingresar Datos");
        System.out.print("Codigo estudiante: ");
        String cod = sc.next();

        System.out.print("Nombre estudiante: ");
        String nombre = sc.next();

        Estudiante estudiante = new Estudiante(cod, nombre);

        System.out.print("Codigo materia: ");
        cod = sc.next();

        System.out.print("Nombre materia: ");
        nombre = sc.next();

        Materia materia = new Materia(cod, nombre);

        System.out.print("Nota: ");
        float nota = sc.nextFloat();

        try {
            Nota notas = new Nota(nota);
            notas.Validar(notas.getNota());
            Nube nube1 = new Nube(estudiante,materia,notas);
            nubecita.add(nube1);
        }catch (InvalidNotaException ex){
            System.out.println("ERROR");
        } finally {
            System.out.println("FIN");
        }
    }
}








