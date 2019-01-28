public class DrzewoLisciaste extends Drzewo {

    int ksztaltLiscia;

    DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        setKsztaltLiscia(ksztaltLiscia);
    }

    @Override
    public String toString() {
        return super.toString() + "\tksztalt liscia: " + ksztaltLiscia;
    }

    public int getKsztaltLiscia() {
        return ksztaltLiscia;
    }

    public void setKsztaltLiscia(int ksztaltLiscia) {
        this.ksztaltLiscia = ksztaltLiscia;
    }
}
