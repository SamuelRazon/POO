package Librerias;


public class Calculadora {
    /*Atributo para guar*/
    Double acumulado;

    /**
     * Constructor, inicia el número acumulado en 0
     */
    public Calculadora(){
        acumulado = 0.0;
    }

    /**
     * Operador que almacena la operación a realizar
     * @param numInput entrada en formato double
     * @param operador operador que almacena la operación a realizar, admite +, -, *, /, root y ^
     */
    public void calcular(double numInput, String operador) {
        switch (operador) {
            case "+" -> acumulado += numInput;
            case "-" -> acumulado -= numInput;
            case "*" -> acumulado *= numInput;
            case "/" ->{
                if (numInput == 0) {
                    throw new IllegalArgumentException("No es posible dividir entre 0");
                }
                acumulado /= numInput;
            }//Fin del caso sqrt
            case "sqrt"->{
                if (acumulado < 0){
                  throw new IllegalArgumentException("No se puede sacar raíz cuadrada de un número negativo");
                }
               acumulado = Math.sqrt(acumulado);
            }//Fin del caso ^
            case "^"-> acumulado = Math.pow(acumulado, numInput);
            default -> throw new IllegalArgumentException("Operador no admitido, usa \"+\", \"-\", \"*\", \"/\", \"sqrt\" o \"^\"");
        }//Fin switch
    }//Fin Calcular

    /**
     * Obtener acumulado actual
     * @return Número acumulado respecto a las operaciones realizadas
     */
    public Double getAcumulado() {
        return acumulado;
    }//Fin acumulado

    /**
     * Colocar numero acumulado en 0
     */
    public  void resetAcumulado() {
        acumulado = 0.0;
    }//Fin resetAcumulado
}//Fin clase
