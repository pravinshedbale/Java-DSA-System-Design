class LoanFile {
    static double rateOfInterest = 3.24;
    double simpleInterest;
    int principleAmt;

    public LoanFile(int amount, int durationInYr) {
        this.principleAmt = amount;
        this.simpleInterest = (principleAmt * durationInYr * rateOfInterest) / 100;
    }

    double getSimpleInterest() {
        return simpleInterest;
    }

    double getTotalAmount() {
        return simpleInterest + principleAmt;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        LoanFile file1 = new LoanFile(10000, 1);
        LoanFile file2 = new LoanFile(20000, 1);
        System.out.println("LOAN FILE 1");
        System.out.println(file1.getSimpleInterest());
        System.out.println(file1.getTotalAmount());

        System.out.println("LOAN FILE 2");
        System.out.println(file2.getSimpleInterest());
        System.out.println(file2.getTotalAmount());
    }
}
