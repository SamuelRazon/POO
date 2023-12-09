package Librerias;

import java.util.ArrayList;

/**
 * Clase con métodos estáticos para cambiar la base de un número, no requiere crear objeto.
 */
public class BasesNumericas {
    /**
     * Transformar numero de una base a el número equivalente con otra base
     * @param numero Número en base original
     * @param baseOrigen La base original del número
     * @param baseDestino Base deseada
     * @return Numero transformado
     */
    public String convertirBase(String numero, int baseOrigen,int baseDestino){
        ArrayList<Integer> digits = new ArrayList<>(); //Array que guarda los dígitos que forman el nuevo numero
        StringBuilder nuevoNumero = new StringBuilder(); // Constructo de strings que guarda el resultado
        numero = numero.toUpperCase(); //Transformar minúsculas a mayúsculas

        /////* Validaciones */////

        if (baseDestino <2 || baseDestino >35){ // Verificar que la base este entre 2 y 35
            throw new IllegalArgumentException("ERROR: El programa solo calcula bases entre 2 y 35");
        }
        if(!validacion(numero, baseOrigen)){    // Validar que la entrada coincida con la base
            throw new IllegalArgumentException("ERROR: El número no coincide con la base numérica");
        }

        /////*Transformar número original a de decimal entero*/////

        int intNumero = 0;
        for (int i = 0, j = numero.length()-1; i < numero.length(); i++, j--) {
            intNumero = intNumero + (int) (digitoDecimal(numero.charAt(i)) * Math.pow(baseOrigen, j));
        }//Fin del for

        /////*Transformar decimal a número de la base esperada */////

        /*Guardar cada digíto en el array a partir del residuo */
        while (intNumero > 0){
            digits.add(intNumero%baseDestino);
            intNumero = intNumero/baseDestino;
        }//Fin del while


        /*Recorrer el array desde atrás, e integrarlo al nuevo número */
        for (int i = digits.size(); i > 0 ; i--) {
            nuevoNumero.append(conversorALetras(digits.get(i-1)));
        }//Fin del for

        return nuevoNumero.toString();
    }//Fin de la función

    /**
     * Transformar un numero a una letra si es mayor a 9
     * @param numero numero entero que servirá como digito
     * @return Números con valor mayor en decimal en formato de letra
     */
    private static String conversorALetras(int numero){ //Convertir números mayores 9 a letras
        //Transformar a letra mayúscula si el carácter es mayor a 9
        if (numero >= 10){
            return String.valueOf((char) (numero+55));
        }//Fin del if
        else return String.valueOf(numero);
    }//Fin de la función

    /**
     * Transforma un digito en numero o letra a su valor entero
     * @param digito carácter que representa al dígito
     * @return Número decimal
     */
    private static int digitoDecimal(char digito){ //
        if ((int) digito >= 48 && (int) digito <=57){ //Sí es un número regresar valor en entero
            return digito - 48;
        } else if ((int) digito >= 65 && (int) digito <= 90 ) { //Sí es una letra regresar valor numérico
            return digito - 55;
        }else { //Else por si acaso
            System.out.println("ERROR: No deberías ves este mensaje"); //Borrar después de validación
            return 0;
        }
    }


    /**
     * Verifica que los caracteres del número ingresado coincidan con la base de origen
     * @param numero String del número ingresado antes de procesar, ya transformado a mayúsculas.
     * @param baseOrigen Base original del numero
     * @return true si el número es valído, false en caso de que no
     */
    public static boolean validacion (String numero, int baseOrigen){
        numero = numero.toUpperCase(); //Transformar minúsculas a mayúsculas
        if(baseOrigen <= 10){//Cuando la base del número es de 10 o mayor
            return numero.matches("[0-" + (baseOrigen - 1) + "]+");
        }
        else{//Cuando la base es mayor a 10
            return numero.matches("[0-9A-"+((char)(baseOrigen+54))+"]+");
        }
    }
}