package Librerias;

/**
 * Clase que representa un círculo y permite calcular su área y circunferencia.
 * Esta clase hereda de la clase abstracta FigurasGeometricas y proporciona
 * implementaciones concretas para el cálculo de área y circunferencia de un círculo.
 */
public class Circulo extends FigurasGeometricas {
    private float radio; // Radio del círculo

    /**
     * Constructor por defecto que inicializa el radio a cero.
     */
    public Circulo() {
        radio = 0;
    }

    /**
     * Constructor que permite establecer el radio del círculo al crear una instancia.
     *
     * @param radio Radio del círculo.
     */
    public Circulo(float radio) {
        this.radio = radio;
    }

    /**
     * Obtiene el valor del radio del círculo.
     *
     * @return Radio del círculo.
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Establece el radio del círculo.
     *
     * @param radio Nuevo valor del radio del círculo.
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo utilizando la fórmula: π * radio^2.
     *
     * @return Área del círculo.
     */
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    /**
     * Calcula la circunferencia del círculo utilizando la fórmula: 2 * π * radio.
     *
     * @return Circunferencia del círculo.
     */
    @Override
    public float getPerimetro() {
        return (float) (Math.PI * 2 * radio);
    }
}
