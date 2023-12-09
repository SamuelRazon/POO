package Librerias;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Funciones de utilidad
 */
public class Util {
    /**
     * Imprimir 50 linéas en blanco para apariencia más limpia
     */
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


    /**
     * Entrada por consola de una fecha validada
     * @return Fecha validada
     */
    public static LocalDate validarFecha(int dia, int mes, int year) {
        LocalDate fecha;
        while (true) {
            /* Solicitar fecha*/
            /*System.out.print("\tEscribe el dia: ");
            int dia = validarInt(1, 31);
            System.out.print("\tEscribe el mes: ");
            int mes = validarInt(1, 12);
            System.out.print("\tEscribe el año: ");
            int year = validarInt(1900, LocalDate.now().getYear());*/

            /* Guardar fecha en una variable y validar, reintentar si es incorrecta */
            try {
                fecha = LocalDate.of(year, mes, dia);
            } catch (DateTimeException e) {
                System.out.println("ERROR. Ingresa una fecha valida.");
                continue;
            }
            return fecha;
        }//Fin del ciclo
    }

    /**
     * Valída la entrada de un número entero
     * @param min Mínimo valor permitido
     * @param max Máximo valor permitido
     * @return Numero entero validado
     */
    public static int validarInt(int min, int max) {
        Scanner input = new Scanner(System.in);
        while (true) {
            while (!input.hasNextInt()) {//Verificar que sea de tipo entero
                System.out.print("ERROR: Ingresa un numero entero: ");
                input.next(); // Consumir la entrada incorrecta
            }

            int retorno = input.nextInt(); //guardar entrada validada en una variable

            if (retorno >= min && retorno <= max) { //Si la entrada está entre X margen regresar la entrada
                return retorno;
            } else { //Si no Imprimir mensaje de error
                System.out.print("ERROR. Ingresa un numero entre " + min + " y " + max + ": ");
            }
        }
    }

    /**
     * Validar la entrada de un dato tipo float
     *
     * @param min mínimo permitido
     * @param max Máximo permitido
     * @return Regresar entrada ya validada
     */
    public static float validarFloat(double min, double max) {
        while (true) {
            Scanner input = new Scanner(System.in);
            while (!input.hasNextFloat()) { // Verificar que sea de tipo double
                System.out.print("ERROR. Ingresa un número decimal: ");
                input.next(); // Consumir la entrada incorrecta
            }

            float retorno = input.nextFloat(); // Guardar entrada validada en una variable

            if (retorno >= min && retorno <= max) { // Si la entrada está entre el margen especificado, regresar la entrada
                input.nextLine();
                return retorno;
            } else { // Si no, imprimir mensaje de error
                System.out.print("ERROR. Ingresa un número entre " + min + " y " + max + ": ");
                input.nextLine();
            }
        }
    }
}