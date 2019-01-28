public class DrzewoIglaste extends Drzewo {

    int iloscIgiel;
    double dlugoscSzyszki;

    DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki){
        super(wiecznieZielone,wysokosc,przekrojDrzewa);
        setIloscIgiel(iloscIgiel);
        setDlugoscSzyszki(dlugoscSzyszki);
    }

    public void setIloscIgiel(int iloscIgiel) {
        this.iloscIgiel = iloscIgiel;
    }

    public void setDlugoscSzyszki(double dlugoscSzyszki) {
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString(){
        return super.toString()+" ilość igieł: "+ iloscIgiel + " dlugoscSzyszki: "+ dlugoscSzyszki;   }
}
