package Librerias;

/**
 * Clase que representa un rombo y permite calcular su área y perímetro.
 */
public class Rombo extends FigurasGeometricas {
    // Atributos
    private float diagonalMayor;
    private float diagonalMenor;

    /**
     * Constructor por defecto con diagonales en 0
     */
    public Rombo() {
        this(0.0F, 0.0F);
    }

    /**
     * Constructor con diagonales personalizadas
     *
     * @param diagonalMenor diagonal menor
     * @param diagonalMayor diagonal mayor
     */
    public Rombo(float diagonalMenor, float diagonalMayor){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * Obtiene la longitud de la diagonal mayor del rombo.
     *
     * @return Diagonal mayor del rombo.
     */
    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    /**
     * Establece la longitud de la diagonal mayor del rombo.
     *
     * @param diagonalMayor Diagonal mayor del rombo.
     */
    public void setDiagonalMayor(float diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    /**
     * Obtiene la longitud de la diagonal menor del rombo.
     *
     * @return Diagonal menor del rombo.
     */
    public float getDiagonalMenor() {
        return diagonalMenor;
    }

    /**
     * Establece la longitud de la diagonal menor del rombo.
     *
     * @param diagonalMenor Diagonal menor del rombo.
     */
    public void setDiagonalMenor(float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * Calcula el área del rombo utilizando la fórmula: (diagonalMayor * diagonalMenor) / 2.
     *
     * @return Área del rombo.
     */
    @Override
    public float getArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    /**
     * Calcula el perímetro del rombo utilizando la fórmula: 2 * (Math.sqrt(diagonalMayor^2 + diagonalMenor^2)).
     *
     * @return Perímetro del rombo.
     */
    @Override
    public float getPerimetro() {
        return (float) (2 * Math.sqrt((diagonalMayor * diagonalMayor + diagonalMenor * diagonalMenor)));
    }
}

