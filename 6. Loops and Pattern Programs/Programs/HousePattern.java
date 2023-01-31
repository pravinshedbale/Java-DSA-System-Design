
public class HousePattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {

            // First Triangle
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            // Spaces
            for (int s = 1; s <= 2 * i - 2; s++) {
                System.out.print("  ");
            }

            // Second Triangle
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Hollow Rectangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                if (j == 1 || i == n || j == (n * 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
