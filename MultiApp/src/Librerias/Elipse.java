package Librerias;

/**
 * Clase que representa una elipse y permite calcular su área y circunferencia.
 * Esta clase hereda de la clase Circulo y proporciona implementaciones concretas
 * para el cálculo de área y circunferencia de una elipse.
 */
public class Elipse extends Circulo {
    private float radioMayor; // Radio mayor de la elipse

    /**
     * Constructor que permite establecer los radios mayor y menor de la elipse al crear una instancia.
     *
     * @param radioMenor Radio menor de la elipse.
     * @param radioMayor Radio mayor de la elipse.
     */
    public Elipse(float radioMenor, float radioMayor) {
        super(radioMenor);
        this.radioMayor = radioMayor;
    }

    /**
     * Constructor por defecto que inicializa los radios a cero.
     */
    public Elipse() {
        super();
        this.radioMayor = 0;
    }

    /**
     * Establece el radio mayor de la elipse.
     *
     * @param radioMayor Nuevo valor del radio mayor de la elipse.
     */
    public void setRadioMayor(float radioMayor) {
        this.radioMayor = radioMayor;
    }

    /**
     * Obtiene el valor del radio mayor de la elipse.
     *
     * @return Radio mayor de la elipse.
     */
    public float getRadioMayor() {
        return radioMayor;
    }

    /**
     * Calcula el área de la elipse utilizando la fórmula: π * radioMayor * radioMenor.
     *
     * @return Área de la elipse.
     */
    @Override
    public float getArea() {
        return (float) (Math.PI * radioMayor * getRadio());
    }


    /**
     * Calcular circunferencia
     * @return Circunferencia
     */
    @Override
    public float getPerimetro() {
        return (float)(2 *Math.PI * Math.sqrt((radioMayor * radioMayor + getRadio() * getRadio())/2));
    }
}
