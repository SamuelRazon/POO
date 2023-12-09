package Librerias;

import java.util.Scanner;

/**
 * Clase que extiende a trabajador con atributos de intendente
 */
public class Intendente extends Trabajador{
    private String area;

    /**
     * Constructor de instancia que asigna valores por defecto
     */
    public Intendente() {
        super();
        Scanner scanner = new Scanner(System.in);
        area = "";
    }

    @Override
    public void pedirDatosConsola() {
        super.pedirDatosConsola();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Area: ");
        setArea(scanner.nextLine());
    }

    @Override
    public void imprimirConsola() {
        super.imprimirConsola();
        System.out.println("Area: " + getArea());
    }

    @Override
    public String accion() {
        return "Limpia";
    }

    /**
     * Obtener área de trabajo
     * @return área de trabajo
     */
    public String getArea() {
        return area;
    }

    /**
     * Getter Setter área de trabajo
     * @param area área de trabajo en String
     */
    public void setArea(String area) {
        this.area = area;
    }
}
