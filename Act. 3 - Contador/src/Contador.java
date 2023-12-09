
public class Contador {
    private int acumulado;

    /**
     * Construir contador con valor en 0
     */
    public Contador(){
        this.acumulado = 0;
    }

    /**
     * Construir contador en valor elegido
     * @param inicio valor para iniciar el contador
     */
    public Contador(int inicio){
        this.acumulado = inicio;
    }

    /**
     * Aumentar el contador en 1
     */
    public void incremento(){
        this. acumulado++;
    }

    /**
     * Aumentar el contador en el valor elegido
     * @param suma El valor en que va a incrementar el contador
     */
    public void incremento(int suma){
        this.acumulado = this.acumulado + suma;
    }


    /**
     * Mostrar el estado actual del contador
     * @return Valor del contador acumulado
     */
    public int mostrar(){
        return this.acumulado;
    }

    /**
     * Reasignar el valor acumulado
     * @param set Nuevo valor
     */
    public void setAcumulado(int set){
        this.acumulado = set;
    }

    /**
     * Reiniciar el contador a 0
     */
    public void reiniciar(){
        this.acumulado = 0;
    }

}
