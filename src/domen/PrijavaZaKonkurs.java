/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bojana Komljenovic
 */
public class PrijavaZaKonkurs implements Serializable {

    private int prijavaID;
    private Date datumPotpisivanja;
    private Mesto mesto;
    private Student student;

    public PrijavaZaKonkurs() {
    }

    public PrijavaZaKonkurs(int prijavaID, Date datumPotpisivanja, Mesto mesto, Student student) {
        this.prijavaID = prijavaID;
        this.datumPotpisivanja = datumPotpisivanja;
        this.mesto = mesto;
        this.student = student;
    }

    public int getPrijavaID() {
        return prijavaID;
    }

    public void setPrijavaID(int prijavaID) {
        this.prijavaID = prijavaID;
    }

    public Date getDatumPotpisivanja() {
        return datumPotpisivanja;
    }

    public void setDatumPotpisivanja(Date datumPotpisivanja) {
        this.datumPotpisivanja = datumPotpisivanja;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
