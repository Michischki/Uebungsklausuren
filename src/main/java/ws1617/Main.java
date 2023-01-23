package ws1617;

/*
* Schreiben Sie eine Methode
public int[] zufälligeWerteVon(int[] a, int anzahl),
die eine durch anzahl definierte Anzahl an zufälligen Werten aus dem Array a
ermittelt und als Array zurückgibt. Das übergebene Array soll unverändert bleiben.
Falls anzahl die Größe von a übersteigt oder negativ ist, soll eine
IllegalArgumentException geworfen werden.
Hinweis: Die Methode Math.random() liefert einen zufälligen double-Wert
zwischen 0 (inklusive) und 1 (exklusive).*/


public class Main {
    public static void main(String[] args) {

    }

    public static int[] zufälligeWerteVon(int[] a, int anzahl) {
        if (anzahl > a.length || anzahl < 0) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            result[i] = a[(int) (Math.random() * a.length)];
        }
        return result;
    }

}
