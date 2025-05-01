import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre1, nombre2, nombre3;
        int experiencia1, experiencia2, experiencia3;
        String especialidad1, especialidad2, especialidad3;


        System.out.println("Nombre1: ");
        nombre1 = scanner.nextLine();
        System.out.println("Experiencia1: ");
        experiencia1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Especialidad1: ");
        especialidad1 = scanner.nextLine();
        Cocinero c1 = new Cocinero(nombre1, experiencia1, especialidad1);


        System.out.println("Nombre2: ");
        nombre2 = scanner.nextLine();
        System.out.println("Experiencia2: ");
        experiencia2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Especialidad2: ");
        especialidad2 = scanner.nextLine();
        Cocinero c2 = new Cocinero(nombre1, experiencia1, especialidad1);


        System.out.println("Nombre3: ");
        nombre3 = scanner.nextLine();
        System.out.println("Experiencia3: ");
        experiencia3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Especialidad3: ");
        especialidad3 = scanner.nextLine();
        Cocinero c3 = new Cocinero(nombre1, experiencia1, especialidad1);

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();

    scanner.close();
    }

}
//Santiago Vargas