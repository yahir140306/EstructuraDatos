public class Burbuja {
    public static void main(String[] args) {
        int[] Numeros = { 2, 1, 4, 3, 7 };
        int count = 0;

        for (int j = 0; j <= 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (Numeros[i] > Numeros[i + 1]) {
                    int aux = Numeros[i];
                    Numeros[i] = Numeros[i + 1];
                    Numeros[i + 1] = aux;
                }
            }
            System.out.println(Numeros[j]);
        }
    }
}