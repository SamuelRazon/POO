/*
 * ActividadDeProgramación = "MultiApp"
 * Descripción =⠀"Reutilizar clases creadas a lo largo del semestre para integrarlos en una interfaz grafica"⠀⠀
 * Nombre = "Fernando Samuel Razón Gómez"
 * OtrosDatos = "UDG - Cualtos - ICOM - POO - Profesor Sergio"
 * ⠀⠀⠀⠀⠀⠀⠀⠀⡤⢲⠞⢉⡽⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 *⠀⠀⠀⠀⠀⠀⠀⣼⣰⡇⢀⡎⠀⣠⣼⣷⣄⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀
 *⠀⠀⠀⠀⠀⠀⠀⣿⣿⣷⣿⣀⣀⡼⢉⣿⣿⣷⣶⣶⠖⠈⠉⠚⠛⠣⣀⠀⠀⠀
 *⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣌⣉⣠⣾⣿⣿⣿⣿⠇⠀⠀⣀⡀⠀⠀⠀⠑⢤⣄
 *⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⡿⢟⣿⣿⣿⣿⠀⠀⠀⠻⣯⠆⠀⠀⠀⠈⡇
 *⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⣿⣿⣷⣿⣿⣿⣿⣿⣿⡄⠀⠀⡀⣠⡈⠀⣤⢄⠀⢠
 *⠀⠀⠀⠀⠀⠀⢀⡴⠃⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠳⣸⠷⠄⠲⠾⢇⠆
 *⠀⠀⠀⠀⠀⣠⠞⠀⠀⠀⠀⠈⠛⠿⣿⣿⣿⣿⣿⣿⣷⣤⣀⠀⠀⢀⡠⠐⠁⠀
 *⠀⠀⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠿⣿⣿⣿⢿⣿⣿⣖⣂⠀⠀⠀
 *⠀⠀⢀⢶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⣿⠉⡇⢹⣸⠀⠀⠀
 *⠀⡠⠙⣻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠿⠿⠚⠛⠋⠁⠀⠀⠀
 *⣸⡆⠀⢣⣳⡀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⡖⠲⠆⣺⣁⡀⣠⣴⣲⠒⣦⠀⠀⠀
 *⢿⣿⡀⠀⠙⠺⠗⣶⣢⣔⣲⣲⠯⠟⠊⠀⣦⣾⡿⠁⣴⢡⡟⠉⠉⠙⠤⠆⠀⠀
 *⠈⢿⣿⣦⡀⢀⣤⣤⣀⣀⠀⠀⠀⠀⢠⣾⣿⣿⡇⠀⣧⢸⡄⠀⠀⠀⡼⠃⠀⠀
 *⠀⠈⠛⠛⠚⠁⠀⠀⠀⠉⠉⠙⠒⠢⠽⢿⣿⣿⣷⡀⢻⣦⡙⠲⠶⠛⠁⠀⠀⠀
 */
package multiapp;

import Librerias.Alumno;
import Librerias.Docente;
import Librerias.Intendente;
import Librerias.Persona;
import Librerias.Secretaria;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samue
 */
public class MostrarContacto extends javax.swing.JFrame {
    private static MostrarContacto instancia;
    private Persona contacto;
    
    private String clase;
    /*
    //Arraylist para guardar las materias del alumno 
    protected ArrayList<String> materias;
    protected ArrayList<Float> promedios;
    protected ArrayList<String> horarios;
    
    //ArrayList para guardar las materias del profesor
    protected ArrayList<String> materiasP;
    */
    /**
     * Crear una instancia estilo singletone
     * @param contacto contacto que se quiere ver
     * @return ventana mostrar contacto
     */
    public static MostrarContacto getInstance(Persona contacto) { //Metodo singleTone
        if (instancia == null) {
            instancia = new MostrarContacto(contacto);
        }else{
            instancia.toFront();
        }
        return instancia;
        
    }
    
    /**
     * Creates new form MostrarContacto
     */
    private MostrarContacto(Persona contacto) {
        //Inicializar componentes
        initComponents();
        
        this.setLocationRelativeTo(null);//Posicionar ventana en el centro
        
        //Asignar contacto seleccionado al atributo contacto
        this.contacto = contacto;
        
        //Generar campos para los datos segun la clase del contacto
        generarEspacios();
    }
    
    /**
     * Generar campos para los datos segun la clase del contacto
     */
    private void generarEspacios(){
        //quitar seleccionabilidad a botones
        bMasculino.setFocusable(false);
        bFemenino.setFocusable(false);
        bSoltero.setFocusable(false);
        bCasado.setFocusable(false);
        
        
        //Setter layout adecuado para añadir paneles
        pContenedor.setLayout(new BoxLayout(pContenedor, BoxLayout.Y_AXIS));
        
        //Agregar panel con atributos de persona
        pContenedor.add(pAtributosPersona);
        
        //Seleccionar icono
                setIconImage(new ImageIcon(getClass().getResource("contact.png")).getImage());
        
        //Seleccionar los siguiente paneles segun la clase
        switch(contacto.getClass().getSimpleName()){
            case "Alumno" -> {
                //Hacer casting o algo asi
                Alumno vContacto = (Alumno)contacto;
                
                //Agregar paneles correspondientes
                pContenedor.add(pAtributosAlumno);
                
                


                //Settear atributos persona
                cNombre.setText(vContacto.getNombre());
                cCodigo.setText(vContacto.getCodigo());
                cTelefono.setText(vContacto.getTelefono());
                cCorreo.setText(vContacto.getCorreo());

                if (vContacto.getEstadoCivil().equals("Soltero/a")){
                    bSoltero.setSelected(true);
                } else {
                    bCasado.setSelected(true);
                }

                cDomicilio.setText(vContacto.getDomicilio());
                cNss.setText(vContacto.getNss());
                cCurp.setText(vContacto.getCurp());
                cEdad.setText(Integer.toString(vContacto.getEdad()));
                cDiaNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getDayOfMonth()));
                cMesDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getMonthValue()));
                cYearDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getYear()));

                if (vContacto.getSexo().equals("Masculino")){
                    bMasculino.setSelected(true);
                } else {
                    bFemenino.setSelected(true);
                }

                //Atributos Alumno
                cPago.setText(Integer.toString(vContacto.getPago()));
                DefaultTableModel modelo = (DefaultTableModel) tablaMateriasAlumno.getModel();

                String[] materias = new String[3];
                for (int i = 0; i < vContacto.getMaterias().size(); i++) {
                    //Guardar la materias, promedio y horario en un array
                    materias[0] = vContacto.getMaterias().get(i);
                    materias[1] = String.valueOf(vContacto.getPromedio().get(i));
                    materias[2] = vContacto.getHorario().get(i);
                    
                    //Añadir vector como fila
                    modelo.addRow(materias);
                }
                
                cSalon.setText(vContacto.getSalon());
                
            }//Fin case Alumno
            case "Docente" -> {
                //Hacer casting o algo asi
                Docente vContacto = (Docente)contacto;
                
                //Agregar paneles correspondientes
                pContenedor.add(pAtributosTrabajador);
                pContenedor.add(pAtributosProfesor);

                //Settear atributos persona
                cNombre.setText(vContacto.getNombre());
                cCodigo.setText(vContacto.getCodigo());
                cTelefono.setText(vContacto.getTelefono());
                cCorreo.setText(vContacto.getCorreo());

                if (vContacto.getEstadoCivil().equals("Soltero/a")){
                    bSoltero.setSelected(true);
                } else {
                    bCasado.setSelected(true);
                }

                cDomicilio.setText(vContacto.getDomicilio());
                cNss.setText(vContacto.getNss());
                cCurp.setText(vContacto.getCurp());
                cEdad.setText(String.valueOf(vContacto.getEdad()));
                cDiaNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getDayOfMonth()));
                cMesDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getMonthValue()));
                cYearDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getYear()));

                if (vContacto.getSexo().equals("Masculino")){
                    bMasculino.setSelected(true);
                } else {
                    bFemenino.setSelected(true);
                }
                
                //Atributos Trabajador
                cRfc.setText(vContacto.getRFC());
                cSueldo.setText(String.valueOf(vContacto.getSueldo()));
                cHorarioT.setText(vContacto.getHorario());
                cProfesion.setText(vContacto.getProfesion());
                cPuesto.setText(vContacto.getPuesto());
                
                //Atributos Docente
                DefaultTableModel modelo = (DefaultTableModel) tablaMateriasProfesor.getModel();
                String[] materias = new String[1];
                for (String materia : vContacto.getMaterias()) {
                   
                    materias[0] = materia;
                     
                    modelo.addRow(materias);
                }
                modelo.fireTableDataChanged();
                if(bPCompleto.isSelected()){
                    bPCompleto.setSelected(true);
                }else bPMateria.setSelected(true);
                cCubiculo.setText(vContacto.getCubiculo());
                
                
                
            }//Fin case Docente
            case "Secretaria" -> {
                //Hacer casting o algo asi
                Secretaria vContacto = (Secretaria)contacto;
                
                //Agregar paneles correspondientes
                pContenedor.add(pAtributosTrabajador);
                pContenedor.add(pAtributosSecretaria);


                //Settear atributos persona
                cNombre.setText(vContacto.getNombre());
                cCodigo.setText(vContacto.getCodigo());
                cTelefono.setText(vContacto.getTelefono());
                cCorreo.setText(vContacto.getCorreo());

                if (vContacto.getEstadoCivil().equals("Soltero/a")){
                    bSoltero.setSelected(true);
                } else {
                    bCasado.setSelected(true);
                }

                cDomicilio.setText(vContacto.getDomicilio());
                cNss.setText(vContacto.getNss());
                cCurp.setText(vContacto.getCurp());
                cEdad.setText(Integer.toString(vContacto.getEdad()));
                cDiaNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getDayOfMonth()));
                cMesDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getMonthValue()));
                cYearDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getYear()));

                if (vContacto.getSexo().equals("Masculino")){
                    bMasculino.setSelected(true);
                } else {
                    bFemenino.setSelected(true);
                }
                
                //Atributos Trabajador
                cRfc.setText(vContacto.getRFC());
                cSueldo.setText(String.valueOf(vContacto.getSueldo()));
                cHorarioT.setText(vContacto.getHorario());
                cProfesion.setText(vContacto.getProfesion());
                cPuesto.setText(vContacto.getPuesto());
                
                //Atributos Secretaria
                cOficina.setText(vContacto.getOficina());
                
            }//Fin case Secretaria
            case "Intendente" -> {
                //Hacer casting o algo asi
                Intendente vContacto = (Intendente)contacto;
                
                //Agregar paneles correspondientes
                pContenedor.add(pAtributosTrabajador);
                pContenedor.add(pAtributosIntendente);


                //Settear atributos persona
                cNombre.setText(vContacto.getNombre());
                cCodigo.setText(vContacto.getCodigo());
                cTelefono.setText(vContacto.getTelefono());
                cCorreo.setText(vContacto.getCorreo());

                if (vContacto.getEstadoCivil().equals("Soltero/a")){
                    bSoltero.setSelected(true);
                } else {
                    bCasado.setSelected(true);
                }

                cDomicilio.setText(vContacto.getDomicilio());
                cNss.setText(vContacto.getNss());
                cCurp.setText(vContacto.getCurp());
                cEdad.setText(Integer.toString(vContacto.getEdad()));
                cDiaNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getDayOfMonth()));
                cMesDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getMonthValue()));
                cYearDeNacimiento.setText(Integer.toString(vContacto.getFechaNacimiento().getYear()));

                if (vContacto.getSexo().equals("Masculino")){
                    bMasculino.setSelected(true);
                } else {
                    bFemenino.setSelected(true);
                }
                
                //Atributos Trabajador
                cRfc.setText(vContacto.getRFC());
                cSueldo.setText(String.valueOf(vContacto.getSueldo()));
                cHorarioT.setText(vContacto.getHorario());
                cProfesion.setText(vContacto.getProfesion());
                cPuesto.setText(vContacto.getPuesto());
                
                //Atributos Intendente
                cArea.setText(vContacto.getArea());
                
            }//Fin case Intendete
        }//Fin switch
        pContenedor.revalidate();
        pContenedor.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAtributosTrabajador = new javax.swing.JPanel();
        lRfc = new javax.swing.JLabel();
        cRfc = new javax.swing.JTextField();
        lSueldo = new javax.swing.JLabel();
        cSueldo = new javax.swing.JTextField();
        lHorario2 = new javax.swing.JLabel();
        cHorarioT = new javax.swing.JTextField();
        lProfesion = new javax.swing.JLabel();
        cProfesion = new javax.swing.JTextField();
        lPuesto = new javax.swing.JLabel();
        cPuesto = new javax.swing.JTextField();
        pAtributosAlumno = new javax.swing.JPanel();
        lPago = new javax.swing.JLabel();
        cPago = new javax.swing.JTextField();
        lSalon = new javax.swing.JLabel();
        cSalon = new javax.swing.JTextField();
        lIndicadorMaterias = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMateriasAlumno = new javax.swing.JTable();
        pAtributosProfesor = new javax.swing.JPanel();
        lCategoria = new javax.swing.JLabel();
        lCubiculo = new javax.swing.JLabel();
        cCubiculo = new javax.swing.JTextField();
        lIndicadorMateriasP = new javax.swing.JLabel();
        bPCompleto = new javax.swing.JRadioButton();
        bPMateria = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMateriasProfesor = new javax.swing.JTable();
        pAtributosPersona = new javax.swing.JPanel();
        lNombre = new javax.swing.JLabel();
        cNombre = new javax.swing.JTextField();
        lCodigo = new javax.swing.JLabel();
        cCodigo = new javax.swing.JTextField();
        lCorreo = new javax.swing.JLabel();
        cCorreo = new javax.swing.JTextField();
        lTelefono = new javax.swing.JLabel();
        cTelefono = new javax.swing.JTextField();
        lDomicilio = new javax.swing.JLabel();
        cDomicilio = new javax.swing.JTextField();
        lCurp = new javax.swing.JLabel();
        cCurp = new javax.swing.JTextField();
        lNss = new javax.swing.JLabel();
        cNss = new javax.swing.JTextField();
        lDiaDeNacimiento = new javax.swing.JLabel();
        cDiaNacimiento = new javax.swing.JTextField();
        lMesDeNacimiento = new javax.swing.JLabel();
        cMesDeNacimiento = new javax.swing.JTextField();
        lYearDeNacimiento = new javax.swing.JLabel();
        cYearDeNacimiento = new javax.swing.JTextField();
        lSexo = new javax.swing.JLabel();
        bMasculino = new javax.swing.JRadioButton();
        bFemenino = new javax.swing.JRadioButton();
        lEstadoCivil = new javax.swing.JLabel();
        bSoltero = new javax.swing.JRadioButton();
        bCasado = new javax.swing.JRadioButton();
        lEdad = new javax.swing.JLabel();
        cEdad = new javax.swing.JTextField();
        pAtributosSecretaria = new javax.swing.JPanel();
        lOficina = new javax.swing.JLabel();
        cOficina = new javax.swing.JTextField();
        pAtributosIntendente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cArea = new javax.swing.JTextField();
        grupoSexo = new javax.swing.ButtonGroup();
        grupoTipoDeContacto = new javax.swing.ButtonGroup();
        grupoEstadoCivil = new javax.swing.ButtonGroup();
        grupoCategoria = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        pContenedor = new javax.swing.JPanel();
        bRegresar = new javax.swing.JButton();

        lRfc.setText("RFC");

        cRfc.setEditable(false);

        lSueldo.setText("Sueldo");

        cSueldo.setEditable(false);

        lHorario2.setText("Horario");

        cHorarioT.setEditable(false);

        lProfesion.setText("Profesión");

        cProfesion.setEditable(false);

        lPuesto.setText("Puesto");

        cPuesto.setEditable(false);

        javax.swing.GroupLayout pAtributosTrabajadorLayout = new javax.swing.GroupLayout(pAtributosTrabajador);
        pAtributosTrabajador.setLayout(pAtributosTrabajadorLayout);
        pAtributosTrabajadorLayout.setHorizontalGroup(
            pAtributosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosTrabajadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAtributosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cRfc)
                    .addComponent(cSueldo)
                    .addComponent(cHorarioT)
                    .addComponent(cProfesion)
                    .addGroup(pAtributosTrabajadorLayout.createSequentialGroup()
                        .addGroup(pAtributosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lRfc)
                            .addComponent(lSueldo)
                            .addComponent(lHorario2)
                            .addComponent(lProfesion)
                            .addComponent(lPuesto))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        pAtributosTrabajadorLayout.setVerticalGroup(
            pAtributosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosTrabajadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lRfc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSueldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lHorario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cHorarioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lProfesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lPago.setText("Pago semestral");

        cPago.setEditable(false);

        lSalon.setText("Salon");

        cSalon.setEditable(false);
        cSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSalonActionPerformed(evt);
            }
        });

        tablaMateriasAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia", "Promedio", "Horario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaMateriasAlumno);

        javax.swing.GroupLayout pAtributosAlumnoLayout = new javax.swing.GroupLayout(pAtributosAlumno);
        pAtributosAlumno.setLayout(pAtributosAlumnoLayout);
        pAtributosAlumnoLayout.setHorizontalGroup(
            pAtributosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAtributosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cPago)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAtributosAlumnoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lIndicadorMaterias)
                        .addGap(122, 122, 122))
                    .addComponent(cSalon)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(pAtributosAlumnoLayout.createSequentialGroup()
                        .addGroup(pAtributosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPago)
                            .addComponent(lSalon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pAtributosAlumnoLayout.setVerticalGroup(
            pAtributosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lIndicadorMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lSalon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lCategoria.setText("Categoría");

        lCubiculo.setText("Cubículo");

        cCubiculo.setEditable(false);

        grupoCategoria.add(bPCompleto);
        bPCompleto.setText("Tiempo completo");
        bPCompleto.setEnabled(false);
        bPCompleto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bPCompletoItemStateChanged(evt);
            }
        });
        bPCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPCompletoActionPerformed(evt);
            }
        });

        grupoCategoria.add(bPMateria);
        bPMateria.setText("Profesor de Materia");
        bPMateria.setEnabled(false);
        bPMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bPMateriaItemStateChanged(evt);
            }
        });
        bPMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPMateriaActionPerformed(evt);
            }
        });

        tablaMateriasProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaMateriasProfesor);

        javax.swing.GroupLayout pAtributosProfesorLayout = new javax.swing.GroupLayout(pAtributosProfesor);
        pAtributosProfesor.setLayout(pAtributosProfesorLayout);
        pAtributosProfesorLayout.setHorizontalGroup(
            pAtributosProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAtributosProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cCubiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(pAtributosProfesorLayout.createSequentialGroup()
                        .addGroup(pAtributosProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pAtributosProfesorLayout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addComponent(lIndicadorMateriasP))
                            .addComponent(lCategoria)
                            .addComponent(lCubiculo)
                            .addGroup(pAtributosProfesorLayout.createSequentialGroup()
                                .addComponent(bPCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bPMateria)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pAtributosProfesorLayout.setVerticalGroup(
            pAtributosProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCategoria)
                .addGap(5, 5, 5)
                .addGroup(pAtributosProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPCompleto)
                    .addComponent(bPMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCubiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lIndicadorMateriasP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lNombre.setText("Nombre");

        cNombre.setEditable(false);
        cNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreActionPerformed(evt);
            }
        });

        lCodigo.setText("Codigo");

        cCodigo.setEditable(false);

        lCorreo.setText("Correo");

        cCorreo.setEditable(false);

        lTelefono.setText("Telefono");

        cTelefono.setEditable(false);

        lDomicilio.setText("Domicilio");

        cDomicilio.setEditable(false);

        lCurp.setText("CURP");

        cCurp.setEditable(false);
        cCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCurpActionPerformed(evt);
            }
        });

        lNss.setText("NSS");

        cNss.setEditable(false);

        lDiaDeNacimiento.setText("Dia de nacimiento");

        cDiaNacimiento.setEditable(false);
        cDiaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDiaNacimientoActionPerformed(evt);
            }
        });

        lMesDeNacimiento.setText("Mes de nacimiento");

        cMesDeNacimiento.setEditable(false);
        cMesDeNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMesDeNacimientoActionPerformed(evt);
            }
        });

        lYearDeNacimiento.setText("Año de nacimiento");

        cYearDeNacimiento.setEditable(false);

        lSexo.setText("Sexo");

        grupoSexo.add(bMasculino);
        bMasculino.setText("Masculino");
        bMasculino.setEnabled(false);
        bMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasculinoActionPerformed(evt);
            }
        });

        grupoSexo.add(bFemenino);
        bFemenino.setText("Femenino");
        bFemenino.setEnabled(false);

        lEstadoCivil.setText("Estado Civil");

        grupoEstadoCivil.add(bSoltero);
        bSoltero.setText("Soltero/a");
        bSoltero.setEnabled(false);

        grupoEstadoCivil.add(bCasado);
        bCasado.setText("Casado/a");
        bCasado.setEnabled(false);

        lEdad.setText("Edad");

        cEdad.setEditable(false);

        javax.swing.GroupLayout pAtributosPersonaLayout = new javax.swing.GroupLayout(pAtributosPersona);
        pAtributosPersona.setLayout(pAtributosPersonaLayout);
        pAtributosPersonaLayout.setHorizontalGroup(
            pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                        .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lEstadoCivil)
                            .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                                .addComponent(bSoltero)
                                .addGap(12, 12, 12)
                                .addComponent(bCasado))
                            .addComponent(lSexo)
                            .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                                .addComponent(bMasculino)
                                .addGap(12, 12, 12)
                                .addComponent(bFemenino))
                            .addComponent(lEdad))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                        .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cEdad)
                            .addComponent(cCorreo)
                            .addComponent(cNombre)
                            .addComponent(cCodigo)
                            .addComponent(cTelefono)
                            .addComponent(cDomicilio)
                            .addComponent(cCurp)
                            .addComponent(cNss)
                            .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                                .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNombre)
                                    .addComponent(lCodigo)
                                    .addComponent(lCorreo)
                                    .addComponent(lTelefono)
                                    .addComponent(lDomicilio)
                                    .addComponent(lCurp)
                                    .addComponent(lNss)
                                    .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                                        .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lDiaDeNacimiento))
                                        .addGap(32, 32, 32)
                                        .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cMesDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lMesDeNacimiento))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cYearDeNacimiento)
                                    .addComponent(lYearDeNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        pAtributosPersonaLayout.setVerticalGroup(
            pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSoltero)
                    .addComponent(bCasado))
                .addGap(11, 11, 11)
                .addComponent(lDomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCurp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                        .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lYearDeNacimiento)
                            .addComponent(lMesDeNacimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cYearDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cMesDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pAtributosPersonaLayout.createSequentialGroup()
                        .addComponent(lDiaDeNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEdad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pAtributosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMasculino)
                    .addComponent(bFemenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lOficina.setText("Oficina");

        cOficina.setEditable(false);

        javax.swing.GroupLayout pAtributosSecretariaLayout = new javax.swing.GroupLayout(pAtributosSecretaria);
        pAtributosSecretaria.setLayout(pAtributosSecretariaLayout);
        pAtributosSecretariaLayout.setHorizontalGroup(
            pAtributosSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosSecretariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAtributosSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cOficina)
                    .addGroup(pAtributosSecretariaLayout.createSequentialGroup()
                        .addComponent(lOficina)
                        .addGap(0, 350, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pAtributosSecretariaLayout.setVerticalGroup(
            pAtributosSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosSecretariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lOficina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Área");

        cArea.setEditable(false);

        javax.swing.GroupLayout pAtributosIntendenteLayout = new javax.swing.GroupLayout(pAtributosIntendente);
        pAtributosIntendente.setLayout(pAtributosIntendenteLayout);
        pAtributosIntendenteLayout.setHorizontalGroup(
            pAtributosIntendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosIntendenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAtributosIntendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAtributosIntendenteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cArea, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        pAtributosIntendenteLayout.setVerticalGroup(
            pAtributosIntendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtributosIntendenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ver contacto");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout pContenedorLayout = new javax.swing.GroupLayout(pContenedor);
        pContenedor.setLayout(pContenedorLayout);
        pContenedorLayout.setHorizontalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
        pContenedorLayout.setVerticalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pContenedor);

        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bRegresar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSalonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cSalonActionPerformed

    private void cNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreActionPerformed

    private void cCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCurpActionPerformed

    private void cDiaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDiaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDiaNacimientoActionPerformed

    private void cMesDeNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMesDeNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMesDeNacimientoActionPerformed

    private void bMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMasculinoActionPerformed

    /**
     * Cerrar ventana eliminando estancia por completo
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
        instancia = null;
    }//GEN-LAST:event_formWindowClosing

    private void bPMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPMateriaActionPerformed

    private void bPMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bPMateriaItemStateChanged
        /*if(evt.getStateChange() == ItemEvent.SELECTED){
            cCubiculo.setText("Sin cubículo");
            cCubiculo.setEnabled(false);
        } else {
            cCubiculo.setText("");
            cCubiculo.setEnabled(true);
        }*/
    }//GEN-LAST:event_bPMateriaItemStateChanged

    private void bPCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPCompletoActionPerformed

    private void bPCompletoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bPCompletoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bPCompletoItemStateChanged
    /**
     * Boton regresar
     * @param evt 
     */
    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        dispose();
        instancia = null;
    }//GEN-LAST:event_bRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MostrarContacto.getInstance(MultiApp.multiApp.getSeleccion()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bCasado;
    private javax.swing.JRadioButton bFemenino;
    private javax.swing.JRadioButton bMasculino;
    private javax.swing.JRadioButton bPCompleto;
    private javax.swing.JRadioButton bPMateria;
    private javax.swing.JButton bRegresar;
    private javax.swing.JRadioButton bSoltero;
    private javax.swing.JTextField cArea;
    private javax.swing.JTextField cCodigo;
    private javax.swing.JTextField cCorreo;
    private javax.swing.JTextField cCubiculo;
    private javax.swing.JTextField cCurp;
    private javax.swing.JTextField cDiaNacimiento;
    private javax.swing.JTextField cDomicilio;
    private javax.swing.JTextField cEdad;
    private javax.swing.JTextField cHorarioT;
    private javax.swing.JTextField cMesDeNacimiento;
    private javax.swing.JTextField cNombre;
    private javax.swing.JTextField cNss;
    private javax.swing.JTextField cOficina;
    private javax.swing.JTextField cPago;
    private javax.swing.JTextField cProfesion;
    private javax.swing.JTextField cPuesto;
    private javax.swing.JTextField cRfc;
    private javax.swing.JTextField cSalon;
    private javax.swing.JTextField cSueldo;
    private javax.swing.JTextField cTelefono;
    private javax.swing.JTextField cYearDeNacimiento;
    private javax.swing.ButtonGroup grupoCategoria;
    private javax.swing.ButtonGroup grupoEstadoCivil;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.ButtonGroup grupoTipoDeContacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lCategoria;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lCorreo;
    private javax.swing.JLabel lCubiculo;
    private javax.swing.JLabel lCurp;
    private javax.swing.JLabel lDiaDeNacimiento;
    private javax.swing.JLabel lDomicilio;
    private javax.swing.JLabel lEdad;
    private javax.swing.JLabel lEstadoCivil;
    private javax.swing.JLabel lHorario2;
    private javax.swing.JLabel lIndicadorMaterias;
    private javax.swing.JLabel lIndicadorMateriasP;
    private javax.swing.JLabel lMesDeNacimiento;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lNss;
    private javax.swing.JLabel lOficina;
    private javax.swing.JLabel lPago;
    private javax.swing.JLabel lProfesion;
    private javax.swing.JLabel lPuesto;
    private javax.swing.JLabel lRfc;
    private javax.swing.JLabel lSalon;
    private javax.swing.JLabel lSexo;
    private javax.swing.JLabel lSueldo;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JLabel lYearDeNacimiento;
    private javax.swing.JPanel pAtributosAlumno;
    private javax.swing.JPanel pAtributosIntendente;
    private javax.swing.JPanel pAtributosPersona;
    private javax.swing.JPanel pAtributosProfesor;
    private javax.swing.JPanel pAtributosSecretaria;
    private javax.swing.JPanel pAtributosTrabajador;
    private javax.swing.JPanel pContenedor;
    private javax.swing.JTable tablaMateriasAlumno;
    private javax.swing.JTable tablaMateriasProfesor;
    // End of variables declaration//GEN-END:variables
}
