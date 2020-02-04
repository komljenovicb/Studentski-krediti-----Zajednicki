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
public class Broj implements Serializable {

    private int br;
    private String dodatakBroju;

    public Broj() {
    }

    public Broj(int br, String dodatakBroju) {
        this.br = br;
        this.dodatakBroju = dodatakBroju;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public String getDodatakBroju() {
        return dodatakBroju;
    }

    public void setDodatakBroju(String dodatakBroju) {
        this.dodatakBroju = dodatakBroju;
    }

}
