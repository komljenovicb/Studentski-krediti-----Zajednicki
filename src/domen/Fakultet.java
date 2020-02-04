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
public class Fakultet implements Serializable {

    private int fakultetID;
    private String nazivFakulteta;
    private Mesto mesto;

    public Fakultet() {
    }

    public Fakultet(int fakultetID, String nazivFakulteta, Mesto mesto) {
        this.fakultetID = fakultetID;
        this.nazivFakulteta = nazivFakulteta;
        this.mesto = mesto;
    }

    public int getFakultetID() {
        return fakultetID;
    }

    public void setFakultetID(int fakultetID) {
        this.fakultetID = fakultetID;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return nazivFakulteta;
    }

}
