public class Drzewo {

    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    Drzewo() {
    }

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        setPrzekrojDrzewa(przekrojDrzewa);
        setWiecznieZielone(wiecznieZielone);
        setWysokosc(wysokosc);
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public String getPrzekrojDrzewa() {
        return przekrojDrzewa;
    }

    public void setPrzekrojDrzewa(String przekrojDrzewa) {
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public boolean isWiecznieZielone() {
        return wiecznieZielone;
    }

    public void setWiecznieZielone(boolean wiecznieZielone) {
        this.wiecznieZielone = wiecznieZielone;
    }

    @Override
    public String toString() {
        return "Wysokość drzewa = " + getWysokosc() + "\t przekrój drzewa: " + getPrzekrojDrzewa() + "\t wiecznie zielone?: " + isWiecznieZielone();
    }
}
