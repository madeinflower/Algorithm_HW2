//task #2
//
//        START
//        READ number n
//        numbers i = 0, j = 0, a = 0
//        FOR i = n/2, i <= n; i + 1
//        FOR j = 2, j <= n, j * 2
//        a = a + n / 2
//        END

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        for (int i = n / 2; i <= n; i++) {
            for (int j = 2; j <= n; j *= 2) {
                a = a + n / 2;
            }
        }
    }
}
 //временная сложность: O(n log n)
