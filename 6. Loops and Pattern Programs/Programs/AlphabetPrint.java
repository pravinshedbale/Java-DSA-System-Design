public class AlphabetPrint {
    public static void main(String[] args) {
        int n = 7;
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 && j != n / 2 || j == 0 || j == n / 2 && i != 0 && i != n / 2 && i != n - 1
                        || i == n / 2 && j != n / 2 || i == n - 1 && j != n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 && j != 0 || i == n - 1 && j != 0 || j == 0 && i != 0 && i != n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 && j != n / 2 || i == n - 1 && j != n / 2 || j == 0 || j == n / 2 && i != 0 && i != n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 || i == n / 2 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 1 && i != 0 && i != n - 1) ||
                        ((i == 0 || i == n - 1) && j > 1 &&
                                j < n - 2)
                        || (i == ((n - 1) / 2) &&
                                j > 2 && j < n - 1)
                        || (j == n - 2 &&
                                i != 0 && i >= ((n - 1) / 2) && i != n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if ((j == 0 || j == n - 4) || i <= n && i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}