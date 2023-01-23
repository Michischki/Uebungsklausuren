package ws1718;

/*Schreiben Sie eine Methode, die den ersten wiederkehrenden Character eines
übergebenen Strings ermittelt und zurückgibt. Existiert kein solcher, soll '#'
zurückgegeben werden.
Beispiele:
"Hallo" → 'l'
"Vertrieb" → 'e'
"Algorithmus" → '#'
Der folgende Code wandelt bereits den übergebenen String in ein char-Array um.
Vervollständigen Sie den Code entsprechend der Aufgabenstellung!
Hinweis: nutzen Sie den == Operator zum Vergleich zweier Character. */


public class Main {
    public static void main(String[] args) {
        System.out.println(getFirstRecurringChar("Hallo"));
        System.out.println(getFirstRecurringChar("Vertrieb"));
        System.out.println(getFirstRecurringChar("Algorithmus"));

    }

    public static char getFirstRecurringChar(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return chars[i];
                }
            }
        }
        return '#';
    }

}
