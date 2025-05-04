package Vista;

import Hilos.personaje1;
import Hilos.personaje2;
import Hilos.personaje3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vista extends JFrame {
    public vista(){
        super("Carrera de leyendas");
        JLabel yoshi,kratos,sonic, yoshi_pos, kratos_pos, sonic_pos;
        JButton iniciarCarrera;
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Parametro de Yoshi
        Image image_yoshi= new ImageIcon("src/Img/Joshi.gif").getImage();
        ImageIcon Icon_yoshi = new ImageIcon(image_yoshi.getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        yoshi=new JLabel();
        yoshi.setIcon(Icon_yoshi);
        yoshi.setBounds(50, 50 , 50 ,50);

        // Parametros de Kratos
        Image image_kratos= new ImageIcon("src/Img/Kratos.gif").getImage();
        ImageIcon Icon_kratos = new ImageIcon(image_kratos.getScaledInstance(60, 70, Image.SCALE_DEFAULT));
        kratos=new JLabel();
        kratos.setIcon(Icon_kratos);
        kratos.setBounds(50, 100 , 50 ,50);

        // Parametros de Sonic.exe
        Image image_sonic= new ImageIcon("src/Img/Sonic-exe.gif").getImage();
        ImageIcon Icon_sonic = new ImageIcon(image_sonic.getScaledInstance(60, 70, Image.SCALE_DEFAULT));
        sonic=new JLabel();
        sonic.setIcon(Icon_sonic);
        sonic.setBounds(50, 150 , 50 ,50);

        // Parametros para las etiquetas
        // Yoshi
        yoshi_pos= new JLabel();
        yoshi_pos.setBounds(50,50,50,50);

        // Kratos
        kratos_pos= new JLabel();
        kratos_pos.setBounds(50,100,50,50);
        // SONIC
        sonic_pos= new JLabel();
        sonic_pos.setBounds(50,150,50,50);

        // Boton de inicio
        iniciarCarrera = new JButton("Iniciar Carrera");
        iniciarCarrera.setBounds(150, 200, 150, 50);

        iniciarCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personaje1 tyoshi = new personaje1("Yoshi", yoshi,yoshi_pos);
                personaje2 tkratos= new personaje2("Kratos", kratos, kratos_pos);
                personaje3 tsonic= new personaje3("Sonic.exe", sonic, sonic_pos);
            }
        });

        panel.add(yoshi);
        panel.add(yoshi_pos);
        panel.add(kratos);
        panel.add(kratos_pos);
        panel.add(sonic);
        panel.add(sonic_pos);
        panel.add(iniciarCarrera);

        add(panel);
        setVisible(true);
    }

    public  static void  main(String[] args){
        new vista();
    }
}

