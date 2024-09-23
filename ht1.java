package HomeWork;

// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

public class ht1 {
    public int factorial(int n) {
        
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
       
        ht1 ans = new ht1();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}
