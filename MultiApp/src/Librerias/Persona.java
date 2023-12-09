package Librerias;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.io.*;

/**
 * Clase abstracta que contiene métodos y atributos de una persona
 */
public abstract class Persona implements Serializable {
    private String nombre;
    private String codigo;
    private String correo;
    private String telefono;
    private String estadoCivil;
    private String domicilio;
    private String curp;
    private String nss;
    private LocalDate fechaNacimiento;
    private String sexo;

    /**
     * Constructor de instancia que asigna valores por defecto
     */
    public Persona(){
        nombre = "";
        codigo = "";
        correo = "";
        telefono = "";
        estadoCivil = "";
        domicilio = "";
        curp = "";
        nss = "";
        fechaNacimiento = LocalDate.now();
        sexo = "";
    }

    /**
     * Método polimórfico para pedir y validar los datos en consola
     */
    public void pedirDatosConsola(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        setNombre(scanner.nextLine());

        //solicitar y validar código
        while (true) {
            try {
                System.out.print("Código: ");
                setCodigo(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage() + ".");
                continue;
            }
            break;

        }


        //Solicitar y validar correo
        while (true) {
            try {
                System.out.print("Correo: ");
                setCorreo(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage() + ".");
            }

        }

        //Solicitar y validar teléfono
        while (true) {
            try {
                System.out.print("Teléfono: ");
                setTelefono(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage() + ".");
                continue;
            }
            break;
        }

        //Solicitar estado civil
        System.out.print("""
                Estado civil
                    1.- Soltero/a
                    2.- Casado/a
                Opción:\s""");
        while (true) {
            switch (scanner.nextLine()) {
                case "1" -> setEstadoCivil("S");
                case "2" -> setEstadoCivil("C");
                default -> {
                    System.out.print("Ingresa solo 1 o 2: ");
                    continue;
                }
            }
            break;
        }

        System.out.print("Domicilio: ");
        setDomicilio(scanner.nextLine());

        //Solicitar y validar CURP
        while (true) {
            try {
                System.out.print("CURP: ");
                setCurp(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage() + ".");
            }
        }

        //Solicitar y validar NSS
        while (true) {
            try {
                System.out.print("NSS: ");
                setNss(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage() + ":");
            }
        }

        System.out.println("Fecha de nacimiento:");
        /*setFechaNacimiento(Util.validarFecha());*/    

        //Solicitar y validar sexo
        System.out.print("""
                Sexo:
                    1.- Masculino
                    2.- Femenino
                Opción:\s""");
        while (true) {
            switch (scanner.nextLine()) {
                case "1" -> setSexo("M");
                case "2" -> setSexo("F");
                default -> {
                    System.out.print("Ingresa solo 1 o 2: ");
                    continue;
                }
            }
            break;
        }

    }


    /**
     * Método polimórfico para imprimir los datos de la persona
     */
    public void imprimirConsola(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Código: " + getCodigo());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Estado civil: " + getEstadoCivil());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("CURP: " + getCurp());
        System.out.println("NSS: " +  getNss());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
    }


    /**
     * Getter nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     * @param nombre Nombre de la persona en string
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter código
     * @return Código del alumno / trabajador
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Setter código
     * @param codigo Código del alumno / trabajador con 9 dígitos
     */
    public void setCodigo(String codigo) {
        if(codigo.matches("\\d{9}")) this.codigo = codigo; //Validar que el código contenga 9 caracteres
        else throw  new IllegalArgumentException("Ingresa un código valido");
    }

    /**
     * Getter correo electrónico
     * @return Correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Setter correo electrónico
     * @param correo correo electrónico con "@" y "." adecuados
     */
    public void setCorreo(String correo) { //Pedir y validar correo electrónico
        correo = correo.toLowerCase();
        if (correo.matches("^[A-Za-z0-9+_.-]+@(.+)+\\.+(.+)$")) {
            this.correo = correo;
        } else{
            throw new IllegalArgumentException("Ingresa un correo electrónico valido.");
        }
    }

    /**
     * Getter teléfono
     * @return Teléfono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter teléfono
     * @param telefono Teléfono con 10 digitos
     */
    public void setTelefono(String telefono) {
        if(telefono.matches("\\d{10}")) this.telefono = telefono; //Validar que el número tenga 9 dígitos
        else throw new IllegalArgumentException("Ingresa un número de 10 dígitos");
    }

    /**
     * Estado civil de la persona
     * @return estado civil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Asignar estado civil
     * @param estadoCivil S para soltero o C para casado
     */
    public void setEstadoCivil(String estadoCivil) {
        estadoCivil = estadoCivil.toUpperCase();
        switch (estadoCivil){
            case "S", "SOLTERO", "SOLTERA" -> this.estadoCivil = "Soltero/a";
            case "C", "CASADO", "CASADA" -> this.estadoCivil = "Casado/a";
            default -> throw new IllegalArgumentException("Solo se acepta \"S\" para soltero o \"C\" para casado");
        }
    }

    /**
     * Getter domicilio
     * @return domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Setter domicilio
     * @param domicilio domicilio en String
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Getter CURP
     * @return CURP
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Setter CURP
     * @param curp CURP con el formato correcto
     */
    public void setCurp(String curp) {
         curp = curp.toUpperCase();
        if (curp.matches("^[A-Z]{4}[0-9]{6}[HM][A-Z]{5}[0-9]{2}$")) this.curp = curp; //Validar formato curp
        else throw new IllegalArgumentException("Ingresa una CURP valida, por ejemplo \"ABCD123456HABCDE12\"");
    }

    /**
     * Getter numero social
     * @return NSS
     */
    public String getNss() {
        return nss;
    }

    /**
     * Setter Numero social
     * @param nss Número social del IMSS de 11 dígitos en formato String
     */
    public void setNss(String nss) {
        if (nss.matches("^[0-9]{11}$")) this.nss = nss; //Validar que contenga 11 dígitos
        else throw new IllegalArgumentException("Ingresa un Numero de seguro social valido (11 dígitos)");
    }

    /**
     * Setter fecha de nacimiento
     * @param fechaNacimiento Fecha de nacimiento de tipo LocalDate
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    /**
     * Getter edad
     * @return Edad calculada a partir de fecha de nacimiento
     */
    public int getEdad(){
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    /**
     * Getter sexo
     * @return Sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Asignar sexo a la persona
     * @param sexo M para masculino o F para femenino
     */
    public void setSexo(String sexo) {
        sexo = sexo.toLowerCase();
        switch (sexo){
            case "m", "masculino" -> this.sexo = "Masculino";
            case "f", "femenino" -> this.sexo = "Femenino";
            case "enbeces" -> this.sexo = "Pillin";
            default -> throw new IllegalArgumentException("Ingresa \"f\" para femenino o \"m\" para masculino");
        }

    }

    /**
     * Acción de una persona
     * @return Acción del contacto dependiendo de su clase
     */
    public abstract String accion();
}
