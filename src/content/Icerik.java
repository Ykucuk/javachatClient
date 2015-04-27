/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Yasin
 */
public class Icerik implements Serializable {
    
    // M = mesaj
    // G = giris
    // C = cikis
    // U = guncelleme
    
    private char Tur;
    private Date Tarih;
    private String kod;

    public Icerik() {
        this.Tarih = new Date();
    }

    /**
     * @return the Tur
     */
    public char getTur() {
        return Tur;
    }

    /**
     * @param Tur the Tur to set
     */
    public void setTur(char Tur) {
        this.Tur = Tur;
    }

    /**
     * @return the Tarih
     */
    public Date getTarih() {
        return Tarih;
    }
    
    /**
     * @return the kod
     */
    public String getKod() {
        return kod;
    }

    /**
     * @param kod the kod to set
     */
    public void setKod(String kod) {
        this.kod = kod;
    }
    
    
    
    
    
    
    
}
