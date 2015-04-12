/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

import java.io.Serializable;

/**
 *
 * @author Yasin
 */
public class Mesaj implements Serializable {

 private String mesaj = "";
 private String tur = "";
 
 private String hesap_adi;
 private String hesap_sifre;
 

    /**
     * @return the mesaj
     */
    public String getMesaj() {
        return mesaj;
    }

    /**
     * @param mesaj the mesaj to set
     */
    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    /**
     * @return the tur
     */
    public String getTur() {
        return tur;
    }

    /**
     * @param tur the tur to set
     */
    public void setTur(String tur) {
        this.tur = tur;
    }

    /**
     * @return the hesap_adi
     */
    public String getHesap_adi() {
        return hesap_adi;
    }

    /**
     * @param hesap_adi the hesap_adi to set
     */
    public void setHesap_adi(String hesap_adi) {
        this.hesap_adi = hesap_adi;
    }

    /**
     * @return the hesap_sifre
     */
    public String getHesap_sifre() {
        return hesap_sifre;
    }

    /**
     * @param hesap_sifre the hesap_sifre to set
     */
    public void setHesap_sifre(String hesap_sifre) {
        this.hesap_sifre = hesap_sifre;
    }
 
 

}
