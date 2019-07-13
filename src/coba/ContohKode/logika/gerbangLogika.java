package coba.ContohKode.logika;

public class gerbangLogika {

    int logic1, logic2;

    public gerbangLogika(int logic1, int logic2) {
        if ((logic1 < 0 || logic1 > 1) || (logic2 < 0 || logic2 > 1)) {
            System.out.println("Nilai logika tidak terdefinisi!!!");
            this.logic1 = logic1;
            this.logic2 = logic2;
        } else {
            this.logic1 = logic1;
            this.logic2 = logic2;
        }
    }

    public void tampil() {
        if ((logic1 < 0 || logic1 > 1) || (logic2 < 0 || logic2 > 1)) {
            System.out.println("");
        } else {
            System.out.println("AND : " + (logic1 & logic2));
            System.out.println("OR : " + (logic1 | logic2));
            System.out.println("XOR : " + (logic1 ^ logic2));
        }
    }
}
