import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola");
        System.out.print("Por favor ingresa la edad de Pepito: ");
        int edadPepito = scanner.nextInt();
        System.out.print("Por favor ingresa la edad de Juan: ");
        int edadJuan = scanner.nextInt();

        System.out.println("Pepito es mayor que Juan? " + (edadPepito > edadJuan));
        System.out.println("Pepito es menor que Juan? " + (edadPepito < edadJuan));
        System.out.println("Pepito tiene la misma edad que Juan? " + (edadPepito == edadJuan));

        System.out.println();
    }
}
