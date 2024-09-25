package HomeWork;

// Задача 3. Подсчет суммы цифр числа
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр.


public class ht3 {

    public static void main(String[] args) {

        System.out.println(sumDigits(25));
    }

    public static int sumDigits(int n) {
        
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
        
}
