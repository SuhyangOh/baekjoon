import java.util.Scanner;
public class Baekjoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int p = 0; p < num; p++) {
            int n = sc.nextInt();
            String s = sc.next();
            for (int i = 0; i < s.length(); i ++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
