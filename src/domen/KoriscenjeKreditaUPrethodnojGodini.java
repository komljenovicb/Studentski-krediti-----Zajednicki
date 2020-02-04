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
public class KoriscenjeKreditaUPrethodnojGodini implements Serializable {

    private int kkID;
    private String statusKK;

    public KoriscenjeKreditaUPrethodnojGodini() {
    }

    public KoriscenjeKreditaUPrethodnojGodini(int kkID, String statusKK) {
        this.kkID = kkID;
        this.statusKK = statusKK;
    }

    public int getKkID() {
        return kkID;
    }

    public void setKkID(int kkID) {
        this.kkID = kkID;
    }

    public String getStatusKK() {
        return statusKK;
    }

    public void setStatusKK(String statusKK) {
        this.statusKK = statusKK;
    }

    @Override
    public String toString() {
        return statusKK;
    }

}
