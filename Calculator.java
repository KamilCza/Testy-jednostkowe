public class Calculator {

    // Zadanie 1: Suma dwóch liczb
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Zadanie 2: Sprawdzanie parzystości
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Zadanie 3: Konwersja Celsjusza na Fahrenheita
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Zadanie 4: Obliczanie silni
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia nie jest zdefiniowana dla liczb ujemnych.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Zadanie 5: Sprawdzanie czy liczba jest pierwsza
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}