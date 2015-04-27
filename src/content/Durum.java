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
public class Durum extends Icerik {

    private boolean GirisDurumu;
    private String  DurumBilgisi;
    private char DurumTur;

    /**
     * @return the GirisDurumu
     */
    public boolean getGirisDurumu() {
        return GirisDurumu;
    }

    /**
     * @param GirisDurumu the GirisDurumu to set
     */
    public void setGirisDurumu(boolean GirisDurumu) {
        this.GirisDurumu = GirisDurumu;
    }

    /**
     * @return the DurumTur
     */
    public char getDurumTur() {
        return DurumTur;
    }

    /**
     * @param DurumTur the DurumTur to set
     */
    public void setDurumTur(char DurumTur) {
        this.DurumTur = DurumTur;
    }

    /**
     * @return the DurumBilgisi
     */
    public String getDurumBilgisi() {
        return DurumBilgisi;
    }

    /**
     * @param DurumBilgisi the DurumBilgisi to set
     */
    public void setDurumBilgisi(String DurumBilgisi) {
        this.DurumBilgisi = DurumBilgisi;
    }
    
    
    
    
}
