import java.util.Scanner;

public class ifElseComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("A and B both are equal");
        // } else {
        // if (a > b) {
        // System.out.println("A is greater then B");
        // } else {
        // System.out.println("A is less then B");
        // }
        // }

        if (a == b) {
            System.out.println("A and B both are equal");
        } else if (a > b) {
            System.out.println("A is greater then B");
        } else {
            System.out.println("A is less then B");
        }
    }
}
