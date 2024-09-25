// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

package HomeWork;

public class HTask1 {
    public static void main(String[] args) {

        System.out.println(factorial(6));
    }

    public static int factorial(int n) {

        if (n < 0)
            return -1;
        if (n == 0)
            return 1;
        return n * factorial(n - 1);

    }
}
