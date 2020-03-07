package com.cv5.miprimeraaplicacion;

public class Proceso1 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 200 ; i++) {
            System.out.println("hilo "+i);
        }
    }
}
