import java.util.Scanner;

public class TwentyPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf(" %d số nguyên tố đầu tiên là: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (isPrimNumber(i)){
                System.out.println(i + "");
                dem ++;
            }
            i++;
        }
    }
    public static  boolean isPrimNumber(int n){
        if (n<2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i ++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
