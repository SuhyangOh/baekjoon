import java.util.*;
public class Baekjoon1065  {
    static boolean hansu(int n) {
        int temp = n;
        int len = (int) ((Math.log10(n)) + 1);
        int[] arr = new int[len];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }
        int diff = 0;
        if (arr.length > 1) {
            diff = arr[0] - arr[1];
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != diff) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (hansu(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
