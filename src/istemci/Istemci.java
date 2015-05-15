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
import icerik.Mesaj;
import icerik.Icerik;
import icerik.Durum;
import gui.kullaniciWindow;
import gui.mainClientWindow;
import java.net.Socket;
import java.io.*;

public class Istemci extends Thread {

    Socket mijnSock;

    ObjectInputStream ois;
    ObjectOutputStream oos;

    Boolean GirisDurumu = false;

    Icerik GelenIcerik = null;
    mainClientWindow mCl;
    Durum durum;

    public Istemci(mainClientWindow sum) {

        try {
            mijnSock = new Socket("192.168.2.45", 1234);
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

                this.GelenIcerik = (Icerik) this.ois.readObject();
                if (this.GelenIcerik.getTur() == 'D') {
                    // Buraya sadece bilgilendirme icin kullaniliyor, durum sinifi ni burada kullaniyoruz.

                    this.durum = (Durum) this.GelenIcerik;

                    if (this.durum.getDurumTur() == 'G') {
                        if (this.durum.getGirisDurumu() == true) {
                            mCl.outputEkle("giris oldu");
                            mCl.GRW.dispose();
                            mCl.KLW = new kullaniciWindow(mCl);
                            mCl.jDesktopPane1.add(mCl.KLW);
                        } else {
                            System.out.println("Giris basarisiz tekrar deneyiniz.");
                        }
                    } else {
                       System.out.println("Durum baska birsey icin heaa..");
                    }

                } else if (this.GelenIcerik.getTur() == 'M') {
                    // normal gelen mesajlar...
                    Mesaj msj = (Mesaj) this.GelenIcerik;
                    System.out.println(msj.getMesaj());
                }

            }
        } catch (Exception e) {
            System.err.println("baglanti kapatildi.");
        }
    }

    public void Ilet(Icerik obj) {
        try {
            oos.writeObject(obj);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
