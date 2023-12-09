package Librerias;

/**
 * Clase que permite calcular área y perímetro de un polígono de n lados.
 * Esta clase hereda de la clase Cuadrado para aprovechar su funcionalidad de cálculo de área y perímetro.
 */
public class Poligono extends Cuadrado {
    private float apotema; // Longitud de la apotema desde un lado al centro de la figura
    private float nLados; // Número de lados del polígono

    /**
     * Constructor sin argumentos que inicializa los valores a cero.
     */
    public Poligono(){
        super();
        apotema = 0;
        nLados = 0;
    }

    /**
     * Constructor con valores asignados para crear un polígono.
     *
     * @param lado Medida del lado de la figura.
     * @param apotema Medida del punto central de un lado al centro de la figura.
     * @param nLados Número de lados de la figura.
     */
    public Poligono(float lado, float apotema, float nLados){
        super(lado);
        this.apotema = apotema;
        this.nLados = nLados;
    }

    /**
     * Calcula el área del polígono utilizando la fórmula apropiada.
     *
     * @return Área de la figura.
     */
    @Override
    public float getArea() {
        return (getLado1() * apotema / 2) * nLados;
    }

    /**
     * Calcula el perímetro del polígono utilizando la fórmula apropiada.
     *
     * @return Perímetro de la figura.
     */
    @Override
    public float getPerimetro() {
        return nLados * getLado1();
    }

    /**
     * Obtiene la longitud del apotema del polígono.
     *
     * @return Longitud del apotema.
     */
    public float getApotema() {
        return apotema;
    }

    /**
     * Establece la longitud del apotema del polígono.
     *
     * @param apotema Longitud del apotema.
     */
    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    /**
     * Obtiene el número de lados del polígono.
     *
     * @return Número de lados del polígono.
     */
    public float getNLados() {
        return nLados;
    }

    /**
     * Establece el número de lados del polígono.
     *
     * @param nLados Número de lados del polígono.
     */
    public void setNLados(float nLados) {
        this.nLados = nLados;
    }
}
