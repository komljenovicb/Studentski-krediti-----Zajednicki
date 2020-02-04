/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bojana Komljenovic
 */
public class PreliminarnaRangLista implements Serializable {

    private int sifraPRL;
    private String opisPRL;
    private Date datumObjavljivanjaPRL;
    private ArrayList<StavkaPreliminarneRangListe> listaStavki;

    public PreliminarnaRangLista() {
        listaStavki = new ArrayList<>();
    }

    public PreliminarnaRangLista(int sifraPRL, String opisPRL, Date datumObjavljivanjaPRL, ArrayList<StavkaPreliminarneRangListe> listaStavki) {
        this.sifraPRL = sifraPRL;
        this.opisPRL = opisPRL;
        this.datumObjavljivanjaPRL = datumObjavljivanjaPRL;
        this.listaStavki = listaStavki;
    }

    public ArrayList<StavkaPreliminarneRangListe> getListaStavki() {
        return listaStavki;
    }

    public int getSifraPRL() {
        return sifraPRL;
    }

    public void setSifraPRL(int sifraPRL) {
        this.sifraPRL = sifraPRL;
    }

    public String getOpisPRL() {
        return opisPRL;
    }

    public void setOpisPRL(String opisPRL) {
        this.opisPRL = opisPRL;
    }

    public Date getDatumObjavljivanjaPRL() {
        return datumObjavljivanjaPRL;
    }

    public void setDatumObjavljivanjaPRL(Date datumObjavljivanjaPRL) {
        this.datumObjavljivanjaPRL = datumObjavljivanjaPRL;
    }

}
