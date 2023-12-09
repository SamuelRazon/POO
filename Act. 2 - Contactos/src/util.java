import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class util {
     public static Scanner input = new Scanner(System.in);

     /**
      * Pedir y validar un número entero
      * @param min El número más pequeño que vas a aceptar
      * @param max El número más grande que se va a aceptar
      * @return Número tipo int ya validado
      */
     public static int validarInt(int min, int max){
          while(true){
               while (!input.hasNextInt()) {//Verificar que sea de tipo entero
                    System.out.println("ERROR: Ingresa un numero entero.");
                    input.next(); // Consumir la entrada incorrecta
               }

               int retorno = input.nextInt(); //guardar entrada validada en una variable

               if (retorno >= min && retorno <= max){ //Si la entrada está entre X margen regresar la entrada
                    return retorno;
               }
               else{ //Si no Imprimir mensaje de error
                    System.out.println("ERROR: Ingresa un numero entre " + min + " y " + max + ".");
               }
          }
     }

     /**
      * Función que válida que una cadena de datos sea solo de números y tenga el largo esperado
      * @param largo El largo que se espera que tenga el string
      * @return String ya validado
      */
     public static String validarSNumero(int largo){
          while (true) {
               boolean reiniciar = false;
               String bigNum = input.next();

               for (char c : bigNum.toCharArray()) {
                    if (!Character.isDigit(c)) {
                         System.out.print("ERROR. Escribe solo números: ");
                         reiniciar = true;
                         break;
                    }

               }
               if(reiniciar)continue;
               if (bigNum.length() != largo) {
                    System.out.print("ERROR: El numero debe tener "+ largo + " dígitos: ");
                    continue;
               }
               input.nextLine();

               return bigNum;

          }
     }


     /**
      * Generar 50 espacios en blanco para generar una apariencia limpia
      */
     public static void limpiarConsola() {
          for (int i = 0; i < 50; i++) {
               System.out.println();
          }
     }

     /**
      * Solicitar una fecha con validación
      * @return Fecha tipo LocalDate validada.
      */
     public static LocalDate validarFecha() {
          LocalDate fecha;
          while (true) {
               /* Solicitar fecha*/
               System.out.print("\tEscribe el dia:");
               int dia = validarInt(1, 31);
               System.out.print("\tEscribe el mes: ");
               int mes = validarInt(1, 12);
               System.out.print("\tEscribe el año: ");
               int year = validarInt(1900, LocalDate.now().getYear());

               /* Guardar fecha en una variable y validar, reintentar si es incorrecta */
               try {
                    fecha = LocalDate.of(year, mes, dia);
               } catch (DateTimeException e) {
                    System.out.println("ERROR. Ingresa una fecha valida.");
                    continue;
               }
               return fecha;
          }//Fin del ciclo
     }//Fin de la función
}
