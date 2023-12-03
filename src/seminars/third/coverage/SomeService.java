package seminars.third.coverage;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int i) {

        if (i%15 == 0) {
            return "fizzBuzz";
        } else if (i%5 == 0) {
            return "buzz";
        } else if (i%3 == 0) {
            return "fizz";
        }
        return String.valueOf(i);
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {

        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double discountedAmount = 0; // Сумма со скидкой (первоначальная сумма - скидка%)
        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException( "Скидка должна быть в диапазоне от 0 до 100%");
            }
        } else {
            // Сумма покупки не может быть отрицательной
            throw new ArithmeticException( "Сумма покупки не может быть отрицательной");
        }
        return discountedAmount; // Метод должен возвращать сумму покупки со скидкой
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */


    // Homework 3

    /**
     * Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
     * переданное число четным или нечетным:
     */

    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    /**
     * Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
     * переданное число в интервал (25;100)
     */

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }


}