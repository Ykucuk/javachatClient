/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

/**
 *
 * @author Yasin
 */
public class Giris extends Icerik {

    private String hesapAdi;
    private String hesapSifre;

    public Giris() {
        setTur('G');
    }

    /**
     * @return the hesapAdi
     */
    
    public String getHesapAdi() {
        return hesapAdi;
    }

    /**
     * @param hesapAdi the hesapAdi to set
     */
    public void setHesapAdi(String hesapAdi) {
        this.hesapAdi = hesapAdi;
    }

    /**
     * @return the hesapSifre
     */
    public String getHesapSifre() {
        return hesapSifre;
    }

    /**
     * @param hesapSifre the hesapSifre to set
     */
    public void setHesapSifre(String hesapSifre) {
        this.hesapSifre = hesapSifre;
    }
    
    

}
