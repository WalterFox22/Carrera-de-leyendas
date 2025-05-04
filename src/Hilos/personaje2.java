package Hilos;

import javax.swing.*;

public class personaje2 implements Runnable {
    Thread p2;
    String nombre;
    JLabel personaje;
    JLabel labelFinal;



    public personaje2 (String nombre, JLabel personaje, JLabel labelFinal){
        this.nombre= nombre;
        this.labelFinal=labelFinal;
        this.personaje=personaje;
        p2= new Thread(this,nombre);
        p2.start();
    }

    @Override
    public void  run(){
        int retardo;
        try{

            retardo = (int)(Math.random()*15)+1;
            labelFinal.setVisible(false);
            personaje.setVisible(true);

            for (int i =50; i <=500; i++){
                personaje.setLocation(i,personaje.getY());
                Thread.sleep(retardo);
            }
            personaje.setVisible(false);
            labelFinal.setVisible(true);
            labelFinal.setText(nombre + ", ha llegado en la posición: "+ PosicionLlegada.obtenerLugar());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
