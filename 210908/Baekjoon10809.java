import java.util.Scanner;
public class Baekjoon10809 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            int arr[] = new int[26];

            for (int i = 0; i < arr.length; i ++) {
                arr[i] = input.indexOf(((char) (i + 97)));
            }
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    }