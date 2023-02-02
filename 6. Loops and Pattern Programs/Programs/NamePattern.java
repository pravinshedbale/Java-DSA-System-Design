public class NamePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2)
                        && j < n - 1)
                    System.out.printf("*");
                else if (i < n / 2
                        && j == n - 1 && i != 0)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        System.out.println();

        int half = (n / 2);
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == half)
                        && j < (n - 2))
                    System.out.printf("*");
                else if (j == (n - 2)
                        && !(i == 0 || i == half))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || i == n / 2 + 1) {
                    if ((i == 1 && j == 1) || (i == 1 && j == n)) {
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        int counter = 0, width = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= width; j++) {
                if (j == counter
                        || j == width - counter - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }

        System.out.println();
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
        counter = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j <= n; j++) {
                if (j == n)
                    System.out.printf("*");
                else if (j == counter)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }
    }

}
