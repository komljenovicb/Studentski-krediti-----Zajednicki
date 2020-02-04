/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author BojanaKomljenovic
 */
public class Konkurs implements Serializable {

    private int konkursID;
    private String skolskaGodina;
    private String rokPodnosenjaDokumentacije;
    private TipKonkursa tipKonkursa;
    private Banka banka;

    public Konkurs() {
        banka = new Banka();
    }

    public Konkurs(int konkursID, String skolskaGodina, String rokPodnosenjaDokumentacije, TipKonkursa tipKonkursa, Banka banka) {
        this.konkursID = konkursID;
        this.skolskaGodina = skolskaGodina;
        this.rokPodnosenjaDokumentacije = rokPodnosenjaDokumentacije;
        this.tipKonkursa = tipKonkursa;
        this.banka = banka;
    }

    public int getKonkursID() {
        return konkursID;
    }

    public void setKonkursID(int konkursID) {
        this.konkursID = konkursID;
    }

    public Banka getBanka() {
        return banka;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }

    public String getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(String skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public String getRokPodnosenjaDokumentacije() {
        return rokPodnosenjaDokumentacije;
    }

    public void setRokPodnosenjaDokumentacije(String rokPodnosenjaDokumentacije) {
        this.rokPodnosenjaDokumentacije = rokPodnosenjaDokumentacije;
    }

    public TipKonkursa getTipKonkursa() {
        return tipKonkursa;
    }

    public void setTipKonkursa(TipKonkursa tipKonkursa) {
        this.tipKonkursa = tipKonkursa;
    }

}
