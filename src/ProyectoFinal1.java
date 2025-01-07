import javax.swing.* ;
import java.awt.event.* ;
import java.awt.* ;

public class ProyectoFinal1 extends JFrame implements ActionListener {

    private JButton botón_de_ingreso ;
    private JTextField nombre_de_usuario ;
    private JLabel marca, SCV, orden, TCCC ;
    public static String ingreso_nombre = "";

    public ProyectoFinal1() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage()); //Esto no funciona.
        ImageIcon imagen = new ImageIcon("images/logo-coca.png");

        nombre_de_usuario = new JTextField();
        nombre_de_usuario.setBounds(45,240,255,25);
        nombre_de_usuario.setBackground(new Color(224,224,224));
        nombre_de_usuario.setFont(new Font("Andale Mono", 1, 14));
        nombre_de_usuario.setForeground(new Color(255,0,0));
        add(nombre_de_usuario);

        botón_de_ingreso = new JButton("Ingresar");
        botón_de_ingreso.setBounds(125,280,100,30);
        botón_de_ingreso.setBackground(new Color(255,255,255));
        botón_de_ingreso.setFont(new Font("Andale Mono", 1, 14));
        botón_de_ingreso.setForeground(new Color(255,0,0));
        botón_de_ingreso.addActionListener(this);
        add(botón_de_ingreso);

        marca = new JLabel(imagen);
        marca.setBounds(25,15,300,150);
        add(marca);

        SCV = new JLabel("Sistema de Control Vacacional");
        SCV.setBounds(35,135,300,30);
        SCV.setFont(new Font("Andale Mono", 3, 18));
        SCV.setForeground(new Color(255,255,255));
        add(SCV);

        orden = new JLabel("Ingrese su nombre");
        orden.setBounds(45,212,200,30);
        orden.setFont(new Font("Andale Mono", 1, 12));
        orden.setForeground(new Color(255,255,255));
        add(orden);

        TCCC = new JLabel("©2017 The Coca-Cola Company");
        TCCC.setBounds(85,375,300,30);
        TCCC.setFont(new Font("Andale Mono", 1, 12));
        TCCC.setForeground(new Color(255,255,255));
        add(TCCC);
    }

    public void actionPerformed( ActionEvent evento){
        if (evento.getSource() == botón_de_ingreso) {
            ingreso_nombre = nombre_de_usuario.getText().trim();
            if (ingreso_nombre.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else {
                ProyectoFinal2 proyectoFinal2 = new ProyectoFinal2();
                proyectoFinal2.setBounds(0,0,660,360);
                proyectoFinal2.setVisible(true);
                proyectoFinal2.setResizable(false);
                proyectoFinal2.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]) {
        ProyectoFinal1 proyectoFinal1 = new ProyectoFinal1();
        proyectoFinal1.setBounds(0,0,350,450);
        proyectoFinal1.setVisible(true);
        proyectoFinal1.setResizable(false);
        proyectoFinal1.setLocationRelativeTo(null);
    }
}