import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        float x = 5.5F;

        float y = (x + 5) / (2 * (x + 1));
        float z = ((y * y + x) * (x - 2 * y)) / (x * y);

        System.out.println(z);

    }
}
