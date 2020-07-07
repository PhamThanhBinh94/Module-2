import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {

        int choice = -1;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right,botton-left, botton-right");
            System.out.println("3. Print isosceles triangle ");
            System.out.println("4. Exit ");
            choice = input.nextInt();
            if (choice == 1) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("\n");
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                }
            }
            if (choice == 2) {
                for (int i = 1; i <= 5; i++) {
                    System.out.print("\n");
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                }
            }
            if (choice == 3) {
                for (int i = 1; i <= 7; i++) {
                    for (int j =0 ; j <= (7-i) ;j ++){
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
