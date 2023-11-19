import java.util.Scanner;

class Record {
    String[] name;
    int[] rnk;

    public Record() {
        name = new String[50];
        rnk = new int[50];
    }

    public void readvalues() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.println("Enter name and rank of student " + (i + 1) + ":");
            name[i] = sc.next();
            rnk[i] = sc.nextInt();
        }
    }

    public void display() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Name: " + name[i] + ", Rank: " + rnk[i]);
        }
    }
}

class Rank extends Record {
    int index;

    public Rank() {
        super();
        index = 0;
    }

    public void highest() {
        for (int i = 1; i < 50; i++) {
            if (rnk[i] < rnk[index]) {
                index = i;
            }
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Highest rank is " + rnk[index] + ", achieved by " + name[index]);
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Rank rank = new Rank();
        rank.readvalues();
        rank.highest();
        rank.display();
    }
}