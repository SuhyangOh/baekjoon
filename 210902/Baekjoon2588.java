import java.util.Scanner;

public class Baekjoon2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1 * (num2 % 10);
        int b = num1 * ((num2 / 10) % 10);
        int c = num1 * ((num2 / 100) % 10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + b * 10 + c * 100);
    }
}
