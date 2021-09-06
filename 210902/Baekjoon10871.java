import java.util.*;
public class Baekjoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < len; i++) {
            int a = sc.nextInt();
            if (a < x) {
                System.out.print(a + " ");
            }
        }
    }
}