import java.util.*;

public class Baekjoon8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String ox = sc.next();
            int score = 0;
            int cons = 1;
            for (int j = 0; j < ox.length(); j++) {
                char c = ox.charAt(j);
                if (c == 'O') {
                    score += cons;
                    cons++;
                } else if (c == 'X') {
                    cons = 1;
                }
            }
            System.out.println(score);
        }
    }
}
