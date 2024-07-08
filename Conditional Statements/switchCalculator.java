import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.println("Enter First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator: ");
        char opertor = sc.next().charAt(0);

        switch (opertor) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition:" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Addition:" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Addition:" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Addition:" + result);
                break;
            default: {
                System.out.println("Invalid Expression");
            }
        }
    }
}
