package AppSolveQuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("APP SOLVE QUADRATIC EQUATION");
        System.out.println("Enter a, b, c");
        Scanner scanner = new Scanner(System.in);
        String abc = scanner.nextLine();
        String[] abcArr = abc.split(" ");

        double a = Double.parseDouble(abcArr[0]);
        double b = Double.parseDouble(abcArr[1]);
        double c = Double.parseDouble(abcArr[2]);
        AppSolveQuadraticEquation my = new AppSolveQuadraticEquation(a, b, c);
        double delta = my.getDiscriminant();
        double root1 = my.getRoot1(delta);
        double root2 = my.getRoot2(delta);
        if (delta < 0) {
            System.out.println("The equation has no solution!");
        } else if (delta == 0) {
            System.out.println("The equation has a double solution: " + root1);
        } else {
            System.out.println("The equation has two distinct solutions x1 = " + root1 + " x2 = " + root2);
        }
    }
}
