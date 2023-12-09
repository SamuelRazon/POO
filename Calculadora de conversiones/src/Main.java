/*
 * ActividadDeProgramación4 = "Calculadora de conversiones"
 * Descripción =⠀"Convertir distintos tipos de datos"⠀⠀
 * Nombre = "Fernando Samuel Razón Gómez"
 * OtrosDatos = "UDG - Cualtos - ICOM - POO - Profesor Sergio"
 * ⠀⠀⠀⠀⠀⠀⠀⠀⡤⢲⠞⢉⡽⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 *⠀⠀⠀⠀⠀⠀⠀⣼⣰⡇⢀⡎⠀⣠⣼⣷⣄⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀
 *⠀⠀⠀⠀⠀⠀⠀⣿⣿⣷⣿⣀⣀⡼⢉⣿⣿⣷⣶⣶⠖⠈⠉⠚⠛⠣⣀⠀⠀⠀
 *⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣌⣉⣠⣾⣿⣿⣿⣿⠇⠀⠀⣀⡀⠀⠀⠀⠑⢤⣄
 *⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⡿⢟⣿⣿⣿⣿⠀⠀⠀⠻⣯⠆⠀⠀⠀⠈⡇
 *⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⣿⣿⣷⣿⣿⣿⣿⣿⣿⡄⠀⠀⡀⣠⡈⠀⣤⢄⠀⢠
 *⠀⠀⠀⠀⠀⠀⢀⡴⠃⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠳⣸⠷⠄⠲⠾⢇⠆
 *⠀⠀⠀⠀⠀⣠⠞⠀⠀⠀⠀⠈⠛⠿⣿⣿⣿⣿⣿⣿⣷⣤⣀⠀⠀⢀⡠⠐⠁⠀
 *⠀⠀⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠿⣿⣿⣿⢿⣿⣿⣖⣂⠀⠀⠀
 *⠀⠀⢀⢶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⣿⠉⡇⢹⣸⠀⠀⠀
 *⠀⡠⠙⣻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠿⠿⠚⠛⠋⠁⠀⠀⠀
 *⣸⡆⠀⢣⣳⡀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⡖⠲⠆⣺⣁⡀⣠⣴⣲⠒⣦⠀⠀⠀
 *⢿⣿⡀⠀⠙⠺⠗⣶⣢⣔⣲⣲⠯⠟⠊⠀⣦⣾⡿⠁⣴⢡⡟⠉⠉⠙⠤⠆⠀⠀
 *⠈⢿⣿⣦⡀⢀⣤⣤⣀⣀⠀⠀⠀⠀⢠⣾⣿⣿⡇⠀⣧⢸⡄⠀⠀⠀⡼⠃⠀⠀
 *⠀⠈⠛⠛⠚⠁⠀⠀⠀⠉⠉⠙⠒⠢⠽⢿⣿⣿⣷⡀⢻⣦⡙⠲⠶⠛⠁⠀⠀⠀
 */

import java.util.Scanner;
// float pepe;
// double juan;
// juan = (double) pepe;
public class Main {
    public static void main(String[] args) {
        BasesNumericas convertirBases = new BasesNumericas();
        Unidades convertirMedida = new Unidades();
        Temperatura convertirTemperatura = new Temperatura();
        String unidadEntrada = "", unidadSalida = "";
        Scanner scanner = new Scanner(System.in);

        while (true){ //Ciclo principal
            limpiarConsola();
            System.out.print("""
                    CALCULADORA DE CONVERSIONES
                    -------------------------------------------------------------------------
                    \t1.- Convertir bases numéricas
                    \t2.- Convertir temperatura
                    \t3.- Convertir medidas
                    \t4.- Calculadora
                    \t5.- Cerrar programa
                    Opción:\s""");
            switch (scanner.nextLine()){
                case "1"-> { /*Solicitar base y llamar función para trasformar*/
                    while (true) {
                        limpiarConsola();
                        System.out.println("""
                                CONVERTIR BASES NUMÉRICAS
                                -------------------------------------------------------------------------""");
                        System.out.print("""
                                Selecciona la base de este numero:
                                \t2.- Binario
                                \t8.- Octal
                                \t10.- Decimal
                                \t16.- Hexadecimal
                                \t2...35.- Base correspondiente al número
                                Base original:\s""");
                        int baseOrigen = validarInt(2, 35);

                        System.out.print("-------------------------------------------------------------------------\n" +
                                "Numero en base " + baseOrigen + ": ");
                        String numero = scanner.next();

                        if (!BasesNumericas.validacion(numero, baseOrigen)) { //Volver a pedir datos si la base no coincide
                            System.out.println("La base no coincide con el numero, ingresa de nuevo los datos...");
                            System.out.println("Presiona ENTER para continuar...");
                            scanner.nextLine();
                            scanner.nextLine();
                            continue;
                        }
                        System.out.print("""
                                -------------------------------------------------------------------------
                                Selecciona la base a la que quieres transformar:
                                \t2.- Binario
                                \t8.- Octal
                                \t10.- Decimal
                                \t16.- Hexadecimal
                                \t2...35.- Base correspondiente al número
                                Base a transformar:\s""");
                        int baseDestino = validarInt(2, 35);
                        scanner.nextLine();
                        System.out.println("-------------------------------------------------------------------------\n" +
                                "Resultado: " + convertirBases.convertirBase(numero, baseOrigen, baseDestino));
                        if (regresarAMenu()) break;
                    }
                }
                case "2"-> { /*Solicitar temperatura, unidad de temperatura original y a transformar*/
                    do {
                        limpiarConsola();
                        System.out.println("""
                                CONVERTIR TEMPERATURA
                                -------------------------------------------------------------------------""");
                        //Asignar unidad original
                        System.out.print("""
                                Selecciona la unidad de la temperatura original
                                \t1.- Celsius (C)
                                \t2.- Kelvin (K)
                                \t3.- Fahrenheit (F)
                                Opción:\s""");
                        switch (validarInt(1, 3)) {
                            case 1 -> unidadEntrada = "C";
                            case 2 -> unidadEntrada = "K";
                            case 3 -> unidadEntrada = "F";
                        }

                        //Asignar valor original
                        System.out.print("-------------------------------------------------------------------------\n" +
                                "Temperatura en " + unidadEntrada  + ": ");
                        double temperatura = validarDouble(-459.67, Float.MAX_VALUE);

                        //Asignar unidad destino
                        System.out.print("""
                                -------------------------------------------------------------------------
                                Selecciona la unidad de temperatura a transformar
                                \t1.- Celsius (C)
                                \t2.- Kelvin (K)
                                \t3.- Fahrenheit (F)
                                Opción:\s""");
                        switch (validarInt(1, 3)) {
                            case 1 -> unidadSalida = "C";
                            case 2 -> unidadSalida = "K";
                            case 3 -> unidadSalida = "F";
                        }
                        System.out.println("-------------------------------------------------------------------------\n" +
                                "Resultado: " + convertirTemperatura.convertirTemperatura(temperatura, unidadEntrada,
                                unidadSalida) + " " + unidadSalida);
                    } while (!regresarAMenu());
                }
                case "3"-> { /*Solicitar medida, unidad original y unidad a transformar*/
                    do {
                        limpiarConsola();
                        System.out.println("""
                                CONVERTIR UNIDADES MEDIDA
                                -------------------------------------------------------------------------""");


                        //Asignar unidad de medida original
                        System.out.print("""
                                Selecciona la unidad de medida original:
                                \t1.- Centímetros
                                \t2.- Pulgadas
                                \t3.- Metros
                                \t4.- Yardas
                                \t5.- Kilómetros
                                \t6.- Millas
                                Opción:\s""");
                        unidadEntrada = asignarUnidadMedida(unidadEntrada);

                        //Asignar valor de la medida original
                        System.out.print("-------------------------------------------------------------------------\n" +
                                "Medida en " + unidadEntrada + ": ");
                        double medida = validarDouble(0, Double.MAX_VALUE);

                        //Asignar unidad de medida a transformar
                        System.out.print("""
                                -------------------------------------------------------------------------
                                Selecciona la unidad de medida Esperada:
                                \t1.- Centímetros
                                \t2.- Pulgadas
                                \t3.- Metros
                                \t4.- Yardas
                                \t5.- Kilómetros
                                \t6.- Millas
                                Opción:\s""");
                        unidadSalida = asignarUnidadMedida(unidadSalida);

                        System.out.println("-------------------------------------------------------------------------\n" +
                                "Resultado: " + convertirMedida.ConvertirMedidas(medida, unidadEntrada, unidadSalida)
                                + " " + unidadSalida);
                    } while (!regresarAMenu());
                }
                case "4" -> { //Calculadora
                    boolean ciclo = true;
                    Calculadora calculadora = new Calculadora();
                    String operador = "";
                    double entrada;
                    limpiarConsola();
                    System.out.print("""
                                CALCULADORA
                                -------------------------------------------------------------------------
                                Numero inicial:\s""");
                    calculadora.calcular(validarDouble((-4.8 * Math.pow(10, 324)), Double.MAX_VALUE), "+");
                    while (ciclo) {
                        limpiarConsola();
                        System.out.println("""
                                CALCULADORA
                                -------------------------------------------------------------------------""");
                        System.out.println(calculadora.getAcumulado());
                        System.out.println("""
                                -------------------------------------------------------------------------
                                1.- Sumar           5.- Raíz cuadrada
                                2.- Restar          6.- Potencia
                                3.- Multiplicar     7.- Reiniciar
                                4.- Dividir         8.- Cerrar
                                Opción:\s""");
                        switch (scanner.nextLine()) {
                            case "1" -> operador = "+";
                            case "2" -> operador = "-";
                            case "3" -> operador = "*";
                            case "4" -> operador = "/";
                            case "5" -> {
                                try {
                                    calculadora.calcular(0, "sqrt");
                                    //
                                } catch (IllegalArgumentException e) {
                                    System.out.println("------------------------------------------------------------------------- \n" +
                                            "Error: " + e.getMessage());
                                    System.out.println("Presiona ENTER para continuar...");
                                    scanner.nextLine();
                                }

                                continue;
                            }
                            case "6" -> operador = "^";
                            case "7" -> {
                                limpiarConsola();
                                calculadora.resetAcumulado();
                                System.out.print("""
                                CALCULADORA
                                -------------------------------------------------------------------------
                                Numero inicial:\s""");
                                calculadora.calcular(validarDouble((-4.8 * Math.pow(10, 324)), Double.MAX_VALUE), "+");
                                continue;
                            }
                            case "8" -> ciclo = false;
                        }//Fin del switch
                        if (ciclo == false)break;
                        System.out.print("-------------------------------------------------------------------------\n"+
                                calculadora.getAcumulado() + " " + operador + " ");
                        entrada = validarDouble((-4.8 * Math.pow(10, 324)), Double.MAX_VALUE);

                        try {
                            calculadora.calcular(entrada, operador);

                        } catch (IllegalArgumentException e) {
                            System.out.println("-------------------------------------------------------------------------\n" +
                                    "Error: " + e.getMessage());
                            System.out.println("Presiona ENTER para continuar...");
                            scanner.nextLine();
                        }

                    }//Fin del ciclo

                }

                case "5"-> {
                    return;
                }
                default -> {
                    System.out.println("Opción invalida. Presiona ENTER para continuar... ");
                    scanner.nextLine();
                }
            }//Fin del switch
        }//Fin del ciclo
    }//Fin del main

    /**
     * Asignar unidad de medida con switch
     * @param unidadEntrada Parametro donde se asignara la medida
     * @return Parametro seleccionado en el formato necesario para la función
     */
    private static String asignarUnidadMedida(String unidadEntrada) {
        switch (validarInt(1,6)){
            case 1 -> unidadEntrada = "centimetros";
            case 2 -> unidadEntrada = "pulgadas";
            case 3 -> unidadEntrada = "metros";
            case 4 -> unidadEntrada = "yardas";
            case 5 -> unidadEntrada = "kilometros";
            case 6 -> unidadEntrada = "millas";
        }
        return unidadEntrada;
    }

    /**
     * Validar la entrada de un dato tipo Entero
     * @param min mínimo permitido
     * @param max Máximo permitido
     * @return Regresar entrada ya validada
     */
    private static int validarInt(int min, int max){
        while(true){
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()) {//Verificar que sea de tipo entero
                System.out.print("ERROR. Ingresa un numero entero: ");
                input.next(); // Consumir la entrada incorrecta
            }

            int retorno = input.nextInt(); //guardar entrada validada en una variable

            if (retorno >= min && retorno <= max){ //Si la entrada está entre X margen regresar la entrada
                input.nextLine();
                return retorno;
            }
            else{ //Si no Imprimir mensaje de error
                input.nextLine();
                System.out.print("ERROR. Ingresa un numero entre " + min + " y " + max + ": ");
            }

        }
    }

    /**
     * Validar la entrada de un dato tipo double
     * @param min mínimo permitido
     * @param max Máximo permitido
     * @return Regresar entrada ya validada
     */
    private static double validarDouble(double min, double max) {
        while (true) {
            Scanner input = new Scanner(System.in);
            while (!input.hasNextDouble()) { // Verificar que sea de tipo double
                System.out.print("ERROR. Ingresa un número decimal: ");
                input.next(); // Consumir la entrada incorrecta
            }

            double retorno = input.nextDouble(); // Guardar entrada validada en una variable

            if (retorno >= min && retorno <= max) { // Si la entrada está entre el margen especificado, regresar la entrada
                input.nextLine();
                return retorno;
            } else { // Si no, imprimir mensaje de error
                System.out.print("ERROR. Ingresa un número entre " + min + " y " + max + ": ");
                input.nextLine();
            }
        }
    }

    /**
     * Función para imprimir espacios en blanco para simular limpieza de consola
     */
    private static void limpiarConsola() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }//Fin de la función

    /**
     * Imprimir menu para realizar otro calculo o regresar al menu
     * @return booleano para revisar si romper el ciclo
     */
    private static boolean regresarAMenu(){ //
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                -------------------------------------------------------------------------
                Selecciona una opción:
                \t1.- Realizar otro calculo
                \t2.- Regresar a menu principal
                Opción:\s""");
        while(true) {
            switch (scanner.nextLine()) {
                case "1" -> {
                    return false;
                }
                case "2" -> {
                    return true;
                }
                default -> System.out.println("Opción invalida, introduce el valor nuevamente: ");

            }//Fin del switch
        }//Fin del ciclo
    }//Fin de la función
}//Fin de la clase