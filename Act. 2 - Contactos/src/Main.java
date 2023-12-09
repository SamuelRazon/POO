/**
 * ActividadDeProgramación2 = "Agenda simple"
 * Descripción =⠀"Solicitar y guardar datos de personas utilizando ArraList"⠀⠀
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


import java.util.ArrayList;


public class Main {

    static ArrayList<String> codigo = new ArrayList<>();
    static ArrayList<String> nombre = new ArrayList<>();
    static ArrayList<String> edad = new ArrayList<>();
    static ArrayList<String> diaYMes = new ArrayList<>();
    static ArrayList<String> telefono = new ArrayList<>();
    static ArrayList<String> pais = new ArrayList<>();

    public static void main(String[] args) {
        int i = 0;
        i += nuevo();
        while (true){
            util.limpiarConsola();
            System.out.println("""
            Agenda simple
            --------------------------------------------------------
            \t1.- Ver contactos
            \t2.- Nuevo contacto
            \t3.- Cerrar programa
            Opción:""");
            switch (util.validarInt(1,3)) {
                case 1 -> {/*Imprimir los contactos*/
                    util.input.nextLine();
                    util.limpiarConsola();
                    System.out.println("Nombre\t\tCódigo\t\tEdad\t\tCumpleaños\t\tTeléfono\t\tPais");
                    for (int j = 0; j<nombre.size(); j++){
                        System.out.println(nombre.get(j) + "\t\t" + codigo.get(j)
                                + "\t\t" + edad.get(j) + "\t\t" + diaYMes.get(j) + "\t\t" + telefono.get(j) + "\t\t" + pais.get(j) );
                    }
                    System.out.println("\n\nPresiona Enter para continuar...");
                    util.input.nextLine();

                }
                case 2 -> /*Nuevo contacto*/ {
                    util.input.nextLine();
                    i += nuevo();
                }
                case 3 -> {/*Cerrar programa*/
                    util.input.nextLine();
                    util.limpiarConsola();
                    System.out.println("""
                            El programa se cerrará
                            ---------------------------------------------------------
                            \tY.- Aceptar
                            \tN.- Cancelar
                            Opción:\s""");
                    if((util.input.next().charAt(0) == 'Y') || (util.input.next().charAt(0) == 'y')){
                        return;
                    }
                }
            }
        }
    }


    /**
     * Función para crear un nuevo contacto.
     * @return entero para añadir a un contador
     */
    public static int nuevo() {
        util.limpiarConsola();
        System.out.print("""
                Nuevo Contacto
                -----------------------------------------------------------------------------
                """);
        System.out.print("Nombre: ");
        nombre.add(util.input.nextLine());

        System.out.print("Código: ");
        codigo.add(util.validarSNumero(9));

        System.out.print("Edad: ");
        edad.add(util.validarSNumero(2));

        System.out.print("Cumpleaños: ");
        diaYMes.add(util.input.nextLine());

        System.out.print("Teléfono: ");
        telefono.add(util.validarSNumero(10));

        System.out.print("Pais: ");
        pais.add(util.input.nextLine());

        return 1;
    }

    /**
     * Función para imprimir una cadena de texto
     * @param imprimir Imprimir el texto ingresado en la consola
     */
    public static void imp(String imprimir){
        System.out.println(imprimir);
    }
} //Fin de clase main


