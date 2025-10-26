package Unidad_2.Herencia.Animales;

public class Main {
    public static void main(String[] args) {
        Pez nemo = new Pez("nemo", 1, "agua salada");
        Perro hachi = new Perro("hachi", 5, "Pitbull");
        Gato garfiel = new Gato("garfiel", 3, true);

        System.out.println(nemo);
        nemo.hacerSonido();
        nemo.moverse();

        System.out.println(hachi);
        hachi.moverse();
        hachi.hacerSonido();
        hachi.ladrar();

        System.out.println(garfiel);
        garfiel.moverse();
        garfiel.hacerSonido();
        garfiel.ronronear();
    }
}
