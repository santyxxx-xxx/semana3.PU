
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cocinero[] cocinero = new Cocinero[3];
        String nombre;
        int experiencia;
        String especialidad;
        for (int i = 0; i < cocinero.length; i++) {
            System.out.println("Nombre: ");
            nombre = scanner.nextLine();
            System.out.println("Experiencia: ");
            experiencia = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Especialidad: ");
            especialidad = scanner.nextLine();
            Cocinero c = new Cocinero(nombre, experiencia, especialidad);
            cocinero[i] = c;

        }
        for (int i = 0; i < cocinero.length; i++) {
            System.out.println("-------------Cocinero----------"+(i+1));
            cocinero[i].mostrar();
        }
    scanner.close();
    }

}
//Santiago Vargas