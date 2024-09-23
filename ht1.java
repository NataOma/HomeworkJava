package Lessen1;

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
