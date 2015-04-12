/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istemci;

/**
 *
 * @author Yasin
 */
import content.Mesaj;
import gui.mainClientWindow;
import java.net.Socket;
import java.io.*;

public class Istemci extends Thread {

    Socket mijnSock;

    ObjectInputStream ois;
    ObjectOutputStream oos;

    Boolean GirisDurumu = false;

    Mesaj GelenMesaj = null;
    mainClientWindow mCl;

    public Istemci(mainClientWindow sum) {

        try {
            mijnSock = new Socket("192.168.2.100", 1234);
            oos = new ObjectOutputStream(this.mijnSock.getOutputStream());
            ois = new ObjectInputStream(this.mijnSock.getInputStream());
            this.mCl = sum;

            System.out.println("Basarili gidiyor.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Dinleyici calistirildi.");
        try {
            while (true) {

                GelenMesaj = (Mesaj) ois.readObject();

                if (GelenMesaj.getTur().equals("/girisyap")) {
                    mCl.outputEkle(GelenMesaj.getMesaj());
                    mCl.KilidiKapat();
                } else if (GelenMesaj.getTur().equals("/global")) {
                    mCl.outputEkle(GelenMesaj.getMesaj());
                }
            }
        } catch (Exception e) {
            System.err.println("baglanti kapatildi.");
        }
    }

    public void Ilet(Mesaj obj) {
        try {
            oos.writeObject(obj);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
