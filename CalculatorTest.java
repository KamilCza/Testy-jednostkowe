import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Zadanie 1: Testowanie funkcji dodawania")
    void testAddNumbers() {
        assertThat(calculator.addNumbers(5, 10)).isEqualTo(15);
        assertThat(calculator.addNumbers(5, -2)).isEqualTo(3);
        assertThat(calculator.addNumbers(-3, -7)).isEqualTo(-10);
        assertThat(calculator.addNumbers(0, 5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Zadanie 2: Testowanie parzystości")
    void testIsEven() {
        assertThat(calculator.isEven(4)).isTrue();
        assertThat(calculator.isEven(7)).isFalse();
        assertThat(calculator.isEven(0)).isTrue();
        assertThat(calculator.isEven(1000000)).isTrue();
    }

    @Test
    @DisplayName("Zadanie 3: Testowanie konwersji temperatury")
    void testCelsiusToFahrenheit() {
        assertThat(calculator.celsiusToFahrenheit(0)).isEqualTo(32);
        assertThat(calculator.celsiusToFahrenheit(100)).isEqualTo(212);
        assertThat(calculator.celsiusToFahrenheit(-10)).isEqualTo(14);
        assertThat(calculator.celsiusToFahrenheit(1000)).isEqualTo(1832);
    }

    @Test
    @DisplayName("Zadanie 4: Testowanie silni")
    void testFactorial() {
        assertThat(calculator.factorial(0)).isEqualTo(1);
        assertThat(calculator.factorial(1)).isEqualTo(1);
        assertThat(calculator.factorial(5)).isEqualTo(120);
        assertThat(calculator.factorial(10)).isEqualTo(3628800);

        // Testowanie wyjątku dla liczb ujemnych
        assertThatThrownBy(() -> calculator.factorial(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Zadanie 5: Testowanie liczb pierwszych")
    void testIsPrime() {
        assertThat(calculator.isPrime(2)).isTrue();
        assertThat(calculator.isPrime(7)).isTrue();
        assertThat(calculator.isPrime(4)).isFalse();
        assertThat(calculator.isPrime(1)).isFalse();
        assertThat(calculator.isPrime(104729)).isTrue();
    }
}