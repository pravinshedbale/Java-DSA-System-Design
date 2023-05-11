import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int setBitCount = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                setBitCount++;
            }
            n = n >> 1;
        }

        System.out.println("Set Bit Count : " + setBitCount);
    }
}

/*
 * Output
 * 1
 * Set Bit Count : 1
 * 
 * 2
 * Set Bit Count : 1
 * 
 * 3
 * Set Bit Count : 2
 * 
 * 4
 * Set Bit Count : 1
 */