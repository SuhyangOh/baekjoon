import java.util.Scanner;
public class Baekjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 0;
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            value += s.charAt(i) - '0';
        }
        System.out.println(value);
    }
}