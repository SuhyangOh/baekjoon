import java.util.*;

public class Baekjoon4673 {
    static int d(int n) {
        int temp = n;
        while (temp > 0) {
            n += temp % 10;
            temp /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        for (int i = 1; i <= 10000; i++) {
            arr.add(d(i));
        }
        for (int i = 1; i <= 10000; i++) {
            if (!arr.contains(i)) {
                System.out.println(i);
            }
        }

    }
}