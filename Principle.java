import java.util.Scanner;

class Compound {
    double principal_amt, rate;
    int time;

    public Compound() {
        this.principal_amt = 0;
        this.rate = 0;
        this.time = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        this.principal_amt = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        this.rate = sc.nextDouble();
        System.out.print("Enter the time period (in years): ");
        this.time = sc.nextInt();
    }

    public double findInterest() {
        return principal_amt * Math.pow(1 + rate / 100, time);
    }

    public void printData() {
        System.out.println("Principal amount: " + principal_amt);
        System.out.println("Rate of interest: " + rate);
        System.out.println("Time period: " + time);
    }
}

public class Principal {
    public static void main(String[] args) {
        Compound compound = new Compound();
        compound.input();
        compound.printData();
        System.out.println("Compound interest: " + compound.findInterest());
    }