/*
 * ActividadDeProgramación3 = "Contador"
 * Descripción =⠀""⠀⠀
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
 *⠀⠈⠛⠛⠚⠁⠀⠀⠀⠉⠉⠙⠒⠢⠽⢿⣿⣿⣷⡀⢻⣦⡙⠲⠶⠛⠁⠀⠀⠀0
 * @author Fernando Samuel Razon Gomez
 */

public class Main {

    public static void main(String[] args) {

        //Crear contador 1
        Contador contador1 = new Contador();

        //Imprimir el contador 1 y su progreso
        print("Progreso de contador 1");
        for (int i = 0; i < 10; i++) {
            contador1.incremento();
            print(contador1.mostrar());
        }//Fin del for

        //Reiniciar el estado del contador
        contador1.reiniciar();

        Contador contador2 = new Contador(11);

        /*For que imprime el decremento del contador 2*/
        print("Progreso del contador 2");
        for (int i = 0; i < 10; i++) {
            contador2.incremento(-1);
            print(contador2.mostrar());
        }//Fin del for
        contador2.setAcumulado(11);
    }// Fin de la función main

    /**
     * Funcion para imprimir
     * @param texto texto a imprimir
     */
    public static void print(String texto){
        System.out.println(texto);
    } //Fin de la función

    /**
     * Sobrecarga 1: imprimir numero
     * @param numero numero a imprimir
     */
    public static void print(int numero){
        System.out.println(numero);
    }//Fin de la función
}//Fin de la clase

