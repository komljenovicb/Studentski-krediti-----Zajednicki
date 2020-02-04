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

public class IspunjavanjeUslovaKonkursa implements Serializable {

    private int iukID;
    private String statusIUK;

    public IspunjavanjeUslovaKonkursa() {
    }

    public IspunjavanjeUslovaKonkursa(int iukID, String statusIUK) {
        this.iukID = iukID;
        this.statusIUK = statusIUK;
    }

    public int getIukID() {
        return iukID;
    }

    public void setIukID(int iukID) {
        this.iukID = iukID;
    }

    public String getStatusIUK() {
        return statusIUK;
    }

    public void setStatusIUK(String statusIUK) {
        this.statusIUK = statusIUK;
    }

    @Override
    public String toString() {
        return statusIUK;
    }

}
