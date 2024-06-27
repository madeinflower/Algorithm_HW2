//task #4
//
//START
//        READ number n
//        numbers a = 0, i = n
//        WHILE i > 0
//        a = a + i
//        i = i / 2
//        END

public class Task4 {
    public static void main(String[] args) {
        int n = 10; // Пример входного значения
        int a = 0;
        int i = n;
        while (i > 0) {
            a = a + i;
            i = i / 2;
        }
    }
}

// временная сложность: O(log n)
