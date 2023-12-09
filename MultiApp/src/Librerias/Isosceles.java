package Librerias;

/**
 * Clase que representa un triángulo isósceles y permite calcular su área y perímetro.
 * Esta clase hereda de la clase Equilátero y agrega la capacidad de establecer el lado2
 * y ajustar la altura manualmente.
 */
public class Isosceles extends Equilatero {
    private float lado2; // Longitud del lado2 del triángulo isósceles

    /**
     * Constructor por defecto que inicializa el primer lado y el segundo lado a 0.
     */
    public Isosceles() {
        super();
        lado2 = 0;
    }

    /**
     * Constructor que permite establecer los lados y la altura del triángulo isósceles.
     *
     * @param lado1   Longitud del primer lado del triángulo isósceles.
     * @param lado2   Longitud del segundo lado del triángulo isósceles.
     * @param altura  Altura del triángulo isósceles.
     */
    public Isosceles(float lado1, float lado2, float altura) {
        super(lado1, altura);
        this.lado2 = lado2;
    }
    /**
     * Obtiene la longitud del lado2 del triángulo isósceles.
     *
     * @return Longitud del lado2 del triángulo isósceles.
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * Establece la longitud del lado2 del triángulo isósceles.
     *
     * @param lado2 Longitud del lado2 del triángulo isósceles.
     */
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    /**
     * Calcula el perímetro del triángulo isósceles utilizando la fórmula: lado1 + 2 * lado2.
     *
     * @return Perímetro del triángulo isósceles.
     */
    @Override
    public float getPerimetro() {
        return getLado1() + 2 * lado2;
    }

    /**
     * Establece manualmente la altura del triángulo isósceles.
     *
     * @param altura Altura del triángulo isósceles.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
