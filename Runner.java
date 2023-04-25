public class Runner {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
