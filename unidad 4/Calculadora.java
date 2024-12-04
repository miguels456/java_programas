import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer numero: ");
                double numero1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo numero: ");
                double numero2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (numero1 + numero2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (numero1 - numero2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicacion: " + (numero1 * numero2));
                        break;
                    case 4:
                        if (numero2 != 0) {
                            System.out.println("Resultado de la division: " + (numero1 / numero2));
                        } else {
                            System.out.println("Error: Division por cero no permitida.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion inválida. Por favor, elige una opción del menu.");
            }
        } while (opcion != 5);

    }
}
