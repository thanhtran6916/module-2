import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x + b = 0', please enter constants:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = sc.nextDouble();

        System.out.println("Enter b:");
        double b = sc.nextDouble();

        if (a == 0 && b != 0) {
            System.out.println("The equation has no solution");
        } else if (a == 0 && b == 0) {
            System.out.println("The equation has infinitely many solutions");
        } else {
            System.out.println("The equation has a solution " + (-b / a));
        }
    }
}
