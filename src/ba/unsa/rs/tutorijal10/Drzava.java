package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Drzava implements Serializable {

    String naziv;
    int brojStanovnika;
    double povrsina;
    Grad glavniGrad;

    public Drzava() {
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

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }

    @Override
    public String toString() {
        return "Drzava{" +
                "naziv='" + naziv + '\'' +
                ", brojStanovnika=" + brojStanovnika +
                ", povrsina=" + povrsina +
                ", glavniGrad=" + glavniGrad +
                '}';
    }
}
