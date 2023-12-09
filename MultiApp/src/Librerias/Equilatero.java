package Librerias;

/**
 * Clase que representa un triángulo equilátero y permite calcular su área y perímetro.
 * Esta clase hereda de la clase Cuadrado y proporciona implementaciones concretas
 * para el cálculo de área y perímetro de un triángulo equilátero.
 */
public class Equilatero extends Cuadrado {
    protected float altura; // Altura del triángulo equilátero


    /**
     * Constructor por defecto que inicializa el lado y la altura a 0.
     */
    public Equilatero() {
        this(0.0F, 0.0F);
    }

    /**
     * Constructor que permite establecer el lado y la altura del triángulo equilátero.
     *
     * @param lado1   Longitud del lado del triángulo equilátero.
     * @param altura  Altura del triángulo equilátero.
     */
    public Equilatero(float lado1, float altura) {
        super(lado1);
        this.altura = altura;
    }

    /**
     * Calcula el área del triángulo equilátero utilizando la fórmula: (lado * altura) / 2.
     *
     * @return Área del triángulo equilátero.
     */
    @Override
    public float getArea() {
        return getLado1() * altura / 2;
    }

    /**
     * Calcula el perímetro del triángulo equilátero utilizando la fórmula: 3 * lado.
     *
     * @return Perímetro del triángulo equilátero.
     */
    @Override
    public float getPerimetro() {
        return 3 * getLado1();
    }

    /**
     * Establece el lado del triángulo equilátero y calcula automáticamente la altura
     * utilizando la fórmula: altura = (sqrt(3) * lado) / 2.
     *
     * @param lado1 Longitud del lado del triángulo equilátero.
     */
    @Override
    public void setLado1(float lado1) {
        super.setLado1(lado1);
        altura = (float) (Math.sqrt(3) * lado1 / 2);
    }

    /**
     * Obtiene la altura del triángulo equilátero.
     *
     * @return Altura del triángulo equilátero.
     */
    public float getAltura() {
        return altura;
    }
}
