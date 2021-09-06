import java.util.*;
public class Baekjoon4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] score = new int[n];
            double sum = 0;
            for (int j = 0; j < n; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = sum / n;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (score[j] > avg) {
                    count++;
                }
            }
            double value = (double) count * 100 / n;
            System.out.printf("%.3f", value);
            System.out.println("%");
        }
    }
}