package Herencia.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Barco titanic = new Barco("Titanic", 40);
        Velero perlaNegra = new Velero("Perla Negra");
        Motocicleta italika = new Motocicleta("Italika", 180);
        Tractor noseTractor = new Tractor("Nose Tractor");
        Avion boeing = new Avion("Boeing 777", 900, 13000);
        Helicoptero apache = new Helicoptero("Apache", 293);

        titanic.arrancar();
        titanic.moverse();
        perlaNegra.moverse();
        titanic.anclar();

        italika.arrancar();
        italika.moverse();
        noseTractor.arar();
        noseTractor.moverse();

        boeing.aterrizar();
        boeing.moverse();
        apache.moverse();
        boeing.planear();
        boeing.aterrizar();
    }
}