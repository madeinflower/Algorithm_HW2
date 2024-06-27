//task #1
//
//        START
//        READ number n
//        IF n == 1 THEN return
//        FOR i = 1, i <= n, i + 1
//        FOR j = 1; j <= n, j + 1
//        print "*"
//        BREAK
//        END

public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        if (n == 1) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
                break;
            }
        }
    }
}
// временная сложность O(n)

