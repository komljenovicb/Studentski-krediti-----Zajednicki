/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bojana Komljenovic
 */
public class SpisakPrijavljenih implements Serializable {

    private int rbrSpiska;
    private String skolskaGodina;
    private Fakultet fakultet;
    private Mesto mesto;
    private ArrayList<StavkaSpiska> listaStavki;

    public SpisakPrijavljenih() {
        listaStavki = new ArrayList<>();
    }

    public SpisakPrijavljenih(int rbrSpiska, String skolskaGodina, Fakultet fakultet, Mesto mesto, ArrayList<StavkaSpiska> listaStavki) {
        this.rbrSpiska = rbrSpiska;
        this.skolskaGodina = skolskaGodina;
        this.fakultet = fakultet;
        this.mesto = mesto;
        this.listaStavki = listaStavki;
    }

    public ArrayList<StavkaSpiska> getListaStavki() {
        return listaStavki;
    }

    public int getRbrSpiska() {
        return rbrSpiska;
    }

    public void setRbrSpiska(int rbrSpiska) {
        this.rbrSpiska = rbrSpiska;
    }

    public String getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(String skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        for (StavkaSpiska stavkaSpiska : listaStavki) {
            if(stavkaSpiska.getRbrSpiska() == rbrSpiska) {
                return stavkaSpiska.getPrijava().getPrijavaID() + ". " + stavkaSpiska.getPrijava().getStudent().getImePrezime();
            } else {
                return "";
            }
        }
        return "";
    }

}
