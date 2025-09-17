
import java.util.Scanner;

class miPrograma {

    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el valor 1:");
        valor1 = read.nextInt();
        System.out.println("Introduce el valor 2:");
        valor2 = read.nextInt();

        //Condicionales
        if (valor1 == 0) {
            System.out.println("El valor 1 es 0");
        } else {
            System.out.println("El valor 1 es diferente a 0");
        }

        //Ciclos
        //For
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //While
        System.out.println("Ciclo While");
        int i2 = 1;
        while (i2 <= 10) {
            System.err.println(i2);
            i2++;
        }

        //Ciclo do-while
        int i3 = 11;
        do {
            System.err.println("El valor de i3 es:" + i3);
        } while (i3 <= 10);

        System.out.println("La suma de los valores es: " + (valor1 + valor2));
        read.close();
    }
}
