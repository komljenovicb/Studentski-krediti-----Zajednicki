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
public class TransferObjekatOdgovor implements Serializable {

    private int operacija;
    private Object rezultat;

    public TransferObjekatOdgovor() {
    }

    public TransferObjekatOdgovor(int operacija, Object rezultat) {
        this.operacija = operacija;
        this.rezultat = rezultat;
    }

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    public Object getRezultat() {
        return rezultat;
    }

    public void setRezultat(Object rezultat) {
        this.rezultat = rezultat;
    }

}
