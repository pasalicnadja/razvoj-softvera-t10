package ba.unsa.rs.tutorijal10;

import java.io.Serializable;
import java.util.Arrays;

public class Grad implements Serializable {

    String naziv;
    int brojStanovnika;
    double [] temperatura = new double[1000];

    public Grad() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public double[] getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double[] temperatura) {
        this.temperatura = temperatura;
    }


}
