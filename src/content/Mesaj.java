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
public class Mesaj extends Icerik {
    
    private String Mesaj;
    
    // GLOBAL = HERKEZ
    
    // Belirli isim kullanici;
    
    private String Ontvanger;

    public Mesaj() {
        setTur('M');
    }
    
    
    
    
    /**
     * @return the Mesaj
     */
    public String getMesaj() {
        String msj = super.getTarih().toString() + " : " + this.Mesaj;
        return msj;
    }

    /**
     * @param Mesaj the Mesaj to set
     */
    public void setMesaj(String Mesaj) {
        this.Mesaj = Mesaj;
    }

    /**
     * @return the Ontvanger
     */
    public String getOntvanger() {
        return Ontvanger;
    }

    /**
     * @param Ontvanger the Ontvanger to set
     */
    public void setOntvanger(String Ontvanger) {
        this.Ontvanger = Ontvanger;
    }
    
    
    

}
