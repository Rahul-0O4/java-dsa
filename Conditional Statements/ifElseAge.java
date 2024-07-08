import java.util.*;

public class ifElseAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are adult!!");
        } else {
            System.out.println("You are Child!!!");
        }
    }
}