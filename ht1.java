package HomeWork;

// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

public class ht1 {
    public static void main(String[] args) {

        System.out.println(getFactorial(6));
    }

    public static Integer getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

}