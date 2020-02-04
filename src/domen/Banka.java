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
public class Banka implements Serializable {

    private int bankaID;
    private String nazivBanke;
    private String ovlascenoLice;

    public Banka() {
    }

    public Banka(int bankaID, String nazivBanke, String ovlascenoLice) {
        this.bankaID = bankaID;
        this.nazivBanke = nazivBanke;
        this.ovlascenoLice = ovlascenoLice;
    }

    public int getBankaID() {
        return bankaID;
    }

    public void setBankaID(int bankaID) {
        this.bankaID = bankaID;
    }

    public String getNazivBanke() {
        return nazivBanke;
    }

    public void setNazivBanke(String nazivBanke) {
        this.nazivBanke = nazivBanke;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public String toString() {
        return nazivBanke;
    }

}
