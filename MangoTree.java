import java.util.Scanner;
public class MangoTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int n = sc.nextInt();
        if(n > row*col) {
            System.out.println("False");
        } else if(n < row) {
            System.out.println("True");
        } else if(n % row == 0 || (n-1) % row == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
