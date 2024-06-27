//task #3
//
//        START
//        READ number n
//        number a = 0
//        FOR i = 0, i < n, i + 1
//        FOR j = n, j > i, j - 1
//        a = a + i + j
//        END

public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                a = a + i + j;
            }
        }
    }
}

// временная сложность: O(n2)
