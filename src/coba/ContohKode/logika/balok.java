package coba.ContohKode.logika;

/**
 *
 * @author Aleq
 */
public class balok {

    double p, l, t;

    public balok(double p, double l, double t) {    //method konstruktor
        if (p == 0) {
            this.p = 1;
        } else if (p < 0) {
            this.p = p * -1;
        } else {
            this.p = p;
        }

        if (l == 0) {
            this.l = 1;
        } else if (l < 0) {
            this.l = l * -1;
        } else {
            this.l = l;
        }

        if (t == 0) {
            this.t = 1;
        } else if (t < 0) {
            this.t = t * -1;
        } else {
            this.t = t;
        }

    }

    public double hitungVolume() {
        double volume;
        volume = p * l * t;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luas;
        luas = (2 * p * l) + (2 * p * t) + (2 * l * t);
        return luas;
    }
}
