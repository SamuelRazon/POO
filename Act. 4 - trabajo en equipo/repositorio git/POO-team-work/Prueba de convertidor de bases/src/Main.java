import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("Ingrese un número en una de las siguientes bases:");
        System.out.println("1. Decimal");
        System.out.println("2. Binario");
        System.out.println("3. Octal");
        System.out.println("4. Hexadecimal");
        System.out.println("------------------------------------------------------");
        System.out.print("Seleccione la base (1/2/3/4): \n");

        int baseOrigen = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        System.out.print("Ingrese el número en la base seleccionada: ");
        String numeroStr = scanner.nextLine();

        // Parsear el número en la base especificada a decimal
        switch(baseOrigen) {
            case 1:  // Decimal
                baseOrigen=10;
                break;
            case 2:  // Binario
                baseOrigen=2;
                break;
            case 3:  // Octal
                baseOrigen=8;
                break;
            case 4:  // Hexadecimal
                baseOrigen=16;
                break;
            default:
                System.out.println("Selección de base no válida.\n");
                return;
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Ingrese la base a la que desea convertir:");
        System.out.println("1. Decimal");
        System.out.println("2. Binario");
        System.out.println("3. Octal");
        System.out.println("4. Hexadecimal");
        System.out.println("------------------------------------------------------");
        System.out.print("Seleccione la base de destino (1/2/3/4): \n");

        int baseDestino = scanner.nextInt();

        switch (baseDestino) {
            case 1:  // Decimal
                baseDestino=10;
                System.out.print("\033[H\033[2J");//limpiar pantalla
                System.out.println( "Resultado: " + Conversor.convertirBase(numeroStr, baseOrigen, baseDestino));
                break;
            case 2:  // Binario
                baseDestino=2;
                System.out.print("\033[H\033[2J");//limpiar pantalla
                System.out.println( "Resultado: " + Conversor.convertirBase(numeroStr, baseOrigen, baseDestino));
                break;
            case 3:  // Octal
                baseDestino=8;
                System.out.print("\033[H\033[2J");//limpiar pantalla
                System.out.println( "Resultado: " + Conversor.convertirBase(numeroStr, baseOrigen, baseDestino));
                break;
            case 4:  // Hexadecimal
                baseDestino=16;
                System.out.print("\033[H\033[2J");//limpiar pantalla
                System.out.println( "Resultado: " + Conversor.convertirBase(numeroStr, baseOrigen, baseDestino));
                break;
            default:
                System.out.print("\033[H\033[2J");//limpiar pantalla
                System.out.println("Selección de base de destino no válida.");
        }
    }
}
