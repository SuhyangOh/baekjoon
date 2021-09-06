import java.util.*;
public class Baekjoon1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int input = sc.nextInt();
        int x = 0;
        if (input == 0) {
            System.out.println(1);
            return;
        }
        while (input != x) {
            if (x == 0) {
                x = input;
            }
            int a = ((x / 10) + (x % 10)) % 10;
            x = (x % 10) * 10 + a;
            result++;
        }
        System.out.println(result);
    }
}
