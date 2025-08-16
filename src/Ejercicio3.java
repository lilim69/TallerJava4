import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola");
        System.out.print("Por favor ingresa la edad de la primera persona: ");
        int edad1 = scanner.nextInt();
        System.out.print("Por favor ingresa la edad de la segunda persona: ");
        int edad2 = scanner.nextInt();

        boolean ambasMayores18 = (edad1 > 18) && (edad2 > 18);
        boolean ambasMenores30 = (edad1 < 30) && (edad2 < 30);
        boolean algunaMayor50 = (edad1 > 50) || (edad2 > 50);

        System.out.println("¿Ambas personas son mayores de 18 años? " + ambasMayores18);
        System.out.println("¿Ambas personas son menores de 30 años? " + ambasMenores30);
        System.out.println("¿Alguna de las personas es mayor de 50 años? " + algunaMayor50);

        System.out.println();
    }
}

