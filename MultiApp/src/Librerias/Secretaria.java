package Librerias;

import java.util.Scanner;

/**
 * Clase que extiende a trabajador con atributos de secretaria
 */
public class Secretaria extends Trabajador {
    private String oficina;

    /**
     * Constructor de instancia que asigna valores por defecto
     */
    public Secretaria() {
        super();
        Scanner scanner = new Scanner(System.in);

        oficina = "";
    }

    @Override
    public void pedirDatosConsola() {
        super.pedirDatosConsola();
        oficina = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oficina: ");
        setOficina(scanner.nextLine());
    }

    @Override
    public void imprimirConsola() {
        super.imprimirConsola();
        System.out.println("Oficina: " + getOficina());
    }

    /**
     * Getter Oficina
     * @return Oficina
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * Setter oficina
     * @param oficina oficina en string
     */
    public void setOficina(String oficina) {this.oficina = oficina;
    }

    @Override
    public String accion() {
        return "Secretea";
    }
}
