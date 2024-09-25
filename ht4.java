package HomeWork;

// Задача 4*. Нахождение максимального из трех чисел
// Реализуйте две функции:
// 1. Функция findMaxOfTwo должна принимать два числа и возвращать
// максимальное из них, используя только знак сравнения.
// 2. Функция findMaxOfThree должна принимать три числа и находить
// максимальное из них, используя первую функцию.


public class ht4 {

    public static void main(String[] args) {

        System.out.println(findMaxOfThree(87, 2, 52));
    }

    public static int findMaxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
   
}
