import java.io.*;

public class Hola {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            System.out.println("Hola");
            runtime.exec("shutdown -s -t 1");
        } catch (IOException e) {
                 System.out.println("Excepcion: " + e);
        }
    }
}
