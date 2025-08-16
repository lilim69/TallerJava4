import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola");
        System.out.print("Por favor ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Por favor ingresa tu altura en metros (con coma ',': ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura); // cálculo IMC
        int imcEntero = (int) imc; // casteo a int

        // Mostrar ambos resultados
        System.out.println("Tu IMC exacto es: " + imc);
        System.out.println("Tu IMC solo con la parte entera es: " + imcEntero);

        System.out.println();
    }
}
