package Librerias;

import java.util.Scanner;

/**
 * Clase heredada de persona que contiene atributos para un trabajador de la universidad
 */
public abstract class Trabajador extends Persona {
    private String RFC;
    private float sueldo;
    private String horario;
    private String profesion;
    private String puesto;

    /**
     * Constructor de instancia que asigna valores por defecto
     */
    public Trabajador() {
        super();
        RFC = "";
        sueldo = 0;
        horario = "";
        profesion = "";
        puesto = "";
    }


    @Override
    public void pedirDatosConsola() {
        super.pedirDatosConsola();
        Scanner scanner = new Scanner(System.in);

        //solicitar y validar RFC
        while (true) {
            try {
                System.out.print("RFC: ");
                setRFC(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage() + ".");
                continue;
            }
            break;

        }

        System.out.print("Sueldo: ");
        setSueldo(Util.validarFloat(0, 9999999));

        System.out.print("Horario: ");
        setHorario(scanner.nextLine());

        System.out.print("Profesión: ");
        setProfesion(scanner.nextLine());

        System.out.print("Puesto: ");
        setPuesto(scanner.nextLine());
    }

    @Override
    public void imprimirConsola() {
        super.imprimirConsola();
        System.out.println("RFC: " + getRFC());
        System.out.println("Sueldo: " + getSueldo());
        System.out.println("Horario: " + getHorario());
        System.out.println("Profesión: " + getProfesion());
        System.out.println("Puesto: " + getPuesto());
    }

    /**
     * Getter RFC
     * @return RFC
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * Setter RFC con IllegalArgument
     * @param RFC RFC con el formato valido
     */
    public void setRFC(String RFC) {
        RFC = RFC.toUpperCase();
        if (RFC.matches("^[A-Z&Ñ]{3,4}[0-9]{6}[A-V0-9]{3}$")) this.RFC = RFC;
        else throw new IllegalArgumentException("Ingresa un RFC valido, por ejemplo \"ABCD123456ABC\"");
    }

    /**
     * Getter sueldo
     * @return Sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * Setter sueldo
     * @param sueldo sueldo en float
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Getter profesión
     * @return profesión del trabajador
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Setter profesión
     * @param profesion Profesión del trabajador en formato String
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * Getter Horario
     * @return Horario del profesor en formato String
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Setter horario
     * @param horario Horario del profesor en formato String
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * Getter puesto
     * @return Puesto del trabajador
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Setter puesto
     * @param puesto puesto del trabajador en formato String
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
