/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author Bojana Komljenovic
 */
public class TransferObjekatZahtev implements Serializable {

    private Object zahtev;
    private int operacija;

    public TransferObjekatZahtev() {
    }

    public TransferObjekatZahtev(Object zahtev, int operacija) {
        this.zahtev = zahtev;
        this.operacija = operacija;
    }

    public Object getZahtev() {
        return zahtev;
    }

    public void setZahtev(Object zahtev) {
        this.zahtev = zahtev;
    }

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

}
