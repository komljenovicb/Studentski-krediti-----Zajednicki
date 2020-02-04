/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author Bojana Komljenovic
 */
public class TipKonkursa implements Serializable {

    private int tipID;
    private String nazivTipaKonkursa;

    public TipKonkursa() {
    }

    public TipKonkursa(int tipID, String nazivTipaKonkursa) {
        this.tipID = tipID;
        this.nazivTipaKonkursa = nazivTipaKonkursa;
    }

    public int getTipID() {
        return tipID;
    }

    public void setTipID(int tipID) {
        this.tipID = tipID;
    }

    public String getNazivTipaKonkursa() {
        return nazivTipaKonkursa;
    }

    public void setNazivTipaKonkursa(String nazivTipaKonkursa) {
        this.nazivTipaKonkursa = nazivTipaKonkursa;
    }

    @Override
    public String toString() {
        return tipID + "";
    }

}
