/*
Utwórz klasę Tree z polami boolean wiecznieZielone, int wysokosc oraz String
przekrojDrzewa, następnie zaimplementuj konstruktory inicjujące pola i metodę
String toString() wypisującą na konsoli informacje o drzewie.

Utwórz klasę Conifer dziedziczącą po klasie Tree, oraz definiująca pola int
iloscIgiel i double dlugscSzyszki. Następnie przygotuj konstruktor inicjujący
wszystkie pola oraz metodę String toString() wypisującą na konsoli informacje o
drzewie wraz z wartościami pól opisujących drzewo iglaste.

Utwórz klasę LeafyTree dziedziczącą po klasie Tree, oraz definiująca pole
int ksztaltLiscia i metodę String toString() wypisującą na konsoli wszystkie
informacje o drzewie.

Utwórz klasę FruitTree dziedziczącą po klasie LeafyTree, oraz definiująca
pole String nazwaOwoca, podobnie jak w poprzednich zadaniach uzupełnij klasę
o konstruktor i funkcjonalną metodę toString.
Na koniec utwórz program, który wypełni tablicę Tree[] las drzewami takimi
jak: sosny, modrzewie, dęby, osiki, morelowce czy śliwy. Wykorzystując mechanizm
polimorfizmu wyświetl wszystkie informacje o wszystkich drzewach
*/

import java.util.Random;

public class Main {

    private static Random r = new Random();
    private static Tree[] las = new Tree[11];

    public static void main(String[] args) {

        String[] fruits = {"jabłko", "śliwka", "gruszka", "morela"};
        String[] conifer = {"sosna", "modrzew", "swierk", "limba"};
        String[] leafyTree = {"dąb", "osika", "lipa", "brzoza", "wierzba"};
        String[] fruitTree = {"jabłoń", "śliwa", "grusza", "morela"};

        for (int i = 0; i < las.length; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    int fruit = r.nextInt(fruitTree.length);
                    las[i] = new FruitTree(false, r.nextInt(100) + 100, fruitTree[fruit], r.nextInt(10), fruits[fruit]);
                    break;
                case 1:
                    las[i] = new Conifer(true, r.nextInt(500) + 100, conifer[r.nextInt(conifer.length)], r.nextInt(1000000), r.nextInt(10));
                    break;
                case 2:
                    las[i] = new LeafyTree(false, r.nextInt(400) + 200, leafyTree[r.nextInt(leafyTree.length)], r.nextInt(10));
                    break;
            }
        }
        for (Tree la : las) {
            System.out.println(la);
            System.out.println();
        }

    }
}
