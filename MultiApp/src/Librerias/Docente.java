package Librerias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que extiende a trabajador y contiene atributos de un docente
 */
public class Docente extends Trabajador{
    private ArrayList<String> materias;
    private String categoria;
    private String cubiculo;

    /**
     * Constructor de instancia que asigna valores por defecto
     */
    public Docente() {
        super();
        materias = new ArrayList<>();
        categoria = "";
        cubiculo = "";
    }

    @Override
    public void pedirDatosConsola() {
        super.pedirDatosConsola();
        Scanner scanner = new Scanner(System.in);

        ////////////// Atributos Docente ////////////////
        ArrayList<String> materias = new ArrayList<>();
        //Añadir materias
        for (int i = 0; true; i++) {
            System.out.print("Materia " + (i + 1) + ": ");
            materias.add(scanner.nextLine());


            System.out.print("""
                    Selecciona una opción:
                        1.- Ingresar otra materia
                        2.- No ingresar más materias
                    Opción:\s""");

            switch (Util.validarInt(1, 2)) {
                case 1 -> {
                    continue;
                }
                case 2 -> {
                }
            }//fin switch
            break;
        }//Fin ciclo ingresar materias
        setMaterias(materias);

        // Asignar categoría del profesor
        System.out.print("""
                Categoría:
                    1.- Tiempo completo
                    2.- Profesor de materia
                Opción:\s""");
        while (true) {
            switch (scanner.nextLine()) {
                case "1" -> setCategoria("c");
                case "2" -> setCategoria("m");
                default -> {
                    System.out.print("Ingresa solo 1 o 2: ");
                    continue;
                }
            }
            break;
        }

        if (getCategoria().equals("Tiempo completo")) {
            System.out.print("Cubículo: ");
            setCubiculo(scanner.nextLine());
        }
        else setCubiculo("Sin cubículo");
    }

    @Override
    public void imprimirConsola() {
        super.imprimirConsola();
        for (int i = 0; i < materias.size(); i++) {
            System.out.println("Materia: " + (i+1) + ": " + getMaterias().get(i));
        }
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Cubículo: " + getCubiculo());
    }

    /**
     * Getter materias
     * @return Materías en ArrayList
     */
    public ArrayList<String> getMaterias() {
        return materias;
    }

    /**
     * Setter materias
     * @param materias Materias en un ArrayList de Strings
     */
    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    /**
     * Getter categoría
     * @return categoría
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Asignar categoría del profesor, puede ser de tiempo completo o profesor de materia
     *
     * @param categoria Usa "C" para tiempo completo o "M" para profesor de materia
     */
    public void setCategoria(String categoria) {
        switch (categoria.toLowerCase()){
            case "c" -> this.categoria = "Tiempo completo";
            case "m" -> this.categoria = "Profesor de materia";
            default -> throw new IllegalArgumentException("Usa \"C\" para tiempo completo o \"M\" para profesor de materia");
        }
    }

    /**
     * Getter cubículo del profesor
     * @return retornar cubículo si es profesor de tiempo completo
     */
    public String getCubiculo() {
        if (categoria.equals("Tiempo completo")) return cubiculo;
        else return "Profesor sin cubículo";
    }

    /**
     * Setter cubículo
     * @param cubiculo cubículo en string
     */
    public void setCubiculo(String cubiculo) {
        this.cubiculo = cubiculo;
    }

    @Override
    public String accion() {
        return "Enseña";
    }
}
