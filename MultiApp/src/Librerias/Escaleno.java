package Librerias;

/**
 * Clase que permite calcular área y perímetro de un triángulo escaleno.
 * Esta clase hereda de la clase Isosceles y agrega la capacidad de establecer y calcular
 * la longitud del tercer lado y calcular el perímetro de un triángulo escaleno.
 */
public class Escaleno extends Isosceles {
    private float lado3; // Longitud del tercer lado del triángulo escaleno

    /**
     * Constructor por defecto que inicializa todos los lados a 0.
     */
    public Escaleno() {
        this(0.0F, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Constructor que permite establecer los lados del triángulo escaleno.
     *
     * @param lado1   Longitud del primer lado.
     * @param lado2   Longitud del segundo lado.
     * @param lado3   Longitud del tercer lado.
     * @param altura  Altura del triángulo escaleno.
     */
    public Escaleno(float lado1, float lado2, float lado3, float altura) {
        super(lado1, lado2, altura);
        this.lado3 = lado3;
    }

    /**
     * Obtiene la longitud del tercer lado del triángulo escaleno.
     *
     * @return Longitud del tercer lado del triángulo escaleno.
     */
    public float getLado3() {
        return lado3;
    }

    /**
     * Establece la longitud del tercer lado del triángulo escaleno.
     *
     * @param lado3 Longitud del tercer lado del triángulo escaleno.
     */
    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula el perímetro del triángulo escaleno sumando las longitudes de sus tres lados.
     *
     * @return Perímetro del triángulo escaleno.
     */
    @Override
    public float getPerimetro() {
        return getLado1() + getLado2() + lado3;
    }
}
