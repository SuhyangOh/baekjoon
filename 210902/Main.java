import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int min = 100001;
        int max = -100001;
        for (int i = 0; i < count; i++) {
            int x = sc.nextInt();
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        System.out.println(min + " " + max);
    }
}