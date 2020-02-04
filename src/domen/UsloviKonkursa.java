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
public class UsloviKonkursa implements Serializable {

    private int rbrUslova;
    private String opisUslova;
    private Konkurs konkurs;

    public UsloviKonkursa() {
    }

    public UsloviKonkursa(int rbrUslova, String opisUslova, Konkurs konkurs) {
        this.rbrUslova = rbrUslova;
        this.opisUslova = opisUslova;
        this.konkurs = konkurs;
    }

    public int getRbrUslova() {
        return rbrUslova;
    }

    public void setRbrUslova(int rbrUslova) {
        this.rbrUslova = rbrUslova;
    }

    public String getOpisUslova() {
        return opisUslova;
    }

    public void setOpisUslova(String opisUslova) {
        this.opisUslova = opisUslova;
    }

    public Konkurs getKonkurs() {
        return konkurs;
    }

    public void setKonkurs(Konkurs konkurs) {
        this.konkurs = konkurs;
    }

    @Override
    public String toString() {
        return opisUslova;
    }

}
