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
public class Student implements Serializable {

    private String jmbg;
    private String imePrezime;
    private boolean sluzioVojniRok;
    private boolean osetljivaDrustvenaGrupa;
    private double uspeh;
    private int espb;
    private Date datumRodjenja;
    private Date datumUpisaFakulteta;
    private double prosecanPrihodPoClanu;
    private String brojLicneKarte;
    private String kontaktTelefon;
    private Mesto mestoRodjenja;
    private Mesto mestoIzdavanajaLK;

    public Student() {
    }

    public Student(String jmbg, String imePrezime, boolean sluzioVojniRok, boolean osetljivaDrustvenaGrupa, double uspeh, int espb, Date datumRodjenja, Date datumUpisaFakulteta, double prosecanPrihodPoClanu, String brojLicneKarte, String kontaktTelefon, Mesto mestoRodjenja, Mesto mestoIzdavanajaLK) {
        this.jmbg = jmbg;
        this.imePrezime = imePrezime;
        this.sluzioVojniRok = sluzioVojniRok;
        this.osetljivaDrustvenaGrupa = osetljivaDrustvenaGrupa;
        this.uspeh = uspeh;
        this.espb = espb;
        this.datumRodjenja = datumRodjenja;
        this.datumUpisaFakulteta = datumUpisaFakulteta;
        this.prosecanPrihodPoClanu = prosecanPrihodPoClanu;
        this.brojLicneKarte = brojLicneKarte;
        this.kontaktTelefon = kontaktTelefon;
        this.mestoRodjenja = mestoRodjenja;
        this.mestoIzdavanajaLK = mestoIzdavanajaLK;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public boolean isSluzioVojniRok() {
        return sluzioVojniRok;
    }

    public void setSluzioVojniRok(boolean sluzioVojniRok) {
        this.sluzioVojniRok = sluzioVojniRok;
    }

    public boolean isOsetljivaDrustvenaGrupa() {
        return osetljivaDrustvenaGrupa;
    }

    public void setOsetljivaDrustvenaGrupa(boolean osetljivaDrustvenaGrupa) {
        this.osetljivaDrustvenaGrupa = osetljivaDrustvenaGrupa;
    }

    public double getUspeh() {
        return uspeh;
    }

    public void setUspeh(double uspeh) {
        this.uspeh = uspeh;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumUpisaFakulteta() {
        return datumUpisaFakulteta;
    }

    public void setDatumUpisaFakulteta(Date datumUpisaFakulteta) {
        this.datumUpisaFakulteta = datumUpisaFakulteta;
    }

    public double getProsecanPrihodPoClanu() {
        return prosecanPrihodPoClanu;
    }

    public void setProsecanPrihodPoClanu(double prosecanPrihodPoClanu) {
        this.prosecanPrihodPoClanu = prosecanPrihodPoClanu;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    public void setKontaktTelefon(String kontaktTelefon) {
        this.kontaktTelefon = kontaktTelefon;
    }

    public Mesto getMestoRodjenja() {
        return mestoRodjenja;
    }

    public void setMestoRodjenja(Mesto mestoRodjenja) {
        this.mestoRodjenja = mestoRodjenja;
    }

    public Mesto getMestoIzdavanajaLK() {
        return mestoIzdavanajaLK;
    }

    public void setMestoIzdavanajaLK(Mesto mestoIzdavanajaLK) {
        this.mestoIzdavanajaLK = mestoIzdavanajaLK;
    }

    @Override
    public String toString() {
        return imePrezime;
    }

}
