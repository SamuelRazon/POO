package Librerias;

/**
 * Clase que representa un rectángulo y permite calcular su área y perímetro.
 * Esta clase hereda de la clase Cuadrado y agrega la capacidad de establecer
 * la longitud del lado2 y calcular el área y el perímetro de un rectángulo.
 */
public class Rectangulo extends Cuadrado {
    private float lado2; // Longitud del lado2 del rectángulo

    public Rectangulo () {
        this(0.0F, 0.0F);
    }

    public Rectangulo (float lado1, float lado2){
        super(lado1);
        this.lado2 = lado2;
    }

    /**
     * Establece la longitud del lado2 del rectángulo.
     *
     * @param lado2 Longitud del lado2 del rectángulo.
     */
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    /**
     * Obtiene la longitud del lado2 del rectángulo.
     *
     * @return Longitud del lado2 del rectángulo.
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * Calcula el área del rectángulo utilizando la fórmula: lado1 * lado2.
     *
     * @return Área del rectángulo.
     */
    @Override
    public float getArea() {
        return getLado1() * lado2;
    }

    /**
     * Calcula el perímetro del rectángulo utilizando la fórmula: 2 * lado2 + 2 * lado1.
     *
     * @return Perímetro del rectángulo.
     */
    @Override
    public float getPerimetro() {
        return 2 * lado2 + 2 * getLado1();
    }
}

