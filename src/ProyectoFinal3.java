import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ProyectoFinal3 extends JFrame implements ActionListener {

    private JMenuBar menubar;
    private JMenu menuOpciones, menuColor_de_Fondo, menuTamaño_de_Ventana, menuCalcular, menuAcerca_De;
    private JMenuItem miRojo, miVerde, miAzul, miNegro, miVioleta, mitamaño1, mitamaño2, mitamaño3, miNuevo,
            miReiniciar, miSalir, miVacaciones, miEl_Creador;
    private JLabel labelmarca3, labelSaludo, labelmensaje, labelNombre_C, labelApellido_P, labelApellido_M,
            labelS_Departamento, labelS_Antigüedad, labelResultado_C, leyenda;
    private JTextField txtnombre, txtapellido1, txtapellido2;
    private JTextArea textarea_resultado_c;
    private JScrollPane scroll2;
    private JComboBox comboDepartamento, comboAntigüedad;
    String nombre = "";
    String nombreUsuario = "";
    String apellidoMadre = "";
    String apellidoPadre = "";
    String departamento = "";
    String antigüedad = "";

    public ProyectoFinal3(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage()); //Esto no funciona.
        ProyectoFinal1 ventana1 = new ProyectoFinal1();
        nombre = ventana1.ingreso_nombre;

        menubar = new JMenuBar();
        menubar.setBackground(new Color(255,0,0));
        setJMenuBar(menubar);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0)); //Por alguna razón esto no funciona.
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255,255,255));
        menubar.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0)); //Por alguna razón esto no funciona.
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255,255,255));
        menubar.add(menuCalcular);

        menuAcerca_De = new JMenu("Acerca de");
        menuAcerca_De.setBackground(new Color(255,0,0)); //Por alguna razón esto no funciona.
        menuAcerca_De.setFont(new Font("Andale Mono", 1, 14));
        menuAcerca_De.setForeground(new Color(255,255,255));
        menubar.add(menuAcerca_De);

        menuColor_de_Fondo = new JMenu("Color de Fondo");
        menuColor_de_Fondo.setFont(new Font("Andale Mono", 1, 14));
        menuColor_de_Fondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColor_de_Fondo);

        menuTamaño_de_Ventana = new JMenu("Tamaño de Ventana");
        menuTamaño_de_Ventana.setFont(new Font("Andale Mono", 1, 14));
        menuTamaño_de_Ventana.setForeground(new Color(255,0,0));
        menuOpciones.add(menuTamaño_de_Ventana);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255,0,0));
        menuColor_de_Fondo.add(miRojo);
        miRojo.addActionListener(this);

        miAzul = new JMenuItem("Azul");
        miAzul.setFont(new Font("Andale Mono", 1, 14));
        miAzul.setForeground(new Color(255,0,0));
        menuColor_de_Fondo.add(miAzul);
        miAzul.addActionListener(this);

        miVerde = new JMenuItem("Verde");
        miVerde.setFont(new Font("Andale Mono", 1, 14));
        miVerde.setForeground(new Color(255,0,0));
        menuColor_de_Fondo.add(miVerde);
        miVerde.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(255,0,0));
        menuColor_de_Fondo.add(miNegro);
        miNegro.addActionListener(this);

        miVioleta = new JMenuItem("Violeta");
        miVioleta.setFont(new Font("Andale Mono", 1, 14));
        miVioleta.setForeground(new Color(255,0,0));
        menuColor_de_Fondo.add(miVioleta);
        miVioleta.addActionListener(this);

        mitamaño1 = new JMenuItem("640*535");
        mitamaño1.setFont(new Font("Andale Mono", 1, 14));
        mitamaño1.setForeground(new Color(255,0,0));
        menuTamaño_de_Ventana.add(mitamaño1);
        mitamaño1.addActionListener(this);

        mitamaño2 = new JMenuItem("740*635");
        mitamaño2.setFont(new Font("Andale Mono", 1, 14));
        mitamaño2.setForeground(new Color(255,0,0));
        menuTamaño_de_Ventana.add(mitamaño2);
        mitamaño2.addActionListener(this);

        mitamaño3 = new JMenuItem("840*735");
        mitamaño3.setFont(new Font("Andale Mono", 1, 14));
        mitamaño3.setForeground(new Color(255,0,0));
        menuTamaño_de_Ventana.add(mitamaño3);
        mitamaño3.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miReiniciar = new JMenuItem("Reiniciar datos");
        miReiniciar.setFont(new Font("Andale Mono", 1, 14));
        miReiniciar.setForeground(new Color(255,0,0));
        menuOpciones.add(miReiniciar);
        miReiniciar.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        miVacaciones = new JMenuItem("Vacaciones");
        miVacaciones.setFont(new Font("Andale Mono", 1, 14));
        miVacaciones.setForeground(new Color(255,0,0));
        menuCalcular.add(miVacaciones);
        miVacaciones.addActionListener(this);

        miEl_Creador = new JMenuItem("El Creador");
        miEl_Creador.setFont(new Font("Andale Mono", 1, 14));
        miEl_Creador.setForeground(new Color(255,0,0));
        menuAcerca_De.add(miEl_Creador);
        miEl_Creador.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelmarca3 = new JLabel(imagen);
        labelmarca3.setBounds(5,5,250,100);
        add(labelmarca3);

        labelSaludo = new JLabel("Bienvenido " + nombre);
        labelSaludo.setFont(new Font("Andale Mono", 1, 32));
        labelSaludo.setForeground(new Color(255,255,255));
        labelSaludo.setBounds(280,30,300,50);
        add(labelSaludo);

        labelmensaje = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        labelmensaje.setFont(new Font("Andale Mono", 0, 24));
        labelmensaje.setForeground(new Color(255,255,255));
        labelmensaje.setBounds(45,140,900,25);
        add(labelmensaje);

        labelNombre_C = new JLabel("Nombre completo");
        labelNombre_C.setFont(new Font("Andale Mono", 1, 12));
        labelNombre_C.setForeground(new Color(255,255,255));
        labelNombre_C.setBounds(25,188,180,25);
        add(labelNombre_C);

        txtnombre = new JTextField();
        txtnombre.setBounds(25,213,150,25);
        txtnombre.setBackground(new java.awt.Color(224,224,224));
        txtnombre.setFont(new java.awt.Font("Andale Mono",1,14));
        txtnombre.setForeground(new java.awt.Color(255,0,0));
        add(txtnombre);

        labelApellido_P = new JLabel("Apellido Paterno");
        labelApellido_P.setFont(new Font("Andale Mono", 1, 12));
        labelApellido_P.setForeground(new Color(255,255,255));
        labelApellido_P.setBounds(25,248,180,25);
        add(labelApellido_P);

        txtapellido1 = new JTextField();
        txtapellido1.setBounds(25,273,150,25);
        txtapellido1.setBackground(new java.awt.Color(224,224,224));
        txtapellido1.setFont(new java.awt.Font("Andale Mono",1,14));
        txtapellido1.setForeground(new java.awt.Color(255,0,0));
        add(txtapellido1);

        labelApellido_M = new JLabel("Apellido Materno");
        labelApellido_M.setFont(new Font("Andale Mono", 1, 12));
        labelApellido_M.setForeground(new Color(255,255,255));
        labelApellido_M.setBounds(25,308,180,25);
        add(labelApellido_M);

        txtapellido2 = new JTextField();
        txtapellido2.setBounds(25,334,150,25);
        txtapellido2.setBackground(new java.awt.Color(224,224,224));
        txtapellido2.setFont(new java.awt.Font("Andale Mono",1,14));
        txtapellido2.setForeground(new java.awt.Color(255,0,0));
        add(txtapellido2);

        labelS_Departamento = new JLabel("Selecciona el Departamento");
        labelS_Departamento.setFont(new Font("Andale Mono", 1, 12));
        labelS_Departamento.setForeground(new Color(255,255,255));
        labelS_Departamento.setBounds(220,188,180,25);
        add(labelS_Departamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,213,320,25);
        comboDepartamento.setBackground(new Color(224,224,224));
        comboDepartamento.setFont(new Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new Color(255,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Departamento de Atención al Cliente");
        comboDepartamento.addItem("Departamento de Logística");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelS_Antigüedad = new JLabel("Selecciona la Antigüedad");
        labelS_Antigüedad.setFont(new Font("Andale Mono", 1, 12));
        labelS_Antigüedad.setForeground(new Color(255,255,255));
        labelS_Antigüedad.setBounds(220,248,180,25);
        add(labelS_Antigüedad);

        comboAntigüedad = new JComboBox();
        comboAntigüedad.setBounds(220,273,220,25);
        comboAntigüedad.setBackground(new Color(224,224,224));
        comboAntigüedad.setFont(new Font("Andale Mono",1,14));
        comboAntigüedad.setForeground(new Color(255,0,0));
        add(comboAntigüedad);
        comboAntigüedad.addItem("");
        comboAntigüedad.addItem("1 año de servicio");
        comboAntigüedad.addItem("2-6 años de servicio");
        comboAntigüedad.addItem("7 o más años de servicio");

        labelResultado_C = new JLabel("Resultado del Cálculo");
        labelResultado_C.setFont(new Font("Andale Mono", 1, 12));
        labelResultado_C.setForeground(new Color(255,255,255));
        labelResultado_C.setBounds(220,307,180,25);
        add(labelResultado_C);

        textarea_resultado_c = new JTextArea();
        textarea_resultado_c.setEditable(false);
        textarea_resultado_c.setBackground(new Color(224,224,224));
        textarea_resultado_c.setFont(new Font("Andale Mono",1,11 ));
        textarea_resultado_c.setForeground(new Color(255,0,0));
        textarea_resultado_c.setText("\n Aquí aparece el resultado del cálculo de vacaciones.");
        scroll2 = new JScrollPane(textarea_resultado_c);
        scroll2.setBounds(220,333,385,90);
        add(scroll2);

        leyenda = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
        leyenda.setBounds(135,445,500,30);
        leyenda.setFont(new Font("Andale Mono", 1, 12));
        leyenda.setForeground(new Color(255,255,255));
        add(leyenda);
    }

    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == miVacaciones) {
            nombreUsuario = txtnombre.getText().trim();
            apellidoPadre = txtapellido1.getText().trim();
            apellidoMadre = txtapellido2.getText().trim();
            departamento = comboDepartamento.getSelectedItem().toString();
            antigüedad = comboAntigüedad.getSelectedItem().toString();
            int díasVacaciones = 0;

            if (nombreUsuario.equals("") || apellidoMadre.equals("") || apellidoPadre.equals("") ||
                    departamento.equals("") || antigüedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos correctamente");
            } else {
                if (departamento.equals("Departamento de Atención al Cliente")) {
                    if (antigüedad.equals("1 año de servicio")) {
                        díasVacaciones = 6;
                    } else if (antigüedad.equals("2-6 años de servicio")) {
                        díasVacaciones = 14;
                    } else if (antigüedad.equals("7 o más años de servicio")) {
                        díasVacaciones = 20;
                    }
                } else if (departamento.equals("Departamento de Logística")) {
                    if (antigüedad.equals("1 año de servicio")) {
                        díasVacaciones = 7;
                    } else if (antigüedad.equals("2-6 años de servicio")) {
                        díasVacaciones = 15;
                    } else if (antigüedad.equals("7 o más años de servicio")) {
                        díasVacaciones = 22;
                    }
                } else if (departamento.equals("Departamento de Gerencia")) {
                    if (antigüedad.equals("1 año de servicio")) {
                        díasVacaciones = 10;
                    } else if (antigüedad.equals("2-6 años de servicio")) {
                        díasVacaciones = 20;
                    } else if (antigüedad.equals("7 o más años de servicio")) {
                        díasVacaciones = 30;
                    }
                }

                textarea_resultado_c.setText("\n A usted " + nombreUsuario + " " + apellidoPadre + " " + apellidoMadre +
                                             "\n quien labora en el " + departamento +
                                             "\n con " + antigüedad +
                                             "\n le corresponden " + díasVacaciones + " días de vacaciones");

            }
        }
        if (evento.getSource() == miRojo) {
            getContentPane().setBackground(new Color(255,0,0));
            menubar.setBackground(new Color(255,0,0));
        }
        if (evento.getSource() == miAzul) {
            getContentPane().setBackground(new Color(0,0,255));
            menubar.setBackground(new Color(0,0,255));
        }
        if (evento.getSource() == miVerde) {
            getContentPane().setBackground(new Color(0,255,0));
            menubar.setBackground(new Color(0,255,0));
        }
        if (evento.getSource() == miNegro) {
            getContentPane().setBackground(new Color(0,0,0));
            menubar.setBackground(new Color(0,0,0));
        }
        if (evento.getSource() == miVioleta) {
            getContentPane().setBackground(new Color(255,0,255));
            menubar.setBackground(new Color(255,0,255));
        }
        if (evento.getSource() == mitamaño1) {
            setSize(640,535);
        }
        if (evento.getSource() == mitamaño2) {
            setSize(740,635);
        }
        if (evento.getSource() == mitamaño3) {
            setSize(840,735);
        }
        if (evento.getSource() == miNuevo) {
            ProyectoFinal1 proyectoFinal1 = new ProyectoFinal1();
            proyectoFinal1.setBounds(0,0,350,450);
            proyectoFinal1.setVisible(true);
            proyectoFinal1.setResizable(false);
            proyectoFinal1.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (evento.getSource() == miReiniciar){
            txtnombre.setText("");
            txtapellido1.setText("");
            txtapellido2.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntigüedad.setSelectedIndex(0);
            textarea_resultado_c.setText("\n Aquí aparece el resultado del cálculo de vacaciones.");
        }
        if (evento.getSource() == miSalir) {
            System.exit(0);
        }
        if (evento.getSource() == miEl_Creador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Angel Eduardo Pedraza Ordoñez.");
        }
    }

    public static void main(String args[]){
        ProyectoFinal3 proyectoFinal3 = new ProyectoFinal3();
        proyectoFinal3.setBounds(0,0,640,535);
        proyectoFinal3.setVisible(true);
        proyectoFinal3.setResizable(false);
        proyectoFinal3.setLocationRelativeTo(null);
    }
}

//Esto concluye el proyecto final.