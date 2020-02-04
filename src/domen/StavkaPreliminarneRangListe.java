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
public class StavkaPreliminarneRangListe implements Serializable {

    private int sifraPRL;
    private int rbrStavke;
    private String napomenaPRL;
    private IspunjavanjeUslovaKonkursa iuk;
    private KoriscenjeKreditaUPrethodnojGodini kku;
    private SpisakPrijavljenih sp;
    private String status = "";
    double ukupno = 0.0;

    public StavkaPreliminarneRangListe() {
        iuk = new IspunjavanjeUslovaKonkursa();
        kku = new KoriscenjeKreditaUPrethodnojGodini();
        sp = new SpisakPrijavljenih();
    }

    public StavkaPreliminarneRangListe(int sifraPRL, int rbrStavke, String napomenaPRL, double ukupno, IspunjavanjeUslovaKonkursa iuk, KoriscenjeKreditaUPrethodnojGodini kku, SpisakPrijavljenih sp, String status) {
        this.sifraPRL = sifraPRL;
        this.rbrStavke = rbrStavke;
        this.napomenaPRL = napomenaPRL;
        this.ukupno = ukupno;
        this.iuk = iuk;
        this.kku = kku;
        this.sp = sp;
        this.status = status;
    }
    
    public double getUkupno() {
        return ukupno;
    }

    public void setUkupno(double ukupno) {
        this.ukupno = ukupno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSifraPRL() {
        return sifraPRL;
    }

    public void setSifraPRL(int sifraPRL) {
        this.sifraPRL = sifraPRL;
    }

    public IspunjavanjeUslovaKonkursa getIuk() {
        return iuk;
    }

    public KoriscenjeKreditaUPrethodnojGodini getKku() {
        return kku;
    }

    public SpisakPrijavljenih getSp() {
        return sp;
    }

    public int getRbrStavke() {
        return rbrStavke;
    }

    public void setRbrStavke(int rbrStavke) {
        this.rbrStavke = rbrStavke;
    }

    public String getNapomenaPRL() {
        return napomenaPRL;
    }

    public void setNapomenaPRL(String napomenaPRL) {
        this.napomenaPRL = napomenaPRL;
    }

    public void setIuk(IspunjavanjeUslovaKonkursa iuk) {
        this.iuk = iuk;
    }

    public void setKku(KoriscenjeKreditaUPrethodnojGodini kku) {
        this.kku = kku;
    }

    @Override
    public String toString() {
        return napomenaPRL;
    }

}
