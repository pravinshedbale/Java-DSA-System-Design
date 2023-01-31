
public class PWSkillsPattern {
    public static void main(String[] args) {
        int n = 5;

        // Print P
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2)
                        && j < n - 1)
                    System.out.print("*");
                else if (i < n / 2
                        && j == n - 1 && i != 0)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        System.out.println();
        // Print W
        int counter = n / 2;
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j <= n; j++) {
                if (j == n)
                    System.out.printf("*");
                else if ((i >= n / 2)
                        && (j == counter
                                || j == n - counter - 1))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            if (i >= n / 2) {
                counter++;
            }
            System.out.printf("\n");
        }
        System.out.println();
        // print S
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2
                        || i == n - 1))
                    System.out.printf("*");
                else if (i < n / 2
                        && j == 0)
                    System.out.printf("*");
                else if (i > n / 2
                        && j == n - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        System.out.println();
        // print K
        int half = n / 2, temp = half;
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j <= half; j++) {
                if (j == Math.abs(temp))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            temp--;
        }

        System.out.println();
        // print I
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1)
                    System.out.printf("*");
                else if (j == n / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");

        }

        System.out.println();
        // print LL
        for (int t = 0; t < 2; t++) {
            for (int i = 0; i < n; i++) {
                System.out.printf("*");
                for (int j = 0; j <= n; j++) {
                    if (i == n - 1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }
        }

        System.out.println();
        // print S
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2
                        || i == n - 1))
                    System.out.printf("*");
                else if (i < n / 2
                        && j == 0)
                    System.out.printf("*");
                else if (i > n / 2
                        && j == n - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }

    }
}
