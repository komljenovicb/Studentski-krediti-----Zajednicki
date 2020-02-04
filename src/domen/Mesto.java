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
public class Mesto implements Serializable {

    private int mestoID;
    private String nazivMesta;
    private ArrayList<Ulica> ulice;

    public Mesto() {
        ulice = new ArrayList<>();
    }

    public Mesto(int mestoID, String nazivMesta, ArrayList<Ulica> ulice) {
        this.mestoID = mestoID;
        this.nazivMesta = nazivMesta;
        this.ulice = ulice;
    }

    public ArrayList<Ulica> getUlice() {
        return ulice;
    }

    public int getMestoID() {
        return mestoID;
    }

    public void setMestoID(int mestoID) {
        this.mestoID = mestoID;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    @Override
    public String toString() {
        return nazivMesta;
    }

}
