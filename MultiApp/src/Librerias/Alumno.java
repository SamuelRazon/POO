package Librerias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que extiende a persona y contiene atributos de un alumno
 */
public class Alumno  extends Persona{
    protected int pago;
    protected ArrayList<String> materias;
    protected ArrayList<Float> promedio;
    protected ArrayList<String> horario;
    protected String salon;

    /**
     * Constructor de instancia que asigna valores por defecto
     */
    public Alumno() {
        super();
        pago = 0;
        materias = new ArrayList<>();
        promedio = new ArrayList<>();
        horario = new ArrayList<>();
        salon = "";
    }


    @Override
    public void pedirDatosConsola() {
        super.pedirDatosConsola();
        Scanner scanner = new Scanner(System.in);

        //Settear atributos especiales alumno
        System.out.print("Pago semestral: ");
        setPago(Util.validarInt(0, 99999999));

        System.out.print("Salón: ");
        setSalon(scanner.nextLine());

        //Generar array temporales para guardar datos relacionados
        ArrayList<String> materias = new ArrayList<>();
        ArrayList<Float> promedios = new ArrayList<>();
        ArrayList<String> horarios = new ArrayList<>();

        //For que añade elementos de materia, promedio y horario a los arreglos
        for (int i = 0; true; i++) {
            System.out.print("Materia " + (i + 1) + ": ");
            materias.add(scanner.nextLine());
            System.out.print("Promedio de " + materias.get(i) + ": ");
            promedios.add(Util.validarFloat(0, 10));
            System.out.print("Horario de " + materias.get(i) + ": ");
            horarios.add(scanner.nextLine());

            //Validar si añadir más materias
            System.out.print("""
                    Selecciona una opción:
                        1.- Ingresar otra materia
                        2.- No ingresar más materias
                    Opción:\s""");
            switch (Util.validarInt(1, 2)) {
                case 1 -> {continue;}
                case 2 -> {}
            }//fin switch
            break;
        }//Fin ciclo ingresar materias

        //Guardar arreglos temporales en los atributos correspondientes
        setHorario(horarios);
        setPromedio(promedios);
        setMaterias(materias);
    }

    @Override
    public void imprimirConsola() {
        super.imprimirConsola();
        System.out.println("Pago: " + getPago());
        for (int i = 0; i < materias.size(); i++) {
            System.out.println("Materia "+(i+1)+":\t" + getMaterias().get(i) + "\t| Promedio:\t" +
                    getPromedio().get(i) + "\t| Horario:\t"  + getHorario().get(i) );
        }
        System.out.println("Salon: " + getSalon());

    }

    /**
     * Getter pago semestral
     * @return pago semestral
     */
    public int getPago() {
        return pago;
    }

    /**
     * Setter pago semestral
     * @param pago pago semestral en entero
     */
    public void setPago(int pago) {
        this.pago = pago;
    }

    /**
     * Getter materias
     * @return Materias en formato de arraylist
     */
    public ArrayList<String> getMaterias() {
        return materias;
    }

    /**
     * Setter materias
     * @param materias materias en formato de ArrayList
     */
    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    /**
     * Getter promedios
     * @return Promedios en arraylist
     */
    public ArrayList<Float> getPromedio() {
        return promedio;
    }

    /**
     * Setter promedios
     * @param promedio Promedios de las materías en un Arraylist que coincida con las materias
     */
    public void setPromedio(ArrayList<Float> promedio) {
        this.promedio = promedio;
    }

    /**
     * Getter Horarios de las materias
     * @return Horarios de las materías
     */
    public ArrayList<String> getHorario() {
        return horario;
    }

    /**
     * Setter horarios de las materias
     * @param horario Horarios de las materias en Arraylist que coincidan con las materias
     */
    public void setHorario(ArrayList<String> horario) {
        this.horario = horario;
    }

    /**
     * Getter salon
     * @return salon
     */
    public String getSalon() {
        return salon;
    }

    /**
     * Setter salon
     * @param salon Salon en String
     */
    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public String accion() {
        return "Estudia en depresión";
    }
}
