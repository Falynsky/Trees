public class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;

    DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        setNazwaOwoca(nazwaOwoca);
    }

    public void setNazwaOwoca(String nazwaOwoca) {
        this.nazwaOwoca = nazwaOwoca;
    }

    public String getNazwaOwoca() {
        return nazwaOwoca;
    }

    public String toString(){
        return super.toString() + "\t nazwa owoca: " + nazwaOwoca;
    }
}
