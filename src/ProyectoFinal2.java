import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ProyectoFinal2 extends JFrame implements ActionListener, ChangeListener {

    private JLabel marca2, tyc;
    private JTextArea texto;
    private JScrollPane scroll1;
    private JButton continuar, noAceptar;
    private JCheckBox check1 ;
    String nombreUsuario = "";

    public ProyectoFinal2(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage()); //Esto no funciona.
        ProyectoFinal1 ventana1 = new ProyectoFinal1();
        nombreUsuario = ventana1.ingreso_nombre;

        noAceptar = new JButton("No acepto");
        noAceptar.setBounds(120,290,100,30);
        noAceptar.addActionListener(this);
        noAceptar.setEnabled(true);
        add(noAceptar);

        continuar = new JButton("Continuar");
        continuar.setBounds(10,290,100,30);
        continuar.addActionListener(this);
        continuar.setEnabled(false);
        add(continuar);

        texto = new JTextArea();
        texto.setEditable(false);
        texto.setFont(new Font("Andale Mono",0,12));
        texto.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                "\n\n Aquí empezaré a poner mucho texto innecesario." +
                "\n Aquí pondré mucho más." +
                "\n Y así seguiré y seguiré." +
                "\n Hasta más no poder." +
                "\n Ya que después de todo." +
                "\n Esto es un texto totalmente necesario para el programa." +
                "\n Si no me crees puedes leer hasta el final línea por línea." +
                "\n De esa manera encontrarás muchas cosas interesantes." +
                "\n Repito, muchas cosas interesante." +
                "\n Tanto que no aguantarás las ganas de continuar leyendo y leyendo." +
                "\n Ves que aún con toda la mierda que escribo sigues leyendo." +
                "\n Es que eres tonto." +
                "\n Y lo sabes." +
                "\n Deja de leer cojones." +
                "\n ¿No ves que esto es inútil?"

        );
        scroll1 = new JScrollPane(texto);
        scroll1.setBounds(10,40,575,200);
        add(scroll1);

        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        marca2 = new JLabel(imagen);
        marca2.setBounds(315,135,300,300);
        add(marca2);

        tyc = new JLabel("TÉRMINOS Y CONDICIONES");
        tyc.setBounds(215,5,200,30);
        tyc.setFont(new Font("Andale Mono", 1, 14));
        tyc.setForeground(new Color(0,0,0));
        add(tyc);

        check1 = new JCheckBox("Yo " + nombreUsuario + " Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);
    }

    public void stateChanged(ChangeEvent evento){
        if (check1.isSelected() == true) {
            continuar.setEnabled(true);
            noAceptar.setEnabled(false);
        } else {
            continuar.setEnabled(false);
            noAceptar.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == noAceptar){
            ProyectoFinal1 proyectoFinal1 = new ProyectoFinal1();
            proyectoFinal1.setBounds(0,0,350,450);
            proyectoFinal1.setVisible(true);
            proyectoFinal1.setResizable(false);
            proyectoFinal1.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (evento.getSource() == continuar){
            ProyectoFinal3 proyectoFinal3 = new ProyectoFinal3();
            proyectoFinal3.setBounds(0,0,640,535);
            proyectoFinal3.setVisible(true);
            proyectoFinal3.setResizable(false);
            proyectoFinal3.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String args[]){
        ProyectoFinal2 proyectoFinal2 = new ProyectoFinal2();
        proyectoFinal2.setBounds(0,0,660,360);
        proyectoFinal2.setVisible(true);
        proyectoFinal2.setResizable(false);
        proyectoFinal2.setLocationRelativeTo(null);
    }
}