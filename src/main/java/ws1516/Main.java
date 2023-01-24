package ws1516;

/*Schreiben Sie eine Methode, die den Durchschnitt eines übergebenen int-Arrays
von der ersten Position bis zu einer vom Aufrufer definierten Position (einschließlich)
berechnet und das Ergebnis zurückgibt!
In der Vorlesung haben Sie gelernt, dass dem Aufrufer der Methode eine
Fehlermeldung in Form einer Exception mitgeteilt werden soll, falls z.B. Parameter
nicht korrekt gesetzt worden sind. Sorgen Sie dafür, dass eine
IllegalArgumentException geworfen wird, wenn das Argument bis außerhalb
der Größe des Arrays liegt oder negativ ist!
Ergänzen Sie den Rumpf der folgenden Methode!*/


public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("Durchschnitt bis Position 5: " + berechneDurchschnittBis(array, 5));
        System.out.println("Durchschnitt bis Position 10: " + berechneDurchschnittBis(array, 10));
        System.out.println("Durchschnitt bis Position 15: " + berechneDurchschnittBis(array, 15));
        try {
            System.out.println("Durchschnitt bis Position -1: " + berechneDurchschnittBis(array, -1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double berechneDurchschnittBis(int[] a, int bis) {
        double sum = 0;
        if (bis < 0 || bis >= a.length) {
            throw new IllegalArgumentException("Bis darf nicht kleiner als 0 oder größer als die Länge des Arrays sein!");
        }
        for (int i = 0; i <= bis; i++) {
            sum += a[i];
        }

        return sum / (bis + 1);
    }
}

