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
public class StavkaSpiska implements Serializable {

    private int rbrSpiska;
    private int rbrStavkeSpiska;
    private String primedba;
    private PrijavaZaKonkurs prijava;

    public StavkaSpiska() {
    }

    public StavkaSpiska(int rbrSpiska, int rbrStavkeSpiska, String primedba, PrijavaZaKonkurs prijava) {
        this.rbrSpiska = rbrSpiska;
        this.rbrStavkeSpiska = rbrStavkeSpiska;
        this.primedba = primedba;
        this.prijava = prijava;
    }

    public int getRbrSpiska() {
        return rbrSpiska;
    }

    public void setRbrSpiska(int rbrSpiska) {
        this.rbrSpiska = rbrSpiska;
    }

    public int getRbrStavkeSpiska() {
        return rbrStavkeSpiska;
    }

    public void setRbrStavkeSpiska(int rbrStavkeSpiska) {
        this.rbrStavkeSpiska = rbrStavkeSpiska;
    }

    public String getPrimedba() {
        return primedba;
    }

    public void setPrimedba(String primedba) {
        this.primedba = primedba;
    }

    public PrijavaZaKonkurs getPrijava() {
        return prijava;
    }

    public void setPrijava(PrijavaZaKonkurs prijava) {
        this.prijava = prijava;
    }

    @Override
    public String toString() {
        return primedba;
    }

}
