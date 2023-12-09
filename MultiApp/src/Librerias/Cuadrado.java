package Librerias;

/**
 * Clase que representa un cuadrado y permite calcular su área y perímetro.
 * Esta clase hereda de la clase abstracta FigurasGeometricas y proporciona
 * implementaciones concretas para el cálculo de área y perímetro de un cuadrado.
 */
public class Cuadrado extends FigurasGeometricas {
    private float lado1; // Longitud de un lado del cuadrado

    /**
     * Constructor por defecto que inicializa el lado a 0.
     */
    public Cuadrado() {
        this(0);
    }

    /**
     * Constructor que permite establecer la longitud del lado del cuadrado.
     *
     * @param lado1 Longitud del lado del cuadrado.
     */
    public Cuadrado(float lado1) {
        super();
        this.lado1 = lado1;
    }

    /**
     * Obtiene la longitud de un lado del cuadrado.
     *
     * @return Longitud del lado del cuadrado.
     */
    public float getLado1() {
        return lado1;
    }

    /**
     * Establece la longitud de un lado del cuadrado.
     *
     * @param lado1 Longitud del lado del cuadrado.
     */
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    /**
     * Calcula el área del cuadrado utilizando la fórmula: lado1 * lado1.
     *
     * @return Área del cuadrado.
     */
    @Override
    public float getArea() {
        return lado1 * lado1;
    }

    /**
     * Calcula el perímetro del cuadrado utilizando la fórmula: 4 * lado1.
     *
     * @return Perímetro del cuadrado.
     */
    @Override
    public float getPerimetro() {
        return 4 * lado1;
    }
}