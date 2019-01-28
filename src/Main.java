/*
Utwórz klasę Drzewo z polami boolean wiecznieZielone, int wysokosc oraz String
przekrojDrzewa, następnie zaimplementuj konstruktory inicjujące pola i metodę
String toString() wypisującą na konsoli informacje o drzewie.

Utwórz klasę DrzewoIglaste dziedziczącą po klasie Drzewo, oraz definiująca pola int
iloscIgiel i double dlugscSzyszki. Następnie przygotuj konstruktor inicjujący
wszystkie pola oraz metodę String toString() wypisującą na konsoli informacje o
drzewie wraz z wartościami pól opisujących drzewo iglaste.

Utwórz klasę DrzewoLisciaste dziedziczącą po klasie Drzewo, oraz definiująca pole
int ksztaltLiscia i metodę String toString() wypisującą na konsoli wszystkie
informacje o drzewie.

Utwórz klasę DrzewoOwocowe dziedziczącą po klasie DrzewoLisciaste, oraz definiująca
pole String nazwaOwoca, podobnie jak w poprzednich zadaniach uzupełnij klasę
o konstruktor i funkcjonalną metodę toString.
Na koniec utwórz program, który wypełni tablicę Drzewo[] las drzewami takimi
jak: sosny, modrzewie, dęby, osiki, morelowce czy śliwy. Wykorzystując mechanizm
polimorfizmu wyświetl wszystkie informacje o wszystkich drzewach
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] owoce = {"jabłko","śliwka","gruszka","morela"};
        String[] drzewoIglaste = {"sosna","modrzew","swierk", "limba"};
        String[] drzewoLisciaste = {"dąb","osika", "lipa","brzoza","wierzba"};
        String[] drzewoOwocowe = {"jabłoń","śliwa","grusza","morela"};
        Random r = new Random();
        Drzewo [] las = new Drzewo[11];

        for (int i=0;i<las.length;i++){
            int rodzaj = r.nextInt(3);
            switch(rodzaj){
                case 0:
                    int owoc = r.nextInt(drzewoOwocowe.length);
                    las[i] = new DrzewoOwocowe(false, r.nextInt(100) + 100, drzewoOwocowe[owoc], r.nextInt(10), owoce[owoc]);                    break;
                case 1:
                    las[i] = new DrzewoIglaste(true, r.nextInt(500) + 100, drzewoIglaste[r.nextInt(drzewoIglaste.length)], r.nextInt(1000000),r.nextInt(10));
                    break;
                case 2:
                    las[i] = new DrzewoLisciaste(false, r.nextInt(400) + 200, drzewoLisciaste[r.nextInt(drzewoLisciaste.length)],r.nextInt(10));
                    break;

            }

        }
        for (int i=0;i<las.length;i++){
            System.out.println(las[i]);
            System.out.println();
        }

    }
}
