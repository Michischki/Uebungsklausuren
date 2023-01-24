package ws1819;

/*Gegeben seien folgende Funktionen für positive ganze Zahlen:
a(n) = n * n
b(n) = 2 + a(n)
c(m,0) = 2*m für n = 0
c(m,n) = a(m) + b(n) für n > 0
Implementieren Sie in den gegebenen Lücken den entsprechenden Code für die
genannten Funktionen. Sie dürfen davon ausgehen, dass alle übergebenen
Parameter korrekt sind. D.h. Sie müssen kein Exception-Handling implementieren.*/

public class Main {
    public static void main(String[] args) {

    }

    public static int a(int n) {
        return n * n;
    }

    public static int b(int n) {
        return a(n) * a(n);
    }

    public static int c(int m, int n) {
        if (n < 0 ) {
            return 4 * a(n);
        } else if (n > 0) {
            return 3 * a(m) * b(n);
        } else {
            return b(n) * b(n);
        }
    }
}
