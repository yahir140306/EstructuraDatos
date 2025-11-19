import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nReglones = scanner.nextInt();
        int mReglones = scanner.nextInt();

        for (int i = 0; i < nReglones; i++) {
            for (int j = 0; j < mReglones; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}