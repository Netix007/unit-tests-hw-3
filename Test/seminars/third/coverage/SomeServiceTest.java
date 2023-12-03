package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {

        String check = someService.fizzBuzz(3);

        assertThat(check).isEqualTo("fizz");
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz() {

        String check = someService.fizzBuzz(5);

        assertThat(check).isEqualTo("buzz");
    }

    @Test
    void multipleThreeOrFiveReturnsFizzBuzz() {

        String check = someService.fizzBuzz(15);

        assertThat(check).isEqualTo("fizzBuzz");
    }

    @Test
    void multipleNotThreeOrFiveReturnsNumber() {

        String check = someService.fizzBuzz(8);

        assertThat(check).isEqualTo("8");
    }

    @Test
    void testArrayCellValue6() {

        Boolean check = someService.firstLast6(new int[]{1, 2, 3, 4, 5, 6});

        assertEquals(true, check);
    }

    @Test
    void testArrayCellValueNot6() {

        boolean check = someService.firstLast6(new int[]{1, 2, 3, 4, 5, 1});

        assertFalse(check);
    }

    @ParameterizedTest
    @CsvSource({"2000, 50, 1000", "2000, 100, 0", "2000, 0, 2000"})
    void correctPercentDiscount(double amount, int discount, double result) {

        assertThat(someService.calculatingDiscount(amount, discount))
                .isEqualTo(result); // обычная скидка
    }

    @ParameterizedTest
    @CsvSource({"2000, 101, Скидка должна быть в диапазоне от 0 до 100%",
            "2000, -10, Скидка должна быть в диапазоне от 0 до 100%",
            "-2000, 10, Сумма покупки не может быть отрицательной"})
    void notCorrectPercentDiscount(double amount, int discount, String result) {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(amount, discount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage(result); // процент скидки больше 100%
    }

    @Test
    void isEvenNumber() {

        assertTrue(someService.evenOddNumber(8));

    }

    @Test
    void isOddNumber() {

        assertFalse(someService.evenOddNumber(13));

    }

    @ParameterizedTest
    @CsvSource({"56, true", "1, false", "125, false"})
    void isInInterval(int n, boolean result) {
        assertThat(someService.numberInInterval(n)).isEqualTo(result);
    }

}