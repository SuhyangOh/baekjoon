public class Baekjoon15596 {
    long sum(int[] a){
        long x = 0;
        for (int i = 0; i < a.length; i++) {
            x += a[i];
        }
        return x;
    }
}