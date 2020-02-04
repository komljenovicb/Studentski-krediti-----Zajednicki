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
public class Ulica implements Serializable {

    private int ulicaID;
    private String nazivUlice;
    private Mesto mesto;
    private ArrayList<Broj> brojeviUlica;

    public Ulica() {
        brojeviUlica = new ArrayList<>();
    }

    public Ulica(int ulicaID, String nazivUlice, Mesto mesto) {
        this.ulicaID = ulicaID;
        this.nazivUlice = nazivUlice;
        this.mesto = mesto;
    }

    public int getUlicaID() {
        return ulicaID;
    }

    public void setUlicaID(int ulicaID) {
        this.ulicaID = ulicaID;
    }

    public String getNazivUlice() {
        return nazivUlice;
    }

    public void setNazivUlice(String nazivUlice) {
        this.nazivUlice = nazivUlice;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return nazivUlice;
    }

}
