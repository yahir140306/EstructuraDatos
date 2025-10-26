import java.util.Scanner;

public class noseUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        double d1 = distancia(x1, y1, x2, y2);
        double d2 = distancia(x2, y2, x3, y3);
        double d3 = distancia(x3, y3, x4, y4);
        double d4 = distancia(x4, y4, x1, y1);

        double minimo = d1;
        if (d2 < minimo) {
            minimo = d2;
        }
        if (d3 < minimo) {
            minimo = d3;
        }
        if (d4 < minimo) {
            minimo = d4;
        }

        System.out.println(minimo);
    }
        public static double distancia( double xA, double yA, double xB, double yB) {
            double dx = xB - xA;
            double dy = yB - yA;

            return Math.sqrt(dx * dx  + dy * dy);
        }
    }